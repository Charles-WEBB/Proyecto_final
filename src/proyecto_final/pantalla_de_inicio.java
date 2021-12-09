
package proyecto_final;

//importaciones
import conexiones.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import usuario.Registro_usuario;

//Clase que inicializa todo
public class pantalla_de_inicio extends javax.swing.JFrame {

    //Constructor
    public pantalla_de_inicio() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        //Coloca iconos
        jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/x.png")));
        jLabel_icono_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/user-2-24.png")));
        jLabel_icono_cadena.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/padlock-24.png")));
        jLabel_ojo.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/visible.png")));
        jLabel_img_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/logOk.png")));
        jLabel_logo_escuela.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/logo_e.png")));
        jLabel_iconificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/iconificar.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel_logo_itla = new javax.swing.JPanel();
        jLabel_logo_escuela = new javax.swing.JLabel();
        jLabel1_texto_descripcion = new javax.swing.JLabel();
        jButton_acerca = new javax.swing.JButton();
        jPanel_acerca = new javax.swing.JPanel();
        jLabel_acerca = new javax.swing.JLabel();
        jLabel1_texto_descripcion1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_img_login = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel_icono_cadena = new javax.swing.JLabel();
        jLabel_icono_usuario = new javax.swing.JLabel();
        jTextField_usuario = new javax.swing.JTextField();
        jPasswordField_contrasena = new javax.swing.JPasswordField();
        jButton_login = new javax.swing.JButton();
        jLabel_info = new javax.swing.JLabel();
        jButton_registrar = new javax.swing.JButton();
        jLabel_close = new javax.swing.JLabel();
        jCheckBox_visible = new javax.swing.JCheckBox();
        jLabel_ojo = new javax.swing.JLabel();
        jLabel_iconificar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("frame");
        setUndecorated(true);

        jPanel1.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jPanel_logo_itla.setBackground(new java.awt.Color(153, 204, 255));
        jPanel_logo_itla.setOpaque(false);

        jLabel_logo_escuela.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_logo_itlaLayout = new javax.swing.GroupLayout(jPanel_logo_itla);
        jPanel_logo_itla.setLayout(jPanel_logo_itlaLayout);
        jPanel_logo_itlaLayout.setHorizontalGroup(
            jPanel_logo_itlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_logo_escuela, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );
        jPanel_logo_itlaLayout.setVerticalGroup(
            jPanel_logo_itlaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_logo_escuela, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
        );

        jLabel1_texto_descripcion.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1_texto_descripcion.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1_texto_descripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_texto_descripcion.setText("SISTEMA DE GESTIÓN DE ");

