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
public class Organizador extends Persona {
    
    private String cod_organizador;
    private String usuario, contraseña;
    private String Presupuesto;
    private String cedula_perso; //llave secundaria de persona

    public Organizador(String cod_organizador, String usuario, String contraseña, String Presupuesto, String cedula_perso) {
        this.cod_organizador = cod_organizador;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.Presupuesto = Presupuesto;
        this.cedula_perso = cedula_perso;
    }

    public Organizador() {
    }

    public String getCod_organizador() {
        return cod_organizador;
    }

    public void setCod_organizador(String cod_organizador) {
        this.cod_organizador = cod_organizador;
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

    public String getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(String Presupuesto) {
        this.Presupuesto = Presupuesto;
    }

    public String getCedula_perso() {
        return cedula_perso;
    }

    public void setCedula_perso(String cedula_perso) {
        this.cedula_perso = cedula_perso;
    }

    @Override
    public String toString() {
        return "Organizador{" + "cod_organizador=" + cod_organizador + ", usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", Presupuesto=" + Presupuesto + ", cedula_perso=" + cedula_perso + '}';
    }
    
    
    
    
}
