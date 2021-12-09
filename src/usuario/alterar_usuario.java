
package usuario;

//Importaciones
import conexiones.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyecto_final.pantalla_de_inicio;

//Inicializa
public class alterar_usuario extends javax.swing.JFrame {

   
    public alterar_usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Asigna los iconos
        jButton_guardar_cambios.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/guardar.png")));
        jButton_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/e.png")));
        jLabel_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/m.png")));
        
        jButton_regreso_hacia_bd.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/toDataBase.png")));
        jButton_hacia_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/toLogin.png")));
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_editar_nombre_usuario = new javax.swing.JLabel();
        jTextField_editar_nombreUsuario = new javax.swing.JTextField();
        jLabel_editar_nombre = new javax.swing.JLabel();
        jTextField_editar_nombre = new javax.swing.JTextField();
        jLabel_editar_apellido = new javax.swing.JLabel();
        jTextField_editar_apellido = new javax.swing.JTextField();
        jLabel_editar_telefono = new javax.swing.JLabel();
        jTextField_editar_telefono = new javax.swing.JTextField();
        jLabel_editar_correo = new javax.swing.JLabel();
        jTextField_editar_correo = new javax.swing.JTextField();
        jLabel_editar_contrasena = new javax.swing.JLabel();
        jButton_guardar_cambios = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jTextField_id = new javax.swing.JTextField();
        jPasswordField_modificar_contrasena = new javax.swing.JPasswordField();
        jButton_regreso_hacia_bd = new javax.swing.JButton();
        jButton_hacia_login = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel_alterar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel_editar_nombre_usuario.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_editar_nombre_usuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_editar_nombre_usuario.setText("Nombre Usuario");

        jTextField_editar_nombreUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_editar_nombreUsuario.setFocusCycleRoot(true);
        jTextField_editar_nombreUsuario.setFocusTraversalPolicy(null);
        jTextField_editar_nombreUsuario.setFocusTraversalPolicyProvider(true);

        jLabel_editar_nombre.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_editar_nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_editar_nombre.setText("Nombre");

        jTextField_editar_nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_editar_nombre.setFocusCycleRoot(true);
        jTextField_editar_nombre.setFocusTraversalPolicy(null);
        jTextField_editar_nombre.setFocusTraversalPolicyProvider(true);

        jLabel_editar_apellido.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_editar_apellido.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_editar_apellido.setText("Apellido");

        jTextField_editar_apellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_editar_apellido.setFocusCycleRoot(true);
        jTextField_editar_apellido.setFocusTraversalPolicy(null);
        jTextField_editar_apellido.setFocusTraversalPolicyProvider(true);

        jLabel_editar_telefono.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_editar_telefono.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_editar_telefono.setText("Telefono");

        jTextField_editar_telefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_editar_telefono.setFocusCycleRoot(true);
        jTextField_editar_telefono.setFocusTraversalPolicy(null);
        jTextField_editar_telefono.setFocusTraversalPolicyProvider(true);

        jLabel_editar_correo.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_editar_correo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_editar_correo.setText("Correo");

        jTextField_editar_correo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField_editar_correo.setFocusCycleRoot(true);
        jTextField_editar_correo.setFocusTraversalPolicy(null);
        jTextField_editar_correo.setFocusTraversalPolicyProvider(true);

        jLabel_editar_contrasena.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_editar_contrasena.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_editar_contrasena.setText("Contrrasena");

