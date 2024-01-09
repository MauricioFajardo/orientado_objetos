/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import Clases.Organizador;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Asignar_Credencialess extends javax.swing.JPanel {

    boolean primeraMayusculaIngresada;

    public Asignar_Credencialess() {
        initComponents();
    }

    public void habiltarDatos() {

        txtapellido.setEnabled(true);
        txtnombre.setEnabled(true);
        txtusuario.setEnabled(true);
        txtpass.setEnabled(true);

    }

    public void SubirDatos(ObjectContainer base) {
        habiltarDatos();

        // Crear objeto Organizador con la cédula ingresada
        Organizador miOrganizador = new Organizador(null, null, null, 0.0, txtconsulta.getText().trim(), null, null, null, null, null, null, null, null);

        // Obtener el objeto existente desde la base de datos
        ObjectSet result = base.get(miOrganizador);
        Organizador miorganizador = (Organizador) result.next();

        // Actualizar los datos del Organizador
        miorganizador.setNombre(txtnombre.getText().trim());
        miorganizador.setApellido(txtapellido.getText().trim());

        miorganizador.setUsuario(txtusuario.getText().trim());
        miorganizador.setContraseña(txtpass.getText().trim());

        // Actualizar el objeto en la base de datos
        base.set(miorganizador);

        JOptionPane.showMessageDialog(this, "Se establecieron de forma correcta las credenciales del Organizador");

        // Limpiar campos
        txtconsulta.setText("");
        lblcod.setText("");
        txtnombre.setText("");
        txtapellido.setText("");

        inhabiltarDatos();
        cargarTabla(base);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtconsulta = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableasignar = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtusuario = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        lblcod = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/contrasena.png"))); // NOI18N
        jLabel1.setText("ASIGNAR CREDENCIALES");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 23, 300, 60));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("INGRESAR CEDULA:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        txtconsulta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtconsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtconsultaMouseClicked(evt);
            }
        });
        txtconsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtconsultaKeyTyped(evt);
            }
        });
        add(txtconsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 178, -1));

        btnBuscar.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/busqueda.png"))); // NOI18N
        btnBuscar.setBorder(null);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDO:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 200, -1, 40));

        txtnombre.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 180, -1));

        txtapellido.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 155, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("CODIGO ORGANIZADOR:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 140, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("USUARIO:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("CONTRASEÑA:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        tableasignar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO ORGANIZADOR", "CEDULA", "NOMBRE", "APELLIDO", "USUARIO", "CONTRASEÑA"
            }
        ));
        jScrollPane3.setViewportView(tableasignar);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 800, 190));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lOGO1.png"))); // NOI18N
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, 260, 130));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-flexible.png"))); // NOI18N
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 340, -1, -1));

        txtusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtusuarioMouseClicked(evt);
            }
        });
        add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 180, -1));

        txtpass.setText("jPasswordField1");
        txtpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpassMouseClicked(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpassKeyTyped(evt);
            }
        });
        add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 150, -1));
        add(lblcod, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 50, -1));

        jButton1.setText("LIMPIAR CAMPOS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, 30));

        jButton2.setText("CARGAR TABLA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, -1, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 900, 570));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 620));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ObjectContainer base = Db4o.openFile(Inicio.direccion);

        String nombre = " ", apellido = " ";

        Query query = base.query();
        query.constrain(Organizador.class);
        query.descend("cedula").constrain(txtconsulta.getText().trim());
        ObjectSet<Organizador> result = query.execute();

        if (!result.isEmpty()) {
            habiltarDatos();
            for (Organizador orga : result) {
                nombre = orga.getNombre();
                apellido = orga.getApellido();
            }
            txtnombre.setText(nombre.trim());
            txtapellido.setText(apellido.trim());

            // Mostrar mensaje indicando que se encontró la cédula y sus datos
            JOptionPane.showMessageDialog(null, "Cédula encontrada:\nNombre: " + nombre + "\nApellido: " + apellido);
            inhabiltarDatos2();
        } else {
            // Mostrar mensaje indicando que no se encontró la cédula
            JOptionPane.showMessageDialog(null, "No se encontró ningún Organizador con la cédula ingresada");
        }

        base.close();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        ObjectContainer base = Db4o.openFile(Inicio.direccion);

        try {
            // Primero buscamos al agente por su cedula
            Query query = base.query();
            query.constrain(Organizador.class);
            query.descend("cedula").constrain(txtconsulta.getText().trim());

            ObjectSet<Organizador> result = query.execute();

            if (result.isEmpty()) {
                // No se encontró al agente con esa cedula
                JOptionPane.showMessageDialog(null, "No se encontró al Organizador con esa cedula");
            } else {
                // Encontramos al agente, ahora verificamos si tiene un usuario y una contraseña
                Organizador agente = result.get(0);

                if (agente.getUsuario() == null || agente.getContraseña() == null) {
                    // El agente no tiene asignado un usuario ni una contraseña
                    if (txtusuario.getText().trim().isEmpty() || txtpass.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Ingrese un usuario o cntraseña");
                    } else {
                        SubirDatos(base);

                    }
                } else {
                    // El agente tiene asignado un usuario y una contraseña
                    JOptionPane.showMessageDialog(null, "El Organizador ya tiene asignado un usuario y una contraseña");
                    String[] columnNames = {"CODIGO", "CEDULA", "NOMBRE", "APELLIDO", "USUARIO", "CONTRASEÑA"};

                    Object[][] data = new Object[result.size()][6];

                    int i = 0;
                    for (Organizador organi1 : result) {
                        data[i][0] = organi1.getCod_organizador();
                        data[i][1] = organi1.getCedula();
                        data[i][2] = organi1.getNombre();
                        data[i][3] = organi1.getApellido();
                        data[i][4] = organi1.getUsuario();
                        data[i][5] = organi1.getContraseña();

                        i++;
                    }

                    DefaultTableModel model = new DefaultTableModel(data, columnNames);
                    tableasignar.setModel(model);
                    limpiarcampos();
                }
            }

        } catch (IllegalStateException e) {
            // Código que se ejecutará si se produce la excepción
            JOptionPane.showMessageDialog(null, "Error al buscar al Organizador");
        }

        base.close();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMouseClicked
        txtpass.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassMouseClicked

    private void txtusuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusuarioMouseClicked
        txtusuario.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioMouseClicked

    private void txtconsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtconsultaMouseClicked
        txtconsulta.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_txtconsultaMouseClicked

    private void txtconsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtconsultaKeyTyped
        char c = evt.getKeyChar();
        // Verificar si es un número y si la longitud actual es menor que 10
        if (!Character.isDigit(c) || txtconsulta.getText().length() >= 10) {
            // Si no es un número o la longitud es mayor o igual a 10, se consume el evento para evitar que se agregue al campo de texto
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_txtconsultaKeyTyped

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
// Obtener el caracter ingresado
        char c = evt.getKeyChar();
        // Verificar si es una letra minúscula y si la longitud actual es menor que 50 y si no es un espacio en blanco
        if ((!Character.isLetter(c) || !Character.isLowerCase(c) && primeraMayusculaIngresada) || txtnombre.getText().length() >= 20 || c == ' ') {
            // Si no es una letra minúscula, o no es la primera letra mayúscula, o la longitud es mayor o igual a 50, o el caracter es un espacio en blanco, se consume el evento para evitar que se agregue al campo de texto
            evt.consume();
        } else if (txtnombre.getText().length() == 0) {
            // Si es el primer caracter del campo de texto, verificar que sea mayúscula
            if (!Character.isUpperCase(c)) {
                // Si no es mayúscula, convertirla a mayúscula
                evt.setKeyChar(Character.toUpperCase(c));
                primeraMayusculaIngresada = true;
            }
        } else {
            // Si no es el primer caracter del campo de texto, verificar que sea minúscula
            String textoActual = txtnombre.getText();
            char ultimoCaracter = textoActual.charAt(textoActual.length() - 1);
            if (Character.isUpperCase(ultimoCaracter)) {
                // Si es mayúscula, convertirla a minúscula
                evt.setKeyChar(Character.toLowerCase(c));
                primeraMayusculaIngresada = true;
            }
        }        // TODO add your ha        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
// Obtener el caracter ingresado
        char c = evt.getKeyChar();
        // Verificar si es una letra minúscula y si la longitud actual es menor que 50 y si no es un espacio en blanco
        if ((!Character.isLetter(c) || !Character.isLowerCase(c) && primeraMayusculaIngresada) || txtapellido.getText().length() >= 20 || c == ' ') {
            // Si no es una letra minúscula, o no es la primera letra mayúscula, o la longitud es mayor o igual a 50, o el caracter es un espacio en blanco, se consume el evento para evitar que se agregue al campo de texto
            evt.consume();
        } else if (txtapellido.getText().length() == 0) {
            // Si es el primer caracter del campo de texto, verificar que sea mayúscula
            if (!Character.isUpperCase(c)) {
                // Si no es mayúscula, convertirla a mayúscula
                evt.setKeyChar(Character.toUpperCase(c));
                primeraMayusculaIngresada = true;
            }
        } else {
            // Si no es el primer caracter del campo de texto, verificar que sea minúscula
            String textoActual = txtapellido.getText();
            char ultimoCaracter = textoActual.charAt(textoActual.length() - 1);
            if (Character.isUpperCase(ultimoCaracter)) {
                // Si es mayúscula, convertirla a minúscula
                evt.setKeyChar(Character.toLowerCase(c));
                primeraMayusculaIngresada = true;
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtpassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarcampos2();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ObjectContainer base = Db4o.openFile(Inicio.direccion);

        cargarTabla(base);

        base.close();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    public void inhabiltarDatos() {

        txtapellido.setEnabled(false);
        txtnombre.setEnabled(false);
        txtusuario.setEnabled(false);
        txtpass.setEnabled(false);
    }

    public void inhabiltarDatos2() {

        txtapellido.setEnabled(false);
        txtnombre.setEnabled(false);
        txtconsulta.setEnabled(false);
    }

    public void limpiarcampos() {

        txtpass.setText("");
        txtapellido.setText("");
        txtnombre.setText("");
        txtusuario.setText("");
        txtconsulta.setText("");
    }

    public void limpiarcampos2() {

        txtapellido.setEnabled(true);
        txtnombre.setEnabled(true);
        txtusuario.setEnabled(true);
        txtpass.setEnabled(true);
        txtconsulta.setEnabled(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblcod;
    private javax.swing.JTable tableasignar;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtconsulta;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
private void cargarTabla(ObjectContainer base) {
        DefaultTableModel model = (DefaultTableModel) tableasignar.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar los datos

        ObjectSet<Organizador> result = base.queryByExample(Organizador.class);

        while (result.hasNext()) {
            Organizador organizador = result.next();

            Object[] row = {
                organizador.getCod_organizador(),
                organizador.getCedula(),
                organizador.getNombre(),
                organizador.getApellido(),
                organizador.getUsuario(),
                organizador.getContraseña(),};
            model.addRow(row);
        }
    }

}
