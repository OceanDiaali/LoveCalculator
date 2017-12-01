/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.romancecalculator;

/**
 *
 * @author fum
 */
public class RomanceCalcUI extends javax.swing.JFrame {

    /**
     * Creates new form RomanceCalcUI
     */
    public RomanceCalcUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNameField = new javax.swing.JTextField();
        secondNameField = new javax.swing.JTextField();
        calcButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        resultPercentLabel = new javax.swing.JLabel();
        appLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        firstNameField.setBackground(new java.awt.Color(233, 210, 187));
        firstNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        firstNameField.setText("1st name");

        secondNameField.setBackground(new java.awt.Color(233, 204, 175));
        secondNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        secondNameField.setText("2nd name");

        calcButton.setText("calculate");
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });

        clearButton.setText("clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        resultPercentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        appLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appLabel.setText("Love Calculator");

        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        exitButton.setText("exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultLabel)
                            .addComponent(resultPercentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(appLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstNameField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(secondNameField))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(exitButton)
                .addGap(64, 64, 64)
                .addComponent(calcButton)
                .addGap(48, 48, 48)
                .addComponent(clearButton)
                .addGap(0, 89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(appLabel)
                .addGap(47, 47, 47)
                .addComponent(resultLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultPercentLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(secondNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearButton)
                            .addComponent(exitButton))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(calcButton)
                        .addContainerGap(46, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        firstNameField.setText("");
        secondNameField.setText("");
        resultLabel.setText("");
        resultPercentLabel.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        
        String name1=""; 
        String name2="";
        //String resultText="";
        //String resultPercentText="";
        
        name1 = firstNameField.getText();
        name2 = secondNameField.getText();
        double namesDiv = ((name1.length() / name2.length())*100);
        
        if(namesDiv <= 39.9){
          resultLabel.setText("No romance here..");
          resultPercentLabel.setText(namesDiv+"%");
        }else if(namesDiv <= 79.9){
          resultLabel.setText("Friendship exists");
          resultPercentLabel.setText(namesDiv+"%");
        }else{
          resultLabel.setText("Start planning the wedding!");
          resultPercentLabel.setText(namesDiv+"%");
        }
    }//GEN-LAST:event_calcButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RomanceCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RomanceCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RomanceCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RomanceCalcUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RomanceCalcUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appLabel;
    private javax.swing.JButton calcButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JLabel resultPercentLabel;
    private javax.swing.JTextField secondNameField;
    // End of variables declaration//GEN-END:variables
}
