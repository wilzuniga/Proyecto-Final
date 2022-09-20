/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import java.util.Properties;
import javax.swing.DefaultListModel;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.Properties;

import javax.imageio.ImageIO;

import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Part;
import javax.mail.Session;
import javax.mail.Store;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author wilme
 */
public class Correo extends javax.swing.JFrame {

    /**
     * Creates new form Correo
     */
    public Correo() {
        initComponents();
        jTable1.getTableHeader().setOpaque(false);
        jTable1.getTableHeader().setBackground(header);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PANELLATERAL1 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        AgregarArchivoBoton1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        GruposBoton2 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        GruposBoton3 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        GruposBoton4 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        GruposBoton5 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PANELLATERAL1.setBackground(new java.awt.Color(180, 225, 151));
        PANELLATERAL1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator4.setBackground(new java.awt.Color(78, 148, 79));
        jSeparator4.setForeground(new java.awt.Color(78, 148, 79));
        PANELLATERAL1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 20));

        AgregarArchivoBoton1.setBackground(new java.awt.Color(78, 148, 79));
        AgregarArchivoBoton1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        AgregarArchivoBoton1.setForeground(new java.awt.Color(233, 239, 192));
        AgregarArchivoBoton1.setText("Enviar Correo");
        AgregarArchivoBoton1.setBorder(null);
        AgregarArchivoBoton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AgregarArchivoBoton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        AgregarArchivoBoton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarArchivoBoton1ActionPerformed(evt);
            }
        });
        PANELLATERAL1.add(AgregarArchivoBoton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 190, 31));

        jPanel11.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANELLATERAL1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 31));

        GruposBoton2.setBackground(new java.awt.Color(78, 148, 79));
        GruposBoton2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        GruposBoton2.setForeground(new java.awt.Color(233, 239, 192));
        GruposBoton2.setText("Inbox");
        GruposBoton2.setBorder(null);
        GruposBoton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GruposBoton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GruposBoton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GruposBoton2ActionPerformed(evt);
            }
        });
        PANELLATERAL1.add(GruposBoton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, 31));

        jPanel13.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANELLATERAL1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, 31));

        GruposBoton3.setBackground(new java.awt.Color(78, 148, 79));
        GruposBoton3.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        GruposBoton3.setForeground(new java.awt.Color(233, 239, 192));
        GruposBoton3.setText("Enviados");
        GruposBoton3.setBorder(null);
        GruposBoton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GruposBoton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GruposBoton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GruposBoton3ActionPerformed(evt);
            }
        });
        PANELLATERAL1.add(GruposBoton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 31));

        jPanel14.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANELLATERAL1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 31));

        jLabel22.setBackground(new java.awt.Color(78, 148, 79));
        jLabel22.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(78, 148, 79));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MailIcon.png"))); // NOI18N
        jLabel22.setText("M a i l");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PANELLATERAL1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 60));

        GruposBoton4.setBackground(new java.awt.Color(78, 148, 79));
        GruposBoton4.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        GruposBoton4.setForeground(new java.awt.Color(233, 239, 192));
        GruposBoton4.setText("Spam");
        GruposBoton4.setBorder(null);
        GruposBoton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GruposBoton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GruposBoton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GruposBoton4ActionPerformed(evt);
            }
        });
        PANELLATERAL1.add(GruposBoton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 190, 31));

        jPanel15.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANELLATERAL1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 31));

        GruposBoton5.setBackground(new java.awt.Color(78, 148, 79));
        GruposBoton5.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        GruposBoton5.setForeground(new java.awt.Color(233, 239, 192));
        GruposBoton5.setText("Eliminados");
        GruposBoton5.setBorder(null);
        GruposBoton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        GruposBoton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GruposBoton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GruposBoton5ActionPerformed(evt);
            }
        });
        PANELLATERAL1.add(GruposBoton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 190, 31));

        jPanel16.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PANELLATERAL1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 100, 31));

        getContentPane().add(PANELLATERAL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        jPanel1.setBackground(new java.awt.Color(233, 239, 192));

        jTable1.setBackground(new java.awt.Color(131, 189, 117));
        jTable1.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Correos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jEditorPane1.setBackground(new java.awt.Color(247, 246, 220));
        jEditorPane1.setForeground(new java.awt.Color(78, 148, 79));
        jScrollPane2.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 750, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarArchivoBoton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarArchivoBoton1ActionPerformed

    }//GEN-LAST:event_AgregarArchivoBoton1ActionPerformed

    private void GruposBoton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GruposBoton2ActionPerformed

    }//GEN-LAST:event_GruposBoton2ActionPerformed

    private void GruposBoton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GruposBoton3ActionPerformed

    }//GEN-LAST:event_GruposBoton3ActionPerformed

    private void GruposBoton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GruposBoton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GruposBoton4ActionPerformed

    private void GruposBoton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GruposBoton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GruposBoton5ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Correo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Correo().setVisible(true);
            }
        });
    }
    
    
   
    public Color header = new Color(247, 246, 220);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarArchivoBoton1;
    private javax.swing.JButton GruposBoton2;
    private javax.swing.JButton GruposBoton3;
    private javax.swing.JButton GruposBoton4;
    private javax.swing.JButton GruposBoton5;
    private javax.swing.JPanel PANELLATERAL1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
