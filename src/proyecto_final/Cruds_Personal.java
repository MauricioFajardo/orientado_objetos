/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import Clases.Personal;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Query;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author eliza
 */
public class Cruds_Personal extends javax.swing.JPanel {
    
     String sexo;

    /**
     * Creates new form Cruds_Personal
     */
    public Cruds_Personal() {
        initComponents();
    }
    
    public void Agrupar() {
        ButtonGroup botones = new ButtonGroup();
        botones.add(rbfemeninoPro);
        botones.add(rbmasculinoPro);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fechanac = new com.toedter.calendar.JDateChooser();
        txtemail = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        CedulaPersonal = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        rbmasculinoPro = new javax.swing.JRadioButton();
        rbfemeninoPro = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtcodigopersonal = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxevento = new javax.swing.JComboBox<>();
        jComboBoxdepartamento = new javax.swing.JComboBox<>();
        txttipopersonal = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/humano.png"))); // NOI18N
        jLabel1.setText("PERSONAL");

        jLabel2.setText("Cédula: ");

        jLabel3.setText("Nombre: ");

        jLabel5.setText("Apellido:");

        jLabel6.setText("Teléfono: ");

        jLabel7.setText("Email: ");

        jLabel8.setText("Fecha de Nacimiento: ");

        jLabel9.setText("Dirección: ");

        jLabel11.setText("Género: ");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        rbmasculinoPro.setText("Masculino");

        rbfemeninoPro.setText("Femenino");

        jLabel12.setText("Código Personal:");

        jLabel13.setText("Tipo de Personal: ");

        jLabel14.setText("Id Departamento: ");

        jLabel15.setText("Celular:");

        txtcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelularActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cédula", "Nombre", "Apellido", "Teléfono", "Email", "Dirección", "Género", "Código Personal", "Tipo de Personal", "Departamento", "Contacto Adicional", "Fecha Nacimiento"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/disco-flexible.png"))); // NOI18N
        jButton1.setText("GUARDAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar (1).png"))); // NOI18N
        jButton2.setText("MODIFICAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-eliminar (1).png"))); // NOI18N
        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/curriculum.png"))); // NOI18N
        jButton4.setText("REPORTE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/busqueda (1)_1.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Código Evento: ");

        jComboBoxevento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxdepartamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton6.setText("Ver");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Ver");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbmasculinoPro)
                                        .addGap(33, 33, 33)
                                        .addComponent(rbfemeninoPro))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(txttelefono)
                                            .addComponent(txtapellido)
                                            .addComponent(txtnombre)
                                            .addComponent(CedulaPersonal)
                                            .addComponent(txtdireccion))
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5)
                                        .addGap(31, 31, 31)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel14)
                                                    .addComponent(jLabel15)
                                                    .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(fechanac, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                                    .addComponent(txtcodigopersonal)
                                                    .addComponent(txtcelular)
                                                    .addComponent(jComboBoxevento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jComboBoxdepartamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txttipopersonal))
                                                .addGap(43, 43, 43)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton7)
                                                    .addComponent(jButton6))))))))
                        .addGap(0, 73, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addGap(30, 30, 30)
                .addComponent(jButton3)
                .addGap(33, 33, 33)
                .addComponent(jButton4)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CedulaPersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtcodigopersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txttipopersonal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBoxdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxevento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(rbmasculinoPro)
                    .addComponent(rbfemeninoPro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
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

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdireccionActionPerformed

    private void txtcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelularActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ObjectContainer base = Db4o.openFile(Inicio.direccion);

       // ActualizarDatos(base);
        base.close();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         ObjectContainer base = Db4o.openFile(Inicio.direccion);

        String nombre = " ", apellido = " ", telefono = " ", email = " ", direccion = " ", genero = " ", codigopersoal = " ";
        String tipopersonal = " ", departamento = " ", contacto = " ", codigoevento = " ";
        Date fechanacimiento = null;

        int ed = 0;
        Query query = base.query();
        query.constrain(Personal.class);
        query.descend("cedula").constrain(CedulaPersonal.getText().trim());
        ObjectSet<Personal> result = query.execute();

        String[] columnNames = {"CODIGO DE LA CASA", "CODIGO DEL PROPIETARIO", "DESCRIPCION", "PROVINCIA", "CIUDAD", "BARRIO", "CALLE PRINCIPAL", "CAPACIDAD", "HABITACIONES", "NUMERO DE PISOS", "BAÑOS", "TIPO DE CASA", "DISPONIBILIDAD"};

        Object[][] data = new Object[result.size()][13];

        int i = 0;
        for (Personal personal1 : result) {
            data[i][0] = personal1.getCedula();
            data[i][1] = personal1.getNombre();
            data[i][2] = personal1.getApellido();
            data[i][3] = personal1.getTelefono();
            data[i][4] = personal1.getCorreo();
            data[i][5] = personal1.getDireccion();
            data[i][6] = personal1.getGenero();
            data[i][7] = personal1.getCodigo_perso();
            data[i][8] = personal1.getTipo_personal();
            data[i][9] = personal1.getDepartamento_p();
            data[i][10] = personal1.getCelular();
            data[i][11] = personal1.getFecchaNaci();
            data[i][12] = personal1.getCod_evento();

            i++;
        }

        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        jTable1.setModel(model);

        jTable1.repaint();

        if (!result.isEmpty()) {
            //habiltarDatos();
            for (Personal personal11 : result) {
                nombre = personal11.getNombre();
                apellido = personal11.getApellido();
                telefono = personal11.getTelefono();
                email = personal11.getCorreo();
                direccion = personal11.getDireccion();
                genero = personal11.getGenero();
                codigopersoal = personal11.getCodigo_perso();
                tipopersonal = personal11.getTipo_personal();
                departamento = personal11.getDepartamento_p();

                contacto = personal11.getCelular();

                codigoevento = personal11.getCod_evento();

                fechanacimiento = personal11.getFecchaNaci();

            }

            txtnombre.setText(nombre.trim());
            txtapellido.setText(apellido.trim());
            txttelefono.setText(telefono.trim());
            txtemail.setText(email.trim());
            txtdireccion.setText(direccion.trim());
            txtcodigopersonal.setText(codigopersoal.trim());
            txttipopersonal.setText(tipopersonal.trim());
            jComboBoxdepartamento.setSelectedItem(departamento.trim());
            txtcelular.setText(contacto.trim());
            fechanac.setDate(fechanacimiento);
            jComboBoxevento.setSelectedItem(codigoevento.trim());

            //txtcodigoPropi.setText(cod.trim());
        } else {

            JOptionPane.showMessageDialog(null, "No se encontró ningúna Casa Vacional con la cedula ingresada");

        }

        base.close();
        
        
        
        
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String codigoEliminar = JOptionPane.showInputDialog("Ingrese el código de la casa a eliminar");
        boolean encontrado = false;

        ObjectContainer base = Db4o.openFile(Inicio.direccion);

        Query query = base.query();
        query.constrain(Personal.class);
        query.descend("cedula").constrain(codigoEliminar);

        ObjectSet<Personal> result = query.execute();
        cargarTabla(base);

        if (result.size() > 0) {
            encontrado = true;

            int resul = JOptionPane.showConfirmDialog(null, "Deseas eliminar los datos de la Casa Vacacional", "Confirmacion", JOptionPane.YES_NO_OPTION);

            if (resul == JOptionPane.YES_OPTION) {
                for (Personal vacacionalDB : result) {
                    // Eliminar la Casa Vacacional de la base de datos db4o
                    base.delete(vacacionalDB);
                    JOptionPane.showMessageDialog(null, "Se están borrando los datos de la Casa Vacacional");
                    cargarTabla(base);
                }
            } else if (resul == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Datos de la Casa Vacacional no eliminados");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el código");
            cargarTabla(base);
        }

        base.close();

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ObjectContainer base = Db4o.openFile(Inicio.direccion);

        crearCasa(base);
        base.close();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        ObjectContainer base = Db4o.openFile(Inicio.direccion);

        cargarTabla(base);

        base.close();      

        
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed
 
    public void crearCasa(ObjectContainer Base) {
        // Verificar si todos los campos están llenos
        if (CedulaPersonal.getText().trim().isEmpty() || txtnombre.getText().trim().isEmpty()
                || jComboBoxdepartamento.getSelectedItem() == null || txtapellido.getText().trim().isEmpty() || txttelefono.getText().trim().isEmpty()) {

            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos antes de ingresar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            
            if (rbmasculinoPro.isSelected()) {

                sexo = "Masculino";

            } else if (rbfemeninoPro.isSelected()) {
                sexo = "Femenino";
            }
            // Obtener valores de los campos
            

            // Verificar si ya existe una casa con el mismo código
            ObjectSet<Personal> resul = Base.queryByExample(new Personal(null, null, null, null, null, null, null, null, null,CedulaPersonal.getText().trim() , null, null, null, null, null, null, null,null));

            if (!resul.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ya existe una casa con el código ingresado.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            

            // Crear objeto CasaVacacional y almacenar en la base de datos
            Personal casa1 = new Personal(txtcodigopersonal.getText().trim(), txttipopersonal.getText().trim(), jComboBoxdepartamento.getSelectedItem().toString(), null, null, null,null,null , jComboBoxevento.getSelectedItem().toString(),CedulaPersonal.getText().trim(),txtnombre.getText().trim(), txtapellido.getText().trim(), txttelefono.getText().trim(), txtemail.getText().trim(), txtdireccion.getText().trim(), txtcelular.getText().trim(),fechanac.getDate(),sexo);

            Base.store(casa1);

            JOptionPane.showMessageDialog(this, "Casa creada exitosamente");
            limpiar();
            cargarTabla(Base);
        } finally {
            Base.close();
        }
    }

    public void limpiar() {
        CedulaPersonal.setText("");
        txtnombre.setText("");
        txtapellido.setText("");
        txttelefono.setText("");
        txtemail.setText("");
        txtdireccion.setText("");
        txtcodigopersonal.setText("");
        txttipopersonal.setText("");
        txtcelular.setText("");
        //  txtcodigoPropi.setText(" ");
    }

    public void cargarTabla(ObjectContainer base) {

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Limpiar la tabla antes de cargar los datos

        ObjectSet<Personal> result = base.queryByExample(new Personal());

        while (result.hasNext()) {
            Personal personal1 = result.next();

            

            Object[] row = {
                personal1.getCedula(),
                personal1.getNombre(),
                personal1.getApellido(),
                personal1.getTelefono(),
                personal1.getCorreo(),
                personal1.getDireccion(),
                personal1.getGenero(),
                personal1.getCodigo_perso(),
                personal1.getTipo_personal(),
                personal1.getDepartamento_p(),
                personal1.getCelular(),
                personal1.getFecchaNaci(),
                personal1.getCod_evento()

            };
            model.addRow(row);
        }

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CedulaPersonal;
    private javax.swing.ButtonGroup botones;
    private com.toedter.calendar.JDateChooser fechanac;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBoxdepartamento;
    private javax.swing.JComboBox<String> jComboBoxevento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbfemeninoPro;
    private javax.swing.JRadioButton rbmasculinoPro;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtcodigopersonal;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttipopersonal;
    // End of variables declaration//GEN-END:variables
}
