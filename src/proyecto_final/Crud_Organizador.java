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
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Crud_Organizador extends javax.swing.JPanel {

    /**
     * Creates new form Crud_Organizador
     */
    public Crud_Organizador() {
        initComponents();
        btncrear.setEnabled(false);

        agrupar();

        // spnedad.setModel(new SpinnerNumberModel(0, 0, 60, 1));
    }

    public void agrupar() {

        ButtonGroup botones = new ButtonGroup();
        botones.add(rbnmasculino);
        botones.add(rbnfemenino);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtpresupuesto = new javax.swing.JTextField();
        btncrear = new javax.swing.JButton();
        rbnmasculino = new javax.swing.JRadioButton();
        rbnfemenino = new javax.swing.JRadioButton();
        lblgenero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblcorreo = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        lblapellido = new javax.swing.JLabel();
        lbltelefono = new javax.swing.JLabel();
        lblcelular = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblpresupuesto = new javax.swing.JLabel();
        lblfecha = new javax.swing.JLabel();
        lbldireccion = new javax.swing.JLabel();
        lblcedula = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gestion-del-tiempo.png"))); // NOI18N
        jLabel1.setText("ORGANIZADORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel2.setText("CEDULA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel3.setText("NOMBRE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreKeyReleased(evt);
            }
        });
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 204, 160, -1));

        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtapellidoKeyReleased(evt);
            }
        });
        jPanel1.add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 252, 160, -1));

        jLabel4.setText("APELLDO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

        jLabel5.setText("CELULAR:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcelularKeyReleased(evt);
            }
        });
        jPanel1.add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 301, 160, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lOGO1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        jLabel7.setText("DIRECCION:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, 20));

        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdireccionKeyReleased(evt);
            }
        });
        jPanel1.add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 400, 160, -1));

        jLabel9.setText("GENERO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, -1, -1));

        jLabel11.setText("TELEFONO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, -1, -1));

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txttelefonoKeyReleased(evt);
            }
        });
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 353, 160, -1));
        jPanel1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 180, -1));

        txtpresupuesto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpresupuestoKeyReleased(evt);
            }
        });
        jPanel1.add(txtpresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, 180, -1));

        btncrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disco-flexible.png"))); // NOI18N
        btncrear.setText("CREAR");
        btncrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncrearActionPerformed(evt);
            }
        });
        jPanel1.add(btncrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, -1, -1));

        rbnmasculino.setText("Masculino");
        rbnmasculino.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbnmasculinoStateChanged(evt);
            }
        });
        jPanel1.add(rbnmasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, -1, -1));

        rbnfemenino.setText("Femenino");
        rbnfemenino.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbnfemeninoStateChanged(evt);
            }
        });
        jPanel1.add(rbnfemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, -1, -1));

        lblgenero.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblgenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 160, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblcorreo.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 230, 150, 20));

        lblnombre.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 150, 20));

        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcedulaKeyReleased(evt);
            }
        });
        jPanel2.add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 160, -1));

        lblapellido.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 150, 20));

        lbltelefono.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lbltelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 150, 20));

        lblcelular.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 150, 20));

        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, 170, 20));

        txtcorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcorreoKeyReleased(evt);
            }
        });
        jPanel2.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 180, -1));

        jDateChooser1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooser1PropertyChange(evt);
            }
        });
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 180, -1));

        jLabel15.setText("FECHA DE NACIMIENTO:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, 20));

        jLabel16.setText("PRESUPUESTO:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, 20));

        jLabel10.setText("CORREO:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, 30));

        jLabel12.setText("CODIGO ORGANIZADOR:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, 30));

        lblpresupuesto.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblpresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 180, 20));

        lblfecha.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 180, 20));

        lbldireccion.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lbldireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 150, 20));

        lblcedula.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2.add(lblcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 150, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 880, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btncrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncrearActionPerformed
        // TODO add your handling code here:

        ObjectContainer base = Db4o.openFile(Inicio.direccion);

        crearOrganizador(base);
        base.close();

    }//GEN-LAST:event_btncrearActionPerformed

    private void txtcedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyReleased
        Validar();
    }//GEN-LAST:event_txtcedulaKeyReleased

    private void txtnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyReleased
        Validar();
    }//GEN-LAST:event_txtnombreKeyReleased

    private void txtapellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyReleased
        Validar();

    }//GEN-LAST:event_txtapellidoKeyReleased

    private void txtcelularKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyReleased
        Validar();

    }//GEN-LAST:event_txtcelularKeyReleased

    private void txttelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyReleased
        // TODO add your  code here:
        Validar();

    }//GEN-LAST:event_txttelefonoKeyReleased

    private void txtdireccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyReleased
        // TODO add your handling code here:
        Validar();

    }//GEN-LAST:event_txtdireccionKeyReleased

    private void txtcorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcorreoKeyReleased
        // TODO add your handling code here:
        Validar();

    }//GEN-LAST:event_txtcorreoKeyReleased

    private void txtpresupuestoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpresupuestoKeyReleased
        // TODO add your handling code here:
        Validar();

    }//GEN-LAST:event_txtpresupuestoKeyReleased

    private void rbnmasculinoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbnmasculinoStateChanged
        // TODO add your handling code here:
        Validar();

    }//GEN-LAST:event_rbnmasculinoStateChanged

    private void rbnfemeninoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbnfemeninoStateChanged
        // TODO add your handling code here:
        Validar();

    }//GEN-LAST:event_rbnfemeninoStateChanged

    private void jDateChooser1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooser1PropertyChange
        // TODO add your handling code here:
        Validar();

    }//GEN-LAST:event_jDateChooser1PropertyChange

    public static boolean esNumeroDecimal(String valor) {
        try {
            Double.parseDouble(valor);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void crearOrganizador(ObjectContainer base) {

        try {

            double presupuesto = 0.0;
            String valorIngresado = txtpresupuesto.getText().trim();

            if (esNumeroDecimal(valorIngresado)) {
                presupuesto = Double.valueOf(valorIngresado);
            } else {
                System.out.println("Error: El valor ingresado no es un número decimal.");
            }
            String seleccion = " ";

            Date fecha = jDateChooser1.getDate();

            if (fecha != null) {
                seleccion = new SimpleDateFormat("dd/MM/yyyy").format(fecha);
            } else {
                System.out.println("Fecha no seleccionada");
            }

            String sexo = " ";
            if (rbnfemenino.isSelected()) {
                sexo = "Femenino";

            } else if (rbnmasculino.isSelected()) {
                sexo = "Masculino";
            }

            ObjectSet<Organizador> resul = base.queryByExample(new Organizador(null, null, null, 0.0, txtcedula.getText().trim(), null, null, null, null, null, null, null, null));

            if (!resul.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ya existe un organizador con la cédula ingresada.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Validar();

            Organizador miorganizador = new Organizador(txtcodigo.getText().trim(), null, null, presupuesto, txtcedula.getText().trim(), txtnombre.getText().trim(), txtapellido.getText().trim(), txttelefono.getText().trim(), txtcorreo.getText().trim(), txtdireccion.getText().trim(), txtcelular.getText().trim(), seleccion, sexo);

            base.store(miorganizador);

            JOptionPane.showMessageDialog(null, " Se guardo los datos de forma correcta");

            // spnedad.setValue(0);
            txtcorreo.setText("");
            jDateChooser1.setDate(null);
            txtcedula.setText("");
            txtnombre.setText("");
            txtapellido.setText("");
            txtcelular.setText("");
            txttelefono.setText("");
            txtdireccion.setText("");
            txtpresupuesto.setText("");
            rbnfemenino.setSelected(false);
            rbnmasculino.setSelected(false);

        } finally {
            base.close();
        }

    }

    public void Validar() {

        if (txtcedula.getText().trim().isEmpty()) {
            lblcedula.setText("Campo obligatorio");
        } else {
            lblcedula.setText("");
        }

        if (txtcorreo.getText().trim().isEmpty()) {

            lblcorreo.setText("Campo obligatorio");
        } else {
            lblcorreo.setText(" ");
        }
        if (txtnombre.getText().trim().isEmpty()) {
            lblnombre.setText("Campo obligatorio");
        } else {
            lblnombre.setText("");
        }
        if (txtapellido.getText().trim().isEmpty()) {
            lblapellido.setText("Campo obligatorio");
        } else {
            lblapellido.setText(" ");
        }
        if (txtcelular.getText().trim().isEmpty()) {
            lblcelular.setText("Campo obligatorio");

        } else {
            lblcelular.setText("");

        }
        if (txttelefono.getText().trim().isEmpty()) {
            lbltelefono.setText("Campo obligatorio");

        } else {
            lbltelefono.setText("");

        }
        if (txtdireccion.getText().trim().isEmpty()) {
            lbldireccion.setText("Campo obligatorio");

        } else {
            lbldireccion.setText("");
        }
        if (txtpresupuesto.getText().trim().isEmpty()) {
            lblpresupuesto.setText("Campo obligatorio");

        } else {
            lblpresupuesto.setText("");
        }
        if (jDateChooser1.getDate() == null) {
            lblfecha.setText("Campo requerido");

        } else {
            lblfecha.setText(" ");
        }

        if (rbnfemenino.isSelected()) {
            lblgenero.setText(" ");
        } else if (rbnmasculino.isSelected()) {
            lblgenero.setText(" ");

        } else if (!rbnfemenino.isSelected() || !rbnmasculino.isSelected()) {
            lblgenero.setText("Campo requerido");
        }

        if (jDateChooser1.getDate() == null || txtpresupuesto.getText().trim().isEmpty() || txtdireccion.getText().trim().isEmpty() || txttelefono.getText().trim().isEmpty() || txtcelular.getText().trim().isEmpty()
                || (!rbnfemenino.isSelected() && !rbnmasculino.isSelected()) || txtapellido.getText().trim().isEmpty() || txtnombre.getText().trim().isEmpty() || txtcedula.getText().trim().isEmpty() || txtcorreo.getText().trim().isEmpty()) {
            btncrear.setEnabled(false);

        } else {
            btncrear.setEnabled(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncrear;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblcedula;
    private javax.swing.JLabel lblcelular;
    private javax.swing.JLabel lblcorreo;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lblgenero;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblpresupuesto;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JRadioButton rbnfemenino;
    private javax.swing.JRadioButton rbnmasculino;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpresupuesto;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
