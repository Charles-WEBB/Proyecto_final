
package producto;

//importaciones de clases importantes
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



public class producto_database extends javax.swing.JFrame {

    //inicializa una nueva ventana
    public producto_database() {
        initComponents();
        cargarDatos();
        
        //centra la ventana
        this.setLocationRelativeTo(null);
        
        //carga y coloca al label el icono
        jLabel_close.setIcon(new javax.swing.ImageIcon(getClass().getResource("imagenes/x_rojo.png")));
       
        
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
        jLabel_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_productos = new javax.swing.JTable();
        jButton_agragar = new javax.swing.JButton();
        jLabel_close = new javax.swing.JLabel();
        jButton_c_s = new javax.swing.JButton();
        jButton_intermediario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_titulo.setText("Lista de  los productos registrados");

        jTable_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Marca", "Categoria", "Precio", "Cantidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_productosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_productos);
        if (jTable_productos.getColumnModel().getColumnCount() > 0) {
            jTable_productos.getColumnModel().getColumn(0).setResizable(false);
            jTable_productos.getColumnModel().getColumn(4).setResizable(false);
            jTable_productos.getColumnModel().getColumn(5).setResizable(false);
        }

        jButton_agragar.setBackground(new java.awt.Color(0, 51, 204));
        jButton_agragar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_agragar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_agragar.setText("Agregar nuevo");
        jButton_agragar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agragarActionPerformed(evt);
            }
        });

        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
        });

        jButton_c_s.setBackground(new java.awt.Color(255, 51, 0));
        jButton_c_s.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_c_s.setText("Cierrar session");
        jButton_c_s.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_c_sActionPerformed(evt);
            }
        });

        jButton_intermediario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_intermediario.setText("<  Anterior");
        jButton_intermediario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_intermediarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_intermediario, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addComponent(jButton_agragar)
                .addGap(217, 217, 217)
                .addComponent(jButton_c_s, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_agragar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_intermediario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_c_s, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

    //Cierra la ventana al hacer click sobre el label
    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
       dispose();
    }//GEN-LAST:event_jLabel_closeMouseClicked

    //Se encargar de agregar los datos en la base de datos
    private void jButton_agragarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agragarActionPerformed
       dispose();
        
       //se crea un nuevo objeto
       registro_producto nuevo_producto = new registro_producto();
       nuevo_producto.setVisible(true);
    }//GEN-LAST:event_jButton_agragarActionPerformed
 
    //Funcion llamada cuando damos click en un campo de la tabla
    private void jTable_productosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_productosMouseClicked
       
        //Encierramos el codigo dentro de un try...catch
         try{
             
          //Seleccionamos la fila
         int fila = jTable_productos.getSelectedRow();
         //Recuperamos el id a la posicion 0 de la fila
         int id = Integer.parseInt(jTable_productos.getValueAt(fila, 0).toString());
         
          //Nueva conexion a la base de datos
         conexion conecta = new conexion();
         Connection con = conecta.getConexion();  
         
         //Preparamos nuestra dentencia
         PreparedStatement ps2 = con.prepareStatement("SELECT NombreProducto, MarcaProducto, CategoriaProducto, PrecioProducto, StockProducto FROM productos Where idProducto = ?");
         ResultSet rs;
 
         //Llama la ventana que arroja todos los datos de la fila que recibio el click
         alterar_producto t = new alterar_producto();
         //asegura que esa ventana este visible
         t.setVisible(true);
         
         //Afectaciones
         ps2.setInt(1, id);
         //Execution del query
         rs = ps2.executeQuery();
              
         
         //bucle sobre la variable << rs >> para recuperar y colocar los datos a su campo respectivo en la ventana de verificacion. 
         while(rs.next()){
                  alterar_producto.jTextField_n_id.setText(String.valueOf(id));
                  alterar_producto.jTextField_n_nombre_p.setText(rs.getString("NombreProducto"));
                  alterar_producto.jTextField_n_marca_p.setText(rs.getString("MarcaProducto"));
                  alterar_producto.jTextField_n_categoria_p.setText(rs.getString("CategoriaProducto"));
                  alterar_producto.jTextField_n_precio_p.setText(rs.getString("PrecioProducto"));
                  alterar_producto.jTextField_n_cantidad_p.setText(rs.getString("StockProducto"));
                 
              
              }
              
     } catch(SQLException e){
         JOptionPane.showMessageDialog(null, e);
     }
        
    }//GEN-LAST:event_jTable_productosMouseClicked

    
    //Funcion que lleva a la pantalla de inicio
    private void jButton_c_sActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_c_sActionPerformed
        dispose();
        
        pantalla_de_inicio lp = new pantalla_de_inicio();
        lp.setVisible(true);
    }//GEN-LAST:event_jButton_c_sActionPerformed

    //Manda a la ventana anterior (la ventana intermediaria
    private void jButton_intermediarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_intermediarioActionPerformed
        
        dispose();
        
        pantalla_intermediario pI = new pantalla_intermediario();
        pI.setVisible(true);
    }//GEN-LAST:event_jButton_intermediarioActionPerformed
 
    //Carga todos los datos desde la base de datos hacia la tabla 
     public void cargarDatos(){
        
        //Creamos un objeto modelo de tabla
       DefaultTableModel modeloTabla = (DefaultTableModel) jTable_productos.getModel();
       modeloTabla.setRowCount(0);
       
       //Preparamos la sentencia
       PreparedStatement ps;
       ResultSet rs;
       ResultSetMetaData rsmd;
       
       int columnas;
       //Variable para dar un ancho predefinido a las columnas
       int[] anchos = {10, 30, 50, 50, 40, 90, 60};
       for(int i =0; i<jTable_productos.getColumnCount(); i++){
           jTable_productos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
       }
       //Se realiza una conxion
        try{
              conexion conecta = new conexion();
              Connection con = conecta.getConexion();  

              PreparedStatement ps2 = con.prepareStatement("SELECT idProducto, NombreProducto, MarcaProducto, CategoriaProducto, PrecioProducto, StockProducto FROM productos");
        
              rs = ps2.executeQuery();
              rsmd = (ResultSetMetaData) rs.getMetaData();
              columnas = rsmd.getColumnCount();
              
              //Iteramos la variable rs para llenar cada fila y columna de la tabla
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
    
    
     //Main que ejecuta el codigo
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(producto_database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(producto_database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(producto_database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(producto_database.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

             //Crea y muestra la ventana

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new producto_database().setVisible(true);
            }
        });
    }

    //Variabes importanes declaradas
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_agragar;
    private javax.swing.JButton jButton_c_s;
    private javax.swing.JButton jButton_intermediario;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_productos;
    // End of variables declaration//GEN-END:variables
}
