/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Lenovo
 */
public class Puesto {
    
    private String Codigo_puesto;
    private String NombrePuesto;
    private String DescripcionPuesto;
    private String Departamento;
    private String tipo_puesto;
    private String Salario_puesto;

    public Puesto(String Codigo_puesto, String NombrePuesto, String DescripcionPuesto, String Departamento, String tipo_puesto, String Salario_puesto) {
        this.Codigo_puesto = Codigo_puesto;
        this.NombrePuesto = NombrePuesto;
        this.DescripcionPuesto = DescripcionPuesto;
        this.Departamento = Departamento;
        this.tipo_puesto = tipo_puesto;
        this.Salario_puesto = Salario_puesto;
    }

    public Puesto() {
    }

    public String getCodigo_puesto() {
        return Codigo_puesto;
    }

    public void setCodigo_puesto(String Codigo_puesto) {
        this.Codigo_puesto = Codigo_puesto;
    }

    public String getNombrePuesto() {
        return NombrePuesto;
    }

    public void setNombrePuesto(String NombrePuesto) {
        this.NombrePuesto = NombrePuesto;
    }

    public String getDescripcionPuesto() {
        return DescripcionPuesto;
    }

    public void setDescripcionPuesto(String DescripcionPuesto) {
        this.DescripcionPuesto = DescripcionPuesto;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getTipo_puesto() {
        return tipo_puesto;
    }

    public void setTipo_puesto(String tipo_puesto) {
        this.tipo_puesto = tipo_puesto;
    }

    public String getSalario_puesto() {
        return Salario_puesto;
    }

    public void setSalario_puesto(String Salario_puesto) {
        this.Salario_puesto = Salario_puesto;
    }

    @Override
    public String toString() {
        return "Puesto{" + "Codigo_puesto=" + Codigo_puesto + ", NombrePuesto=" + NombrePuesto + ", DescripcionPuesto=" + DescripcionPuesto + ", Departamento=" + Departamento + ", tipo_puesto=" + tipo_puesto + ", Salario_puesto=" + Salario_puesto + '}';
    }
   
}
