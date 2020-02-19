/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Estuardo
 */
public class addDoctor extends javax.swing.JFrame {
    Doctor cola = new Doctor();

    /**
     * Creates new form addDoctor
     */
    public addDoctor() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreDoc = new javax.swing.JTextField();
        btnAddDoc = new javax.swing.JButton();
        btnShowDoc = new javax.swing.JButton();
        btnDeleteDoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 800));
        setMinimumSize(new java.awt.Dimension(800, 800));
        setPreferredSize(new java.awt.Dimension(800, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Añadir un Doctor");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 16, 160, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Nombre: ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txtNombreDoc.setToolTipText("Ingrese el nombre ");
        getContentPane().add(txtNombreDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 210, 30));

        btnAddDoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddDoc.setText("Añadir");
        btnAddDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDocActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 120, 50));

        btnShowDoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnShowDoc.setText("Mostrar");
        btnShowDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDocActionPerformed(evt);
            }
        });
        getContentPane().add(btnShowDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 120, 50));

        btnDeleteDoc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDeleteDoc.setText("Borrar");
        btnDeleteDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteDocActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 30, 120, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDocActionPerformed
        // TODO add your handling code here:
        System.out.println("Agregando a la Cola");
        cola.insertarCola(txtNombreDoc.getText());
        txtNombreDoc.setText("");
    }//GEN-LAST:event_btnAddDocActionPerformed

    private void btnShowDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDocActionPerformed
        // TODO add your handling code here:
        System.out.println("Cola:");
        cola.mostarCola();
    }//GEN-LAST:event_btnShowDocActionPerformed

    private void btnDeleteDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteDocActionPerformed
        // TODO add your handling code here:
        System.out.println("Se Borrara el Elemento de la Cola");
        cola.sacarCola();
    }//GEN-LAST:event_btnDeleteDocActionPerformed

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
            java.util.logging.Logger.getLogger(addDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDoctor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDoc;
    private javax.swing.JButton btnDeleteDoc;
    private javax.swing.JButton btnShowDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtNombreDoc;
    // End of variables declaration//GEN-END:variables
}