        jButton_acerca.setText("Acerca");
        jButton_acerca.setBorderPainted(false);
        jButton_acerca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_acercaActionPerformed(evt);
            }
        });

        jPanel_acerca.setOpaque(false);

        jLabel_acerca.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_acerca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_acercaLayout = new javax.swing.GroupLayout(jPanel_acerca);
        jPanel_acerca.setLayout(jPanel_acercaLayout);
        jPanel_acercaLayout.setHorizontalGroup(
            jPanel_acercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_acerca, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
        );
        jPanel_acercaLayout.setVerticalGroup(
            jPanel_acercaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_acerca, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        jLabel1_texto_descripcion1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1_texto_descripcion1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1_texto_descripcion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1_texto_descripcion1.setText("PRODUCTOS DE ALMACÉN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton_acerca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel_acerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel_logo_itla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1_texto_descripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1_texto_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel_logo_itla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_texto_descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1_texto_descripcion1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_acerca)
                    .addComponent(jPanel_acerca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 153));

        jLabel_img_login.setBackground(new java.awt.Color(255, 51, 255));
        jLabel_img_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jSeparator1.setOpaque(true);

        jLabel_icono_usuario.setBackground(new java.awt.Color(255, 0, 51));

        jButton_login.setBackground(new java.awt.Color(153, 0, 255));
        jButton_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_login.setText("Login");
        jButton_login.setBorderPainted(false);
        jButton_login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_loginActionPerformed(evt);
            }
        });

        jLabel_info.setFont(new java.awt.Font("Tahoma", 3, 10)); // NOI18N
        jLabel_info.setForeground(new java.awt.Color(0, 0, 255));
        jLabel_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_info.setText("Nuevo por aqui, pulsa ese boton");

        jButton_registrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_registrar.setText("Registrar");
        jButton_registrar.setBorderPainted(false);
        jButton_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_registrarActionPerformed(evt);
            }
        });

        jLabel_close.setBackground(new java.awt.Color(255, 51, 51));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        jCheckBox_visible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_visibleActionPerformed(evt);
            }
        });

        jLabel_ojo.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_iconificar.setBackground(new java.awt.Color(255, 51, 51));
        jLabel_iconificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_iconificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jCheckBox_visible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_ojo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_icono_usuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_icono_cadena, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPasswordField_contrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(jTextField_usuario))
                                .addGap(14, 14, 14)))))
                .addGap(10, 10, 10))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_info, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_registrar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_img_login, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(jLabel_iconificar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 32, Short.MAX_VALUE)
                        .addComponent(jLabel_img_login, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_iconificar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_icono_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_icono_cadena, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jCheckBox_visible, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_ojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton_login, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_info, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_acercaActionPerformed
       //Funcion (metodo) que escribe dentro de un Panel
       
       jLabel_acerca.setText("Eso es el projecto final del curso.");
    }//GEN-LAST:event_jButton_acercaActionPerformed
    
    //Cierra la ventana
    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        dispose();
    }//GEN-LAST:event_jLabel_closeMouseClicked

    //perfoma esas acciones al dar click al boton login
    private void jButton_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_loginActionPerformed
      
        //Creacion de variables
         ResultSet rs;
        
        String username = jTextField_usuario.getText();
        String contrasena = String.valueOf(jPasswordField_contrasena.getPassword());
        
        String consulta = "Select * from usuarios WHERE UserName=? AND Password=?";
        
        //Encierramos el codigo dentro de un try...catch
        try{
            
            //Creacion de una nueva conexion
            conexion conecta = new conexion();
            Connection con = conecta.getConexion(); 

            PreparedStatement st = con.prepareStatement(consulta);

            st.setString(1, username);
            st.setString(2, contrasena);
        
            rs = st.executeQuery();
            
            //iteracion de la variable << rs >> 
            if(rs.next()){
                
                //un mesage que dice "Hola" al usuario
                JOptionPane.showMessageDialog(null, " Hola!!! Usted esta logeado como: " + username + ".","Conexion Exitosa", 1);
                
                dispose();
                //Llama para la creacion de la pantalla intermediaria
                pantalla_intermediario intermedio  = new pantalla_intermediario();
                //Asegura su visibilidad
                intermedio.setVisible(true);
                
            }
            else{
                
                //Si lod datos ingresados en los campos son invalidos, un mensaje de error se muestra
                JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos","Datos invalidos", 0);
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jButton_loginActionPerformed
    
    
    //Manda a la ventana registrar
    private void jButton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_registrarActionPerformed
       
        dispose();
        
        //Creation de un nuevo objeto
        Registro_usuario jk = new Registro_usuario();
        jk.setVisible(true);
        
    }//GEN-LAST:event_jButton_registrarActionPerformed

    //Se encarga de cnvertir el texto en caracteres normales
    private void jCheckBox_visibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_visibleActionPerformed
       
        //Condicion si el usuario ha marcado el checkbox
        if(jCheckBox_visible.isSelected()){
            jPasswordField_contrasena.setEchoChar((char)0);
        }
        //En caso que lo desmarca
        else{
            jPasswordField_contrasena.setEchoChar('.');
        }
        
    }//GEN-LAST:event_jCheckBox_visibleActionPerformed

    private void jLabel_iconificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_iconificarMouseClicked
     
        this.setExtendedState(ICONIFIED);

    }//GEN-LAST:event_jLabel_iconificarMouseClicked
     
   
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pantalla_de_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla_de_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla_de_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla_de_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

      //Crea y muestra la ventana
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pantalla_de_inicio().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_acerca;
    private javax.swing.JButton jButton_login;
    private javax.swing.JButton jButton_registrar;
    public static javax.swing.JCheckBox jCheckBox_visible;
    private javax.swing.JLabel jLabel1_texto_descripcion;
    private javax.swing.JLabel jLabel1_texto_descripcion1;
    private javax.swing.JLabel jLabel_acerca;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_iconificar;
    private javax.swing.JLabel jLabel_icono_cadena;
    private javax.swing.JLabel jLabel_icono_usuario;
    private javax.swing.JLabel jLabel_img_login;
    private javax.swing.JLabel jLabel_info;
    private javax.swing.JLabel jLabel_logo_escuela;
    private javax.swing.JLabel jLabel_ojo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_acerca;
    private javax.swing.JPanel jPanel_logo_itla;
    public static javax.swing.JPasswordField jPasswordField_contrasena;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_usuario;
    // End of variables declaration//GEN-END:variables
}
