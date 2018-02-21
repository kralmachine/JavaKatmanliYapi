
package busıness;

import DBExeCute.DataBaseConn;
import bean.Kisi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SorguCalistir {
    
    Connection baglanti=null;
    PreparedStatement preparedStatement=null;
    ResultSet resultSet=null;
    
    public SorguCalistir() {
        baglanti=DataBaseConn.dbBaglantiIfadesi();
        preparedStatement=null;
        resultSet=null;
    }
    
    //kayıt ifadesi
    public int kisiKaydet(Kisi kisi){
        int rowInserted=-1;
         System.out.println("kişi kayit işlem");
        if(true){
           
           try{

               String eklemeSorgusu="INSERT INTO KISILER (KISIAD,KISISOYAD,KISICEPTEL,KISIADRES,KISIKIMLIKNO)"+
                   "VALUES ('"+kisi.getKisiAd().trim()+"','"+kisi.getKisiSoyad().trim()+"','"+kisi.getKisiCepTel().trim()+"','"+kisi.getKisiAdres().trim()+"','"+kisi.getKisiKimlikNo().trim()+"')";

               preparedStatement=baglanti.prepareStatement(eklemeSorgusu);
               rowInserted=preparedStatement.executeUpdate();

               if(rowInserted>0){
                   JOptionPane.showMessageDialog(null,"Kayıt Ekleme İşlemi Başarılı Oldu.","Mesaj",JOptionPane.INFORMATION_MESSAGE);

               }
           }catch(Exception ex){

               JOptionPane.showMessageDialog(null,"Hata: "+ex+"\n\nKayıt Ekleme İşlemi Başarısız Oldu.","Hata Mesaj",JOptionPane.ERROR_MESSAGE);

           }
        }
        
        try {
            preparedStatement.close();
            baglanti.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return rowInserted;
    }
    
    //silme ifadesi
    public void kisiSil(int kisiID){
        
        try {
                String silmeSorgusu="DELETE FROM KISILER WHERE KISIID=?";
                preparedStatement=baglanti.prepareStatement(silmeSorgusu);
                preparedStatement.setInt(1, kisiID);

                if(preparedStatement.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "Silme İşlemi Başarılı Bir Şekilde Gerçekleşti", "Mesaj", JOptionPane.INFORMATION_MESSAGE);    
                }

           } catch (Exception e) {

                    JOptionPane.showMessageDialog(null,"Hata: "+e+"\n\nKayıt Silme İşlemi Başarısız Oldu.","Hata Mesaj",JOptionPane.ERROR_MESSAGE);
           }

       try {
            preparedStatement.close();
            baglanti.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    
    //tümünü silme ifadesi
    public int tumunuSil(){
        
        int sonuc=0;
         try {
                String silmeSorgusu="DELETE FROM KISILER";
                preparedStatement=baglanti.prepareStatement(silmeSorgusu);
                sonuc=preparedStatement.executeUpdate();
                if(sonuc>0)
                    JOptionPane.showMessageDialog(null, "Silme İşlemi Başarılı Bir Şekilde Gerçekleşti", "Mesaj", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null,"Hata: "+e+"\n\nKayıt Silme İşlemi Başarısız Oldu.","Hata Mesaj",JOptionPane.ERROR_MESSAGE);
            }
         
        try {
          
            preparedStatement.close();
            baglanti.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         
         return sonuc;
         
    }
    
    //kayıt güncelleme ifadesi
     public int guncelleKisi(Kisi kisi){
        
         int sonuc=0;
        try {
                String guncellemeSorgusu="UPDATE KISILER SET KISIAD=? , KISISOYAD=? , KISICEPTEL=? , KISIADRES=? , KISIKIMLIKNO=? WHERE KISIID=?";
                preparedStatement=baglanti.prepareStatement(guncellemeSorgusu);
                preparedStatement.setString(1, kisi.getKisiAd());
                preparedStatement.setString(2, kisi.getKisiSoyad());
                preparedStatement.setString(3, kisi.getKisiCepTel());
                preparedStatement.setString(4, kisi.getKisiAdres());
                preparedStatement.setString(5, kisi.getKisiKimlikNo());
                preparedStatement.setInt(6,kisi.getKisiID());
                sonuc=preparedStatement.executeUpdate();
               
                JOptionPane.showMessageDialog(null, "Güncelleme işemi başarılı bir şekilde gerçekleşti", "Mesaj", JOptionPane.INFORMATION_MESSAGE);
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Hata: "+e+"\n\nKayıt Güncelleme İşlemi Başarısız Oldu.","Hata Mesaj",JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            preparedStatement.close();
            baglanti.close();       
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return sonuc;
    }
     
     //tumunuListele
     public ArrayList<Kisi> tumunuListele(){
         
        Kisi kisi=null;
        ArrayList<Kisi> arrayListKisi=new ArrayList<Kisi>();
         
        try {
            String tumVeirleriGetir="SELECT * FROM KISILER";
            preparedStatement=baglanti.prepareStatement(tumVeirleriGetir);
            resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                kisi=new Kisi(resultSet.getInt("KISIID"),resultSet.getString("KISIAD"),resultSet.getString("KISISOYAD"),resultSet.getString("KISICEPTEL"),resultSet.getString("KISIADRES"),resultSet.getString("KISIKIMLIKNO"));
                arrayListKisi.add(kisi);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"HATA :"+e+"\n\nVerileri yükleme işlemi başarız bir şekilde sonuçlandı.","Hata Mesaj",JOptionPane.ERROR_MESSAGE);
        }
        
        try {
           
           
            preparedStatement.close();
          
            resultSet.close();
            baglanti.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return arrayListKisi;
     }
     
     //secili olan column için listele
     public ArrayList<Kisi> seciliOlanKayitIcinListele(String gelenSorgu){
         
        Kisi kisi=null;
        ArrayList<Kisi> arrayListKisi=new ArrayList<Kisi>();
         
        try {
            String tumVeirleriGetir=gelenSorgu;
            preparedStatement=baglanti.prepareStatement(tumVeirleriGetir);    
            resultSet=preparedStatement.executeQuery();
            while(resultSet.next()){
                kisi=new Kisi(resultSet.getInt("KISIID"),resultSet.getString("KISIAD"),resultSet.getString("KISISOYAD"),resultSet.getString("KISICEPTEL"),resultSet.getString("KISIADRES"),resultSet.getString("KISIKIMLIKNO"));
                arrayListKisi.add(kisi);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"HATA :"+e+"\n\nVerileri yükleme işlemi başarız bir şekilde sonuçlandı.","Hata Mesaj",JOptionPane.ERROR_MESSAGE);
        }
        
        try {
            preparedStatement.close(); 
            resultSet.close();
            baglanti.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        return arrayListKisi;  
         
     }
     
}
