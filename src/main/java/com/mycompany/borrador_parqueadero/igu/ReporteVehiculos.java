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

public class ReporteVehiculos extends javax.swing.JFrame {

    Controladora control;
    Usuario usr;

    public ReporteVehiculos(Usuario usr, Controladora control) {
        this.usr = usr;
        this.control = control;
        initComponents();

        Date fechaActual = new Date();
        jdcFechaInicial.setDate(fechaActual);
        jdcFechaFinal.setDate(fechaActual);
        lbResultado.setText("$0");
        
        ImageIcon icon = new ImageIcon("C:\\Users\\tafik\\Downloads\\calendario2.png");
        jdcFechaFinal.getCalendarButton().setIcon(icon);
        jdcFechaInicial.getCalendarButton().setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelModuloIngreso = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lbResultado = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jdcFechaFinal = new com.toedter.calendar.JDateChooser();
        jdcFechaInicial = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelModuloIngreso.setBackground(new java.awt.Color(153, 153, 153));
        panelModuloIngreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Reporte Vehículos");

        lbResultado.setFont(new java.awt.Font("Bell MT", 0, 25)); // NOI18N
        lbResultado.setForeground(new java.awt.Color(0, 0, 0));
        lbResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbResultado.setText("$ 0");

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Fecha Final");

        btnCalcular.setText("Calcular");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.setFocusPainted(false);
        btnCalcular.setPreferredSize(new java.awt.Dimension(50, 24));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha Inicial");

        btnVolver.setText("Volver");
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.setFocusPainted(false);
        btnVolver.setPreferredSize(new java.awt.Dimension(50, 24));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left_return_arrow_icon_193335.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelModuloIngresoLayout = new javax.swing.GroupLayout(panelModuloIngreso);
        panelModuloIngreso.setLayout(panelModuloIngresoLayout);
        panelModuloIngresoLayout.setHorizontalGroup(
            panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelModuloIngresoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jdcFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(31, 31, 31))
        );
        panelModuloIngresoLayout.setVerticalGroup(
            panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(lbResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(11, 11, 11)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        lbResultado.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModuloIngreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelModuloIngreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        String fechaInicio;
        String fechaFinal;
        try{
            Date fechaIni = jdcFechaInicial.getDate();
            Date fechaFin = jdcFechaFinal.getDate();
            
            fechaInicio = formateador.format(fechaIni) + " 00:00:00";
            fechaFinal = formateador.format(fechaFin) + " 23:59:59";
        } catch (NullPointerException e){
            fechaInicio = "";
            fechaFinal = "";
        }
        DecimalFormat formatter = new DecimalFormat("###,###");
        double totalCierre = 0;

        if (!fechaInicio.isEmpty() && !fechaFinal.isEmpty()) {
            List<Vehiculo> listaEntreFechas = control.traerVehiculosEntreFechas(fechaInicio, fechaFinal);
            if (!listaEntreFechas.isEmpty()) {
                for (Vehiculo vehi : listaEntreFechas) {
                    totalCierre += vehi.getValor_Pagado();
                }
                lbResultado.setText("$ " + String.valueOf(formatter.format(totalCierre)));
            } else {
                mostrarMensaje("No han salido vehículos", "Info", "Total cierre");
            }
        } else {
            lbResultado.setText("$ 0");
            mostrarMensaje("Faltan datos, por favor verificar", "Error", "Falta de datos");
        }

    }//GEN-LAST:event_btnCalcularActionPerformed

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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        ListarVehiculos listVehi = new ListarVehiculos(usr, control);
        listVehi.setVisible(true);
        listVehi.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        Principal princ = new Principal(usr, control);
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JDateChooser jdcFechaFinal;
    private com.toedter.calendar.JDateChooser jdcFechaInicial;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JPanel panelModuloIngreso;
    // End of variables declaration//GEN-END:variables
}
