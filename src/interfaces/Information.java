package interfaces;

import Etudiant.DAO;
import Etudiant.Etudiant;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class Information extends javax.swing.JFrame {

    public Information() {
        initComponents();
        showTable();
        
    }
    
    private final DAO dao = new DAO();
    
    private void showTable(){
        ArrayList<Etudiant> liste = dao.getAllEtudiants(); // Méthode de ta DAO
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Vider le tableau

        for (Etudiant e : liste) {
            Object[] row = new Object[]{
                e.getID(), e.getPrenom(), e.getNom(), e.getEmail(), e.getNInscription(), e.getCours()
            };
            model.addRow(row);
        }
    }
    
    private void resetFields() {
        txtPrenom.setText("");
        txtNom.setText("");
        txtEmail.setText("");
        txtNum.setText("");
        txtCours.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCours = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        txtNom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnAjout = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnSup = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 102, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Prenom", "Nom", "Email", "No d'inscription", "Cours"
            }
        ));
        jTable1.setSelectionForeground(new java.awt.Color(255, 0, 51));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 493, 1024, 159));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("INFORMATIONS DES ETUDIANTS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 34, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(84, 51, 26));
        jLabel2.setText("Prénom :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 214, -1, -1));

        txtCours.setForeground(new java.awt.Color(0, 102, 204));
        txtCours.setMinimumSize(new java.awt.Dimension(64, 30));
        txtCours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoursActionPerformed(evt);
            }
        });
        getContentPane().add(txtCours, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 384, 443, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(84, 51, 26));
        jLabel3.setText("Nom :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 256, -1, -1));

        txtNum.setForeground(new java.awt.Color(0, 102, 204));
        txtNum.setMinimumSize(new java.awt.Dimension(64, 30));
        txtNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumActionPerformed(evt);
            }
        });
        getContentPane().add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 342, 443, -1));

        txtEmail.setForeground(new java.awt.Color(0, 102, 204));
        txtEmail.setMinimumSize(new java.awt.Dimension(64, 30));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 300, 443, -1));

        txtPrenom.setForeground(new java.awt.Color(0, 102, 204));
        txtPrenom.setMinimumSize(new java.awt.Dimension(64, 30));
        getContentPane().add(txtPrenom, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 216, 443, -1));

        txtNom.setForeground(new java.awt.Color(0, 102, 204));
        txtNom.setMinimumSize(new java.awt.Dimension(64, 30));
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 258, 443, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(84, 51, 26));
        jLabel4.setText("Email :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 298, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(84, 51, 26));
        jLabel5.setText("No D'inscription :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(84, 51, 26));
        jLabel6.setText("Cours :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 382, -1, -1));

        btnAjout.setBackground(new java.awt.Color(153, 255, 153));
        btnAjout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAjout.setText("AJOUTER");
        btnAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnAjout, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 670, 175, -1));

        btnMod.setBackground(new java.awt.Color(0, 204, 255));
        btnMod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMod.setText("MODIFIER");
        btnMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModMouseClicked(evt);
            }
        });
        getContentPane().add(btnMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(582, 670, 175, -1));

        btnSup.setBackground(new java.awt.Color(255, 102, 102));
        btnSup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSup.setText("SUPPRIMER");
        btnSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupActionPerformed(evt);
            }
        });
        getContentPane().add(btnSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(882, 670, 175, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/proche.png"))); // NOI18N
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 53, 54));

        jLabel7.setForeground(new java.awt.Color(84, 51, 26));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/classe1.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoursActionPerformed

    private void btnAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutActionPerformed
        String prenom, nom, email, NInscription, cours;
        
        prenom = txtPrenom.getText();
        nom = txtNom.getText();
        email = txtEmail.getText();
        NInscription = txtNum.getText();
        cours = txtCours.getText();
        
        if(prenom.equals("")){
            JOptionPane.showMessageDialog(null, "Entrer le prénom");
        }
        else if(nom.equals("")){
            JOptionPane.showMessageDialog(null, "Entrer le nom");
        }
        else if(email.equals("")){
            JOptionPane.showMessageDialog(null, "Entrer l'email");
        }
        else if(NInscription.equals("")){
            JOptionPane.showMessageDialog(null, "Entrer le numéro d'inscription");
        }
        else if(cours.equals("")){
            JOptionPane.showMessageDialog(null, "Entrer le cours");
        }
        else{
            try {
                if(txtPrenom.getText().isEmpty() || txtNom.getText().isEmpty() || 
                    txtEmail.getText().isEmpty() || txtNum.getText().isEmpty() || 
                    txtCours.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Tous les champs doivent être remplis.");
                    return;
                }
                Etudiant e = new Etudiant(txtPrenom.getText(), txtNom.getText(), txtEmail.getText(), txtNum.getText(), txtCours.getText());
                dao.addEtudiant(e);
                showTable();
                JOptionPane.showMessageDialog(null, "Data ajouter avec succès !");
                resetFields();
                } catch (Exception e) {
                    Logger.getLogger(Information.class.getName()).log(Level.SEVERE, null, e);
                }
        }
    }//GEN-LAST:event_btnAjoutActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        int id = Integer.parseInt(model.getValueAt(selectedIndex, 0).toString());
        txtPrenom.setText(model.getValueAt(selectedIndex, 1).toString());
        txtNom.setText(model.getValueAt(selectedIndex, 2).toString());
        txtEmail.setText(model.getValueAt(selectedIndex, 3).toString());
        txtNum.setText(model.getValueAt(selectedIndex, 4).toString());
        txtCours.setText(model.getValueAt(selectedIndex, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModMouseClicked
        String prenom, nom, email, NInscription, cours;
        
        prenom = txtPrenom.getText();
        nom = txtNom.getText();
        email = txtEmail.getText();
        NInscription = txtNum.getText();
        cours = txtCours.getText();
        
        if(prenom.equals("")){
            JOptionPane.showMessageDialog(null, "Entrer le prénom");
        }
        else if(nom.equals("")){
            JOptionPane.showMessageDialog(null, "Entrer le nom");
        }
        else if(email.equals("")){
            JOptionPane.showMessageDialog(null, "Entrer l'email");
        }
        else if(NInscription.equals("")){
            JOptionPane.showMessageDialog(null, "Entrer le numéro d'inscription");
        }
        else if(cours.equals("")){
            JOptionPane.showMessageDialog(null, "Entrer le cours");
        }
        else{
            try {
                int selectedIndex = jTable1.getSelectedRow();
                if (selectedIndex != -1) {
                    int id = Integer.parseInt(jTable1.getValueAt(selectedIndex, 0).toString());
                    Etudiant e = new Etudiant(
                        id,
                        txtPrenom.getText(),
                        txtNom.getText(),
                        txtEmail.getText(),
                        txtNum.getText(),
                        txtCours.getText()
                    );
                    dao.updateEtudiant(e);
                    JOptionPane.showMessageDialog(null, "Data modifier avec succès !");
                    showTable();
                    resetFields();
                }
            } catch (Exception e) {
                Logger.getLogger(Information.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnModMouseClicked

    private void btnSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupActionPerformed
        try {
            int selectedIndex = jTable1.getSelectedRow();
            if (selectedIndex != -1) {
                int id = Integer.parseInt(jTable1.getValueAt(selectedIndex, 0).toString());
                dao.deleteEtudiant(id);
                JOptionPane.showMessageDialog(null, "Enregistrement supprimé !");
                showTable();
                resetFields();
            }    
        } catch (Exception ex) {
            Logger.getLogger(Information.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSupActionPerformed

    private void txtNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Information.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjout;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnSup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCours;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtPrenom;
    // End of variables declaration//GEN-END:variables
}