        jButton_guardar_cambios.setToolTipText("Guardar cambios");
        jButton_guardar_cambios.setBorderPainted(false);
        jButton_guardar_cambios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_guardar_cambios.setFocusPainted(false);
        jButton_guardar_cambios.setFocusable(false);
        jButton_guardar_cambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardar_cambiosActionPerformed(evt);
            }
        });

        jButton_eliminar.setToolTipText("Eliminar fila selecionada");
        jButton_eliminar.setBorderPainted(false);
        jButton_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_eliminar.setFocusPainted(false);
        jButton_eliminar.setFocusable(false);
        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });

        jButton_regreso_hacia_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_regreso_hacia_bdActionPerformed(evt);
            }
        });

        jButton_hacia_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hacia_loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jButton_guardar_cambios, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addComponent(jButton_regreso_hacia_bd))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_editar_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_editar_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_editar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_editar_nombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(jTextField_editar_nombre)
                            .addComponent(jTextField_editar_apellido))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_editar_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_editar_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_editar_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_editar_telefono)
                            .addComponent(jTextField_editar_correo)
                            .addComponent(jPasswordField_modificar_contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_hacia_login, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_editar_nombre_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_editar_nombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_editar_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_editar_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_editar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_editar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_editar_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_editar_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_editar_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_editar_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_modificar_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel_editar_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_guardar_cambios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_eliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_regreso_hacia_bd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton_hacia_login, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Tabla de datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)))
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_guardar_cambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardar_cambiosActionPerformed
       
        //Creacion de variables
        String n_userUsername = jTextField_editar_nombreUsuario.getText();
        String n_userName = jTextField_editar_nombre.getText();
        String n_userApellido = jTextField_editar_apellido.getText();
        String n_userTelefono = jTextField_editar_telefono.getText();
        String n_userCorreo = jTextField_editar_correo.getText();
        String n_userContrasena = new String(jPasswordField_modificar_contrasena.getPassword());
        int id = Integer.parseInt(jTextField_id.getText());
       
        //Verificacion de la validez
        if(n_userUsername.length() == 0 || n_userName.length() == 0 || n_userApellido.length() == 0 || n_userTelefono.length() == 0 
                || n_userCorreo.length() == 0 || n_userContrasena.length() == 0){
             
            //Mensaje para el usuario
            JOptionPane.showMessageDialog(this, "No se pueden dejar campos vacios");
        }
        else{
                    //Creacio de conexion y ejecucion de la sentencia
                  try{
                            conexion conecta = new conexion();
                            Connection con = conecta.getConexion();  

                            PreparedStatement ps = con.prepareStatement("UPDATE usuarios SET UserName=?, Nombre=?, Apellido=?, Telefono=?, Email=?, Password=? WHERE idUser=?");

                            
                            ps.setString(1, n_userUsername);
                            ps.setString(2, n_userName);
                            ps.setString(3, n_userApellido);
                            ps.setString(4, n_userTelefono);
                            ps.setString(5, n_userCorreo);
                            ps.setString(6, n_userContrasena);
                            ps.setInt(7,id);

                            ps.executeUpdate();

                            ps.close();
                            con.close();

                            JOptionPane.showMessageDialog(null, "Registro modificado");
                            

                         }
                  catch(SQLException e){
                              System.out.print(e);
                  }
                  
             }        
        
    }//GEN-LAST:event_jButton_guardar_cambiosActionPerformed

    //Manda a la pantalla de la tabla de usuarios
    private void jButton_regreso_hacia_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_regreso_hacia_bdActionPerformed
       dispose();
       
       tabla_de_datos tb = new tabla_de_datos();
       tb.setVisible(true);
       
    }//GEN-LAST:event_jButton_regreso_hacia_bdActionPerformed

    //Manda hacia el login 
    private void jButton_hacia_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hacia_loginActionPerformed
        dispose();
        
        pantalla_de_inicio p = new pantalla_de_inicio();
        p.setVisible(true);
    }//GEN-LAST:event_jButton_hacia_loginActionPerformed

    //Metodo que se encarga de retirar un fila 
    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
        
         int id = Integer.parseInt(jTextField_id.getText());
                      
                  try{
                            conexion conecta = new conexion();
                            Connection con = conecta.getConexion();  

                            PreparedStatement ps = con.prepareStatement("DELETE FROM usuarios WHERE idUser=?");

                            ps.setInt(1,id);

                            ps.executeUpdate();

                            ps.close();
                            con.close();

                            JOptionPane.showMessageDialog(null, "Registro Eliminado");
                            

                         }
                  catch(SQLException e){
                              System.out.print(e);
                  }
        
    }//GEN-LAST:event_jButton_eliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(alterar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alterar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alterar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alterar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //Crea y muestra la ventana
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alterar_usuario().setVisible(true);
            }
        });
    }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_guardar_cambios;
    private javax.swing.JButton jButton_hacia_login;
    private javax.swing.JButton jButton_regreso_hacia_bd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_alterar;
    private javax.swing.JLabel jLabel_editar_apellido;
    private javax.swing.JLabel jLabel_editar_contrasena;
    private javax.swing.JLabel jLabel_editar_correo;
    private javax.swing.JLabel jLabel_editar_nombre;
    private javax.swing.JLabel jLabel_editar_nombre_usuario;
    private javax.swing.JLabel jLabel_editar_telefono;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField jPasswordField_modificar_contrasena;
    public static javax.swing.JTextField jTextField_editar_apellido;
    public static javax.swing.JTextField jTextField_editar_correo;
    public static javax.swing.JTextField jTextField_editar_nombre;
    public static javax.swing.JTextField jTextField_editar_nombreUsuario;
    public static javax.swing.JTextField jTextField_editar_telefono;
    public static javax.swing.JTextField jTextField_id;
    // End of variables declaration//GEN-END:variables
}
