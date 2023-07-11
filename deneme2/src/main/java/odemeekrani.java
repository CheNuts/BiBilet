import java.awt.Color;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.JOptionPane;

public class odemeekrani extends javax.swing.JFrame {

 
    public odemeekrani() {
        initComponents();
        addComboBoxListener();
        getContentPane().setBackground(Color.decode("#2C3E50"));
        setPlaceholderText();
        setCardNumberFormat();
        setExpirationDateFormat();
        setCVVFormat();
        setPhoneFormat();
        setMailFormat();
        
    }
    
    private void setPlaceholderText() {
        jTextField1.setForeground(Color.gray);
        jTextField1.setText("Adın, Soyadın*");

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (jTextField1.getText().equals("Adın, Soyadın*")) {
                    jTextField1.setText("");
                    jTextField1.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (jTextField1.getText().isEmpty()) {
                    jTextField1.setForeground(Color.gray);
                    jTextField1.setText("Adın, Soyadın*");
                }
            }
        });
    }
    
    private void setCardNumberFormat() {
        kredikartiTextField.setForeground(Color.gray);
        kredikartiTextField.setText("Kredi Kartı Numaran");

        kredikartiTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (kredikartiTextField.getText().equals("Kredi Kartı Numaran")) {
                    kredikartiTextField.setText("");
                    kredikartiTextField.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (kredikartiTextField.getText().isEmpty()) {
                    kredikartiTextField.setForeground(Color.gray);
                    kredikartiTextField.setText("Kredi Kartı Numaran");
                }
            }
        });
        AbstractDocument doc = (AbstractDocument) kredikartiTextField.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < string.length(); i++) {
                    char c = string.charAt(i);
                    if (Character.isDigit(c)) {
                        sb.append(c);
                    }
                }
                super.insertString(fb, offset, sb.toString(), attr);
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);
                    if (Character.isDigit(c)) {
                        sb.append(c);
                    }
                }
                super.replace(fb, offset, length, sb.toString(), attrs);
            }
        });
    }
    
    private void setExpirationDateFormat() {
        sktTextField.setForeground(Color.gray);
        sktTextField.setText("Son Kullanım Tarihi");

        sktTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (sktTextField.getText().equals("Son Kullanım Tarihi")) {
                    sktTextField.setText("");
                    sktTextField.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (sktTextField.getText().isEmpty()) {
                    sktTextField.setForeground(Color.gray);
                    sktTextField.setText("Son Kullanım Tarihi");
                }
            }
        });

        // Sadece rakam girilmesini sağlayan filtre
        AbstractDocument doc = (AbstractDocument) sktTextField.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < string.length(); i++) {
                    char c = string.charAt(i);
                    if (Character.isDigit(c)) {
                        sb.append(c);
                    }
                }
                super.insertString(fb, offset, sb.toString(), attr);
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);
                    if (Character.isDigit(c)) {
                        sb.append(c);
                    }
                }
                super.replace(fb, offset, length, sb.toString(), attrs);
            }
        });
    }
    
    private void setCVVFormat() {
        cvvTextField.setForeground(Color.gray);
        cvvTextField.setText("Güvenlik Numarası (CVV)");

        cvvTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (cvvTextField.getText().equals("Güvenlik Numarası (CVV)")) {
                    cvvTextField.setText("");
                    cvvTextField.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (cvvTextField.getText().isEmpty()) {
                    cvvTextField.setForeground(Color.gray);
                    cvvTextField.setText("Güvenlik Numarası (CVV)");
                }
            }
        });

        // Sadece rakam girilmesini sağlayan filtre
        AbstractDocument doc = (AbstractDocument) cvvTextField.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < string.length(); i++) {
                    char c = string.charAt(i);
                    if (Character.isDigit(c)) {
                        sb.append(c);
                    }
                }
                super.insertString(fb, offset, sb.toString(), attr);
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);
                    if (Character.isDigit(c)) {
                        sb.append(c);
                    }
                }
                super.replace(fb, offset, length, sb.toString(), attrs);
            }
        });
    }
    
    private void setPhoneFormat() {
        cepTextField.setForeground(Color.gray);
        cepTextField.setText("Cep Telefonu*");

        cepTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (cepTextField.getText().equals("Cep Telefonu*")) {
                    cepTextField.setText("");
                    cepTextField.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (cepTextField.getText().isEmpty()) {
                    cepTextField.setForeground(Color.gray);
                    cepTextField.setText("Cep Telefonu*");
                }
            }
        });

        // Sadece rakam girilmesini sağlayan filtre
        AbstractDocument doc = (AbstractDocument) cepTextField.getDocument();
        doc.setDocumentFilter(new DocumentFilter() {
            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < string.length(); i++) {
                    char c = string.charAt(i);
                    if (Character.isDigit(c)) {
                        sb.append(c);
                    }
                }
                super.insertString(fb, offset, sb.toString(), attr);
            }

            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                if (text == null) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < text.length(); i++) {
                    char c = text.charAt(i);
                    if (Character.isDigit(c)) {
                        sb.append(c);
                    }
                }
                super.replace(fb, offset, length, sb.toString(), attrs);
            }
        });
    }
    
    private void setMailFormat() {
        mailTextField.setForeground(Color.gray);
        mailTextField.setText("E-mail*");

        mailTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            @Override
            public void focusGained(java.awt.event.FocusEvent evt) {
                if (mailTextField.getText().equals("E-mail*")) {
                    mailTextField.setText("");
                    mailTextField.setForeground(Color.black);
                }
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent evt) {
                if (mailTextField.getText().isEmpty()) {
                    mailTextField.setForeground(Color.gray);
                    mailTextField.setText("E-mail*");
                }
            }
        });
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        biletComboBox = new javax.swing.JComboBox<>();
        fiyatLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        kredikartiTextField = new javax.swing.JTextField();
        sktTextField = new javax.swing.JTextField();
        cvvTextField = new javax.swing.JTextField();
        mailTextField = new javax.swing.JTextField();
        cepTextField = new javax.swing.JTextField();
        odemeyitmmlaButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        biletComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bilet Türünü Seçiniz", "Tam", "Öğrenci" }));
        biletComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biletComboBoxActionPerformed(evt);
            }
        });

        fiyatLabel.setForeground(new java.awt.Color(255, 255, 255));
        fiyatLabel.setText("Ödeme Tutarı : ");

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("<-- Önceki Sayfa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Adın, Soyadın*");

        kredikartiTextField.setForeground(new java.awt.Color(0, 0, 0));
        kredikartiTextField.setText("Kredi Kartı Numaran");
        kredikartiTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kredikartiTextFieldActionPerformed(evt);
            }
        });

        sktTextField.setForeground(new java.awt.Color(0, 0, 0));
        sktTextField.setText("Son Kullanım Tarihi");

        cvvTextField.setForeground(new java.awt.Color(0, 0, 0));
        cvvTextField.setText("Güvenlik Numarası (CVV)");

        mailTextField.setForeground(new java.awt.Color(0, 0, 0));
        mailTextField.setText("E-mail*");

        cepTextField.setForeground(new java.awt.Color(0, 0, 0));
        cepTextField.setText("Cep Telefonu*");
        cepTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cepTextFieldActionPerformed(evt);
            }
        });

        odemeyitmmlaButton.setText("Ödemeyi Tamamla");
        odemeyitmmlaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odemeyitmmlaButtonActionPerformed(evt);
            }
        });

        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Ön Bilgilendirme Koşulları'nı ve Mesafeli Satış Sözleşmesi'ni okudum, onaylıyorum.");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(454, 454, 454)
                        .addComponent(biletComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(fiyatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(392, 392, 392)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(392, 392, 392)
                                .addComponent(cepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(odemeyitmmlaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kredikartiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sktTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cvvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jCheckBox1)))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(biletComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiyatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kredikartiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sktTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(odemeyitmmlaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jCheckBox1)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        anabolum anabolumgecis = new anabolum();
        anabolumgecis.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void odemeyitmmlaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemeyitmmlaButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Ödeme Tamamlandı! Bilet Numaranız: #10001", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_odemeyitmmlaButtonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void biletComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biletComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_biletComboBoxActionPerformed

    private void cepTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepTextFieldActionPerformed

    private void kredikartiTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kredikartiTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kredikartiTextFieldActionPerformed

    

    private void addComboBoxListener() {
        biletComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateFiyatLabel();
            }
        });
    }

    private void updateFiyatLabel() {
        String selectedBilet = (String) biletComboBox.getSelectedItem();

        if (selectedBilet.equals("Tam")) {
            fiyatLabel.setText("Ödeme Tutarı: 100 TL");
        } else if (selectedBilet.equals("Öğrenci")) {
            fiyatLabel.setText("Ödeme Tutarı: 70 TL");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new odemeekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> biletComboBox;
    private javax.swing.JTextField cepTextField;
    private javax.swing.JTextField cvvTextField;
    private javax.swing.JLabel fiyatLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField kredikartiTextField;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JButton odemeyitmmlaButton;
    private javax.swing.JTextField sktTextField;
    // End of variables declaration//GEN-END:variables
}
