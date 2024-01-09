/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_bada;

import Clases.Administrador;
import basedatos.Conexion;
import java.sql.Connection;
//import java.beans.Statement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Insert_administrador extends Administrador {

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

    public boolean InsertarAdministrador() {
        String sql = "INSERT INTO administrador (codigo_admi, usuario_admi, contrasenia_admi, cedu_persona)"
                + " VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement statement = cone.getCon().prepareStatement(sql);
            statement.setString(1, getCodigo_dmin());
            statement.setString(2, getUsuario());
            statement.setString(3, getContraseña());
            statement.setString(4, getCedula());

            int rowsAffected = statement.executeUpdate();
            statement.close();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    public List<Administrador> ListaAdministrador() {
        String sqls = "SELECT * FROM persona per JOIN administrador admi ON per.per_cedula = admi.cedu_persona";
        ResultSet rs = cone.selectConsulta(sqls);
        List<Administrador> admin = new ArrayList<>();
        try {
            while (rs.next()) {
                Administrador mi_admin = new Administrador();
                mi_admin.setCodigo_dmin(rs.getString("codigo_admi"));
                mi_admin.setUsuario(rs.getString("usuario_admi"));
                mi_admin.setContraseña(rs.getString("contrasenia_admi"));
                mi_admin.setCedula(rs.getString("cedu_persona"));
                mi_admin.setCedula_perso(rs.getString("per_cedula"));

                mi_admin.setNombre(rs.getString("per_primer_nombre"));
                mi_admin.setApellido(rs.getString("per_primer_apellido"));
                mi_admin.setTelefono(rs.getString("per_telefono"));
                mi_admin.setCorreo(rs.getString("per_correo"));

                mi_admin.setDireccion(rs.getString("per_direccion"));

                mi_admin.setCelular(rs.getString("per_celular"));
                mi_admin.setFecchaNaci(rs.getString("per_fecha_nacimiento"));
                mi_admin.setGenero(rs.getString("per_genero"));
              

                admin.add(mi_admin);
            }
            rs.close();
            return admin;
        } catch (SQLException ex) {
            Logger.getLogger(Insert_administrador.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    // verificar que no se repita uuna llave primaria en ropa
    public boolean verificarDuplicidadCodAdmin(String codigoAdmi) {
        String sql = "SELECT COUNT(*) AS count FROM administrador WHERE codigo_admi = ?";
        try {
            PreparedStatement statement = cone.getCon().prepareStatement(sql);
            statement.setString(1, codigoAdmi);
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

//    public static ArrayList<String> obtenerCodigosAdministradorDesdeBaseDeDatos() {
//        ArrayList<String> codigosAdministrador = new ArrayList<>();
//
//        try (Connection conexion = new Conexion().getCon();
//                PreparedStatement pst = conexion.prepareStatement("SELECT codigo_admi FROM administrador");
//                ResultSet rs = pst.executeQuery()) {
//
//            while (rs.next()) {
//                String codigoAdmin = rs.getString("codigo_admi");
//                codigosAdministrador.add(codigoAdmin);
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//
//        return codigosAdministrador;
//    }

//    public static String[] obtenerDetallesAdministradorDesdeBaseDeDatos(String codigoAdmin) throws SQLException {
//        try (Connection conexion = new Conexion().getCon();
//                PreparedStatement pst = conexion.prepareStatement(
//                        "SELECT per_cedula, per_primer_nombre, per_primer_apellido "
//                        + "FROM persona "
//                        + "INNER JOIN administrador ON persona.per_cedula = administrador.cedu_persona "
//                        + "WHERE administrador.codigo_admi = ?")) {
//
//            pst.setString(1, codigoAdmin);
//
//            try (ResultSet rs = pst.executeQuery()) {
//                if (rs.next()) {
//                    String cedula = rs.getString("per_cedula");
//                    String nombre = rs.getString("per_primer_nombre");
//                    String apellido = rs.getString("per_primer_apellido");
//                    return new String[]{cedula, nombre, apellido};
//                }
//            }
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//
//        return null;
//    }
}
