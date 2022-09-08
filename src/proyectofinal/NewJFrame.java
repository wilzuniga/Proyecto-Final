/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import Clases.Persona;
import DataBase.Dba;
import java.awt.Color;
import proyectofinal.Main;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author wilme
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        Cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        Botonl_Ingresar_Login = new javax.swing.JButton();
        Label_Contraseña_Login = new javax.swing.JLabel();
        Label_Usuario_Login = new javax.swing.JLabel();
        TF_Usuario_Login = new javax.swing.JTextField();
        TF_Contraseña_Login = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        Label_Titulo_Login = new javax.swing.JLabel();
        OlvideContraseña_Label_Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 5));
        setResizable(false);

        Login.setBackground(new java.awt.Color(233, 239, 192));

        Botonl_Ingresar_Login.setBackground(new java.awt.Color(78, 148, 79));
        Botonl_Ingresar_Login.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        Botonl_Ingresar_Login.setForeground(new java.awt.Color(233, 239, 192));
        Botonl_Ingresar_Login.setText("I n g r e s a r");
        Botonl_Ingresar_Login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Botonl_Ingresar_Login.setBorderPainted(false);
        Botonl_Ingresar_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botonl_Ingresar_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Botonl_Ingresar_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Botonl_Ingresar_LoginMouseExited(evt);
            }
        });
        Botonl_Ingresar_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botonl_Ingresar_LoginActionPerformed(evt);
            }
        });

        Label_Contraseña_Login.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        Label_Contraseña_Login.setForeground(new java.awt.Color(78, 148, 79));
        Label_Contraseña_Login.setText("C o n t r a s e ñ a");

        Label_Usuario_Login.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        Label_Usuario_Login.setForeground(new java.awt.Color(78, 148, 79));
        Label_Usuario_Login.setText("U s u a r i o");

        TF_Usuario_Login.setBackground(new java.awt.Color(180, 225, 151));
        TF_Usuario_Login.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        TF_Usuario_Login.setForeground(new java.awt.Color(78, 148, 79));
        TF_Usuario_Login.setBorder(null);
        TF_Usuario_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        TF_Contraseña_Login.setBackground(new java.awt.Color(180, 225, 151));
        TF_Contraseña_Login.setForeground(new java.awt.Color(78, 148, 79));
        TF_Contraseña_Login.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(233, 239, 192));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Label_Titulo_Login.setFont(new java.awt.Font("Roboto Medium", 1, 36)); // NOI18N
        Label_Titulo_Login.setForeground(new java.awt.Color(78, 148, 79));
        Label_Titulo_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Titulo_Login.setText("L o g i n");
        Label_Titulo_Login.setToolTipText("");
        jPanel1.add(Label_Titulo_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        OlvideContraseña_Label_Login.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        OlvideContraseña_Label_Login.setForeground(new java.awt.Color(78, 148, 79));
        OlvideContraseña_Label_Login.setText("Olvide mi contraseña");
        OlvideContraseña_Label_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(OlvideContraseña_Label_Login)
                            .addComponent(Botonl_Ingresar_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(TF_Usuario_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TF_Contraseña_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LoginLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Label_Usuario_Login))
                            .addComponent(Label_Contraseña_Login, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(Label_Usuario_Login)
                .addGap(18, 18, 18)
                .addComponent(TF_Usuario_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_Contraseña_Login)
                .addGap(18, 18, 18)
                .addComponent(TF_Contraseña_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(Botonl_Ingresar_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OlvideContraseña_Label_Login)
                .addGap(92, 92, 92))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botonl_Ingresar_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botonl_Ingresar_LoginMouseEntered
        //Botonl_Ingresar_Login.setBackground(Color.getHSBColor(131, 189, 117));
    }//GEN-LAST:event_Botonl_Ingresar_LoginMouseEntered

    private void Botonl_Ingresar_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botonl_Ingresar_LoginActionPerformed
                    //System.out.println(Main.ListUssers.size());

        for (int i = 0; i < Main.ListUssers.size(); i++) {
            if (TF_Usuario_Login.getText().equals(Main.ListUssers.get(i).getUsuario()) && TF_Contraseña_Login.getText().equals(Main.ListUssers.get(i).getContraseña()) && Main.ListUssers.get(i).getAdministrador().equals("Si")) {
                Main.Uactual = Main.ListUssers.get(i);
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Main().setVisible(true);

                    }
                });
                dispose();
            } else if (TF_Usuario_Login.getText().equals(Main.ListUssers.get(i).getUsuario()) && TF_Contraseña_Login.getText().equals(Main.ListUssers.get(i).getContraseña())) {
               // UsserDis.Uactual = Main.ListUssers.get(i);
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new UsserDis().setVisible(true);

                    }
                });
                dispose();
            } else {
                if (i == Main.ListUssers.size()-1) {
                    JOptionPane.showMessageDialog(null, "Ingrese un usuario y contraseña correctos");
                }
                
            }

        }

    }//GEN-LAST:event_Botonl_Ingresar_LoginActionPerformed

    private void Botonl_Ingresar_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Botonl_Ingresar_LoginMouseExited
        //Botonl_Ingresar_Login.setBackground(Color.getHSBColor(121, 47, 58));
    }//GEN-LAST:event_Botonl_Ingresar_LoginMouseExited

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
                //setLocationRelativeTo();
            }
        });
    }

    public void Cargar() {
        Dba db = new Dba("C:\\Users\\wilme\\Desktop\\Q4-22\\Proyecto Programacion II\\ProyectoFinal\\Usuarios1.accdb");
        db.conectar();
        try {
            db.query.execute("select Usuario,Contraseña,Edad,Nombre,Correo,Genero,Administrador, Id from Usuarios");
            ResultSet rs = db.query.getResultSet();

            while (rs.next()) {

                Main.ListUssers.add(new Persona(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(8), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
//                System.out.println(rs.getString(1)
//                        + "--" + rs.getString(2) + "--"
//                        + rs.getInt(3) + "--"
//                        + rs.getString(4) + "--"
//                        + rs.getString(5) + "--"
//                        + rs.getString(6) + "--"
//                        + rs.getString(7) + "--"
//                        + rs.getInt(8));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botonl_Ingresar_Login;
    private javax.swing.JLabel Label_Contraseña_Login;
    private javax.swing.JLabel Label_Titulo_Login;
    private javax.swing.JLabel Label_Usuario_Login;
    private javax.swing.JPanel Login;
    private javax.swing.JLabel OlvideContraseña_Label_Login;
    private javax.swing.JPasswordField TF_Contraseña_Login;
    private javax.swing.JTextField TF_Usuario_Login;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}