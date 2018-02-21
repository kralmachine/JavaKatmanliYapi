package GUI;

import bean.Kisi;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class BilgilerPanel implements ActionListener{

    Controller controller=null;
    
    private JPanel panelBilgiler=null;
    
    private JLabel lblKisiAd=null;
    private JLabel lblKisiSoyad=null;
    private JLabel lblKisiTelefon=null;
    private JLabel lblKisiKimlikNo=null;
    private JLabel lblKisiAdres=null;
    private JLabel lblKisiTelefonTip=null;
    
    private JTextField txtKisiAd=null;
    private JTextField txtKisiSoyad=null;
    private JTextField txtKisiTelefon=null;
    private JTextField txtKisiKimlikNo=null;
    
    private JTextArea txtKisiAdres=null;
  
    private JButton btnKisiEkle=null;
    private JButton btnFormuKapat=null;

    private JComboBox cbKisiTelTip=null;
    
    private JScrollPane spKisiAdres=null;       
    
    public BilgilerPanel() {
        initGUI(); 
        
        
        butonOlaylari();
    }
    
    private void butonOlaylari(){
        
        controller=new Controller();
        btnFormuKapat.addActionListener(this);
        btnKisiEkle.addActionListener(this);
        
    }
    
    private void initGUI() {
        
       panelBilgiler=getPanelBilgiler();
       
       panelBilgiler.add(getlblKisiAd());
       panelBilgiler.add(getlblKisiAdres());
       panelBilgiler.add(getlblKisiKimlikNo());
       panelBilgiler.add(getlblKisiSoyad());
       panelBilgiler.add(getlblKisiTelefon());
       panelBilgiler.add(getlblKisiTelefonTip());
       
       panelBilgiler.add(getTxtKisiAd());
       panelBilgiler.add(getTxtKisiAdres());
       panelBilgiler.add(getTxtKisiKimlikNo());
       panelBilgiler.add(getTxtKisiSoyad());
       panelBilgiler.add(getTxtKisiTelefon());
      
       panelBilgiler.add(getCbTelefonTip());
       
       panelBilgiler.add(getBtnKisiKaydet());
       panelBilgiler.add(getBtnProgramKapat());
       
       panelBilgiler.add(getSPKisiAdres());
       
       cbKisiTelTip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TÜRKİYE (YURT İÇİ)", "YURT DIŞI" }));
        cbKisiTelTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKisiTelTipActionPerformed();
            }

           private void cbKisiTelTipActionPerformed() {
                if(cbKisiTelTip.getSelectedIndex()==0)
                     txtKisiTelefon.setText("___ ___ __ __");
                else
                    txtKisiTelefon.setText("__ ____ ___ ____");
           }
        });
         
        
    }
    
    public JPanel getPanelBilgiler(){
        
        if(panelBilgiler==null){
            panelBilgiler=new JPanel();
        }
        panelBilgiler.setBackground(new Color(204,255,255));
        
        javax.swing.GroupLayout panelLaout = new javax.swing.GroupLayout(panelBilgiler);
        panelBilgiler.setLayout(panelLaout);
        panelLaout.setHorizontalGroup(
            panelLaout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLaout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLaout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLaout.createSequentialGroup()
                        .addGroup(panelLaout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(getlblKisiAd())
                            .addComponent(getlblKisiSoyad())
                            .addComponent(getlblKisiKimlikNo())
                            .addComponent(getlblKisiTelefonTip())
                            .addComponent(getlblKisiTelefon())
                            .addComponent(getlblKisiAdres()))
                        .addGap(18, 18, 18)
                        .addGroup(panelLaout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getTxtKisiAd())
                            .addComponent(getTxtKisiSoyad())
                            .addComponent(getSPKisiAdres())
                            .addComponent(getTxtKisiKimlikNo(), javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(getCbTelefonTip(), 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getTxtKisiTelefon(), javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(panelLaout.createSequentialGroup()
                        .addGap(0, 490, Short.MAX_VALUE)
                        .addComponent(getBtnProgramKapat(), javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getBtnKisiKaydet(), javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        
          panelLaout.setVerticalGroup(
            panelLaout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLaout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(panelLaout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getlblKisiAd())
                    .addComponent(getTxtKisiAd(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLaout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getlblKisiSoyad())
                    .addComponent(getTxtKisiSoyad(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panelLaout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getlblKisiKimlikNo())
                    .addComponent(getTxtKisiKimlikNo(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLaout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getlblKisiTelefonTip())
                    .addComponent(getCbTelefonTip(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLaout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getlblKisiTelefon())
                    .addComponent(getTxtKisiTelefon(), javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelLaout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLaout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getSPKisiAdres(), javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLaout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(getlblKisiAdres())))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addGroup(panelLaout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getBtnProgramKapat())
                    .addComponent(getBtnKisiKaydet()))
                .addGap(103, 103, 103))
            );
                    
        return panelBilgiler;
        
    }
    
    public JLabel getlblKisiAd(){
        
        if(lblKisiAd==null){
            lblKisiAd=new JLabel();
        }
        lblKisiAd.setText("KİŞİ ADI :");
        return lblKisiAd;
        
    }
    
     public JLabel getlblKisiSoyad(){
        
        if(lblKisiSoyad==null){
            lblKisiSoyad=new JLabel();
        }
        lblKisiSoyad.setText("KİŞİ SOYAD :");
        return lblKisiSoyad;
        
    }
     
      public JLabel getlblKisiTelefon(){
        
        if(lblKisiTelefon==null){
            lblKisiTelefon=new JLabel();
        }
        lblKisiTelefon.setText("KİŞİ TELEFON :");
        return lblKisiTelefon;
        
    }
      
       public JLabel getlblKisiKimlikNo(){
        
        if(lblKisiKimlikNo==null){
            lblKisiKimlikNo=new JLabel();
        }
        lblKisiKimlikNo.setText("KİŞİ KİMLİK NO :");
        return lblKisiKimlikNo;
        
    }
       
       public JLabel getlblKisiAdres(){
        
        if(lblKisiAdres==null){
            lblKisiAdres=new JLabel();
        }
        lblKisiAdres.setText("KİŞİ ADRES :");
        return lblKisiAdres;
     }
        
       public JLabel getlblKisiTelefonTip(){
        
        if(lblKisiTelefonTip==null){
            lblKisiTelefonTip=new JLabel();
        }
        lblKisiTelefonTip.setText("KİŞİ TEL TİP :");
        return lblKisiTelefonTip;
        
     }
       
     public JTextField getTxtKisiAd(){
         if(txtKisiAd==null){
             txtKisiAd=new JTextField();
         }
         return txtKisiAd;
     }
     
      public JTextField getTxtKisiSoyad(){
         if(txtKisiSoyad==null){
             txtKisiSoyad=new JTextField();
         }
         return txtKisiSoyad;
     }
      
       public JTextField getTxtKisiTelefon(){
         if(txtKisiTelefon==null){
             txtKisiTelefon=new JTextField();
         }
         return txtKisiTelefon;
     }
       
        public JTextField getTxtKisiKimlikNo(){
         if(txtKisiKimlikNo==null){
             txtKisiKimlikNo=new JTextField();
         }
         return txtKisiKimlikNo;
     }
        
         public JTextArea getTxtKisiAdres(){
         if(txtKisiAdres==null){
             txtKisiAdres=new JTextArea();
         }
         txtKisiAdres.setColumns(20);
         txtKisiAdres.setFont(new java.awt.Font("Times New Roman", 0, 12));
         txtKisiAdres.setRows(5);
         return txtKisiAdres;
     }
         
        public JComboBox getCbTelefonTip(){
         if(cbKisiTelTip==null){
             cbKisiTelTip=new JComboBox();
         }
         return cbKisiTelTip;
     }
        
      public JButton getBtnKisiKaydet(){
         if(btnKisiEkle==null){
             btnKisiEkle=new JButton();
         }
         btnKisiEkle.setText("KİŞİ EKLE");
         return btnKisiEkle;
     } 
      
       public JButton getBtnProgramKapat(){
         if(btnFormuKapat==null){
             btnFormuKapat=new JButton();
         }
         btnFormuKapat.setText("FORMU KAPAT");
         return btnFormuKapat;
     } 

    public JScrollPane getSPKisiAdres() {
       
        if(spKisiAdres==null){
            spKisiAdres=new JScrollPane();
        }
        
        spKisiAdres.setViewportView(getTxtKisiAdres());
        
        return spKisiAdres;
        
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        
        if(event.getActionCommand().equals("FORMU KAPAT")){
            
             Object[] dugmeler={"EVET KAPAT","HAYIR KAPATMA"};
             int gelenDeger=JOptionPane.showOptionDialog(null,"Formu Kapatmak İstiyormusunuz?", "Uyarı Mesajı", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,dugmeler,dugmeler[1]);
             if(gelenDeger==0)
                 controller.exeCute("FORMU KAPAT", null);
             
        }
        else if(event.getActionCommand().equals("KİŞİ EKLE"))
        {
            if(isBosmuControl()){
                
               
                controller.exeCute("KAYDET",new Object[]{getTxtKisiAd().getText().trim(),getTxtKisiSoyad().getText().trim(),
                getTxtKisiTelefon().getText().trim(),getTxtKisiAdres().getText().trim(),getTxtKisiKimlikNo().getText().trim()});
                formuTemizle();
            }else
                JOptionPane.showMessageDialog(null,"Kişi eklemek için lütfen verileri doğru girelim","Uyarı",JOptionPane.WARNING_MESSAGE);
            
        }
        
    }
   
    public void formuTemizle(){
        
        getCbTelefonTip().setSelectedIndex(0);
        getTxtKisiAd().setText("");
        getTxtKisiSoyad().setText("");
        getTxtKisiTelefon().setText("");
        getTxtKisiAdres().setText("");
        getTxtKisiKimlikNo().setText("");
        
    }

    public boolean isBosmuControl() {
        if(getTxtKisiAd().getText().trim().equals("") || getTxtKisiSoyad().getText().trim().equals("") || getTxtKisiTelefon().getText().trim().equals("") || getTxtKisiAdres().getText().trim().equals("") || getTxtKisiKimlikNo().getText().length()!=11 || !getTxtKisiKimlikNo().getText().matches("^[1-9]{1}[0-9]{10}$") || !isCepTelKontrol())
            return false;
        else
            return true;
    }

    private boolean isCepTelKontrol() {
        
         boolean durum=true;
         if(getCbTelefonTip().getSelectedIndex()==0){//[1-9]{1}[0-9]{10} //
            if(!getTxtKisiTelefon().getText().matches("^5[0-9]{2} [0-9]{3} [0-9]{2} [0-9]{2}$")){
                JOptionPane.showMessageDialog(null, "Lütfen Kişi Yurt İçi Telefon Numarası Düzgün Formtta Giriniz. ","Uyarı",JOptionPane.WARNING_MESSAGE);
                durum=false;
            }
        }else if(getCbTelefonTip().getSelectedIndex()==1){
            if(!getTxtKisiTelefon().getText().matches("^[0-9]{2} [1-9]{1}[0-9]{2} [0-9]{1}[0-9]{2} [0-9]{2}[0-9]{2}$")){
                 JOptionPane.showMessageDialog(null, "Lütfen Kişi Yurt Dışı Telefon Numarası Düzgün Formtta Giriniz. ","Uyarı",JOptionPane.WARNING_MESSAGE);
                 durum=false;
            }
        }
         
         return durum;
        
    }
         
        
    
}
