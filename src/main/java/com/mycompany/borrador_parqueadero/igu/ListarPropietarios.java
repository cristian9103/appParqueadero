package com.mycompany.borrador_parqueadero.igu;

import com.mycompany.borrador_parqueadero.logica.Controladora;
import com.mycompany.borrador_parqueadero.logica.Mensualidad;
import com.mycompany.borrador_parqueadero.logica.Propietario;
import com.mycompany.borrador_parqueadero.logica.Usuario;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListarPropietarios extends javax.swing.JFrame {

    Mensualidad mensu = null;
    List<Propietario> traerPropietario;
    Controladora control;
    Usuario usr;

    public ListarPropietarios(Usuario usr, Controladora control) {
        this.usr = usr;
        this.control = control;
        initComponents();
        boxAutomovil.setSelected(true);
        boxMotocicleta.setSelected(true);
        rdbPagado.setSelected(true);
        rdbSinPagar.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnIngresarVehiculo = new javax.swing.JButton();
        btnRetirarVehiculo = new javax.swing.JButton();
        btnIngresarPropietario = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnListarVehiculo1 = new javax.swing.JButton();
        btnCierreTotal = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelModuloIngreso = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        rdbPagado = new javax.swing.JRadioButton();
        rdbSinPagar = new javax.swing.JRadioButton();
        btnCierre = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        boxAutomovil = new javax.swing.JCheckBox();
        boxMotocicleta = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPropietarios = new javax.swing.JTable();
        btnPagarMensu = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        lbPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIngresarVehiculo.setText("Ingresar Vehículo");
        btnIngresarVehiculo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarVehiculo.setFocusPainted(false);
        btnIngresarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarVehiculoActionPerformed(evt);
            }
        });

        btnRetirarVehiculo.setText("Retirar Vehículo");
        btnRetirarVehiculo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRetirarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetirarVehiculo.setFocusPainted(false);
        btnRetirarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarVehiculoActionPerformed(evt);
            }
        });

        btnIngresarPropietario.setText("Ingresar Mensualidad");
        btnIngresarPropietario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresarPropietario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarPropietario.setFocusPainted(false);
        btnIngresarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPropietarioActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnListarVehiculo1.setText("Listar Vehiculos");
        btnListarVehiculo1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListarVehiculo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarVehiculo1.setFocusPainted(false);
        btnListarVehiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVehiculo1ActionPerformed(evt);
            }
        });

        btnCierreTotal.setText("Cierre Total");
        btnCierreTotal.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCierreTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCierreTotal.setFocusPainted(false);
        btnCierreTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierreTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCierreTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetirarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarVehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(btnIngresarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarVehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRetirarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCierreTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Parqueadero");

        panelModuloIngreso.setBackground(new java.awt.Color(153, 153, 153));
        panelModuloIngreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Buscar Mensualidades");

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo de Vehículo");

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Placa");

        txtPlaca.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtPlaca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPlaca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });

        rdbPagado.setBackground(new java.awt.Color(153, 153, 153));
        rdbPagado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rdbPagado.setForeground(new java.awt.Color(0, 0, 0));
        rdbPagado.setText("Pagado");
        rdbPagado.setFocusPainted(false);
        rdbPagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbPagadoActionPerformed(evt);
            }
        });

        rdbSinPagar.setBackground(new java.awt.Color(153, 153, 153));
        rdbSinPagar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rdbSinPagar.setForeground(new java.awt.Color(0, 0, 0));
        rdbSinPagar.setText("Sin Pagar");
        rdbSinPagar.setFocusPainted(false);
        rdbSinPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSinPagarActionPerformed(evt);
            }
        });

        btnCierre.setText("Cierre");
        btnCierre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCierre.setFocusPainted(false);
        btnCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierreActionPerformed(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText(" Propietario");

        boxAutomovil.setBackground(new java.awt.Color(153, 153, 153));
        boxAutomovil.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        boxAutomovil.setForeground(new java.awt.Color(0, 0, 0));
        boxAutomovil.setText("Automovil");
        boxAutomovil.setFocusPainted(false);

        boxMotocicleta.setBackground(new java.awt.Color(153, 153, 153));
        boxMotocicleta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        boxMotocicleta.setForeground(new java.awt.Color(0, 0, 0));
        boxMotocicleta.setText("Motocicleta");
        boxMotocicleta.setFocusPainted(false);
        boxMotocicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxMotocicletaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 25)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Estado");

        tablaPropietarios.setBackground(new java.awt.Color(204, 204, 204));
        tablaPropietarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaPropietarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaPropietarios);

        btnPagarMensu.setText("Pagar Mensualidad");
        btnPagarMensu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagarMensu.setFocusPainted(false);
        btnPagarMensu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarMensuActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar.setFocusPainted(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelModuloIngresoLayout = new javax.swing.GroupLayout(panelModuloIngreso);
        panelModuloIngreso.setLayout(panelModuloIngresoLayout);
        panelModuloIngresoLayout.setHorizontalGroup(
            panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel4))
                            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(boxMotocicleta))
                            .addComponent(boxAutomovil))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                                .addComponent(rdbPagado)
                                .addGap(18, 18, 18)
                                .addComponent(rdbSinPagar)
                                .addGap(91, 91, 91))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(164, 164, 164))))
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel5)
                                .addGap(46, 46, 46))
                            .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel7)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                        .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPagarMensu, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))))
        );
        panelModuloIngresoLayout.setVerticalGroup(
            panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boxAutomovil)
                            .addComponent(boxMotocicleta)))
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdbPagado)
                            .addComponent(rdbSinPagar))
                        .addGap(2, 2, 2)))
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPagarMensu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left_return_arrow_icon_193335.png"))); // NOI18N
        lbPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPrincipalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbPrincipal)
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelModuloIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPrincipal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(266, 266, 266))
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(panelModuloIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed

    }//GEN-LAST:event_txtPlacaActionPerformed

    private void rdbPagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbPagadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbPagadoActionPerformed

    private void rdbSinPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSinPagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbSinPagarActionPerformed

    private void btnCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierreActionPerformed
        ReporteMensualidades reporte = new ReporteMensualidades(usr, control);
        reporte.setVisible(true);
        reporte.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCierreActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void boxMotocicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMotocicletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxMotocicletaActionPerformed

    private void btnPagarMensuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarMensuActionPerformed

        LocalDate fechaInicio = LocalDate.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fecha = fechaInicio.format(formateador);
        LocalDate fechaFinal = fechaInicio.plusMonths(1);
        String fechaFinalStr = fechaFinal.format(formateador);
        String estado = "PAGADO";

        if (tablaPropietarios.getSelectedRow() != -1) {
            if (tablaPropietarios.getRowCount() > 0) {
                String placa = String.valueOf(tablaPropietarios.getValueAt(tablaPropietarios.getSelectedRow(), 0));
                double valorMensual = Double.parseDouble(String.valueOf(tablaPropietarios.getValueAt(tablaPropietarios.getSelectedRow(), 7)));
                if (String.valueOf(tablaPropietarios.getValueAt(tablaPropietarios.getSelectedRow(), 8)).equals("FINALIZADO")) {
                    control.pagarMensualidad(fecha, fechaFinalStr, estado, valorMensual, placa);
                    mostrarMensaje("Pago exitoso", "Info", "Mensualidad actualizada");
                    CargarTablaAutomatico();
                    txtPlaca.requestFocusInWindow();
                } else {
                    mostrarMensaje("La mensualidad  no ha vencido", "Info", "Mensualidad al día");
                    txtPlaca.requestFocusInWindow();
                }
            } else {
                mostrarMensaje("Sin registros, por favor verificar los datos", "Error", "Sin registros");
                txtPlaca.requestFocusInWindow();
            }
        } else {
            mostrarMensaje("Por favor seleccione un registro", "Error", "Acción inconclusa");
            txtPlaca.requestFocusInWindow();
        }
    }//GEN-LAST:event_btnPagarMensuActionPerformed

    private void btnIngresarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarVehiculoActionPerformed
        IngresoVehiculos alta = new IngresoVehiculos(usr, control);
        alta.setVisible(true);
        alta.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnIngresarVehiculoActionPerformed

    private void btnRetirarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarVehiculoActionPerformed
        salidaVehiculos salida = new salidaVehiculos(usr, control);
        salida.setVisible(true);
        salida.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRetirarVehiculoActionPerformed

    private void btnIngresarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPropietarioActionPerformed

        IngresoPropietarios propi = new IngresoPropietarios(usr, control);
        propi.setVisible(true);
        propi.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnIngresarPropietarioActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnListarVehiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVehiculo1ActionPerformed
        ListarVehiculos listar = new ListarVehiculos(usr, control);
        listar.setVisible(true);
        listar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnListarVehiculo1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
        CargarTablaAutomatico();
    }//GEN-LAST:event_formWindowOpened

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String tipoVehiculo = "";
        String placa = txtPlaca.getText().toUpperCase();
        String propietario = txtNombre.getText().toUpperCase();

        if (boxAutomovil.isSelected()) {
            if (boxMotocicleta.isSelected()) {
                tipoVehiculo = "";
            } else {
                tipoVehiculo = "AUTOMÓVIL";
            }
        } else if (boxMotocicleta.isSelected()) {
            tipoVehiculo = "MOTOCICLETA";
        }

        traerPropietario = control.traerTipoPropietario(tipoVehiculo, placa, propietario);
        cargarTabla();
        txtPlaca.setText("");
        txtNombre.setText("");

        if (tablaPropietarios.getRowCount() == 0) {
            mostrarMensaje("Sin registros, por favor verificar los datos", "Error", "Sin registros");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCierreTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierreTotalActionPerformed
        CierreTotal cierreTotal = new CierreTotal(usr, control);
        cierreTotal.setVisible(true);
        cierreTotal.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCierreTotalActionPerformed

    private void lbPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPrincipalMouseClicked
        Principal princ = new Principal(usr, control);
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_lbPrincipalMouseClicked

    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"Placa", "Nombre", "Cedula", "Telefono", "Tipo Vehículo", "Fecha Inicio", "Fecha Fin", "Valor Pagado", "Estado"};
        modeloTabla.setColumnIdentifiers(titulos);

        if (traerPropietario != null) {
            for (Propietario propi : traerPropietario) {
                int ultimoIndice = propi.getListaMensualidades().size() - 1;
                if (rdbPagado.isSelected()) {
                    if (rdbSinPagar.isSelected()) {
                        Object[] objecto = {propi.getPlaca(), propi.getNombre(), propi.getCedula(), propi.getTelefono(), propi.getTipo_Vehiculo(), propi.getListaMensualidades().get(ultimoIndice).getFecha_Inicio(), propi.getListaMensualidades().get(ultimoIndice).getFecha_Fin(), propi.getListaMensualidades().get(ultimoIndice).getValor_Mensual(), propi.getListaMensualidades().get(ultimoIndice).getEstado()};
                        modeloTabla.addRow(objecto);
                    } else {
                        if (propi.getListaMensualidades().get(propi.getListaMensualidades().size() - 1).getEstado().equals("PAGADO")) {
                            Object[] objecto = {propi.getPlaca(), propi.getNombre(), propi.getCedula(), propi.getTelefono(), propi.getTipo_Vehiculo(), propi.getListaMensualidades().get(ultimoIndice).getFecha_Inicio(), propi.getListaMensualidades().get(ultimoIndice).getFecha_Fin(), propi.getListaMensualidades().get(ultimoIndice).getValor_Mensual(), propi.getListaMensualidades().get(ultimoIndice).getEstado()};
                            modeloTabla.addRow(objecto);
                        } else {
                            continue;
                        }
                    }
                } else if (rdbSinPagar.isSelected()) {
                    if (propi.getListaMensualidades().get(propi.getListaMensualidades().size() - 1).getEstado().equals("FINALIZADO")) {
                        Object[] objecto = {propi.getPlaca(), propi.getNombre(), propi.getCedula(), propi.getTelefono(), propi.getTipo_Vehiculo(), propi.getListaMensualidades().get(ultimoIndice).getFecha_Inicio(), propi.getListaMensualidades().get(ultimoIndice).getFecha_Fin(), propi.getListaMensualidades().get(ultimoIndice).getValor_Mensual(), propi.getListaMensualidades().get(ultimoIndice).getEstado()};
                        modeloTabla.addRow(objecto);
                    } else {
                        continue;
                    }
                }
            }
        }
        tablaPropietarios.setModel(modeloTabla);
    }

    public void CargarTablaAutomatico() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String titulos[] = {"Placa", "Nombre", "Cedula", "Telefono", "Tipo Vehículo", "Fecha Inicio", "Fecha Fin", "Valor Pagado", "Estado"};
        modeloTabla.setColumnIdentifiers(titulos);

        traerPropietario = control.traerTodosPropietarios();

        if (traerPropietario != null) {
            for (Propietario propi : traerPropietario) {
                if (!propi.getListaMensualidades().isEmpty()) {
                    int ultimoIndice = propi.getListaMensualidades().size() - 1;
                    Object[] objeto = {
                        propi.getPlaca(),
                        propi.getNombre(),
                        propi.getCedula(),
                        propi.getTelefono(),
                        propi.getTipo_Vehiculo(),
                        propi.getListaMensualidades().get(ultimoIndice).getFecha_Inicio(),
                        propi.getListaMensualidades().get(ultimoIndice).getFecha_Fin(),
                        propi.getListaMensualidades().get(ultimoIndice).getValor_Mensual(),
                        propi.getListaMensualidades().get(ultimoIndice).getEstado()
                    };
                    modeloTabla.addRow(objeto);
                }
            }
        }
        tablaPropietarios.setModel(modeloTabla);
    }

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {

        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox boxAutomovil;
    private javax.swing.JCheckBox boxMotocicleta;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCierre;
    private javax.swing.JButton btnCierreTotal;
    private javax.swing.JButton btnIngresarPropietario;
    private javax.swing.JButton btnIngresarVehiculo;
    private javax.swing.JButton btnListarVehiculo1;
    private javax.swing.JButton btnPagarMensu;
    private javax.swing.JButton btnRetirarVehiculo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbPrincipal;
    private javax.swing.JPanel panelModuloIngreso;
    private javax.swing.JRadioButton rdbPagado;
    private javax.swing.JRadioButton rdbSinPagar;
    private javax.swing.JTable tablaPropietarios;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
