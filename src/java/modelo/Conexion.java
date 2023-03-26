
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
import java.sql.Connection;


 *
 * @author DELL
 */
public class Conexion {
    Connection con;
    
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            

            con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/evalsyst","root","");
            
        }catch (ClassNotFoundException | SQLException e){
            
        }
                
        return con;
        
    }
           
            
    
    
}
