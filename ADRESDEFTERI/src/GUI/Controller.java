
package GUI;

import busıness.SorguCalistir;
import bean.Kisi;
import java.util.ArrayList;

public class Controller{
   
  Object[] veriler=null;
  ArrayList<Kisi> kisiler=null;
    
  SorguCalistir sorguExecute=null;

  Kisi kisi=null;

  public Controller() {
     sorguExecute=new SorguCalistir();
  }
  
 public ArrayList<Kisi> exeCute(String command,Object[] degerler){
      
     if(degerler==null){
        degerler=new Object[5];
     }
     
     veriler=new Object[degerler.length];
     
     sorguExecute=new SorguCalistir();
     
     switch(command){
         
         case "KAYDET":           
            
            kisi=new Kisi(String.valueOf(degerler[0]), String.valueOf(degerler[1]), String.valueOf(degerler[2]),String.valueOf(degerler[3]),String.valueOf(degerler[4]));
            sorguExecute.kisiKaydet(kisi);
            
            break;
             
         case "KİŞİ SİL":
             
             sorguExecute.kisiSil((int) degerler[0]);
             
             break;
             
         case "KİŞİ GÜNCELLE":

             kisi=new Kisi((int)degerler[0],String.valueOf(degerler[1]), String.valueOf(degerler[2]), String.valueOf(degerler[3]), String.valueOf(degerler[4]), String.valueOf(degerler[5]));
             sorguExecute.guncelleKisi(kisi);
             
             break;
             
         case "TÜMÜNÜ SİL":
             
             sorguExecute.tumunuSil();
             
             break;
             
         case "FORMU KAPAT" :
             
             System.exit(0);
             
             break;
             
         case "KİŞİ LİSTELE":
 
             kisiler=sorguExecute.tumunuListele();
             
             break;
             
         case "KİŞİ SORGULA":
             kisiler=sorguExecute.seciliOlanKayitIcinListele(String.valueOf(degerler[0]));
             break;
     }
      
      return kisiler;
  } 
  
}
