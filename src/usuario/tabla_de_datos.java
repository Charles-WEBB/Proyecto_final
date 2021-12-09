
package usuario;

//importaciones
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import conexiones.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto_final.pantalla_de_inicio;
import proyecto_final.pantalla_intermediario;


//Creacion la clase
public class tabla_de_datos extends javax.swing.JFrame {

    /**
     * Creates new form tabla_de_datos
     */
    public tabla_de_datos() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Asigna los iconos
        jButton_hacia_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/logout.png")));
        jButton_agragar_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/agregar.png")));
        jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/x.png")));
        
        //Carga la tabla dede la inicializacion
        cargarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_usuarios = new javax.swing.JTable();
        jButton_agragar_usuario = new javax.swing.JButton();
        jButton_hacia_login = new javax.swing.JButton();
        jLabel_close = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("usuario_seccion"); // NOI18N
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(102, 102, 102));
        jLabel_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_titulo.setText("Usuarios registrados");

        jTable_usuarios.setAutoCreateRowSorter(true);
        jTable_usuarios.setBackground(new java.awt.Color(255, 255, 204));
        jTable_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "UserName", "Nombre", "Apellido", "Telefono", "Correo", "Contrasena"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_usuarios.setGridColor(new java.awt.Color(0, 153, 102));
        jTable_usuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_usuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_usuarios);

        jButton_agragar_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_agragar_usuario.setToolTipText("Agragar usuarios");
        jButton_agragar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agragar_usuarioActionPerformed(evt);
            }
        });

        jButton_hacia_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_hacia_login.setToolTipText("Cierrar session");
        jButton_hacia_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hacia_loginActionPerformed(evt);
            }
        });

        jLabel_close.setBackground(new java.awt.Color(153, 153, 153));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("< Precedente");
        jButton1.setToolTipText("Ir a la pantalla intermediria");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(jButton_agragar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton_hacia_login, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_hacia_login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_agragar_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Retorna al login
    private void jButton_hacia_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hacia_loginActionPerformed
        this.dispose();
        
        //Creacion de un objeto 
        pantalla_de_inicio logout = new pantalla_de_inicio();
        logout.setVisible(true);
    }//GEN-LAST:event_jButton_hacia_loginActionPerformed

    //Cierra la ventana
    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        dispose();
    }//GEN-LAST:event_jLabel_closeMouseClicked

    //Se ejecuta al dar click en el boton de agregar
    private void jButton_agragar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agragar_usuarioActionPerformed
        dispose();
        Registro_usuario agregarUsuario = new Registro_usuario();
        agregarUsuario.setVisible(true);
    }//GEN-LAST:event_jButton_agragar_usuarioActionPerformed

    //Cuando damos un click en un campo, se ejecuta el codigo dentro
    private void jTable_usuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_usuariosMouseClicked
         try{
         int fila = jTable_usuarios.getSelectedRow();
         int id = Integer.parseInt(jTable_usuarios.getValueAt(fila, 0).toString());
         
         PreparedStatement ps;
         ResultSet rs;
         
         //Nueva conexion a la base de datos
         conexion conecta = new conexion();
         Connection con = conecta.getConexion();  
         
         //Llamada de la ventana que arroja los datos
         alterar_usuario t = new alterar_usuario();
         t.setVisible(true);

         PreparedStatement ps2 = con.prepareStatement("SELECT UserName, Nombre, Apellido, Telefono, Email, Password FROM usuarios Where idUser=?");
        
         ps2.setInt(1, id);
         rs = ps2.executeQuery();
              
            //Se incrementa la variable rs
         while(rs.next()){
                  alterar_usuario.jTextField_id.setText(String.valueOf(id));
                  alterar_usuario.jTextField_editar_nombreUsuario.setText(rs.getString("UserName"));
                  alterar_usuario.jTextField_editar_nombre.setText(rs.getString("Nombre"));
                  alterar_usuario.jTextField_editar_apellido.setText(rs.getString("Apellido"));
                  alterar_usuario.jTextField_editar_telefono.setText(rs.getString("Telefono"));
                  alterar_usuario.jTextField_editar_correo.setText(rs.getString("Email"));
                  alterar_usuario.jPasswordField_modificar_contrasena.setText(rs.getString("Password"));
              
              }
              
     } catch(SQLException e){
         JOptionPane.showMessageDialog(null, e);
     }
    }//GEN-LAST:event_jTable_usuariosMouseClicked

    //Manda a la ventana intermediaria
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        
        pantalla_intermediario pp = new pantalla_intermediario();
        
        pp.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    //Carga los datos en la tabla
    public void  cargarTabla(){
       DefaultTableModel modeloTabla = (DefaultTableModel) jTable_usuarios.getModel();
       modeloTabla.setRowCount(0);
       
       PreparedStatement ps;
       ResultSet rs;
       ResultSetMetaData rsmd;
       int columnas;
       
       //Valor predefinido a las columnas
       int[] anchos = {10, 30, 50, 50, 40, 90, 60};
       for(int i =0; i<jTable_usuarios.getColumnCount(); i++){
           jTable_usuarios.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
       }
       
        try{
              conexion conecta = new conexion();
              Connection con = conecta.getConexion();  

              //Preparacion de la sentencia
              PreparedStatement ps2 = con.prepareStatement("SELECT idUser, UserName, Nombre, Apellido, Telefono, Email, Password FROM usuarios");
        
              rs = ps2.executeQuery();
              rsmd = (ResultSetMetaData) rs.getMetaData();
              columnas = rsmd.getColumnCount();
              
              while(rs.next()){
                  Object[] fila = new Object[columnas];
                  for(int indice=0; indice<columnas; indice++){
                      fila[indice] = rs.getObject(indice+1);
                  }
                  modeloTabla.addRow(fila);
              }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
                                                               
       
    }
    
   
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tabla_de_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabla_de_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabla_de_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabla_de_datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       //Crea y muestra la ventana
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new tabla_de_datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_agragar_usuario;
    private javax.swing.JButton jButton_hacia_login;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_usuarios;
    // End of variables declaration//GEN-END:variables
}
