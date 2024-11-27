package com.mycompany.borrador_parqueadero.igu;

import com.mycompany.borrador_parqueadero.logica.Controladora;
import com.mycompany.borrador_parqueadero.logica.Precio;
import com.mycompany.borrador_parqueadero.logica.Propietario;
import com.mycompany.borrador_parqueadero.logica.Usuario;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class IngresoPropietarios extends javax.swing.JFrame {

    Controladora control;
    Propietario propi = new Propietario();
    Usuario usr;
    Precio carro;
    Precio moto;
    DecimalFormat formatter = new DecimalFormat("######");

    public IngresoPropietarios(Usuario usr, Controladora control) {        
        initComponents();

        LocalDate fecha = LocalDate.now();
        Date fechaIni = Date.from(fecha.atStartOfDay(ZoneId.systemDefault()).toInstant());
        jdcFechaInicial.setDate(fechaIni);

        LocalDate fechaFin = fecha.plusMonths(1);
        Date fechaFinal = Date.from(fechaFin.atStartOfDay(ZoneId.systemDefault()).toInstant());
        jdcFechaFinal.setDate(fechaFinal);
        
        rdbMotocicleta.setSelected(true);
        rdbMotocicleta.getCursor();
        
        this.usr = usr;
        this.control = control;
        
        carro = control.traerPrecio(1);
        moto = control.traerPrecio(2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupRdb = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIngresarVehiculo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnListarPropietarios = new javax.swing.JButton();
        btnListarVehiculo = new javax.swing.JButton();
        btnRetirarVehiculo = new javax.swing.JButton();
        btnCierreTotal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelModuloIngreso = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rdbMotocicleta = new javax.swing.JRadioButton();
        rdbAutomovil = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPlaca4 = new javax.swing.JTextField();
        jdcFechaInicial = new com.toedter.calendar.JDateChooser();
        jdcFechaFinal = new com.toedter.calendar.JDateChooser();
        lbPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Parqueadero");

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

        btnSalir.setText("Salir");
        btnSalir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnListarPropietarios.setText("Listar Mensualidad");
        btnListarPropietarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListarPropietarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarPropietarios.setFocusPainted(false);
        btnListarPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPropietariosActionPerformed(evt);
            }
        });

        btnListarVehiculo.setText("Listar Vehículos");
        btnListarVehiculo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarVehiculo.setFocusPainted(false);
        btnListarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarVehiculoActionPerformed(evt);
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
                    .addComponent(btnListarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(btnIngresarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnRetirarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCierreTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        panelModuloIngreso.setBackground(new java.awt.Color(153, 153, 153));
        panelModuloIngreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Módulo de Mensualidades ");

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo de Vehículo");

        txtNombre.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Placa");

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre Propietario");

        rdbMotocicleta.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroupRdb.add(rdbMotocicleta);
        rdbMotocicleta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rdbMotocicleta.setForeground(new java.awt.Color(0, 0, 0));
        rdbMotocicleta.setText("Motocicleta");
        rdbMotocicleta.setFocusPainted(false);
        rdbMotocicleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMotocicletaActionPerformed(evt);
            }
        });

        rdbAutomovil.setBackground(new java.awt.Color(153, 153, 153));
        buttonGroupRdb.add(rdbAutomovil);
        rdbAutomovil.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rdbAutomovil.setForeground(new java.awt.Color(0, 0, 0));
        rdbAutomovil.setText("Automovil");
        rdbAutomovil.setFocusPainted(false);
        rdbAutomovil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAutomovilActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cédula");

        txtCedula.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtCedula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCedula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Teléfono");

        txtTelefono.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Valor Mensualidad");

        jLabel11.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Fecha Inicio");

        txtValor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtValor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtValor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Fecha Fin");

        txtPlaca4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        txtPlaca4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPlaca4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPlaca4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlaca4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelModuloIngresoLayout = new javax.swing.GroupLayout(panelModuloIngreso);
        panelModuloIngreso.setLayout(panelModuloIngresoLayout);
        panelModuloIngresoLayout.setHorizontalGroup(
            panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(115, 115, 115))
            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelModuloIngresoLayout.createSequentialGroup()
                        .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel9)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono)
                            .addComponent(txtValor)
                            .addComponent(txtNombre)
                            .addComponent(txtCedula)
                            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                        .addComponent(rdbMotocicleta)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbAutomovil))
                                    .addComponent(txtPlaca4, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                                    .addComponent(jdcFechaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jdcFechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18))
        );
        panelModuloIngresoLayout.setVerticalGroup(
            panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPlaca4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11)
                    .addComponent(jdcFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel12))
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdbMotocicleta)
                    .addComponent(rdbAutomovil))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbPrincipal)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelModuloIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbPrincipal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btnListarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVehiculoActionPerformed

        ListarVehiculos listar = new ListarVehiculos(usr, control);
        listar.setVisible(true);
        listar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnListarVehiculoActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String placa = txtPlaca4.getText().toUpperCase();
        String cedula = txtCedula.getText();
        String propietario = txtNombre.getText().toUpperCase();
        String telefono = txtTelefono.getText();
        Date fechaIni;
        Date fechaFin;
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        String fecha_Inicio;
        String fecha_Final;
        double valor_Mensual;
        try {
            fechaIni = jdcFechaInicial.getDate();
            fechaFin = jdcFechaFinal.getDate();
            fecha_Inicio = formateador.format(fechaIni);
            fecha_Final = formateador.format(fechaFin);
        } catch (NullPointerException e) {
            fecha_Inicio = "";
            fecha_Final = "";
        }

        if (txtValor.getText().isEmpty()) {
            valor_Mensual = 0;
        } else {
            valor_Mensual = Double.parseDouble(txtValor.getText());
        }

        String tipo_Vehiculo;
        String estadoMensualidad = "PAGADO";

        propi = control.traerPropietario(placa);

        if (!placa.isEmpty() && !cedula.isEmpty() && !propietario.isEmpty() && !telefono.isEmpty() && !fecha_Inicio.isEmpty() && !fecha_Final.isEmpty() && valor_Mensual != 0 && (rdbMotocicleta.isSelected() || rdbAutomovil.isSelected())) {
            if (propi == null) {

                if (esNumero(cedula)) {
                    if (esNumero(telefono) && telefono.length() == 10) {
                        if (placa.length() == 6) {
                            String letras = placa.substring(0, 3);
                            String numeros = placa.substring(3, placa.length());
                            char ultiLetra = placa.substring(placa.length() - 1).charAt(0);
                            if (esAlfabeto(letras) && esNumero(numeros) && rdbAutomovil.isSelected()) {
                                tipo_Vehiculo = "AUTOMÓVIL";
                                control.agregarPropietario(placa, cedula, propietario, telefono, tipo_Vehiculo);
                                control.agregarMensualidad(fecha_Inicio, fecha_Final, estadoMensualidad, valor_Mensual, placa);
                                BorrarPantalla();
                                mostrarMensaje("Propietario ingresado exitosamente", "Info", "Ingreso Exitoso");
                                txtPlaca4.requestFocusInWindow();
                            } else if (esNumero(numeros.substring(0, numeros.length() - 1)) && Character.isLetter(ultiLetra) && rdbMotocicleta.isSelected()) {
                                tipo_Vehiculo = "MOTOCICLETA";
                                control.agregarPropietario(placa, cedula, propietario, telefono, tipo_Vehiculo);
                                control.agregarMensualidad(fecha_Inicio, fecha_Final, estadoMensualidad, valor_Mensual, placa);
                                BorrarPantalla();
                                mostrarMensaje("Propietario ingresado exitosamente", "Info", "Ingreso Exitoso");
                                txtPlaca4.requestFocusInWindow();
                            } else {
                                mostrarMensaje("Placa mal ingresada o tipo de vehículo mal seleccionado", "Error", "Ingreso incorrecto");
                                txtPlaca4.requestFocusInWindow();
                            }
                        } else {
                            mostrarMensaje("Placa mal ingresada, por favor verifique el número de caracteres de la placa", "Error", "Placa mal ingresada");
                            txtPlaca4.requestFocusInWindow();
                        }
                    } else {
                        mostrarMensaje("Teléfono mal ingresado, por favor verifique el número de caracteres o que no hayan caracteres especiales ni letras", "Error", "Teléfono mal ingresado");
                        txtTelefono.requestFocusInWindow();
                    }
                } else {
                    mostrarMensaje("La cédula solo debe contener números, no se permiten caracteres especiales o letras", "Error", "Cédula mal ingresada");
                    txtCedula.requestFocusInWindow();
                }
            }else{
                mostrarMensaje("Mensualidad Existente","Error","Registro Existente");
                txtPlaca4.requestFocusInWindow();
            }
        } else {
            mostrarMensaje("Faltan datos, por favor verificar", "Error", "Falta de datos");
            txtPlaca4.requestFocusInWindow();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void BorrarPantalla() {
        txtPlaca4.setText("");
        txtCedula.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtPlaca4.requestFocusInWindow();
    }

    public boolean esAlfabeto(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public boolean esNumero(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
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

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void btnListarPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPropietariosActionPerformed
        ListarPropietarios listarPropi = new ListarPropietarios(usr, control);
        listarPropi.setVisible(true);
        listarPropi.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnListarPropietariosActionPerformed

    private void txtPlaca4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlaca4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlaca4ActionPerformed

    private void rdbMotocicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMotocicletaActionPerformed
        txtValor.setText(String.valueOf(formatter.format(moto.getValorMensual())));
    }//GEN-LAST:event_rdbMotocicletaActionPerformed

    private void rdbAutomovilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAutomovilActionPerformed
        txtValor.setText(String.valueOf(formatter.format(carro.getValorMensual())));
    }//GEN-LAST:event_rdbAutomovilActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCierreTotal;
    private javax.swing.JButton btnIngresarVehiculo;
    private javax.swing.JButton btnListarPropietarios;
    private javax.swing.JButton btnListarVehiculo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRetirarVehiculo;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroupRdb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser jdcFechaFinal;
    private com.toedter.calendar.JDateChooser jdcFechaInicial;
    private javax.swing.JLabel lbPrincipal;
    private javax.swing.JPanel panelModuloIngreso;
    private javax.swing.JRadioButton rdbAutomovil;
    private javax.swing.JRadioButton rdbMotocicleta;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPlaca4;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
