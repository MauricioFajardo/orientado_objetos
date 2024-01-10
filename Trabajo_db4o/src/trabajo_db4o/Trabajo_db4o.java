/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_db4o;

import com.db4o.*;

/**
 *
 * @author Lenovo.User
 */
public class Trabajo_db4o {

    public static String direccion = "C:\\Users\\Lenovo.User\\Documents\\base_orientada\\recursos_humanos.yap";

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ObjectContainer base = Db4o.openFile(direccion);
        
        
        //String cedula_empleado, String nombre_empleado, String apellido_empleado, String correo, String telefono, String fecha_contratacion, String cedula_jefe, String comicion, String cod_trabajo, double salario, int id_departamento
        CrearEmpleado(base,"0106170129","Anthony","Fajardo","mauricio.2004@gmaikl.cs","0987654321","12/01/2010"," ","fiestas","001", 450.0 , 5);

        base.close();
    }
    
    public  static void CrearEmpleado(ObjectContainer base,String cedula_empleado, String nombre_empleado, String apellido_empleado, String correo, String telefono, String fecha_contratacion, String cedula_jefe, String comicion, String cod_trabajo, double salario, int id_departamento){
        Empleados empleado1 = new Empleados(cedula_empleado,nombre_empleado, apellido_empleado, correo,telefono, fecha_contratacion,cedula_jefe,comicion, cod_trabajo, salario, id_departamento);
       
        base.set(empleado1);
    }

}
