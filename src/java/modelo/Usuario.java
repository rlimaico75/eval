
package modelo;

public class Usuario {    
 int id;
 String usuario;
 String clave;
 String acceso;
 String descripcion;
 
    public Usuario(){
            }
   
    public Usuario(int id, String usuario, String clave, String acceso, String descripcion) {
        this.id = id;
        this.usuario = usuario;
        this.clave = clave;
        this.acceso = acceso;
        this.descripcion=descripcion;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getAcceso() {
        return acceso;
    }

    public void setAcceso(String acceso) {
        this.acceso = acceso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
 
    
    
    
}
