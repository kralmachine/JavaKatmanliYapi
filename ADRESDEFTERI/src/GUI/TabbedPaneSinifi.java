
package GUI;


import javax.swing.JTabbedPane;


public class TabbedPaneSinifi{

    public TabbedPaneSinifi() {
        initGUI();
    }

    private JTabbedPane tpAnaPanel=null;
    private BilgilerPanel bilgilerPanel=null;
    private DigerBilgilerPanel digerBilgilerPanel=null;
    
    private void initGUI() {
        
        bilgilerPanel=new BilgilerPanel();
        digerBilgilerPanel=new DigerBilgilerPanel();    
        tpAnaPanel=getTpPanel();
    
    }
    
    public JTabbedPane getTpPanel(){
        if(tpAnaPanel==null){
            tpAnaPanel=new JTabbedPane();
        }
        
        tpAnaPanel.addTab("KAYIT BÖLÜMÜ", bilgilerPanel.getPanelBilgiler());
        tpAnaPanel.addTab("SORGULAMA BÖLÜMÜ", digerBilgilerPanel.getDigerPanelBilgiler());
        
        return tpAnaPanel;
    }
}
