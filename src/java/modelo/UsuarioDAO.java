
package modelo;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO implements validar  {

    Connection con;
    Conexion cn= new Conexion();
    PreparedStatement ps;
    ResultSet rs;
  
    
    

    @Override
    public int validar(Usuario us) {
          int r=0;
        String sql = "select * from usuarios where USUARIO = ? and CLAVE = ?";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setString(1, us.usuario);
            ps.setString(2, us.clave);
            rs=ps.executeQuery();
            while (rs.next()){
                r=r+1;
                us.setUsuario(rs.getString("usuario"));
                us.setClave(rs.getString("clave"));
                           }
            if(r==1){
                return 1;
            }else
                return 0;
            
            
        } catch (SQLException e) {
            return 0;
        }
                }
    
}
