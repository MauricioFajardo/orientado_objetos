
package proyecto_final;
public class Comerciantes extends Persona{
    private String codigo_participante;//llave primaria
    private String cedula, Tipo_Comercio, Productos_c, Servicio_c, Contacto_c;
    private String codigo_puesto;//llave secundaria

    public Comerciantes() {
        super();
    }

    public Comerciantes(String codigo_participante, String cedula, String Tipo_Comercio, String Productos_c, String Servicio_c, String Contacto_c, String codigo_puesto, String nombre, String apellido, String telefono, String correo, String direccion, String celular, int edad, char genero) {
        super(cedula, nombre, apellido, telefono, correo, direccion, celular, edad, genero);
        this.codigo_participante = codigo_participante;
        this.cedula = cedula;
        this.Tipo_Comercio = Tipo_Comercio;
        this.Productos_c = Productos_c;
        this.Servicio_c = Servicio_c;
        this.Contacto_c = Contacto_c;
        this.codigo_puesto = codigo_puesto;
    }

    public String getCodigo_participante() {
        return codigo_participante;
    }

    public void setCodigo_participante(String codigo_participante) {
        this.codigo_participante = codigo_participante;
    }

    public String getCedula() {
        return cedula;
    }

    @Override
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTipo_Comercio() {
        return Tipo_Comercio;
    }

    public void setTipo_Comercio(String Tipo_Comercio) {
        this.Tipo_Comercio = Tipo_Comercio;
    }

    public String getProductos_c() {
        return Productos_c;
    }

    public void setProductos_c(String Productos_c) {
        this.Productos_c = Productos_c;
    }

    public String getServicio_c() {
        return Servicio_c;
    }

    public void setServicio_c(String Servicio_c) {
        this.Servicio_c = Servicio_c;
    }

    public String getContacto_c() {
        return Contacto_c;
    }

    public void setContacto_c(String Contacto_c) {
        this.Contacto_c = Contacto_c;
    }

    public String getCodigo_puesto() {
        return codigo_puesto;
    }

    public void setCodigo_puesto(String codigo_puesto) {
        this.codigo_puesto = codigo_puesto;
    }
    
    
    

    

    
   
    
    
}
