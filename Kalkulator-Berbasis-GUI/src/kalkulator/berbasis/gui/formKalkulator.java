package kalkulator.berbasis.gui;
// Izza Amri dengan NIM 191011401558
public class formKalkulator extends javax.swing.JFrame {
    public formKalkulator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelAngka1 = new javax.swing.JLabel();
        labelOperator = new javax.swing.JLabel();
        labelAngka2 = new javax.swing.JLabel();
        labelHasil = new javax.swing.JLabel();
        Hitung = new javax.swing.JButton();
        textAngka1 = new javax.swing.JTextField();
        boxOperator = new javax.swing.JComboBox<>();
        textAngka2 = new javax.swing.JTextField();
        textHasil = new javax.swing.JTextField();
        labelJudul = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelAngka1.setText("Angka 1");

        labelOperator.setText("Operator");

        labelAngka2.setText("Angka 2");

        labelHasil.setText("Hasil");

        Hitung.setText("Hitung");
        Hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitungActionPerformed(evt);
            }
        });

        boxOperator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+ (Tambah)", "- (Kurang)", "X (Kali)", "/ (Bagi)" }));

        labelJudul.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelJudul.setText("Kalkulator Sederhana");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 8)); // NOI18N
        jLabel1.setText("Created by Izza Amri");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(labelJudul))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAngka1)
                                    .addComponent(textAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelOperator)
                                    .addComponent(boxOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAngka2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(textAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Hitung)))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelHasil)
                                    .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(labelJudul)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAngka1)
                    .addComponent(labelOperator)
                    .addComponent(labelAngka2)
                    .addComponent(labelHasil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Hitung)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitungActionPerformed
        if(boxOperator.getSelectedItem().toString().equalsIgnoreCase("+ (Tambah)")){
            int angka1 = Integer.parseInt(textAngka1.getText());
            int angka2 = Integer.parseInt(textAngka2.getText());
            int total = angka1+angka2;
            textHasil.setText(Integer.toString(total));
        }
        if(boxOperator.getSelectedItem().toString().equalsIgnoreCase("- (Kurang)")){
            int angka1 = Integer.parseInt(textAngka1.getText());
            int angka2 = Integer.parseInt(textAngka2.getText());
            int total = angka1-angka2;
            textHasil.setText(Integer.toString(total));
        }
        if(boxOperator.getSelectedItem().toString().equalsIgnoreCase("X (Kali)")){
            int angka1 = Integer.parseInt(textAngka1.getText());
            int angka2 = Integer.parseInt(textAngka2.getText());
            int total = angka1*angka2;
            textHasil.setText(Integer.toString(total));
        }
        if(boxOperator.getSelectedItem().toString().equalsIgnoreCase("/ (Bagi)")){
            int angka1 = Integer.parseInt(textAngka1.getText());
            int angka2 = Integer.parseInt(textAngka2.getText());
            int total = angka1/angka2;
            textHasil.setText(Integer.toString(total));
        }
    }//GEN-LAST:event_HitungActionPerformed
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
            java.util.logging.Logger.getLogger(formKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formKalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formKalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hitung;
    private javax.swing.JComboBox<String> boxOperator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelAngka1;
    private javax.swing.JLabel labelAngka2;
    private javax.swing.JLabel labelHasil;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelOperator;
    private javax.swing.JTextField textAngka1;
    private javax.swing.JTextField textAngka2;
    private javax.swing.JTextField textHasil;
    // End of variables declaration//GEN-END:variables
}