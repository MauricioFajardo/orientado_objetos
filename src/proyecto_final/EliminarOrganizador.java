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
 * @author eliza
 */
public class EliminarOrganizador extends javax.swing.JPanel {

    /**
     * Creates new form EliminarOrganizador
     */
    public EliminarOrganizador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnEliminar = new javax.swing.JButton();
        btnCargarTabla = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cédula", "Nombre", "Apellido", "Celular", "Teléfono", "Dirección", "Género", "Correo", "Usuario", "Contraseña", "Presupuesto", "Fecha de Nacimiento"
            }
        ));
        jScrollPane1.setViewportView(jTableDatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 883, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/despedido.png"))); // NOI18N
        jLabel1.setText("Eliminar Organizador");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/expediente.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCargarTabla.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCargarTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dispositivo.png"))); // NOI18N
        btnCargarTabla.setText("Cargar Tabla");
        btnCargarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarTablaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnCargarTabla)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnCargarTabla))
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
//        // TODO add your handling code here:
//        ObjectContainer base = Db4o.openFile(Inicio.direccion);
//
//        String cedula = txtCedulaOrganizador.getText().trim();
//
//        if (cedula.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "Ingrese la cédula del organizador", "Error", JOptionPane.ERROR_MESSAGE);
//        } else {
//
//            Query query = base.query();
//            query.constrain(Organizador.class);
//            query.descend("cedula").constrain(cedula);
//
//            ObjectSet<Organizador> result = query.execute();
//
//            String[] columnNames = {"Código", "Cédula", "Nombre", "Apellido", "Celular", "Telefono", "Dirección", "Género", "Correo", "Usuario", "Contraseña", "Presupuesto", "Fecha de Nacimiento"};
//
//            Object[][] data = new Object[result.size()][13];
//
//            int i = 0;
//            for (Organizador organizador : result) {
//                data[i][0] = organizador.getCod_organizador();
//                data[i][1] = organizador.getCedula();
//                data[i][2] = organizador.getNombre();
//                data[i][3] = organizador.getApellido();
//                data[i][4] = organizador.getCelular();
//                data[i][5] = organizador.getTelefono();
//                data[i][6] = organizador.getDireccion();
//                data[i][7] = organizador.getGenero();
//                data[i][8] = organizador.getCorreo();
//                data[i][9] = organizador.getUsuario();
//                data[i][10] = organizador.getContraseña();
//                data[i][11] = organizador.getPresupuesto();
//                data[i][12] = organizador.getFecchaNaci();
//
//                i++;
//            }
//
//            DefaultTableModel model = new DefaultTableModel(data, columnNames);
//            jTableDatos.setModel(model);
//
//            base.close();
//        }

        String cedulaEliminar = JOptionPane.showInputDialog("Ingrese la cedula a eliminar");
        boolean encontrado = false;
        ObjectContainer base = Db4o.openFile(Inicio.direccion);

        Query query = base.query();
        query.constrain(Organizador.class);
        query.descend("cedula").constrain(cedulaEliminar);

        ObjectSet<Organizador> result = query.execute();
        cargarTabla(base);
        if (result.size() > 0) {

            encontrado = true;

            int resul = JOptionPane.showConfirmDialog(null, "Deseas eliminar los datos del Cliente", "Confirmacion", JOptionPane.YES_NO_OPTION);

            if (resul == JOptionPane.YES_OPTION) {
                for (Organizador ClienteDB : result) {
                    // Eliminar el Cliente de la base de datos db4o
                    base.delete(ClienteDB);
                    JOptionPane.showMessageDialog(null, "Se están borrando los datos del Cliente");
                    cargarTabla(base);
                }
            } else if (resul == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Datos del Cliente no eliminados");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró la cédula");
            cargarTabla(base);
        }

        base.close();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCargarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarTablaActionPerformed
        // TODO add your handling code here:
        ObjectContainer base = Db4o.openFile(Inicio.direccion);

        cargarTabla(base);

        base.close();
    }//GEN-LAST:event_btnCargarTablaActionPerformed

    public void vaciarTabla() {
        // Obtenemos el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jTableDatos.getModel();

        // Borramos las filas antiguas del modelo de tabla
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarTabla;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
private void cargarTabla(ObjectContainer base) {
        DefaultTableModel model = (DefaultTableModel) jTableDatos.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar los datos

        ObjectSet<Organizador> result = base.queryByExample(Organizador.class);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        while (result.hasNext()) {
            Organizador organizador = result.next();

            Object[] row = {
                organizador.getCod_organizador(),
                organizador.getCedula(),
                organizador.getNombre(),
                organizador.getApellido(),
                organizador.getCelular(),
                organizador.getTelefono(),
                organizador.getDireccion(),
                organizador.getGenero(),
                organizador.getCorreo(),
                organizador.getUsuario(),
                organizador.getContraseña(),
                organizador.getPresupuesto(),
                organizador.getFecchaNaci(),// Verificar si la fecha no es null antes de formatearla
            };
            model.addRow(row);
        }
    }
}
