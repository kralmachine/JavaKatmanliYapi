
package GUI;

import javax.swing.JFrame;


public class MainForm  extends TabbedPaneSinifi{
    
    private JFrame pencere=null;
     
    public static MainForm mainForm;
    
    public MainForm() {
    
        pencere=getPencere(pencere);
        pencere.setVisible(true);
        
    }
    
    private JFrame getPencere(JFrame pencere){
        
        if(pencere==null){
            pencere=new JFrame();
        }
        
        pencere.setTitle("ADRES DEFTERİ");
        pencere.setSize(700,700);
  
        pencere.setLocationRelativeTo(null);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setExtendedState(JFrame.MAXIMIZED_BOTH);
        pencere.setResizable(true);
        pencere.add(getTpPanel());
        pencere.pack();
        
        return pencere;
    }
    
    public static void main(String[] args) {
        mainForm=new MainForm();
    }
}
