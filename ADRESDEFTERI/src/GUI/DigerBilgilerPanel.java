
package GUI;

import bean.Kisi;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class DigerBilgilerPanel extends BilgilerPanel implements ActionListener,MouseListener{
    
    ArrayList<Kisi> arrayListKisiler=null;
    String[] columns=null;
    
    private JPanel digerPanelBilgiler=null;
    
    private JButton btnListele=null;
    private JButton btnSil=null;
    private JButton btnGuncelle=null;
    private JButton btnTumunuSil=null;
    private JButton btnKisiSorgula=null;
    private JTable tblVeriler=null;
    
    private JScrollPane spScrollPane=null;
    
    public DigerBilgilerPanel() {
        
        initGUI();
        butonOlaylari();
        
    }

     private void butonOlaylari(){
        
        controller=new Controller();
        
        btnSil.addActionListener(this);
        btnGuncelle.addActionListener(this);
        btnTumunuSil.addActionListener(this);
        btnKisiSorgula.addActionListener(this);
        btnListele.addActionListener(this);
        
        tblVeriler.addMouseListener(this);
        
        arrayListKisiler=null;
        
    }
    
    private void initGUI() {
       
       digerPanelBilgiler=getDigerPanelBilgiler();
        
       digerPanelBilgiler.add(getKisiSilButon());
       digerPanelBilgiler.add(getKisiGuncelleButon());
       digerPanelBilgiler.add(getKisiTumunuSilButon());
       digerPanelBilgiler.add(getKisiSorgula());
       digerPanelBilgiler.add(getKisiListele());
       digerPanelBilgiler.add(getTblVeriler());
        
       digerPanelBilgiler.add(getlblKisiAd());
       digerPanelBilgiler.add(getlblKisiAdres());
       digerPanelBilgiler.add(getlblKisiKimlikNo());
       digerPanelBilgiler.add(getlblKisiSoyad());
       digerPanelBilgiler.add(getlblKisiTelefon());
       digerPanelBilgiler.add(getlblKisiTelefonTip());
       
      
       digerPanelBilgiler.add(getTxtKisiAdres());
       digerPanelBilgiler.add(getTxtKisiKimlikNo());
       digerPanelBilgiler.add(getTxtKisiSoyad());
       digerPanelBilgiler.add(getTxtKisiTelefon());
       digerPanelBilgiler.add(getTxtKisiAd());
       
       digerPanelBilgiler.add(getCbTelefonTip());
       
       digerPanelBilgiler.add(getSPKisiAdres());
       
       
        
    
    }
    
     
    public JPanel getDigerPanelBilgiler(){
        
        if(digerPanelBilgiler==null){
            digerPanelBilgiler=new JPanel();
        }
      
        digerPanelBilgiler.setBackground(new Color(204,255,255));
        digerPanelBilgiler.setFocusTraversalPolicyProvider(true);
        
         javax.swing.GroupLayout panelLaout = new javax.swing.GroupLayout(digerPanelBilgiler);
        digerPanelBilgiler.setLayout(panelLaout);
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
                        .addGap(0, 420, Short.MAX_VALUE)
                        .addComponent(getKisiSilButon(), javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getKisiTumunuSilButon(), javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getKisiSorgula(), javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getKisiGuncelleButon(), javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(getKisiListele(), javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    ))
                .addGap(30, 30, 30)
                .addGroup(panelLaout.createSequentialGroup()
                .addGap(0,0,Short.MAX_VALUE)
                .addComponent(getSPKisiBilgiler(), javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                    .addComponent(getKisiSilButon())
                    .addComponent(getKisiTumunuSilButon())
                    .addComponent(getKisiGuncelleButon())
                    .addComponent(getKisiSorgula())
                    .addComponent(getKisiListele()))
                .addGap(0,0,0)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getSPKisiBilgiler(), javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())        
                  
            );  
        return digerPanelBilgiler;
    }
     
    public JButton getKisiListele(){
        if(btnListele==null){
            btnListele=new JButton();
        }
        btnListele.setText("KİŞİ LİSTELE");
        return btnListele;
    }
     public JButton getKisiSilButon(){
        if(btnSil==null){
            btnSil=new JButton();
        }
        btnSil.setText("KİŞİ SİL");
        return btnSil;
    }
     
     public JButton getKisiGuncelleButon(){
        if(btnGuncelle==null){
            btnGuncelle=new JButton();
        }
          btnGuncelle.setText("KİŞİ GÜNCELLE");
        return btnGuncelle;
    }
     
      public JButton getKisiTumunuSilButon(){
        if(btnTumunuSil==null){
            btnTumunuSil=new JButton();
        }
          btnTumunuSil.setText("TÜMÜNÜ SİL");
        return btnTumunuSil;
    }
      
       public JButton getKisiSorgula(){
        if(btnKisiSorgula==null){
            btnKisiSorgula=new JButton();
        }
          btnKisiSorgula.setText("KİŞİ SORGULA");
        return btnKisiSorgula;
    }
       
       private JTable getTblVeriler(){
           if(tblVeriler==null){
               tblVeriler=new JTable();
           }
           
          tblVeriler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "KİŞİ İD", "KİŞİ AD", "KİŞİ SOYAD", "KİŞİ CEPTEL", "KİŞİ ADRES", "KİŞİ KİMLİK NO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
           return tblVeriler;
       }
     
    private JScrollPane getSPKisiBilgiler() {
       
        if(spScrollPane==null){
            spScrollPane=new JScrollPane();
        }
        
        spScrollPane.setViewportView(getTblVeriler());
        
        return spScrollPane;
        
    }

    @Override
    public void actionPerformed(ActionEvent event) {
       
        if(event.getActionCommand().trim().equals("KİŞİ SİL")){
            
          
            if(tblVeriler.getSelectedRow()>=0){
                int id=Integer.parseInt(tblVeriler.getModel().getValueAt(tblVeriler.getSelectedRow(),0).toString());
                Object[] dugmeler={"EVET SİL","HAYIR SİLME"};
                int gelenDeger=JOptionPane.showOptionDialog(null,"Seçilen Veriyi Silmek İstiyormusunuz?", "Uyarı Mesajı", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,dugmeler,dugmeler[1]);
                if(gelenDeger==0){
                        controller.exeCute("KİŞİ SİL",new Object[]{id});
                        formuTemizle();
                        tabloyuGuncelle();
                }
            }else
                JOptionPane.showMessageDialog(null,"Silme yapmak için lütfen seçim yapınız.","Uyarı",JOptionPane.WARNING_MESSAGE);
            
          
        }
        else if(event.getActionCommand().trim().equals("KİŞİ GÜNCELLE")){
            if(isBosmuControl()){
                if(tblVeriler.getSelectedRow()>=0){
                      Object[] gelenDegerler=new Object[]{Integer.parseInt(tblVeriler.getModel().getValueAt(tblVeriler.getSelectedRow(),0).toString()),
                      String.valueOf(getTxtKisiAd().getText()),String.valueOf(getTxtKisiSoyad().getText()),String.valueOf(getTxtKisiTelefon().getText()),String.valueOf(getTxtKisiAdres().getText()),String.valueOf(getTxtKisiKimlikNo().getText())};
                  controller.exeCute("KİŞİ GÜNCELLE",gelenDegerler);
                  formuTemizle();
                  tabloyuGuncelle();
                }
            }else
                JOptionPane.showMessageDialog(null,"Kişi güncellemek için lütfen verileri doğru giriniz.","Uyarı",JOptionPane.WARNING_MESSAGE);
            
        }
        else if(event.getActionCommand().trim().equals("TÜMÜNÜ SİL")){
            Object[] dugmeler={"EVET TÜMÜNÜ SİL","HAYIR TÜMÜNÜ SİLME"};
            int gelenDeger=JOptionPane.showOptionDialog(null,"Tüm Verileri Silmek İstiyormusunuz?", "Uyarı Mesajı", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,dugmeler,dugmeler[1]);
            if(gelenDeger==0){
                controller.exeCute("TÜMÜNÜ SİL",null);
                tabloyuGuncelle();
                formuTemizle();
            }
        }
        else if(event.getActionCommand().trim().equals("KİŞİ LİSTELE")){
            tabloyuGuncelle();
            formuTemizle();
        }
        else if(event.getActionCommand().trim().equals("KİŞİ SORGULA")){
            
            arrayListKisiler.clear();
            DefaultTableModel model=(DefaultTableModel)getTblVeriler().getModel();
            model.setRowCount(0);

            gonderilenSutunlar();

            String kisiSorgula="SELECT * FROM KISILER WHERE ";

            int say=0;
            for(int i=0;i<columns.length;i++)
                if(columns[i]!="")
                    say++;

            for(int i=0;i<columns.length;i++){

                if(columns[i]!=""){
                    kisiSorgula +=columns[i];
                    if(say>=2){
                        kisiSorgula+=" AND ";
                        say--;
                    }
                }

            }

            System.out.println("Sorgu :"+kisiSorgula);

            arrayListKisiler=controller.exeCute("KİŞİ SORGULA", new Object[]{kisiSorgula});

            if(arrayListKisiler.size()>0){
             Object[] row=new Object[6];
                for(int i=0;i<arrayListKisiler.size();i++){

                        row[0]=arrayListKisiler.get(i).getKisiID();
                        row[1]=arrayListKisiler.get(i).getKisiAd();
                        row[2]=arrayListKisiler.get(i).getKisiSoyad();
                        row[3]=arrayListKisiler.get(i).getKisiCepTel();
                        row[4]=arrayListKisiler.get(i).getKisiAdres();
                        row[5]=arrayListKisiler.get(i).getKisiKimlikNo();
                        model.addRow(row);        
                }
            }

            }
    }
    
    private void gonderilenSutunlar(){

        columns=new String[5];
        
        for(int i=0;i<columns.length;i++)
            columns[i]="";
        
       if(!getTxtKisiAd().getText().trim().equals(""))
           columns[0]="KISIAD='"+getTxtKisiAd().getText().trim()+"'";
       else
           columns[0]="";
       
       if(!getTxtKisiSoyad().getText().trim().equals(""))
           columns[1]="KISISOYAD='"+getTxtKisiSoyad().getText().trim()+"'";
       else
           columns[1]="";
         
       if(!getTxtKisiTelefon().getText().trim().equals(""))
           columns[2]="KISICEPTEL='"+getTxtKisiTelefon().getText().trim()+"'";
       else
           columns[2]="";
           
       if(!getTxtKisiAdres().getText().trim().equals(""))
           columns[3]="KISIADRES='"+getTxtKisiAdres().getText().trim()+"'";
       else
           columns[3]="";
             
       if(!getTxtKisiKimlikNo().getText().trim().equals(""))
           columns[4]="KISIKIMLIKNO='"+getTxtKisiKimlikNo().getText().trim()+"'";
       else
           columns[4]="";
        
    }
    
     public void tabloyuGuncelle() {

        Kisi kisi=null;
        arrayListKisiler.clear();
        DefaultTableModel model=(DefaultTableModel)getTblVeriler().getModel();
        model.setRowCount(0);
        
        try {
            arrayListKisiler=controller.exeCute("KİŞİ LİSTELE", null);    
            Object[] row=new Object[6];
            for(int i=0;i<arrayListKisiler.size();i++){
                
                    row[0]=arrayListKisiler.get(i).getKisiID();
                    row[1]=arrayListKisiler.get(i).getKisiAd();
                    row[2]=arrayListKisiler.get(i).getKisiSoyad();
                    row[3]=arrayListKisiler.get(i).getKisiCepTel();
                    row[4]=arrayListKisiler.get(i).getKisiAdres();
                    row[5]=arrayListKisiler.get(i).getKisiKimlikNo();
                    model.addRow(row);   
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"HATA :"+e+"\n\nVerileri yükleme işlemi başarız bir şekilde sonuçlandı.","Hata Mesaj",JOptionPane.ERROR_MESSAGE);
        }
        
        arrayListKisiler.clear();
    }

    @Override
    public void mouseClicked(MouseEvent me) {
       
        System.out.println("Tıklandı.");
        int row=tblVeriler.getSelectedRow();
        getTxtKisiAd().setText(tblVeriler.getValueAt(row, 1).toString());
        getTxtKisiSoyad().setText(tblVeriler.getValueAt(row, 2).toString());
        getTxtKisiTelefon().setText(tblVeriler.getValueAt(row, 3).toString());
        getTxtKisiAdres().setText(tblVeriler.getValueAt(row, 4).toString());
        getTxtKisiKimlikNo().setText(tblVeriler.getValueAt(row, 5).toString());
        System.out.println("Tıklandı Bitti.");
    }

    @Override
    public void mousePressed(MouseEvent me) {
       
    }

    @Override
    public void mouseReleased(MouseEvent me) {
      
    }

    @Override
    public void mouseEntered(MouseEvent me) {
      
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
     
     
   
}
