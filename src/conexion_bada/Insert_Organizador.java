/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_bada;

import Clases.Organizador;
import Clases.Persona;
import basedatos.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Insert_Organizador extends Organizador {

    Conexion cone = new Conexion();

    public boolean InsertarPersona(String fecha) {
        Date date = new Date();

        SimpleDateFormat formatofecha = new SimpleDateFormat("yyyy-MM-dd");
        fecha = formatofecha.format(date);
        java.sql.Date fechasql = java.sql.Date.valueOf(fecha);
        String sql = "INSERT INTO persona (per_cedula, per_primer_nombre, per_primer_apellido, per_telefono, per_correo, per_direccion, per_celular, per_fecha_nacimiento, per_genero)"
                + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = cone.getCon().prepareStatement(sql);
            statement.setString(1, getCedula());
            statement.setString(2, getNombre());
            statement.setString(3, getApellido());
            statement.setString(4, getTelefono());
            statement.setString(5, getCorreo());
            statement.setString(6, getDireccion());
            statement.setString(7, getCelular());
            statement.setDate(8, fechasql);
            statement.setString(9, String.valueOf(getGenero()));

            int rowsAffected = statement.executeUpdate();
            statement.close();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public boolean InsertarOrganizador() {
        String sql = "INSERT INTO organizador (codigo_orga, usuario_orga, contrasenia_orga,presupuesto_orga ,cedu_persona)"
                + " VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = cone.getCon().prepareStatement(sql);
            statement.setString(1, getCod_organizador());
            statement.setString(2, getUsuario());
            statement.setString(3, getContraseña());
           // statement.setString(4, getPresupuesto());
            statement.setString(5, getCedula());

            int rowsAffected = statement.executeUpdate();
            statement.close();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    
    
    public List<Organizador> ListaOrganizador() {
        String sqls = "SELECT * FROM persona per JOIN organizador orga ON per.per_cedula = orga.cedu_persona";
        ResultSet rs = cone.selectConsulta(sqls);
        List<Organizador> admin = new ArrayList<>();
        try {
            while (rs.next()) {
                Organizador mi_admin = new Organizador();
                mi_admin.setCod_organizador(rs.getString("codigo_orga"));
                mi_admin.setUsuario(rs.getString("usuario_orga"));
                mi_admin.setContraseña(rs.getString("contrasenia_orga"));
                //mi_admin.setPresupuesto(rs.getString("presupuesto_orga"));
                mi_admin.setCedula(rs.getString("cedu_persona"));
               // mi_admin.setCedula_perso(rs.getString("per_cedula"));

                mi_admin.setNombre(rs.getString("per_primer_nombre"));
                mi_admin.setApellido(rs.getString("per_primer_apellido"));
                mi_admin.setTelefono(rs.getString("per_telefono"));
                mi_admin.setCorreo(rs.getString("per_correo"));

                mi_admin.setDireccion(rs.getString("per_direccion"));

                mi_admin.setCelular(rs.getString("per_celular"));
            //    mi_admin.setFecchaNaci(rs.getString("per_fecha_nacimiento"));
                mi_admin.setGenero(rs.getString("per_genero"));

                admin.add(mi_admin);
            }
            rs.close();
            return admin;
        } catch (SQLException ex) {
            Logger.getLogger(Insert_Organizador.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    // verificar que no se repita uuna llave primaria en ropa
    public boolean verificarDuplicidadCodAdmin(String codigoOrga) {
        String sql = "SELECT COUNT(*) AS count FROM organizador WHERE codigo_orga = ?";
        try {
            PreparedStatement statement = cone.getCon().prepareStatement(sql);
            statement.setString(1, codigoOrga);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                int count = rs.getInt("count");
                return count > 0; // Si count > 0, significa que ya existe un registro con ese código de ropa
            }
            rs.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
