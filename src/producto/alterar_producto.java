//Especificación del paquete
package producto;

//importacion de la clase << conexión >>  de la carpeta conexiones 
import conexiones.conexion;

//Importacion de las clases originadas del conector mySql para Java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import proyecto_final.pantalla_de_inicio;
//_____________________________________________


//clase que se encarga de iniciar los componentes de la ventana, la cual va alojar los campos de modificación de los datos
public class alterar_producto extends javax.swing.JFrame {

    //Método dentro de la cual se van a crear y definir todo los componentes de la ventana
    public alterar_producto() {
        initComponents();
        
        //Un overriding para poder centrar la ventana
        this.setLocationRelativeTo(null);
        
        //Carga los iconoes que van a servir de indicadores en la ventana
        jButton_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/guardar.png"))); //icono de guardar imagen
        jButton_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/e.png"))); //icono del safacon
        
        jButton_hacia_bd.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/toDataBase.png"))); //iconoo de retorna a la pestana de la base de datos
        jButton_hacia_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/toLogin.png"))); //icono para retorna a la pagina login
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_nombe_p1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_nombe_p = new javax.swing.JLabel();
        jTextField_n_nombre_p = new javax.swing.JTextField();
        jTextField_n_marca_p = new javax.swing.JTextField();
        jLabel_n_marca_p = new javax.swing.JLabel();
        jTextField_n_categoria_p = new javax.swing.JTextField();
        jLabel_n_categoria_p = new javax.swing.JLabel();
        jTextField_n_precio_p = new javax.swing.JTextField();
        jLabel_n_precio_p = new javax.swing.JLabel();
        jTextField_n_cantidad_p = new javax.swing.JTextField();
        jLabel_n_cantidad_p = new javax.swing.JLabel();
        jButton_guardar = new javax.swing.JButton();
        jButton_eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField_n_id = new javax.swing.JTextField();
        jButton_hacia_bd = new javax.swing.JButton();
        jButton_hacia_login = new javax.swing.JButton();

        jLabel_nombe_p1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_nombe_p1.setText("Nommbre producto");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.lightGray));

        jLabel_nombe_p.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_nombe_p.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombe_p.setText("Nommbre producto");

        jLabel_n_marca_p.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_n_marca_p.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_n_marca_p.setText("Marca");

        jLabel_n_categoria_p.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_n_categoria_p.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_n_categoria_p.setText("Categoria");

        jLabel_n_precio_p.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_n_precio_p.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_n_precio_p.setText("Precio");

        jLabel_n_cantidad_p.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel_n_cantidad_p.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_n_cantidad_p.setText("Cantidad");

        jButton_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_guardarActionPerformed(evt);
            }
        });

        jButton_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_eliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Modificar la lista de los productos");

        jButton_hacia_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_hacia_bdActionPerformed(evt);
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_nombe_p, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_n_marca_p, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addComponent(jTextField_n_marca_p)
                                .addComponent(jTextField_n_nombre_p))
                            .addGap(72, 72, 72)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_n_cantidad_p, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addComponent(jLabel_n_precio_p, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                .addComponent(jTextField_n_precio_p)
                                .addComponent(jTextField_n_cantidad_p)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_n_categoria_p, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_n_categoria_p, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jButton_hacia_bd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_hacia_login, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 113, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jTextField_n_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField_n_id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_nombe_p, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_n_nombre_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_n_precio_p, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_n_precio_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_n_marca_p, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_n_marca_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_n_cantidad_p, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_n_cantidad_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addComponent(jLabel_n_categoria_p, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_n_categoria_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButton_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_hacia_login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jButton_hacia_bd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    //Método privado que realixa el proceso de guardar los datos modificados
    //Ese espera el evento "clic" ya que esta colocado a un botón
    private void jButton_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_guardarActionPerformed
       
        String n_nombre = jTextField_n_nombre_p.getText();        //Recupera el texto del campo nombre del producto
        String n_marca = jTextField_n_marca_p.getText();         //Recupera el texto del campo de la marca del producto
        String n_categoria = jTextField_n_categoria_p.getText(); //Recupera el texto de categoria
        String n_precio = jTextField_n_precio_p.getText();    //Recupera el texto del campo precio
        String n_cantidad = jTextField_n_cantidad_p.getText();  //Recupera el texto del campo cantidad
        int id_v = Integer.parseInt(jTextField_n_id.getText()); //Recupera como texto el id de la fila del producto
       
        
        //Tras recuperar el contenido de cada campo, uso una corta condición para verificar/comprobar si el usuario no ha dejado ningun campo vacio
        
        if(n_nombre.length() == 0 || n_marca.length() == 0 || n_categoria.length() == 0 || n_precio.length() == 0 
                || n_cantidad.length() == 0){
            
            //Si dejó un campo vacio, se le aparece ese mensaje
             JOptionPane.showMessageDialog(this, "No se puede dejar campos vacios");
        }
        else{
             //Si ha llenado todo, se ejecuta el código dentro de esas llaves encierrado dentro de un try...catch 
             //para prevenir y recuperar cualquier tipo de error que podría surgir      
                  try{
                            
                            //Crea un nuevo ojeto conexion a la base
                            conexion conecta = new conexion();
                            Connection con = conecta.getConexion();  

                            //Crea un objeto que se encarara de preparar el query en ese caso un Update
                            PreparedStatement ps = con.prepareStatement("UPDATE productos SET NombreProducto=?, MarcaProducto=?, CategoriaProducto=?, PrecioProducto=?, StockProducto=? WHERE idProducto=?");

                            //Se coloca en la posicion correcta el valor recuperado de cada campo
                            ps.setString(1, n_nombre);
                            ps.setString(2, n_marca);
                            ps.setString(3, n_categoria);
                            ps.setString(4, n_precio);
                            ps.setString(5, n_cantidad);
                            ps.setInt(6,id_v);

                            //metodo aplicado al ojeto para ejecutar el query
                            ps.executeUpdate();

                            //metodo para finalizar todo relacionado con el query
                            ps.close();
                            //Cierre de la conexion
                            con.close();
                             
                            //Se muestra un mensaje al usuario para informarlo que todo ha ido bien
                            JOptionPane.showMessageDialog(null, "Registro modificado");
                            

                         }
                  //Se encarga de recuperar calquiera excepción de error que se podría levantar
                  catch(SQLException e){
                              System.out.print(e);
                  }
                  
             }        
        
        
    }//GEN-LAST:event_jButton_guardarActionPerformed
    
    //método privado asignado a un bóton que cuando le das clic retorna a ventana de la base de datos
    private void jButton_hacia_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hacia_bdActionPerformed
        
        //método que cierra la venta
        dispose();
        
        //Se crea un nuevo objeto base de datos de los productos el cual con la llamada de sus métodos va crear una ventana
        producto_database v = new producto_database();
        //para que la ventana esté visible
        v.setVisible(true);
        
    }//GEN-LAST:event_jButton_hacia_bdActionPerformed

    //método no accesible fuera de la clase asignado a un bóton que cuando le das clic manda a la pantalla de Login
    private void jButton_hacia_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_hacia_loginActionPerformed
        dispose();
        
        //Se crea un nuevo objeto pantalla de inicio
        pantalla_de_inicio p = new pantalla_de_inicio();
        p.setVisible(true);
    }//GEN-LAST:event_jButton_hacia_loginActionPerformed

    //método asignado a bóton cuyo papel será de borrar de la base de datos el id del campo selecionado 
    private void jButton_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_eliminarActionPerformed
       
        //Recuperar el Id del campo
        int id = Integer.parseInt(jTextField_n_id.getText());
                      
                  try{ 
                            //estable una nueva conexion
                            conexion conecta = new conexion();
                            Connection con = conecta.getConexion();  

                            //Prepara la consulta
                            PreparedStatement ps = con.prepareStatement("DELETE FROM productos WHERE idProducto = ?");

                            //asigna un valor en tero al << id >>
                            ps.setInt(1,id);

                            //Ejecuta el query, en ese caso la actualizacion de la base de datos
                            ps.executeUpdate();

                            //Cierra
                            ps.close();
                            con.close();

                            //Mensaje para el usuario final
                            JOptionPane.showMessageDialog(null, "Registro Eliminado");
                            

                         }
                  //Captura errores durante la ejecucion del programa
                  catch(SQLException e){
                              System.out.print(e);
                  }
        
    }//GEN-LAST:event_jButton_eliminarActionPerformed

   
    
      //Crea y muestra la ventana
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(alterar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(alterar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(alterar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(alterar_producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new alterar_producto().setVisible(true);
            }
        });
    }

    //Declaracion de todas la variable necesaria
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_eliminar;
    private javax.swing.JButton jButton_guardar;
    private javax.swing.JButton jButton_hacia_bd;
    private javax.swing.JButton jButton_hacia_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_n_cantidad_p;
    private javax.swing.JLabel jLabel_n_categoria_p;
    private javax.swing.JLabel jLabel_n_marca_p;
    private javax.swing.JLabel jLabel_n_precio_p;
    private javax.swing.JLabel jLabel_nombe_p;
    private javax.swing.JLabel jLabel_nombe_p1;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField_n_cantidad_p;
    public static javax.swing.JTextField jTextField_n_categoria_p;
    public static javax.swing.JTextField jTextField_n_id;
    public static javax.swing.JTextField jTextField_n_marca_p;
    public static javax.swing.JTextField jTextField_n_nombre_p;
    public static javax.swing.JTextField jTextField_n_precio_p;
    // End of variables declaration//GEN-END:variables
}
