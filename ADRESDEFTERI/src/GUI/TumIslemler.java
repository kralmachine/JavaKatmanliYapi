
package GUI;

import bean.Kisi;
import java.sql.*;
import busıness.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class TumIslemler extends javax.swing.JFrame {

    SorguCalistir sorguIslemi=null;
    
    
    
    Kisi kisi=new Kisi();
    
    Connection baglanti=null;
    PreparedStatement preparedStatement=null;
    ResultSet resultSet;
    
    String[] columns=null;
    ArrayList<Kisi>arrayListKisi=new ArrayList<Kisi>();
    
    public TumIslemler() {
        initComponents();
        sorguIslemi=new SorguCalistir();
       
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKisiAd = new javax.swing.JTextField();
        txtKisiSoyad = new javax.swing.JTextField();
        txtKisiTelefon = new javax.swing.JTextField();
        btnKisiEkle = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbKisiTelTip = new javax.swing.JComboBox<>();
        txtKisiKimlikNo = new javax.swing.JTextField();
        btnKapat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKisiAdres = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSorgulaKisiAd = new javax.swing.JTextField();
        txtSorgulaKisiSoyad = new javax.swing.JTextField();
        txtSorgulaKisiKimlikNo = new javax.swing.JTextField();
        cbSorgulaKisiTelTip = new javax.swing.JComboBox<>();
        txtSorgulaKisiTelefon = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnKisiSorgula = new javax.swing.JButton();
        btnKisiGuncelle = new javax.swing.JButton();
        btnKisiSil = new javax.swing.JButton();
        btnTumunuSil = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSorgulaKisiAdres = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TUM İŞLEMLER");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("KİŞİ ADI :");

        jLabel2.setText("KİŞİ SOYAD :");

        jLabel3.setText("KİŞİ TELEFON :");

        jLabel4.setText("KİŞİ ADRES :");

        btnKisiEkle.setText("KİŞİ EKLE");
        btnKisiEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKisiEkleActionPerformed(evt);
            }
        });

        jLabel5.setText("KİŞİ TEL TİP :");

        jLabel6.setText("KİŞİ KİMLİK NO :");

        cbKisiTelTip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TÜRKİYE (YURT İÇİ)", "YURT DIŞI" }));
        cbKisiTelTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKisiTelTipActionPerformed(evt);
            }
        });

        btnKapat.setText("KAPAT");
        btnKapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKapatActionPerformed(evt);
            }
        });

        txtKisiAdres.setColumns(20);
        txtKisiAdres.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtKisiAdres.setRows(5);
        jScrollPane1.setViewportView(txtKisiAdres);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKisiAd)
                            .addComponent(txtKisiSoyad)
                            .addComponent(jScrollPane1)
                            .addComponent(txtKisiKimlikNo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbKisiTelTip, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtKisiTelefon, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 286, Short.MAX_VALUE)
                        .addComponent(btnKapat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnKisiEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKisiAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtKisiSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtKisiKimlikNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cbKisiTelTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKisiTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKapat)
                    .addComponent(btnKisiEkle))
                .addGap(103, 103, 103))
        );

        jTabbedPane1.addTab("KAYIT", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setFocusTraversalPolicyProvider(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel7.setText("KİŞİ ADI :");

        jLabel8.setText("KİŞİ SOYAD :");

        jLabel9.setText("KİŞİ KİMLİK NO :");

        jLabel10.setText("KİŞİ TEL TİP :");

        jLabel11.setText("KİŞİ TELEFON :");

        cbSorgulaKisiTelTip.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TÜRKİYE (YURT İÇİ)", "YURT DIŞI" }));
        cbSorgulaKisiTelTip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSorgulaKisiTelTipActionPerformed(evt);
            }
        });

        jLabel12.setText("KİŞİ ADRES :");

        btnKisiSorgula.setText("SORGULA");
        btnKisiSorgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKisiSorgulaActionPerformed(evt);
            }
        });

        btnKisiGuncelle.setText("KİŞİ GÜNCELLE");
        btnKisiGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKisiGuncelleActionPerformed(evt);
            }
        });

        btnKisiSil.setText("KİŞİ SİL");
        btnKisiSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKisiSilActionPerformed(evt);
            }
        });

        btnTumunuSil.setText("TÜMÜNÜ SİL");
        btnTumunuSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTumunuSilActionPerformed(evt);
            }
        });

        txtSorgulaKisiAdres.setColumns(20);
        txtSorgulaKisiAdres.setRows(5);
        jScrollPane3.setViewportView(txtSorgulaKisiAdres);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSorgulaKisiKimlikNo)
                    .addComponent(txtSorgulaKisiSoyad)
                    .addComponent(txtSorgulaKisiAd)
                    .addComponent(txtSorgulaKisiTelefon)
                    .addComponent(cbSorgulaKisiTelTip, 0, 220, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnKisiSil, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTumunuSil)
                        .addGap(131, 131, 131)
                        .addComponent(btnKisiGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnKisiSorgula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnKisiSil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnKisiGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnTumunuSil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(btnKisiSorgula, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtSorgulaKisiAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSorgulaKisiSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtSorgulaKisiKimlikNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(cbSorgulaKisiTelTip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtSorgulaKisiTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("SORGULA", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       tabloyuGuncelle();
    }//GEN-LAST:event_formWindowOpened

    private void btnTumunuSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTumunuSilActionPerformed
        
        Object[] dugmeler={"EVET SİL","HAYIR SİLME"};
        int gelenDeger=JOptionPane.showOptionDialog(rootPane,"Tüm Verileri Silmek İstiyormusunuz?", "Uyarı Mesajı", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,dugmeler,dugmeler[1]);
        if(gelenDeger==0){
            //tümünü silme işlemi
             sorguIslemi.tumunuSil();
            tabloyuGuncelle();
            formuTemizle();
        }else{
            ;
        }
        
    }//GEN-LAST:event_btnTumunuSilActionPerformed

    private void btnKisiSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKisiSilActionPerformed

        if(jTable1.getSelectedRow()>=0){

            Object[] dugmeler={"EVET SİL","HAYIR SİLME"};
            int gelenDeger=JOptionPane.showOptionDialog(rootPane,"Seçilen Veriyi Silmek İstiyormusunuz?", "Uyarı Mesajı", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,dugmeler,dugmeler[1]);
            if(gelenDeger==0){
                //silme işlemini çağır
                sorguIslemi.kisiSil(Integer.parseInt(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString()));
                tabloyuGuncelle();
                formuTemizle();
            }else{
                ;
            }
        }else{
            JOptionPane.showMessageDialog(null,"Silme işlemi yapmak için lütfen veriyi seçiniz.","Uyarı Mesaj",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnKisiSilActionPerformed

    private void btnKisiGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKisiGuncelleActionPerformed

        kisi=new Kisi(Integer.parseInt(jTable1.getModel().getValueAt(jTable1.getSelectedRow(),0).toString()),txtSorgulaKisiAd.getText().trim(), txtSorgulaKisiSoyad.getText().trim(), txtSorgulaKisiTelefon.getText().trim(), txtSorgulaKisiAdres.getText().trim(),txtSorgulaKisiKimlikNo.getText().trim());

        if(isSorgulaBosmuControl()){
            //guncelleKisi(kisi);
            sorguIslemi.guncelleKisi(kisi);
            tabloyuGuncelle();
            formuTemizle();
        }else
        JOptionPane.showMessageDialog(null, "Lütfen Değerleri Boş Geçmeyiniz.","Mesaj",JOptionPane.WARNING_MESSAGE);
        
    }//GEN-LAST:event_btnKisiGuncelleActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int row=jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
        txtSorgulaKisiAd.setText(jTable1.getValueAt(row, 1).toString());
        txtSorgulaKisiSoyad.setText(jTable1.getValueAt(row, 2).toString());
        
        //regex kullanılacak unutma
        txtSorgulaKisiTelefon.setText(jTable1.getValueAt(row, 3).toString());
        
        txtSorgulaKisiAdres.setText(jTable1.getValueAt(row, 4).toString());
        txtSorgulaKisiKimlikNo.setText(jTable1.getValueAt(row, 5).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void cbSorgulaKisiTelTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSorgulaKisiTelTipActionPerformed
        
        //regex uygulanacak yurt içi ve yurt dışı ile ilgili
         if(cbKisiTelTip.getSelectedIndex()==0)
             txtSorgulaKisiTelefon.setText("(___) ___ __ __");
        else
             txtSorgulaKisiTelefon.setText("(____) ___ __ __");
        
    }//GEN-LAST:event_cbSorgulaKisiTelTipActionPerformed

    private void btnKapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKapatActionPerformed

        Object[] dugmeler={"EVET KAPAT","HAYIR KAPATMA"};
        int gelenDeger=JOptionPane.showOptionDialog(rootPane,"Formu Kapatmak İstiyormusunuz?", "Uyarı Mesajı", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,dugmeler,dugmeler[1]);
        if(gelenDeger==0)
            System.exit(0);
        
    }//GEN-LAST:event_btnKapatActionPerformed

    private void cbKisiTelTipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKisiTelTipActionPerformed

        //regex uygulanacak yurt içi ve yurt dışı ile ilgili        
        if(cbKisiTelTip.getSelectedIndex()==0)
            txtKisiTelefon.setText("(___) ___ __ __");
        else
            txtKisiTelefon.setText("(+__) ____ ___ ____");
        
    }//GEN-LAST:event_cbKisiTelTipActionPerformed

    private void btnKisiEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKisiEkleActionPerformed

     
        kisi.setKisiAd(txtKisiAd.getText().trim());
        kisi.setKisiSoyad(txtKisiSoyad.getText().trim());
        kisi.setKisiCepTel(txtKisiTelefon.getText().trim());
        kisi.setKisiAdres(txtKisiAdres.getText().trim());
        kisi.setKisiKimlikNo(txtKisiKimlikNo.getText().trim());

        if(isBosmuControl()){
            //kisiKaydet(kisi);
            sorguIslemi.kisiKaydet(kisi);
            tabloyuGuncelle();
            formuTemizle();
        }else
            JOptionPane.showMessageDialog(null, "Lütfen Değerleri Boş Geçmeyiniz.\n\nLütfen Kimlik Numarasını ve Cep Telefonu Numarasını düzgün yazınız.","Mesaj",JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnKisiEkleActionPerformed

    private void gonderilenSutunlar(){

        columns=new String[5];
        
        for(int i=0;i<columns.length;i++)
            columns[i]="";
        
       if(!txtSorgulaKisiAd.getText().trim().equals(""))
           columns[0]="KISIAD='"+txtSorgulaKisiAd.getText().trim()+"'";
       else
           columns[0]="";
       
       if(!txtSorgulaKisiSoyad.getText().trim().equals(""))
           columns[1]="KISISOYAD='"+txtSorgulaKisiSoyad.getText().trim()+"'";
       else
           columns[1]="";
         
       if(!txtSorgulaKisiTelefon.getText().trim().equals(""))
           columns[2]="KISICEPTEL='"+txtSorgulaKisiTelefon.getText().trim()+"'";
       else
           columns[2]="";
           
       if(!txtSorgulaKisiAdres.getText().trim().equals(""))
           columns[3]="KISIADRES='"+txtSorgulaKisiAdres.getText().trim()+"'";
       else
           columns[3]="";
             
       if(!txtSorgulaKisiKimlikNo.getText().trim().equals(""))
           columns[4]="KISIKIMLIKNO='"+txtSorgulaKisiKimlikNo.getText().trim()+"'";
       else
           columns[4]="";
        
    }
    
    private void btnKisiSorgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKisiSorgulaActionPerformed
        
        arrayListKisi.clear();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
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
        
        arrayListKisi=sorguIslemi.seciliOlanKayitIcinListele(kisiSorgula);
        
        if(arrayListKisi.size()>0){
         Object[] row=new Object[6];
            for(int i=0;i<arrayListKisi.size();i++){
                
                    row[0]=arrayListKisi.get(i).getKisiID();
                    row[1]=arrayListKisi.get(i).getKisiAd();
                    row[2]=arrayListKisi.get(i).getKisiSoyad();
                    row[3]=arrayListKisi.get(i).getKisiCepTel();
                    row[4]=arrayListKisi.get(i).getKisiAdres();
                    row[5]=arrayListKisi.get(i).getKisiKimlikNo();
                    model.addRow(row);        
            }
        }
        
        //formuTemizle(); GEREKEBİLİR.
    }//GEN-LAST:event_btnKisiSorgulaActionPerformed

    private void tabloyuGuncelle() {

        Kisi kisi=null;
        arrayListKisi.clear();
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        
        try {
            arrayListKisi=sorguIslemi.tumunuListele();    
            Object[] row=new Object[6];
            for(int i=0;i<arrayListKisi.size();i++){
                
                    row[0]=arrayListKisi.get(i).getKisiID();
                    row[1]=arrayListKisi.get(i).getKisiAd();
                    row[2]=arrayListKisi.get(i).getKisiSoyad();
                    row[3]=arrayListKisi.get(i).getKisiCepTel();
                    row[4]=arrayListKisi.get(i).getKisiAdres();
                    row[5]=arrayListKisi.get(i).getKisiKimlikNo();
                    model.addRow(row);   
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"HATA :"+e+"\n\nVerileri yükleme işlemi başarız bir şekilde sonuçlandı.","Hata Mesaj",JOptionPane.ERROR_MESSAGE);
        }
        
        arrayListKisi.clear();
    }

    private void formuTemizle() {
        
       //kayıt panelindeki textField'ler
       txtKisiAd.setText("");
       txtKisiSoyad.setText("");
       txtKisiTelefon.setText("");
       txtKisiAdres.setText("");
       txtKisiKimlikNo.setText("");
       //sorgu panelindeki textField'ler
       txtSorgulaKisiAd.setText("");
       txtSorgulaKisiSoyad.setText("");
       txtSorgulaKisiTelefon.setText("");
       txtSorgulaKisiAdres.setText("");
       txtSorgulaKisiKimlikNo.setText("");
       //kisi nesnesini sıfırlıyoruz
       kisi.setKisiID(-1);
       kisi.setKisiAd("");
       kisi.setKisiSoyad("");
       kisi.setKisiCepTel("");
       kisi.setKisiAdres("");
       kisi.setKisiKimlikNo("");
       
    }
    
    private boolean isCepTelKontrol(){
        boolean durum=true;
         if(cbKisiTelTip.getSelectedIndex()==0){//[1-9]{1}[0-9]{10} //
            if(!txtKisiTelefon.getText().matches("^5[0-9]{2} [0-9]{3} [0-9]{2} [0-9]{2}$")){
                JOptionPane.showMessageDialog(null, "Lütfen Kişi Yurt İçi Telefon Numarası Düzgün Formtta Giriniz. ","Uyarı",JOptionPane.WARNING_MESSAGE);
                durum=false;
            }
        }else if(cbKisiTelTip.getSelectedIndex()==1){
            if(!txtKisiTelefon.getText().matches("^[0-9]{2} [1-9]{1}[0-9]{2} [0-9]{1}[0-9]{2} [0-9]{2}[0-9]{2}$")){
                 JOptionPane.showMessageDialog(null, "Lütfen Kişi Yurt Dışı Telefon Numarası Düzgün Formtta Giriniz. ","Uyarı",JOptionPane.WARNING_MESSAGE);
                 durum=false;
            }
        }
         
         return durum;
    }
   
    private boolean isBosmuControl(){
      
        if(kisi.getKisiAd().trim().equals("") || kisi.getKisiSoyad().trim().equals("") || kisi.getKisiCepTel().trim().equals("") || kisi.getKisiAdres().trim().equals("") || txtKisiKimlikNo.getText().length()!=11 || !txtKisiKimlikNo.getText().matches("^[1-9]{1}[0-9]{10}$") || !isCepTelKontrol())
            return false;
        else
            return true;
        
    }
    
     private boolean isSorgulaBosmuControl(){
      
        if(txtSorgulaKisiAd.getText().trim().equals("") || txtSorgulaKisiSoyad.getText().trim().equals("") || txtSorgulaKisiTelefon.getText().trim().equals("") || txtSorgulaKisiAdres.getText().trim().equals("") || txtSorgulaKisiKimlikNo.getText().trim().equals("") || txtSorgulaKisiKimlikNo.getText().trim().length()!=11)
            return false;
        else
            return true;
        
    }
   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TumIslemler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TumIslemler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TumIslemler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TumIslemler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TumIslemler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKapat;
    private javax.swing.JButton btnKisiEkle;
    private javax.swing.JButton btnKisiGuncelle;
    private javax.swing.JButton btnKisiSil;
    private javax.swing.JButton btnKisiSorgula;
    private javax.swing.JButton btnTumunuSil;
    private javax.swing.JComboBox<String> cbKisiTelTip;
    private javax.swing.JComboBox<String> cbSorgulaKisiTelTip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtKisiAd;
    private javax.swing.JTextArea txtKisiAdres;
    private javax.swing.JTextField txtKisiKimlikNo;
    private javax.swing.JTextField txtKisiSoyad;
    private javax.swing.JTextField txtKisiTelefon;
    private javax.swing.JTextField txtSorgulaKisiAd;
    private javax.swing.JTextArea txtSorgulaKisiAdres;
    private javax.swing.JTextField txtSorgulaKisiKimlikNo;
    private javax.swing.JTextField txtSorgulaKisiSoyad;
    private javax.swing.JTextField txtSorgulaKisiTelefon;
    // End of variables declaration//GEN-END:variables
    
}
