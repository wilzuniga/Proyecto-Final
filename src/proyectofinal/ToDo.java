/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import Clases.Persona;
import java.util.ArrayList;

/**
 *
 * @author wilme
 */
public class ToDo extends javax.swing.JFrame {

    /**
     * Creates new form ToDo
     */
    public ToDo() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PANELLATERAL = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        CrearTareasBoton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        MiDiaTareasBoton = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        ModificarTareasBoton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        TareasCompletasTareasBoton = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        TareasImportantesTareasBoton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        TareasMediasTareasBoton = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        TareasPendientesTareasBoton = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        TareasMundanasTareasBoton = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(233, 239, 192));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(233, 239, 192));

        PANELLATERAL.setBackground(new java.awt.Color(180, 225, 151));
        PANELLATERAL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setBackground(new java.awt.Color(78, 148, 79));
        jLabel23.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(78, 148, 79));
        jLabel23.setText("L i s t a s");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PANELLATERAL.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 130, 40));

        jSeparator1.setBackground(new java.awt.Color(78, 148, 79));
        jSeparator1.setForeground(new java.awt.Color(78, 148, 79));
        PANELLATERAL.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 220, 20));

        jSeparator2.setBackground(new java.awt.Color(78, 148, 79));
        jSeparator2.setForeground(new java.awt.Color(78, 148, 79));
        PANELLATERAL.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 20));

        CrearTareasBoton.setBackground(new java.awt.Color(78, 148, 79));
        CrearTareasBoton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        CrearTareasBoton.setForeground(new java.awt.Color(233, 239, 192));
        CrearTareasBoton.setText("Crear Tarea");
        CrearTareasBoton.setBorder(null);
        CrearTareasBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CrearTareasBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        CrearTareasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearTareasBotonActionPerformed(evt);
            }
        });
        PANELLATERAL.add(CrearTareasBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 190, 31));

        jPanel5.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        PANELLATERAL.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 100, 31));

        MiDiaTareasBoton.setBackground(new java.awt.Color(78, 148, 79));
        MiDiaTareasBoton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        MiDiaTareasBoton.setForeground(new java.awt.Color(233, 239, 192));
        MiDiaTareasBoton.setText("Mi dia");
        MiDiaTareasBoton.setBorder(null);
        MiDiaTareasBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MiDiaTareasBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MiDiaTareasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiDiaTareasBotonActionPerformed(evt);
            }
        });
        PANELLATERAL.add(MiDiaTareasBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 190, 31));

        jPanel7.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        PANELLATERAL.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 100, 31));

        ModificarTareasBoton.setBackground(new java.awt.Color(78, 148, 79));
        ModificarTareasBoton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        ModificarTareasBoton.setForeground(new java.awt.Color(233, 239, 192));
        ModificarTareasBoton.setText("Modificar  Tarea");
        ModificarTareasBoton.setBorder(null);
        ModificarTareasBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificarTareasBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ModificarTareasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarTareasBotonActionPerformed(evt);
            }
        });
        PANELLATERAL.add(ModificarTareasBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, 31));

        jPanel8.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        PANELLATERAL.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 100, 31));

        TareasCompletasTareasBoton.setBackground(new java.awt.Color(78, 148, 79));
        TareasCompletasTareasBoton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        TareasCompletasTareasBoton.setForeground(new java.awt.Color(233, 239, 192));
        TareasCompletasTareasBoton.setText("Tareas Completadas");
        TareasCompletasTareasBoton.setBorder(null);
        TareasCompletasTareasBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TareasCompletasTareasBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TareasCompletasTareasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TareasCompletasTareasBotonActionPerformed(evt);
            }
        });
        PANELLATERAL.add(TareasCompletasTareasBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 190, 31));

        jPanel9.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        PANELLATERAL.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 100, 31));

        jLabel24.setBackground(new java.awt.Color(78, 148, 79));
        jLabel24.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(78, 148, 79));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ToDoIcon.png"))); // NOI18N
        jLabel24.setText("T o - D o");
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PANELLATERAL.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 130, 40));

        TareasImportantesTareasBoton.setBackground(new java.awt.Color(78, 148, 79));
        TareasImportantesTareasBoton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        TareasImportantesTareasBoton.setForeground(new java.awt.Color(233, 239, 192));
        TareasImportantesTareasBoton.setText("Tareas Importantes");
        TareasImportantesTareasBoton.setBorder(null);
        TareasImportantesTareasBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TareasImportantesTareasBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TareasImportantesTareasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TareasImportantesTareasBotonActionPerformed(evt);
            }
        });
        PANELLATERAL.add(TareasImportantesTareasBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 190, 31));

        jPanel6.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        PANELLATERAL.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, 31));

        TareasMediasTareasBoton.setBackground(new java.awt.Color(78, 148, 79));
        TareasMediasTareasBoton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        TareasMediasTareasBoton.setForeground(new java.awt.Color(233, 239, 192));
        TareasMediasTareasBoton.setText("Tareas Medias");
        TareasMediasTareasBoton.setBorder(null);
        TareasMediasTareasBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TareasMediasTareasBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TareasMediasTareasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TareasMediasTareasBotonActionPerformed(evt);
            }
        });
        PANELLATERAL.add(TareasMediasTareasBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 190, 31));

        jPanel10.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        PANELLATERAL.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 100, 31));

        TareasPendientesTareasBoton.setBackground(new java.awt.Color(78, 148, 79));
        TareasPendientesTareasBoton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        TareasPendientesTareasBoton.setForeground(new java.awt.Color(233, 239, 192));
        TareasPendientesTareasBoton.setText("Tareas Pendientes");
        TareasPendientesTareasBoton.setBorder(null);
        TareasPendientesTareasBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TareasPendientesTareasBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TareasPendientesTareasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TareasPendientesTareasBotonActionPerformed(evt);
            }
        });
        PANELLATERAL.add(TareasPendientesTareasBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 31));

        jPanel11.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        PANELLATERAL.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, 31));

        TareasMundanasTareasBoton.setBackground(new java.awt.Color(78, 148, 79));
        TareasMundanasTareasBoton.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        TareasMundanasTareasBoton.setForeground(new java.awt.Color(233, 239, 192));
        TareasMundanasTareasBoton.setText("Tareas Mundanas");
        TareasMundanasTareasBoton.setBorder(null);
        TareasMundanasTareasBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TareasMundanasTareasBoton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TareasMundanasTareasBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TareasMundanasTareasBotonActionPerformed(evt);
            }
        });
        PANELLATERAL.add(TareasMundanasTareasBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 190, 31));

        jPanel12.setBackground(new java.awt.Color(78, 148, 79));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 31, Short.MAX_VALUE)
        );

        PANELLATERAL.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 100, 31));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(PANELLATERAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 810, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PANELLATERAL, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CrearTareasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearTareasBotonActionPerformed
             
    }//GEN-LAST:event_CrearTareasBotonActionPerformed

    private void MiDiaTareasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiDiaTareasBotonActionPerformed

    }//GEN-LAST:event_MiDiaTareasBotonActionPerformed

    private void ModificarTareasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarTareasBotonActionPerformed

    }//GEN-LAST:event_ModificarTareasBotonActionPerformed

    private void TareasCompletasTareasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TareasCompletasTareasBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TareasCompletasTareasBotonActionPerformed

    private void TareasImportantesTareasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TareasImportantesTareasBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TareasImportantesTareasBotonActionPerformed

    private void TareasMediasTareasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TareasMediasTareasBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TareasMediasTareasBotonActionPerformed

    private void TareasPendientesTareasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TareasPendientesTareasBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TareasPendientesTareasBotonActionPerformed

    private void TareasMundanasTareasBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TareasMundanasTareasBotonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TareasMundanasTareasBotonActionPerformed

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
            java.util.logging.Logger.getLogger(ToDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToDo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToDo().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CrearTareasBoton;
    private javax.swing.JButton MiDiaTareasBoton;
    private javax.swing.JButton ModificarTareasBoton;
    private javax.swing.JPanel PANELLATERAL;
    private javax.swing.JButton TareasCompletasTareasBoton;
    private javax.swing.JButton TareasImportantesTareasBoton;
    private javax.swing.JButton TareasMediasTareasBoton;
    private javax.swing.JButton TareasMundanasTareasBoton;
    private javax.swing.JButton TareasPendientesTareasBoton;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
