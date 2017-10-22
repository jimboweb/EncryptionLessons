package encryptionlessonroots;

import javax.swing.Action;
import javax.swing.text.DefaultEditorKit;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jimstewart
 */
public class EncryptionUI extends javax.swing.JFrame {
    private final Action cut = new DefaultEditorKit.CutAction();
    private final Action copy = new DefaultEditorKit.CopyAction();
    private final Action paste = new DefaultEditorKit.PasteAction();

    /**
     * Creates new form EncryptionUI
     */
    public EncryptionUI() {
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

        EnterMessageLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inputMessage = new javax.swing.JTextArea();
        encryptMessageLabel = new javax.swing.JLabel();
        encryptPattern = new javax.swing.JTextField();
        encryptButton = new javax.swing.JButton();
        decryptButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        outputMessage = new javax.swing.JTextArea();
        cutButton = new javax.swing.JButton();
        copyButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        randomButton = new javax.swing.JButton();
        TopMenuBar = new javax.swing.JMenuBar();
        EditMenuHeader = new javax.swing.JMenu();
        CutMenuItem = new javax.swing.JMenuItem(new DefaultEditorKit.CutAction());
        CopyMenuItem = new javax.swing.JMenuItem(new DefaultEditorKit.CopyAction());
        PasteMenuItem = new javax.swing.JMenuItem(new DefaultEditorKit.PasteAction());
        BeepMenuItem = new javax.swing.JMenuItem(new DefaultEditorKit.BeepAction());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EnterMessageLabel.setText("Enter your message below");

        inputMessage.setColumns(20);
        inputMessage.setRows(5);
        inputMessage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputMessageFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(inputMessage);

        encryptMessageLabel.setText("Input your encryption pattern below:");

        encryptButton.setText("Encrypt");
        encryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encryptButtonActionPerformed(evt);
            }
        });

        decryptButton.setText("Decrypt");
        decryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptButtonActionPerformed(evt);
            }
        });

        outputMessage.setColumns(20);
        outputMessage.setRows(5);
        jScrollPane2.setViewportView(outputMessage);

        cutButton.setText("Cut");

        copyButton.setText("Copy");

        jButton1.setText("Paste");

        randomButton.setText("random");
        randomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomButtonActionPerformed(evt);
            }
        });

        EditMenuHeader.setText("Edit");

        CutMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.META_MASK));
        CutMenuItem.setText("Cut");
        EditMenuHeader.add(CutMenuItem);

        CopyMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.META_MASK));
        CopyMenuItem.setText("Copy");
        EditMenuHeader.add(CopyMenuItem);

        PasteMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.META_MASK));
        PasteMenuItem.setText("Paste");
        PasteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteMenuItemActionPerformed(evt);
            }
        });
        EditMenuHeader.add(PasteMenuItem);

        BeepMenuItem.setText("Beep");
        EditMenuHeader.add(BeepMenuItem);

        TopMenuBar.add(EditMenuHeader);

        setJMenuBar(TopMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(encryptPattern, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EnterMessageLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(encryptMessageLabel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(encryptButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(decryptButton)
                        .addGap(31, 31, 31)
                        .addComponent(randomButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(cutButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(copyButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EnterMessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encryptMessageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(encryptPattern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(encryptButton)
                    .addComponent(decryptButton)
                    .addComponent(randomButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cutButton)
                    .addComponent(copyButton)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void encryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encryptButtonActionPerformed
        String message = inputMessage.getText();
        String pattern = encryptPattern.getText();
        EncryptionTool enc = new EncryptionTool();
        String encryptedMessage = enc.patternEncrypt(message, pattern);
        outputMessage.setText(encryptedMessage);
    }//GEN-LAST:event_encryptButtonActionPerformed

    private void decryptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptButtonActionPerformed
        String message = inputMessage.getText();
        String pattern = encryptPattern.getText();
        DecryptionTool dec = new DecryptionTool();
        String decryptedMessage = dec.patternDecrypt(message, pattern);
        outputMessage.setText(decryptedMessage);
    }//GEN-LAST:event_decryptButtonActionPerformed

    private void randomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomButtonActionPerformed
        // TODO add your handling code here:
        String input = inputMessage.getText();
        outputMessage.setText(input);
    }//GEN-LAST:event_randomButtonActionPerformed

    private void inputMessageFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputMessageFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_inputMessageFocusGained

    private void PasteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasteMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(EncryptionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncryptionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncryptionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncryptionUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncryptionUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem BeepMenuItem;
    private javax.swing.JMenuItem CopyMenuItem;
    private javax.swing.JMenuItem CutMenuItem;
    private javax.swing.JMenu EditMenuHeader;
    private javax.swing.JLabel EnterMessageLabel;
    private javax.swing.JMenuItem PasteMenuItem;
    private javax.swing.JMenuBar TopMenuBar;
    private javax.swing.JButton copyButton;
    private javax.swing.JButton cutButton;
    private javax.swing.JButton decryptButton;
    private javax.swing.JButton encryptButton;
    private javax.swing.JLabel encryptMessageLabel;
    private javax.swing.JTextField encryptPattern;
    private javax.swing.JTextArea inputMessage;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea outputMessage;
    private javax.swing.JButton randomButton;
    // End of variables declaration//GEN-END:variables
}
