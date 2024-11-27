package com.mycompany.borrador_parqueadero.igu;

import com.mycompany.borrador_parqueadero.logica.Controladora;
import com.mycompany.borrador_parqueadero.logica.Propietario;
import com.mycompany.borrador_parqueadero.logica.Usuario;
import com.mycompany.borrador_parqueadero.logica.Vehiculo;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class IngresoVehiculos extends javax.swing.JFrame {

    Controladora control;
    Vehiculo vehi = new Vehiculo();
    Propietario propi = new Propietario();
    Usuario usr;

    public IngresoVehiculos(Usuario usr, Controladora control) {
        this.usr = usr;
        this.control = control;
        initComponents();
        rdbMotocicleta.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoVehiculo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnIngresarPropietario = new javax.swing.JButton();
        btnRetirarVehiculo = new javax.swing.JButton();
        btnListarPropietarios = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnListarVehiculo1 = new javax.swing.JButton();
        btnCierreTotal = new javax.swing.JButton();
        panelModuloIngreso = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        rdbMotocicleta = new javax.swing.JRadioButton();
        rdbAutomovil = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JButton();
        lbPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingreso Vehículos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Parqueadero");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnIngresarPropietario.setText("Ingresar Mensualidad");
        btnIngresarPropietario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnIngresarPropietario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresarPropietario.setFocusPainted(false);
        btnIngresarPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPropietarioActionPerformed(evt);
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

        btnListarPropietarios.setText("Listar Mensualidad");
        btnListarPropietarios.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnListarPropietarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnListarPropietarios.setFocusPainted(false);
        btnListarPropietarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarPropietariosActionPerformed(evt);
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

        btnListarVehiculo1.setText("Listar Vehículos");
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
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCierreTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarVehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIngresarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarPropietarios, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetirarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(btnRetirarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIngresarPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListarVehiculo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        jLabel3.setText("Ingreso de Vehículos");

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

        rdbMotocicleta.setBackground(new java.awt.Color(153, 153, 153));
        GrupoVehiculo.add(rdbMotocicleta);
        rdbMotocicleta.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rdbMotocicleta.setForeground(new java.awt.Color(0, 0, 0));
        rdbMotocicleta.setText("Motocicleta");
        rdbMotocicleta.setFocusPainted(false);

        rdbAutomovil.setBackground(new java.awt.Color(153, 153, 153));
        GrupoVehiculo.add(rdbAutomovil);
        rdbAutomovil.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        rdbAutomovil.setForeground(new java.awt.Color(0, 0, 0));
        rdbAutomovil.setText("Automovil");
        rdbAutomovil.setFocusPainted(false);

        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusPainted(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelModuloIngresoLayout = new javax.swing.GroupLayout(panelModuloIngreso);
        panelModuloIngreso.setLayout(panelModuloIngresoLayout);
        panelModuloIngresoLayout.setHorizontalGroup(
            panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                .addGap(0, 167, Short.MAX_VALUE)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                        .addComponent(rdbMotocicleta)
                        .addGap(18, 18, 18)
                        .addComponent(rdbAutomovil)
                        .addGap(143, 143, 143))))
            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel4)
                .addContainerGap(162, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(227, 227, 227))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(190, 190, 190))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(132, 132, 132))))
        );
        panelModuloIngresoLayout.setVerticalGroup(
            panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(78, 78, 78)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbMotocicleta)
                    .addComponent(rdbAutomovil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbPrincipal)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelModuloIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelModuloIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lbPrincipal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPropietarioActionPerformed
        IngresoPropietarios IngreMensu = new IngresoPropietarios(usr, control);
        IngreMensu.setVisible(true);
        IngreMensu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnIngresarPropietarioActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed

    }//GEN-LAST:event_txtPlacaActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        String placa = txtPlaca.getText().toUpperCase();
        String tipo_Vehiculo;
        String estadoVehiculo = "DISPONIBLE";
        
        if (!placa.isEmpty() && (rdbAutomovil.isSelected() || rdbMotocicleta.isSelected())) {
            if (placa.length() == 6) {
                vehi = control.traerVehiculo(placa, estadoVehiculo);
                String letras = placa.substring(0, 3);
                String numeros = placa.substring(3, placa.length());
                char ultiLetra = placa.substring(placa.length() - 1).charAt(0);
                if (vehi == null) {
                    if (esAlfabeto(letras) && esNumero(numeros) && rdbAutomovil.isSelected()) {
                        tipo_Vehiculo = "AUTOMÓVIL";
                        ingresoDeVehiculos(placa, tipo_Vehiculo);
                    } else if (esNumero(numeros.substring(0, numeros.length() - 1)) && Character.isLetter(ultiLetra) && rdbMotocicleta.isSelected()) {
                        tipo_Vehiculo = "MOTOCICLETA";
                        ingresoDeVehiculos(placa, tipo_Vehiculo);
                    } else {
                        mostrarMensaje("Placa mal ingresada o tipo de vehiculo mal seleccionado, por favor verificar", "Error", "Ingreso incorrecto");
                        txtPlaca.requestFocusInWindow();
                    }
                } else {
                    mostrarMensaje("El vehículo se encuentra dentro del parqueadero, por favor verificar la placa", "Error", "Vehículo dentro");
                    txtPlaca.requestFocusInWindow();
                }
            } else {
                mostrarMensaje("Placa mal ingresada, por favor verificar", "Error", "Ingreso incorrecto");
                txtPlaca.requestFocusInWindow();
            }
        } else {
            mostrarMensaje("Faltan datos, por favor verificar", "Error", "Falta de datos");
            txtPlaca.requestFocusInWindow();
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    public void ingresoDeVehiculos(String placa, String tipo_Vehiculo) {
        String estado = "DISPONIBLE";
        Date hora_Ingreso = new Date();
        String hora_Salida = "";
        propi = control.traerPropietario(placa);
        
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String fecha = formateador.format(hora_Ingreso);
        if(propi == null){
            control.agregarvehiculo(placa, tipo_Vehiculo, estado, fecha, hora_Salida);
            control.ImprimirIngreso(placa, tipo_Vehiculo, fecha );
            mostrarMensaje("Vehículo ingresado exitosamente", "Info", "Ingreso Exitoso");
        }else{
            mostrarMensaje("El vehiculo cuenta con mensualidad", "Info", "Vehículo con mensualidad");
        }
        txtPlaca.setText("");
        txtPlaca.requestFocusInWindow();
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

    private void btnListarPropietariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarPropietariosActionPerformed
        ListarPropietarios listarMensu = new ListarPropietarios(usr, control);
        listarMensu.setVisible(true);
        listarMensu.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnListarPropietariosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnRetirarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarVehiculoActionPerformed
        salidaVehiculos salida = new salidaVehiculos(usr, control);
        salida.setVisible(true);
        salida.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnRetirarVehiculoActionPerformed

    private void btnListarVehiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarVehiculo1ActionPerformed
        ListarVehiculos listar = new ListarVehiculos(usr, control);
        listar.setVisible(true);
        listar.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnListarVehiculo1ActionPerformed

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
    private javax.swing.ButtonGroup GrupoVehiculo;
    private javax.swing.JButton btnCierreTotal;
    private javax.swing.JButton btnIngresarPropietario;
    private javax.swing.JButton btnListarPropietarios;
    private javax.swing.JButton btnListarVehiculo1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRetirarVehiculo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbPrincipal;
    private javax.swing.JPanel panelModuloIngreso;
    private javax.swing.JRadioButton rdbAutomovil;
    private javax.swing.JRadioButton rdbMotocicleta;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
