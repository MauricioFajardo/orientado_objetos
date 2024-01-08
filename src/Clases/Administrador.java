
package Clases;

import java.util.Date;

public class Administrador extends Persona{
    private String codigo_dmin;
    private String usuario, contraseña;
    private String cedula_perso; //llave secundaria de persona
    private String codigo_orga;// llave secundaria de ordanizadores

    public Administrador() {
        super();
    }

    public Administrador(String codigo_dmin, String usuario, String contraseña, String cedula_perso, String codigo_orga, String cedula, String nombre, String apellido, String telefono, String correo, String direccion, String celular, Date fecchaNaci, int edad, String genero) {
        super(cedula, nombre, apellido, telefono, correo, direccion, celular, fecchaNaci, edad, genero);
        this.codigo_dmin = codigo_dmin;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cedula_perso = cedula_perso;
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

    public String getCedula_perso() {
        return cedula_perso;
    }

    public void setCedula_perso(String cedula_perso) {
        this.cedula_perso = cedula_perso;
    }

    

    public String getCodigo_orga() {
        return codigo_orga;
    }

    public void setCodigo_orga(String codigo_orga) {
        this.codigo_orga = codigo_orga;
    }
    
    
    

    
    
}
