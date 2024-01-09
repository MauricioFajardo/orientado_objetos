/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_bada;

import Clases.Persona;
import basedatos.Conexion;
import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class Insert extends Persona {

    Conexion cone = new Conexion();
    private Statement st;
    private ResultSet rs;

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
            statement.setString(9, (getGenero()));

            int rowsAffected = statement.executeUpdate();
            statement.close();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            if (ex.getMessage().contains("llave duplicada viola restricción de unicidad \"persona_pkey\"")) {
                // Acciones a tomar si se viola la restricción de unicidad de la clave primaria en "persona"
                JOptionPane.showMessageDialog(null, "La cédula ingresada ya existe en la tabla \"persona\". No se puede insertar el registro.");
            } else {
                // Otras acciones para manejar excepciones específicas (si es necesario)
                ex.printStackTrace();
            }
            return false;
        }
    }

    public boolean validarduplicado(String cedula) throws SQLException {
        boolean validar = false;
        String sqls = "SELECT COUNT(*) AS count FROM persona WHERE per_cedula=?";
        PreparedStatement statement = cone.getCon().prepareStatement(sqls);
        statement.setString(1, cedula);
        ResultSet rs = statement.executeQuery();

        if (rs.next()) {
            int count = rs.getInt("count");
            if (count == 0) {
                validar = false; // La cédula NO existe, entonces retornamos false
            } else {
                validar = true; // La cédula YA existe, entonces retornamos true
            }
        }

        rs.close();
        statement.close();
        return validar;
    }

}
