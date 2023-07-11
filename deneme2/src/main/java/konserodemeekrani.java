import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

public class konserodemeekrani extends javax.swing.JFrame {

  
    public konserodemeekrani() {
        initComponents();
        getContentPane().setBackground(Color.decode("#EEEEEE"));
        setPlaceholderText();
        setCardNumberFormat();
        setExpirationDateFormat();
        setCVVFormat();
        setMaxCharacterLimit();
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

        // Sadece rakam girilmesini sağlayan filtre
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

    private void setMaxCharacterLimit() {
        cepTextField.setDocument(new JTextFieldLimit(11));
    }

    private class JTextFieldLimit extends javax.swing.text.PlainDocument {

        private int limit;

        JTextFieldLimit(int limit) {
            super();
            this.limit = limit;
        }

        @Override
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
            if (str == null) {
                return;
            }

            if ((getLength() + str.length()) <= limit) {
                super.insertString(offset, str, attr);
            }
        }
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        biletturuComboBox = new javax.swing.JComboBox<>();
        fiyattutariLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        kredikartiTextField = new javax.swing.JTextField();
        sktTextField = new javax.swing.JTextField();
        cvvTextField = new javax.swing.JTextField();
        mailTextField = new javax.swing.JTextField();
        cepTextField = new javax.swing.JTextField();
        odemeyitmmlaButton = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("<-- Önceki Sayfa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        biletturuComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bilet Türünü Seçiniz", "Tam", "Öğrenci" }));
        biletturuComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                biletturuComboBoxActionPerformed(evt);
            }
        });

        fiyattutariLabel.setForeground(new java.awt.Color(0, 0, 0));
        fiyattutariLabel.setText("Ödeme Tutarı : ");

        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("Adın, Soyadın*");

        kredikartiTextField.setForeground(new java.awt.Color(0, 0, 0));
        kredikartiTextField.setText("Kredi Kartı Numaran");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(331, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(biletturuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(fiyattutariLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(435, 435, 435))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(mailTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cepTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(odemeyitmmlaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kredikartiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(sktTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cvvTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(322, 322, 322))))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(biletturuComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fiyattutariLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
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
                .addContainerGap(149, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        konserekrani konserekraninadonus = new konserekrani();
        konserekraninadonus.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void biletturuComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_biletturuComboBoxActionPerformed
        // TODO add your handling code here:
        String secilenTur = (String) biletturuComboBox.getSelectedItem();
        if (secilenTur.equals("Tam")) {
            fiyattutariLabel.setText("Ödeme Tutarı : 260 TL");
        } else if (secilenTur.equals("Öğrenci")) {
            fiyattutariLabel.setText("Ödeme Tutarı : 200 TL");
        }
    }//GEN-LAST:event_biletturuComboBoxActionPerformed

    private void odemeyitmmlaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odemeyitmmlaButtonActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Ödeme Tamamlandı! Bilet Numaranız: #20001", "Bilgi", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_odemeyitmmlaButtonActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void cepTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cepTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cepTextFieldActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new konserodemeekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> biletturuComboBox;
    private javax.swing.JTextField cepTextField;
    private javax.swing.JTextField cvvTextField;
    private javax.swing.JLabel fiyattutariLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField kredikartiTextField;
    private javax.swing.JTextField mailTextField;
    private javax.swing.JButton odemeyitmmlaButton;
    private javax.swing.JTextField sktTextField;
    // End of variables declaration//GEN-END:variables
}
