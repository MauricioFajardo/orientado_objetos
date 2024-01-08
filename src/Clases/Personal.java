
package Clases;

import Clases.Persona;
import java.util.Date;

public class Personal extends Persona{
    private String codigo_perso;//llave primraria
    private String Tipo_personal, Departamento_p, contanto_p, Calificacion_p;
  //  private Date Fecha_contrato;
    private String cedula_perso;//llave secundaria de persona

    public Personal() {
        super();
    }

    public Personal(String codigo_perso, String Tipo_personal, String Departamento_p, String contanto_p, String Calificacion_p, String cedula_perso, String cedula, String nombre, String apellido, String telefono, String correo, String direccion, String celular, Date fecchaNaci, int edad, String genero) {
        super(cedula, nombre, apellido, telefono, correo, direccion, celular, fecchaNaci, edad, genero);
        this.codigo_perso = codigo_perso;
        this.Tipo_personal = Tipo_personal;
        this.Departamento_p = Departamento_p;
        this.contanto_p = contanto_p;
        this.Calificacion_p = Calificacion_p;
        this.cedula_perso = cedula_perso;
    }

    

    public String getCodigo_perso() {
        return codigo_perso;
    }

    public void setCodigo_perso(String codigo_perso) {
        this.codigo_perso = codigo_perso;
    }

    public String getTipo_personal() {
        return Tipo_personal;
    }

    public void setTipo_personal(String Tipo_personal) {
        this.Tipo_personal = Tipo_personal;
    }

    public String getDepartamento_p() {
        return Departamento_p;
    }

    public void setDepartamento_p(String Departamento_p) {
        this.Departamento_p = Departamento_p;
    }

    public String getContanto_p() {
        return contanto_p;
    }

    public void setContanto_p(String contanto_p) {
        this.contanto_p = contanto_p;
    }

    public String getCalificacion_p() {
        return Calificacion_p;
    }

    public void setCalificacion_p(String Calificacion_p) {
        this.Calificacion_p = Calificacion_p;
    }

    public String getCedula_perso() {
        return cedula_perso;
    }

    public void setCedula_perso(String cedula_perso) {
        this.cedula_perso = cedula_perso;
    }

    
      
}
