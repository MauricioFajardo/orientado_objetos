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
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eliza
 */
public class ReporteOrganizador extends javax.swing.JPanel {

    public static ArrayList<Organizador> listaagentes = new ArrayList<>();

    public static ArrayList<Organizador> codigoseliminados = new ArrayList<>();

    /**
     * Creates new form ReporteOrganizador
     */
    public ReporteOrganizador() {
        initComponents();
        actualizarDatos();
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
        btnActualizatDatos = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código ", "Cédula", "Nombre", "Apellido", "Celular", "Teléfono", "Dirección", "Género", "Correo", "Presupuesto", "Fecha de nacimento"
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consulta.png"))); // NOI18N
        jLabel1.setText("Reporte Organizadores");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnActualizatDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lista-de-verificacion.png"))); // NOI18N
        btnActualizatDatos.setText("Actualizar Reporte ");
        btnActualizatDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizatDatosActionPerformed(evt);
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
                            .addComponent(btnActualizatDatos))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizatDatos)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void btnActualizatDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizatDatosActionPerformed
        // TODO add your handling code here:

        actualizarDatos();
        /* ObjectContainer base = Db4o.openFile(Inicio.direccion);

        ObjectSet<Organizador> result = base.queryByExample(new Organizador());
        String[] columnNames = {"Código", "Cédula", "Nombre", "Apellido", "Celular", "Telefono", "Dirección", "Género", "Correo", "Presupuesto", "Fecha de Nacimiento"};

        Object[][] data = new Object[result.size()][11];

        int i = 0;
        for (Organizador organizador : result) {
            data[i][0] = organizador.getCod_organizador();
            data[i][1] = organizador.getCedula();
            data[i][2] = organizador.getNombre();
            data[i][3] = organizador.getApellido();
            data[i][4] = organizador.getCelular();
            data[i][5] = organizador.getTelefono();
            data[i][6] = organizador.getDireccion();
            data[i][7] = organizador.getGenero();
            data[i][8] = organizador.getCorreo();
            data[i][9] = organizador.getPresupuesto();
            data[i][10] = organizador.getFecchaNaci();

            i++;
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        jTableDatos.setModel(model);
        base.close();*/
    }//GEN-LAST:event_btnActualizatDatosActionPerformed

    public void actualizarDatos() {
        ObjectContainer base = Db4o.openFile(Inicio.direccion);

        AsignarRegistrosArray(base);

        // Limpia los datos de la tabla y actualiza los datos en la tabla con los nuevos registros del ArrayList
        jTableDatos.setModel(new DefaultTableModel());

        String[] columnNames = {"Código", "Cédula", "Nombre", "Apellido", "Celular", "Telefono", "Dirección", "Género", "Correo", " Usuario", "Contraseña", "Presupuesto", "Fecha de Nacimiento"};

        Object[][] data = new Object[listaagentes.size()][13];

        for (int i = 0; i < listaagentes.size(); i++) {
            data[i][0] = listaagentes.get(i).getCod_organizador();
            data[i][1] = listaagentes.get(i).getCedula();
            data[i][2] = listaagentes.get(i).getNombre();
            data[i][3] = listaagentes.get(i).getApellido();
            data[i][4] = listaagentes.get(i).getCelular();
            data[i][5] = listaagentes.get(i).getTelefono();
            data[i][6] = listaagentes.get(i).getDireccion();
            data[i][7] = listaagentes.get(i).getGenero();
            data[i][8] = listaagentes.get(i).getCorreo();
            data[i][9] = listaagentes.get(i).getUsuario();

            data[i][10] = listaagentes.get(i).getContraseña();

            data[i][11] = listaagentes.get(i).getPresupuesto();
            data[i][12] = listaagentes.get(i).getFecchaNaci();
        }

        this.validate();
        jTableDatos.repaint();

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        jTableDatos.setModel(model);

        base.close();
    }

    public void AsignarRegistrosArray(ObjectContainer base) {

        Query query = base.query();
        query.constrain(Organizador.class);
        ObjectSet<Organizador> agentes = query.execute();

        // Elimina todos los elementos del ArrayList existente
        listaagentes.clear();

        // Agrega los nuevos registros al ArrayList
        for (Organizador agente : agentes) {
            listaagentes.add(agente);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizatDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}
