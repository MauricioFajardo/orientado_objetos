/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import Clases.Puesto;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eliza
 */
public class Crud_Puestos extends javax.swing.JPanel {

    public static ArrayList<Puesto> listapuesto = new ArrayList<>();

    public static ArrayList<Puesto> codigoseliminados = new ArrayList<>();

    public Crud_Puestos() {
        initComponents();
    }

    public void crearPuestos(ObjectContainer Base) {
        // Verificar si todos los campos están llenos
        if (txtnombrepuesto.getText().trim().isEmpty() || txttipopuesto.getText().trim().isEmpty() || txtdescripcion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos antes de ingresar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            // Obtener el último código de puesto en la base de datos
            ObjectSet<Puesto> resul = Base.queryByExample(new Puesto(null, null, null, null));
            int ultimoCodigo = resul.size() + 1;

            // Formatear el código con ceros a la izquierda
            String cod = String.format("%03d", ultimoCodigo);
            lblcod.setText(cod);

            // Verificar si ya existe un Puesto con el mismo código
            resul = Base.queryByExample(new Puesto(cod, null, null, null));

            if (!resul.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ya existe un Puesto con el código ingresado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear objeto Puesto y almacenar en la base de datos
            Puesto puesto1 = new Puesto(cod, txtnombrepuesto.getText().trim(), txttipopuesto.getText().trim(), txtdescripcion.getText().trim());

            Base.store(puesto1);

            JOptionPane.showMessageDialog(this, "Puesto Creado exitosamente");
        } finally {
            Base.close();
        }

        // Limpiar los campos después de almacenar
        txtnombrepuesto.setText("");
        txttipopuesto.setText("");
        txtdescripcion.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtnombrepuesto = new javax.swing.JTextField();
        txttipopuesto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablapuesto = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblcod = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cabina.png"))); // NOI18N
        jLabel1.setText("PUESTO");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Código Puesto:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Nombre de Puesto:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Tipo de Puesto: ");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Descripción:");

        txtnombrepuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrepuestoActionPerformed(evt);
            }
        });

        txttipopuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipopuestoActionPerformed(evt);
            }
        });

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

        tablapuesto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "TIPO DE PUESTO", "DESCRIPCION"
            }
        ));
        jScrollPane2.setViewportView(tablapuesto);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-flexible.png"))); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar (1).png"))); // NOI18N
        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-eliminar (1).png"))); // NOI18N
        jButton3.setText("ELIMINAR");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/curriculum.png"))); // NOI18N
        jButton4.setText("REPORTE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lOGO1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(43, 43, 43)
                                        .addComponent(jButton2)
                                        .addGap(52, 52, 52)
                                        .addComponent(jButton3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(57, 57, 57)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtnombrepuesto)
                                                .addComponent(txttipopuesto, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblcod, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(29, 29, 29)
                                .addComponent(jButton4)))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lblcod, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnombrepuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttipopuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
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

    private void txtnombrepuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrepuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrepuestoActionPerformed

    private void txttipopuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipopuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipopuestoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ObjectContainer base = Db4o.openFile(Inicio.direccion);

        crearPuestos(base);
        base.close();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        ObjectContainer base = Db4o.openFile(Inicio.direccion);

        cargarTabla(base);

        base.close();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    // Función para realizar la modificación
    public void cargarTabla(ObjectContainer base) {
        DefaultTableModel model = (DefaultTableModel) tablapuesto.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar los datos

        ObjectSet<Puesto> result = base.queryByExample(new Puesto());

        while (result.hasNext()) {
            Puesto puesto = result.next();
            Object[] row = {
                puesto.getCodigo_puesto(),
                puesto.getNombrePuesto(),
                puesto.getTipo_puesto(),
                puesto.getDescripcionPuesto()

            };
            model.addRow(row);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblcod;
    private javax.swing.JTable tablapuesto;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtnombrepuesto;
    private javax.swing.JTextField txttipopuesto;
    // End of variables declaration//GEN-END:variables

}
