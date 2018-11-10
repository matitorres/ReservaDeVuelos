/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author asus pc
 */
public class LoginAdmin extends javax.swing.JFrame {
    
    private static LoginAdmin ventana = new LoginAdmin();
    
    public LoginAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabelInicio = new javax.swing.JLabel();
        jLabelAdministrador = new javax.swing.JLabel();
        jLabelCerrar = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jLabelContraseña = new javax.swing.JLabel();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jButtonIniciarSesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 204, 51));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelInicio.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        jLabelInicio.setForeground(new java.awt.Color(102, 153, 51));
        jLabelInicio.setText("Inicio //");
        jLabelInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelInicio.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabelInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelInicioMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 20, 98, 30));

        jLabelAdministrador.setFont(new java.awt.Font("Arial", 0, 28)); // NOI18N
        jLabelAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdministrador.setText("Administrador");
        jLabelAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabelAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 20, -1, 30));

        jLabelCerrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelCerrar.setForeground(new java.awt.Color(102, 153, 51));
        jLabelCerrar.setText("X");
        jLabelCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCerrarMouseClicked(evt);
            }
        });
        jPanel1.add(jLabelCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 15, 15));

        jLabelUsuario.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(102, 153, 51));
        jLabelUsuario.setText("Usuario");
        jPanel1.add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, -1, -1));

        jTextFieldUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 108, 321, 31));

        jLabelContraseña.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabelContraseña.setForeground(new java.awt.Color(102, 153, 51));
        jLabelContraseña.setText("Contraseña");
        jPanel1.add(jLabelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(435, 145, -1, -1));

        jPasswordFieldContraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1));
        jPanel1.add(jPasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 172, 321, 31));

        jButtonIniciarSesion.setBackground(new java.awt.Color(102, 153, 51));
        jButtonIniciarSesion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIniciarSesion.setText("Iniciar sesión");
        jButtonIniciarSesion.setBorder(null);
        jButtonIniciarSesion.setBorderPainted(false);
        jButtonIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 220, 146, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCerrarMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelCerrarMouseClicked

    private void jLabelInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelInicioMouseClicked
        ventana.setVisible(false);
        VistaVueloCliente.visibilidad(true);
    }//GEN-LAST:event_jLabelInicioMouseClicked

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        ventana.setVisible(false);
        VistaAdmin.visibilidad(true);
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    public static void visibilidad(boolean estado) {
        ventana.setVisible(estado);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JLabel jLabelAdministrador;
    private javax.swing.JLabel jLabelCerrar;
    private javax.swing.JLabel jLabelContraseña;
    private javax.swing.JLabel jLabelInicio;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
