package DBExeCute;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class DataBaseConn {
    
    public static Connection dbBaglantiIfadesi(){
        try {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection baglanti=DriverManager.getConnection("jdbc:sqlserver://KRALMACHINE:1433;databaseName=AdresDefteri;user=sa;password=1234");
            //JOptionPane.showMessageDialog(null, "Bağlantı Kuruldur","VeriTabanı Bağlantısı",JOptionPane.INFORMATION_MESSAGE);
            return baglanti;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"HATA :"+ex,"Hata Mesajı",JOptionPane.WARNING_MESSAGE);
            //System.out.println(ex.toString());
            return null;
        }
        
    }
    
}
