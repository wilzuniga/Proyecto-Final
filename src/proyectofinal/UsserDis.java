/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.awt.Color;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.OverlayLayout;
import Clases.Persona;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import DataBase.Dba;
import java.sql.ResultSet;
import java.sql.SQLException;
import proyectofinal.NewJFrame;

public class UsserDis extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public UsserDis() {
        initComponents();
        //iniciarVA();
        //Nombre_Usuario_Label.setText("Bienvenido " + Uactual.getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InformacionUsuarioFra = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        UsuarioInfo = new javax.swing.JLabel();
        NombreInfo = new javax.swing.JLabel();
        EdadInfo = new javax.swing.JLabel();
        CorreoInfo = new javax.swing.JLabel();
        GeneroInfo = new javax.swing.JLabel();
        IdInfo = new javax.swing.JLabel();
        PanelAdministrador = new javax.swing.JPanel();
        Panel_Lateral = new javax.swing.JPanel();
        FondoCloudy = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        InfoCuenta_AdminTools_MW = new javax.swing.JButton();
        Nombre_Usuario_Label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        botonuniversal = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();

        jPanel1.setBackground(new java.awt.Color(233, 239, 192));

        jLabel24.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(78, 148, 79));
        jLabel24.setText("Usuario");

        jLabel25.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(78, 148, 79));
        jLabel25.setText("Nombre");

        jLabel26.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(78, 148, 79));
        jLabel26.setText("Edad");

        jLabel27.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(78, 148, 79));
        jLabel27.setText("Correo");

        jLabel28.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(78, 148, 79));
        jLabel28.setText("Genero");

        jLabel29.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(78, 148, 79));
        jLabel29.setText("Id");

        UsuarioInfo.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        UsuarioInfo.setForeground(new java.awt.Color(78, 148, 79));
        UsuarioInfo.setText("Usuario");

        NombreInfo.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        NombreInfo.setForeground(new java.awt.Color(78, 148, 79));
        NombreInfo.setText("Nombre");

        EdadInfo.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        EdadInfo.setForeground(new java.awt.Color(78, 148, 79));
        EdadInfo.setText("Edad");

        CorreoInfo.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        CorreoInfo.setForeground(new java.awt.Color(78, 148, 79));
        CorreoInfo.setText("Correo");

        GeneroInfo.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        GeneroInfo.setForeground(new java.awt.Color(78, 148, 79));
        GeneroInfo.setText("Genero");

        IdInfo.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        IdInfo.setForeground(new java.awt.Color(78, 148, 79));
        IdInfo.setText("Id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EdadInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsuarioInfo)
                    .addComponent(NombreInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CorreoInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GeneroInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel25)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel26)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel27)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(jLabel28)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UsuarioInfo)
                        .addGap(61, 61, 61)
                        .addComponent(NombreInfo)
                        .addGap(63, 63, 63)
                        .addComponent(EdadInfo)
                        .addGap(63, 63, 63)
                        .addComponent(CorreoInfo)
                        .addGap(69, 69, 69)
                        .addComponent(IdInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GeneroInfo)
                        .addGap(20, 20, 20))))
        );

        javax.swing.GroupLayout InformacionUsuarioFraLayout = new javax.swing.GroupLayout(InformacionUsuarioFra.getContentPane());
        InformacionUsuarioFra.getContentPane().setLayout(InformacionUsuarioFraLayout);
        InformacionUsuarioFraLayout.setHorizontalGroup(
            InformacionUsuarioFraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        InformacionUsuarioFraLayout.setVerticalGroup(
            InformacionUsuarioFraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 50));
        setResizable(false);

        PanelAdministrador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Lateral.setBackground(new java.awt.Color(233, 239, 192));
        Panel_Lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FondoCloudy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CloudyFormated.png"))); // NOI18N
        Panel_Lateral.add(FondoCloudy, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 860, 510));

        jPanel4.setBackground(new java.awt.Color(180, 225, 151));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InfoCuenta_AdminTools_MW.setBackground(new java.awt.Color(78, 148, 79));
        InfoCuenta_AdminTools_MW.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        InfoCuenta_AdminTools_MW.setForeground(new java.awt.Color(233, 239, 192));
        InfoCuenta_AdminTools_MW.setText("Informacion de Cuenta");
        InfoCuenta_AdminTools_MW.setBorder(null);
        InfoCuenta_AdminTools_MW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InfoCuenta_AdminTools_MWActionPerformed(evt);
            }
        });
        jPanel4.add(InfoCuenta_AdminTools_MW, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 230, 30));

        Nombre_Usuario_Label.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        Nombre_Usuario_Label.setForeground(new java.awt.Color(78, 148, 79));
        Nombre_Usuario_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Nombre_Usuario_Label.setText("Bienvenido Avelardo");
        Nombre_Usuario_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Nombre_Usuario_Label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(Nombre_Usuario_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 230, -1));

        jSeparator1.setBackground(new java.awt.Color(78, 148, 79));
        jSeparator1.setForeground(new java.awt.Color(78, 148, 79));
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 211, 10));

        botonuniversal.setBackground(new java.awt.Color(78, 148, 79));
        botonuniversal.setFont(new java.awt.Font("Roboto Medium", 1, 24)); // NOI18N
        botonuniversal.setForeground(new java.awt.Color(233, 239, 192));
        botonuniversal.setText("C l o u d y");
        botonuniversal.setBorder(null);
        botonuniversal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonuniversalActionPerformed(evt);
            }
        });
        jPanel4.add(botonuniversal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 230, 60));

        jLabel21.setBackground(new java.awt.Color(78, 148, 79));
        jLabel21.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(78, 148, 79));
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CloudIcon.png"))); // NOI18N
        jLabel21.setText("C l o u d");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, 50));

        jSeparator2.setBackground(new java.awt.Color(78, 148, 79));
        jSeparator2.setForeground(new java.awt.Color(78, 148, 79));
        jSeparator2.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 211, 10));

        jLabel22.setBackground(new java.awt.Color(78, 148, 79));
        jLabel22.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(78, 148, 79));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MailIcon.png"))); // NOI18N
        jLabel22.setText("M a i l");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 130, 50));

        jLabel23.setBackground(new java.awt.Color(78, 148, 79));
        jLabel23.setFont(new java.awt.Font("Roboto Medium", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(78, 148, 79));
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ToDoIcon.png"))); // NOI18N
        jLabel23.setText("T o - D o");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 130, 40));

        jSeparator3.setBackground(new java.awt.Color(78, 148, 79));
        jSeparator3.setForeground(new java.awt.Color(78, 148, 79));
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 30));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 211, 10));

        Panel_Lateral.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 620));

        PanelAdministrador.add(Panel_Lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 620));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InfoCuenta_AdminTools_MWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InfoCuenta_AdminTools_MWActionPerformed
        NombreInfo.setText(Uactual.getNombre());
        UsuarioInfo.setText(Uactual.getUsuario());
        EdadInfo.setText("" + Uactual.getEdad());
        CorreoInfo.setText(Uactual.getCorreo());
        IdInfo.setText("" + Uactual.getID());
        GeneroInfo.setText(Uactual.getGenero());

        InformacionUsuarioFra.setModal(true);
        InformacionUsuarioFra.pack();
        InformacionUsuarioFra.setLocationRelativeTo(this);
        InformacionUsuarioFra.setVisible(true);


    }//GEN-LAST:event_InfoCuenta_AdminTools_MWActionPerformed

    private void botonuniversalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonuniversalActionPerformed
        FondoCloudy.setVisible(true);
        Nombre_Usuario_Label.setText("Bienvenido " + Uactual.getNombre());
    }//GEN-LAST:event_botonuniversalActionPerformed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToDo().setVisible(true);
                
            }
        });
    }//GEN-LAST:event_jLabel23MouseClicked

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
            java.util.logging.Logger.getLogger(UsserDis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsserDis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsserDis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsserDis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsserDis().setVisible(true);
            }
        });
    }

    public static ArrayList<Persona> ListUssers = new ArrayList();
    public static Persona Uactual;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CorreoInfo;
    private javax.swing.JLabel EdadInfo;
    private javax.swing.JLabel FondoCloudy;
    private javax.swing.JLabel GeneroInfo;
    private javax.swing.JLabel IdInfo;
    private javax.swing.JButton InfoCuenta_AdminTools_MW;
    private javax.swing.JDialog InformacionUsuarioFra;
    private javax.swing.JLabel NombreInfo;
    private javax.swing.JLabel Nombre_Usuario_Label;
    private javax.swing.JPanel PanelAdministrador;
    private javax.swing.JPanel Panel_Lateral;
    private javax.swing.JLabel UsuarioInfo;
    private javax.swing.JButton botonuniversal;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}