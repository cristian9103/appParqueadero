package com.mycompany.borrador_parqueadero.igu;

import com.mycompany.borrador_parqueadero.logica.Controladora;
import com.mycompany.borrador_parqueadero.logica.Mensualidad;
import com.mycompany.borrador_parqueadero.logica.Usuario;
import com.mycompany.borrador_parqueadero.logica.Vehiculo;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class CierreTotal extends javax.swing.JFrame {

    Controladora control;
    Usuario usr;

    public CierreTotal(Usuario usr, Controladora control) {
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
        jdcFechaInicial = new com.toedter.calendar.JDateChooser();
        jdcFechaFinal = new com.toedter.calendar.JDateChooser();
        lbPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelModuloIngreso.setBackground(new java.awt.Color(153, 153, 153));
        panelModuloIngreso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 0, 25)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cierre Total");

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
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha Inicial");

        lbPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/left_return_arrow_icon_193335.png"))); // NOI18N
        lbPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPrincipalMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelModuloIngresoLayout = new javax.swing.GroupLayout(panelModuloIngreso);
        panelModuloIngreso.setLayout(panelModuloIngresoLayout);
        panelModuloIngresoLayout.setHorizontalGroup(
            panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addComponent(lbResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelModuloIngresoLayout.createSequentialGroup()
                        .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                .addComponent(jdcFechaInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(jdcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(40, 40, 40))))
            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbPrincipal)
                        .addGap(93, 93, 93)
                        .addComponent(jLabel3))
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelModuloIngresoLayout.setVerticalGroup(
            panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3))
                    .addGroup(panelModuloIngresoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lbPrincipal)))
                .addGap(39, 39, 39)
                .addComponent(lbResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelModuloIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcFechaInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

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
        String fechaInicio = "";
        String fechaInicioMensu;
        String fechaFinal = "";
        String fechaFinalMensu;

        try {
            Date fechaIni = jdcFechaInicial.getDate();
            Date fechaFin = jdcFechaFinal.getDate();

            fechaInicio = formateador.format(fechaIni) + " 00:00:00";
            fechaInicioMensu = formateador.format(fechaIni);
            fechaFinal = formateador.format(fechaFin) + " 23:59:59";
            fechaFinalMensu = formateador.format(fechaFin);
        } catch (NullPointerException e) {
            fechaInicioMensu = "";
            fechaFinalMensu = "";
        }

        DecimalFormat formatter = new DecimalFormat("###,###");

        double totalVehi = 0;
        double totalMensu = 0;

        if (!fechaInicioMensu.isEmpty() && !fechaFinalMensu.isEmpty()) {
            List<Vehiculo> listaEntreFechas = control.traerVehiculosEntreFechas(fechaInicio, fechaFinal);
            List<Mensualidad> listaEntreFechasMensu = control.traerMensualidadEntreFechas(fechaInicioMensu, fechaFinalMensu);
            if (!listaEntreFechas.isEmpty() || !listaEntreFechasMensu.isEmpty()) {
                for (Vehiculo vehi : listaEntreFechas) {
                    totalVehi += vehi.getValor_Pagado();
                }
                for (Mensualidad mensu : listaEntreFechasMensu) {
                    totalMensu += mensu.getValor_Mensual();
                }

                lbResultado.setText("$ " + String.valueOf(formatter.format(totalVehi + totalMensu)));
                control.ImprimirCierreTotal(fechaInicioMensu, fechaFinalMensu, totalVehi, totalMensu);
            } else {
                mostrarMensaje("No han salido vehículos", "Info", "Total cierre");
            }
        } else {
            lbResultado.setText("$ 0");
            mostrarMensaje("Faltan datos, por favor verificar", "Error", "Falta de datos");
        }


    }//GEN-LAST:event_btnCalcularActionPerformed

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
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JDateChooser jdcFechaFinal;
    private com.toedter.calendar.JDateChooser jdcFechaInicial;
    private javax.swing.JLabel lbPrincipal;
    private javax.swing.JLabel lbResultado;
    private javax.swing.JPanel panelModuloIngreso;
    // End of variables declaration//GEN-END:variables
}
