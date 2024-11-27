package com.mycompany.borrador_parqueadero.igu;

import com.mycompany.borrador_parqueadero.logica.Controladora;
import com.mycompany.borrador_parqueadero.logica.Usuario;
import com.mycompany.borrador_parqueadero.logica.Vehiculo;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListarVehiculos extends javax.swing.JFrame {

    DecimalFormat formatter = new DecimalFormat("###,###");
    List<Vehiculo> traerVehiculos;
    Controladora control;
    Usuario usr;

    public ListarVehiculos(Usuario usr, Controladora control) {
        this.usr = usr;
        this.control = control;
        initComponents();
        boxMotocicleta.setSelected(true);
        rdbAfuera.setSelected(true);
        boxAutomovil.setSelected(true);
        rdbAdentro.setSelected(true);

        Date hora_Ingreso = new Date();
        jdcFecha.setDate(hora_Ingreso);
        
        ImageIcon icon = new ImageIcon("C:\\Users\\tafik\\Downloads\\calendario2.png");
        jdcFecha.getCalendarButton().setIcon(icon);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbPrincipal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIngresarVehiculo = new javax.swing.JButton();
        btnRetirarVehiculo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnIngresarPropietario = new javax.swing.JButton();
        btnListarPropietarios = new javax.swing.JButton();
        btnCierreTotal = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelModuloIngreso = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        rdbAdentro = new javax.swing.JRadioButton();
        rdbAfuera = new javax.swing.JRadioButton();
        btnCierre = new javax.swing.JButton();
        boxAutomovil = new javax.swing.JCheckBox();
        boxMotocicleta = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVehiculos = new javax.swing.JTable();
        btnBuscar1 = new javax.swing.JButton();
        jdcFecha = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lbPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left_return_arrow_icon_193335.png"))); // NOI18N
        lbPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPrincipalMouseClicked(evt);
            }
        });

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

        btnRetirarVehiculo.setText("Retirar Vehículo");
        btnRetirarVehiculo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRetirarVehiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRetirarVehiculo.setFocusPainted(false);
        btnRetirarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarVehiculoActionPerformed(evt);
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

        btnIngresarPropietario.setText("Ingresar Mensualidad");
        btnIngresarPropietario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresarPropietario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarPropietario.setFocusPainted(false);
        btnIngresarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPropietarioActionPerformed(evt);
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCierreTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetirarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(btnIngresarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRetirarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnListarPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCierreTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelModuloIngreso.setBackground(new java.awt.Color(153, 153, 153));
        panelModuloIngreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Buscar Vehiculos");

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

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha");

        rdbAdentro.setBackground(new java.awt.Color(153, 153, 153));
        rdbAdentro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rdbAdentro.setForeground(new java.awt.Color(0, 0, 0));
        rdbAdentro.setText("En parqueadero");
        rdbAdentro.setFocusPainted(false);
        rdbAdentro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAdentroActionPerformed(evt);
            }
        });

        rdbAfuera.setBackground(new java.awt.Color(153, 153, 153));
        rdbAfuera.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rdbAfuera.setForeground(new java.awt.Color(0, 0, 0));
        rdbAfuera.setText("Fuera del parqueadero");
        rdbAfuera.setFocusPainted(false);
        rdbAfuera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAfueraActionPerformed(evt);
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
        jLabel8.setText("Ubicación del Vehículo");

        tablaVehiculos.setBackground(new java.awt.Color(204, 204, 204));
        tablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaVehiculos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tablaVehiculos);

        btnBuscar1.setText("Buscar");
        btnBuscar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscar1.setFocusPainted(false);
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelModuloIngresoLayout = new javax.swing.GroupLayout(panelModuloIngreso);
        panelModuloIngreso.setLayout(panelModuloIngresoLayout);
        panelModuloIngresoLayout.setHorizontalGroup(
            panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelModuloIngresoLayout.createSequentialGroup()
                        .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel4))
                            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(boxMotocicleta))
                                    .addComponent(boxAutomovil))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                                .addComponent(rdbAdentro)
                                .addGap(29, 29, 29)
                                .addComponent(rdbAfuera))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(40, 40, 40))))
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addGap(0, 526, Short.MAX_VALUE)
                        .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(139, 139, 139))
            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addComponent(jLabel3))
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelModuloIngresoLayout.setVerticalGroup(
            panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbAdentro)
                        .addComponent(rdbAfuera))
                    .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(boxAutomovil)
                        .addComponent(boxMotocicleta)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbPrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(81, 81, 81))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
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
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbPrincipal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed

    }//GEN-LAST:event_txtPlacaActionPerformed

    private void btnCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierreActionPerformed
        ReporteVehiculos repor = new ReporteVehiculos(usr, control);
        repor.setVisible(true);
        repor.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnCierreActionPerformed

    private void rdbAdentroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAdentroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbAdentroActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        String tipoVehiculo = "";
        String placa = txtPlaca.getText().toUpperCase();
        String estado = "";
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        Date fechaDate;
        String fecha;
        try {
            fechaDate = jdcFecha.getDate();
            fecha = formateador.format(fechaDate);
        } catch (NullPointerException e) {
            fecha = "";
        }

        if (boxAutomovil.isSelected()) {
            if (boxMotocicleta.isSelected()) {
                tipoVehiculo = "";
            } else {
                tipoVehiculo = "AUTOMOVIL";
            }
        } else if (boxMotocicleta.isSelected()) {
            tipoVehiculo = "MOTOCICLETA";
        }

        if (rdbAdentro.isSelected()) {
            if (rdbAfuera.isSelected()) {
                estado = "";
            } else {
                estado = "DISPONIBLE";
            }
        } else if (rdbAfuera.isSelected()) {
            estado = "POR FUERA";
        }

        traerVehiculos = control.traerTipoVehiculos(tipoVehiculo, placa, estado, fecha);
        cargarTabla();
        txtPlaca.setText("");
        txtPlaca.requestFocusInWindow();

        if (tablaVehiculos.getRowCount() == 0) {
            mostrarMensaje("Sin registros, por favor verificar los datos", "Error", "Sin registros");
            txtPlaca.requestFocusInWindow();
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
        CargarTablaAutomatico();

    }//GEN-LAST:event_formWindowOpened

    private void btnListarPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPropietariosActionPerformed
        ListarPropietarios listarPropi = new ListarPropietarios(usr, control);
        listarPropi.setVisible(true);
        listarPropi.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnListarPropietariosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void boxMotocicletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxMotocicletaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxMotocicletaActionPerformed

    private void rdbAfueraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAfueraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbAfueraActionPerformed

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
    private javax.swing.JCheckBox boxAutomovil;
    private javax.swing.JCheckBox boxMotocicleta;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnCierre;
    private javax.swing.JButton btnCierreTotal;
    private javax.swing.JButton btnIngresarPropietario;
    private javax.swing.JButton btnIngresarVehiculo;
    private javax.swing.JButton btnListarPropietarios;
    private javax.swing.JButton btnRetirarVehiculo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JLabel lbPrincipal;
    private javax.swing.JPanel panelModuloIngreso;
    private javax.swing.JRadioButton rdbAdentro;
    private javax.swing.JRadioButton rdbAfuera;
    private javax.swing.JTable tablaVehiculos;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        String titulos[] = {"Placa", "Tipo Vehículo", "Hora Entrada", "Hora Salida", "Valor Pagado", "Estado"};
        modeloTabla.setColumnIdentifiers(titulos);

        if (traerVehiculos != null) {
            for (Vehiculo vehi : traerVehiculos) {
                String hora_Salida;
                if (vehi.getHora_Salida().length() == 0) {
                    hora_Salida = "NO HA SALIDO";
                } else {
                    hora_Salida = vehi.getHora_Salida().substring(10, vehi.getHora_Salida().length());
                }
                Object[] objecto = {vehi.getPlaca(), vehi.getTipo_Vehiculo(), vehi.getHora_Ingreso().substring(10, vehi.getHora_Ingreso().length()),
                    hora_Salida, formatter.format(vehi.getValor_Pagado()), vehi.getEstado()};

                modeloTabla.addRow(objecto);
            }
        }

        tablaVehiculos.setModel(modeloTabla);
    }

    public void CargarTablaAutomatico() {
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String titulos[] = {"Placa", "Tipo Vehículo", "Hora Entrada", "Hora Salida", "Valor Pagado", "Estado"};
        modeloTabla.setColumnIdentifiers(titulos);

        traerVehiculos = control.traerTodosVehiculos();

        if (traerVehiculos != null) {
            for (Vehiculo vehi : traerVehiculos) {
                String hora_Salida;
                if (vehi.getHora_Salida().length() == 0) {
                    hora_Salida = "NO HA SALIDO";
                } else {
                    hora_Salida = vehi.getHora_Salida().substring(10, vehi.getHora_Salida().length());
                }
                Object[] objeto = {vehi.getPlaca(), vehi.getTipo_Vehiculo(), vehi.getHora_Ingreso().substring(10, vehi.getHora_Ingreso().length()),
                    hora_Salida, formatter.format(vehi.getValor_Pagado()), vehi.getEstado()};
                modeloTabla.addRow(objeto);
            }
        }
        tablaVehiculos.setModel(modeloTabla);

    }
}
