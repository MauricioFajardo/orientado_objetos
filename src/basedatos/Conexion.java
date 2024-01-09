/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basedatos;

import java.sql.Statement;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author HP
 */
public class Conexion {

    private Statement st;
    private ResultSet rs;

    private Connection con;
    private Connection conexion;

    String cadenaConexion = "jdbc:postgresql://localhost:5433/Proyecto_final";

    String usuarioPG = "postgres";
    String contraPG = "12345";

    public Conexion() {
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("Driver OK");
        } catch (ClassNotFoundException ex) {
            System.out.println("Exception" + ex.getMessage());
        }

        try {
            conexion = DriverManager.getConnection(cadenaConexion, usuarioPG, contraPG);
            System.out.println("Conexion OK");
        } catch (SQLException ex) {

            System.out.println("Exception" + ex.getMessage());
        }
    }

    public ResultSet consultaBD(String sql) {

        try {
            Statement st = conexion.createStatement();
            return st.executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println("Exception" + ex.getMessage());
            return null;
        }

    }

    public ResultSet selectConsulta(String sql) {
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        return null;
    }

    public boolean InsertUpdateDeleteAcciones(String sql) {
        try {
            st = con.createStatement();
            boolean rv = st.execute(sql);
            st.close();
            return true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Conexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return false;
        }

    }

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
}
