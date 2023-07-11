import java.awt.Color;

public class galaksikoruyucu extends javax.swing.JFrame {


    public galaksikoruyucu() {
        initComponents();
        getContentPane().setBackground(Color.decode("#34495E"));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        saatComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        sehirComboBox = new javax.swing.JComboBox<>();
        sinemaComboBox = new javax.swing.JComboBox<>();
        koltuksirasiComboBox = new javax.swing.JComboBox<>();
        koltuknumarasiComboBox = new javax.swing.JComboBox<>();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Oyuncular: Dave Bautista, Chris Pratt, Zoe Saldana");

        saatComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seans Saati Seçiniz", "14:00", "18:00", "20:00" }));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Formatlar: 2D, 3D Dublajlı, Altyazılı");

        jLabel9.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Süre: 150 Dakika");

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tür: Aksiyon");

        jLabel11.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Vizyon Tarihi: 05.05.2023");

        sehirComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İl Seçiniz", "İstanbul", "İzmir", "Ankara", "Antalya" }));
        sehirComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sehirComboBoxActionPerformed(evt);
            }
        });

        sinemaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sinema Salonu Seçiniz" }));
        sinemaComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinemaComboBoxActionPerformed(evt);
            }
        });

        koltuksirasiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Koltuk Sırası Seçiniz" }));
        koltuksirasiComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koltuksirasiComboBoxActionPerformed(evt);
            }
        });

        koltuknumarasiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Koltuk Numarası Seçiniz", "1 (EN SOL)", "2", "3", "4", "5 (ORTA)", "6", "7", "8", "9", "10 (EN SAĞ)" }));
        koltuknumarasiComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                koltuknumarasiComboBoxActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\OneDrive\\Masaüstü\\OKUL PROJESİ\\filmafisleri\\galaksiposter.png")); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Galaksinin Koruyucuları 3");

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Guardians of the Galaxy Vol. 3");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\OneDrive\\Masaüstü\\OKUL PROJESİ\\filmafisleri\\TRDSİ_13+.svg.png")); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\OneDrive\\Masaüstü\\OKUL PROJESİ\\filmafisleri\\TRAİ_Olumsuz_örnek.svg.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\hasan\\OneDrive\\Masaüstü\\OKUL PROJESİ\\filmafisleri\\TRAİ_Şiddet.svg.png")); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Yönetmen: James Gunn");

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("<-- Önceki Sayfa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ödemeye Geç");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(sehirComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(sinemaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(koltuksirasiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(koltuknumarasiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saatComboBox, 0, 211, Short.MAX_VALUE))
                        .addGap(186, 186, 186))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(45, 45, 45)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(248, 248, 248)
                                        .addComponent(jLabel11)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sehirComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sinemaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(koltuksirasiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(koltuknumarasiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sehirComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sehirComboBoxActionPerformed
        // TODO add your handling code here:
        String selectedSehir = sehirComboBox.getSelectedItem().toString();
        String[] sinemalar = null;

        if (selectedSehir.equals("İstanbul")) {
            sinemalar = new String[] {"İGÜ Forum Sineması", "İGÜ Park Sineması", "İGÜ VadiPark Sineması"};
            koltuksirasiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"A(EN ÖN)", "B", "C", "D", "E(ORTA SIRA)", "G", "F", "H", "I(EN ARKA)"}));
        } else if (selectedSehir.equals("Ankara")) {
            sinemalar = new String[] {"İGÜ Kızılay Sineması", "İGÜ Mamak Sineması"};
            koltuksirasiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"A(EN ÖN)", "B", "C", "D", "E(ORTA SIRA)", "G", "F", "H", "I(EN ARKA)"}));
        } else if (selectedSehir.equals("İzmir")) {
            sinemalar = new String[] {"İGÜ Bornova Sineması", "İGÜ Karşıyaka Sineması"};
            koltuksirasiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"A(EN ÖN)", "B", "C", "D", "E(ORTA SIRA)", "G", "F", "H", "I(EN ARKA)"}));
        } else if (selectedSehir.equals("Antalya")) {
            sinemalar = new String[] {"İGÜ Manavgat Sineması", "İGÜ Kemer Sineması"};
            koltuksirasiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"A(EN ÖN)", "B", "C", "D", "E(ORTA SIRA)", "G", "F", "H", "I(EN ARKA)"}));
        }

        sinemaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(sinemalar));

    }//GEN-LAST:event_sehirComboBoxActionPerformed

    private void sinemaComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinemaComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sinemaComboBoxActionPerformed

    private void koltuksirasiComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koltuksirasiComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_koltuksirasiComboBoxActionPerformed

    private void koltuknumarasiComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_koltuknumarasiComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_koltuknumarasiComboBoxActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        anabolum anabolumegeri = new anabolum();
        anabolumegeri.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        odemeekrani odemegecis = new odemeekrani();
        odemegecis.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new galaksikoruyucu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> koltuknumarasiComboBox;
    private javax.swing.JComboBox<String> koltuksirasiComboBox;
    private javax.swing.JComboBox<String> saatComboBox;
    private javax.swing.JComboBox<String> sehirComboBox;
    private javax.swing.JComboBox<String> sinemaComboBox;
    // End of variables declaration//GEN-END:variables
}
