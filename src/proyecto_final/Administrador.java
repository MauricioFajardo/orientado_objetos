
package proyecto_final;
public class Administrador extends Persona{
    private String codigo_dmin;
    private String usuario, contraseña;
    private String cedula; //llave secundaria de persona
    private String codigo_orga;// llave secundaria de ordanizadores

    public Administrador() {
        super();
    }

    public Administrador(String codigo_dmin, String usuario, String contraseña, String codigo_orga, String cedula, String nombre, String apellido, String telefono, String correo, String direccion, String celular, int edad, char genero) {
        super(cedula, nombre, apellido, telefono, correo, direccion, celular, edad, genero);
        this.codigo_dmin = codigo_dmin;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cedula = cedula;
        this.codigo_orga = codigo_orga;
    }

    public String getCodigo_dmin() {
        return codigo_dmin;
    }

    public void setCodigo_dmin(String codigo_dmin) {
        this.codigo_dmin = codigo_dmin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo_orga() {
        return codigo_orga;
    }

    public void setCodigo_orga(String codigo_orga) {
        this.codigo_orga = codigo_orga;
    }
    
    
    

    
    
}
