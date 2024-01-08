
package Clases;

import java.util.Date;

public class Patrocinador extends Persona{
    private String codigo_patri;//llave primaria
    private String Descripcion_p, Contacto_p, Redes_Sociales;
    private String cedula_perso;// llave secundaria de persona

    public Patrocinador() {
        super();
    }

    public Patrocinador(String codigo_patri, String Descripcion_p, String Contacto_p, String Redes_Sociales, String cedula_perso, String cedula, String nombre, String apellido, String telefono, String correo, String direccion, String celular, String fecchaNaci, String genero) {
        super(cedula, nombre, apellido, telefono, correo, direccion, celular, fecchaNaci, genero);
        this.codigo_patri = codigo_patri;
        this.Descripcion_p = Descripcion_p;
        this.Contacto_p = Contacto_p;
        this.Redes_Sociales = Redes_Sociales;
        this.cedula_perso = cedula_perso;
    }

    

    

    public String getCodigo_patri() {
        return codigo_patri;
    }

    public void setCodigo_patri(String codigo_patri) {
        this.codigo_patri = codigo_patri;
    }

    public String getDescripcion_p() {
        return Descripcion_p;
    }

    public void setDescripcion_p(String Descripcion_p) {
        this.Descripcion_p = Descripcion_p;
    }

    public String getContacto_p() {
        return Contacto_p;
    }

    public void setContacto_p(String Contacto_p) {
        this.Contacto_p = Contacto_p;
    }

    public String getRedes_Sociales() {
        return Redes_Sociales;
    }

    public void setRedes_Sociales(String Redes_Sociales) {
        this.Redes_Sociales = Redes_Sociales;
    }

    public String getCedula_perso() {
        return cedula_perso;
    }

    public void setCedula_perso(String cedula_perso) {
        this.cedula_perso = cedula_perso;
    }

    
    
    
    
}
