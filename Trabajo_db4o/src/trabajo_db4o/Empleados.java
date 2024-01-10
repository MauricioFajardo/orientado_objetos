/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_db4o;

/**
 *
 * @author Lenovo.User
 */
public class Empleados {
    
    private String cedula_empleado,nombre_empleado,apellido_empleado,correo,telefono;
    private String fecha_contratacion;
    private String cedula_jefe,comicion,cod_trabajo;
    private double salario;
    private int id_departamento;

    public Empleados() {
    }

    public Empleados(String cedula_empleado, String nombre_empleado, String apellido_empleado, String correo, String telefono, String fecha_contratacion, String cedula_jefe, String comicion, String cod_trabajo, double salario, int id_departamento) {
        this.cedula_empleado = cedula_empleado;
        this.nombre_empleado = nombre_empleado;
        this.apellido_empleado = apellido_empleado;
        this.correo = correo;
        this.telefono = telefono;
        this.fecha_contratacion = fecha_contratacion;
        this.cedula_jefe = cedula_jefe;
        this.comicion = comicion;
        this.cod_trabajo = cod_trabajo;
        this.salario = salario;
        this.id_departamento = id_departamento;
    }

    
    

    public String getCedula_empleado() {
        return cedula_empleado;
    }

    public void setCedula_empleado(String cedula_empleado) {
        this.cedula_empleado = cedula_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getApellido_empleado() {
        return apellido_empleado;
    }

    public void setApellido_empleado(String apellido_empleado) {
        this.apellido_empleado = apellido_empleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFecha_contratacion() {
        return fecha_contratacion;
    }

    public void setFecha_contratacion(String fecha_contratacion) {
        this.fecha_contratacion = fecha_contratacion;
    }

    public String getCedula_jefe() {
        return cedula_jefe;
    }

    public void setCedula_jefe(String cedula_jefe) {
        this.cedula_jefe = cedula_jefe;
    }

    public String getComicion() {
        return comicion;
    }

    public void setComicion(String comicion) {
        this.comicion = comicion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId_departamento() {
        return id_departamento;
    }

    public void setId_departamento(int id_departamento) {
        this.id_departamento = id_departamento;
    }

    public String getCod_trabajo() {
        return cod_trabajo;
    }

    public void setCod_trabajo(String cod_trabajo) {
        this.cod_trabajo = cod_trabajo;
    }

    
    @Override
    public String toString() {
        return "Empleados{" + "cedula_empleado=" + cedula_empleado + ", nombre_empleado=" + nombre_empleado + ", apellido_empleado=" + apellido_empleado + ", correo=" + correo + ", telefono=" + telefono + ", fecha_contratacion=" + fecha_contratacion + ", cedula_jefe=" + cedula_jefe + ", comicion=" + comicion + ", salario=" + salario + ", id_departamento=" + id_departamento + '}';
    }
    
    
    
}
