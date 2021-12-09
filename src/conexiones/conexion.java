
package conexiones;

//importacion de algunas clase necesaria
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Clase que hace la conexion con la base de datos gracias al conector 
public class conexion {
      
   //variables
    public static final String URL = "jdbc:mysql://db4free.net:3306/almacenitlafinal";
    public static final String USER = "estuditlafinal";
    public static final String CLAVE = "itla123.";
     
    //cosntructor de la clase
    public Connection getConexion(){
        Connection con = null;
        //Encieramos el codigo dentro de un try..catch
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Llama al driver
            con = (Connection) DriverManager.getConnection(URL, USER, CLAVE);
        }catch(ClassNotFoundException | SQLException e){
            //Mensaje que se muestra en caso que haya un error
            System.out.println("Error: " + e.getMessage());
        }
        return con;
    }
}

