package vistas;

import comercio.ControllerSingleton;
import controladoresJPA.VentaJpaController;
import controladoresJPA.exceptions.CodigoProductoNoRegistradoException;
import modelo.MedioDePago;
import modelo.PuntoVenta;
import modelo.Vendedor;
import vistas.modelos.ItemDeVentaTableModel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

/**
 *
 * @author Mauro Federico Lopez
 */
public class GestionVentaUI extends javax.swing.JFrame {

    private Vendedor vendedor;
    private VentaJpaController ventaJpaController;
    private ItemDeVentaTableModel itemDeVentaTableModel;

    /**
     * Creates new form GestionVentaUI
     */
    public GestionVentaUI() {
        initComponents();
        ventaJpaController = new VentaJpaController(ControllerSingleton.getEmf());
        itemDeVentaTableModel = new ItemDeVentaTableModel(ventaJpaController);
        tablaItemsDeVenta.setModel(itemDeVentaTableModel);
        repintarVentana();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrimero = new javax.swing.JPanel();
        etiquetaPuntoDeVenta = new javax.swing.JLabel();
        botonCerrarSesion = new javax.swing.JButton();
        etiquetaFecha = new javax.swing.JLabel();
        etiquetaSucursal = new javax.swing.JLabel();
        etiquetaVendedor = new javax.swing.JLabel();
        campoFecha = new javax.swing.JFormattedTextField();
        campoPuntoDeVenta = new javax.swing.JComboBox();
        jsp = new javax.swing.JScrollPane();
        tablaItemsDeVenta = new javax.swing.JTable();
        panelDespues = new javax.swing.JPanel();
        botonIngresarProducto = new javax.swing.JButton();
        etiquetaCodigoProducto = new javax.swing.JLabel();
        campoCodigoProducto = new javax.swing.JTextField();
        etiquetaCantidadProducto = new javax.swing.JLabel();
        campoCantidadProducto = new javax.swing.JFormattedTextField();
        etiquetaIngreseProducto = new javax.swing.JLabel();
        etiquetaMontoTotal = new javax.swing.JLabel();
        campoMontoTotal = new javax.swing.JFormattedTextField();
        campoMedioDePago = new javax.swing.JComboBox();
        etiquetaMedioDePago = new javax.swing.JLabel();
        botonCancelarVenta = new javax.swing.JButton();
        botonFinalizarVenta = new javax.swing.JButton();
        panelUltimo = new javax.swing.JPanel();
        botonEliminarItemVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Venta");
        setIconImages(null);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(950, 550));
        setResizable(false);

        panelPrimero.setBackground(new java.awt.Color(102, 102, 102));
        panelPrimero.setMaximumSize(new java.awt.Dimension(950, 79));
        panelPrimero.setMinimumSize(new java.awt.Dimension(950, 79));

        etiquetaPuntoDeVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaPuntoDeVenta.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaPuntoDeVenta.setText("Punto de venta N°");

        botonCerrarSesion.setText("Cerrar Sesión");

        etiquetaFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaFecha.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaFecha.setText("Fecha:");

        etiquetaSucursal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaSucursal.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaSucursal.setText("Sucursal N°");

        etiquetaVendedor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaVendedor.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaVendedor.setText("Juan Pablo Velazquez Rodriguez Perez");

        campoFecha.setBackground(new java.awt.Color(102, 102, 102));
        campoFecha.setBorder(null);
        campoFecha.setEditable(false);
        campoFecha.setForeground(new java.awt.Color(240, 240, 240));
        campoFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/MM/yyyy"))));
        campoFecha.setText("21/12/09");
        campoFecha.setToolTipText("");
        campoFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        campoPuntoDeVenta.setModel(new vistas.modelos.PuntoDeVentaComboBoxModel());
        campoPuntoDeVenta.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                campoPuntoDeVentaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelPrimeroLayout = new javax.swing.GroupLayout(panelPrimero);
        panelPrimero.setLayout(panelPrimeroLayout);
        panelPrimeroLayout.setHorizontalGroup(
            panelPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrimeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(etiquetaSucursal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaPuntoDeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrimeroLayout.createSequentialGroup()
                        .addComponent(etiquetaFecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrimeroLayout.createSequentialGroup()
                        .addComponent(campoPuntoDeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                        .addComponent(botonCerrarSesion))
                    .addComponent(etiquetaVendedor, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelPrimeroLayout.setVerticalGroup(
            panelPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrimeroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaVendedor)
                    .addComponent(etiquetaSucursal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCerrarSesion)
                    .addGroup(panelPrimeroLayout.createSequentialGroup()
                        .addGroup(panelPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaPuntoDeVenta)
                            .addComponent(campoPuntoDeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrimeroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaFecha)
                            .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelPrimero, java.awt.BorderLayout.PAGE_START);

        jsp.setBackground(new java.awt.Color(153, 255, 153));

        tablaItemsDeVenta.setAutoCreateRowSorter(true);
        tablaItemsDeVenta.setBackground(new java.awt.Color(153, 153, 153));
        tablaItemsDeVenta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tablaItemsDeVenta.setForeground(new java.awt.Color(240, 240, 240));
        tablaItemsDeVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaItemsDeVenta.setGridColor(new java.awt.Color(255, 255, 255));
        tablaItemsDeVenta.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tablaItemsDeVenta.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tablaItemsDeVenta.getTableHeader().setReorderingAllowed(false);
        jsp.setViewportView(tablaItemsDeVenta);
        tablaItemsDeVenta.getTableHeader().setBackground(Color.GRAY);
        tablaItemsDeVenta.getTableHeader().setForeground(Color.WHITE);
        tablaItemsDeVenta.getTableHeader().setFont(new Font("Tahoma", 1, 12));

        getContentPane().add(jsp, java.awt.BorderLayout.CENTER);

        panelDespues.setBackground(new java.awt.Color(102, 102, 102));
        panelDespues.setMaximumSize(new java.awt.Dimension(296, 32767));
        panelDespues.setMinimumSize(new java.awt.Dimension(296, 0));

        botonIngresarProducto.setText("Ingresar");
        botonIngresarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarProductoActionPerformed(evt);
            }
        });

        etiquetaCodigoProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etiquetaCodigoProducto.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCodigoProducto.setText("Código");

        etiquetaCantidadProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etiquetaCantidadProducto.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaCantidadProducto.setText("Cantidad");

        etiquetaIngreseProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        etiquetaIngreseProducto.setForeground(new java.awt.Color(255, 255, 255));
        etiquetaIngreseProducto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaIngreseProducto.setText("Ingrese un producto");

        etiquetaMontoTotal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaMontoTotal.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaMontoTotal.setText("  Monto Total");
        etiquetaMontoTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 4, true));

        campoMontoTotal.setBackground(new java.awt.Color(102, 102, 102));
        campoMontoTotal.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 240, 240), 5, true));
        campoMontoTotal.setEditable(false);
        campoMontoTotal.setForeground(new java.awt.Color(240, 240, 240));
        campoMontoTotal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        campoMontoTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoMontoTotal.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        campoMedioDePago.setModel(new vistas.modelos.MedioDePagoComboBoxModel());
        campoMedioDePago.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                campoMedioDePagoItemStateChanged(evt);
            }
        });

        etiquetaMedioDePago.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        etiquetaMedioDePago.setForeground(new java.awt.Color(240, 240, 240));
        etiquetaMedioDePago.setText("Medio de pago");

        botonCancelarVenta.setText("Cancelar Venta");
        botonCancelarVenta.setMaximumSize(new java.awt.Dimension(450, 23));
        botonCancelarVenta.setMinimumSize(new java.awt.Dimension(450, 23));
        botonCancelarVenta.setPreferredSize(new java.awt.Dimension(450, 23));
        botonCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarVentaActionPerformed(evt);
            }
        });

        botonFinalizarVenta.setText("Finalizar Venta");
        botonFinalizarVenta.setMaximumSize(new java.awt.Dimension(450, 23));
        botonFinalizarVenta.setMinimumSize(new java.awt.Dimension(450, 23));
        botonFinalizarVenta.setPreferredSize(new java.awt.Dimension(450, 23));
        botonFinalizarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFinalizarVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDespuesLayout = new javax.swing.GroupLayout(panelDespues);
        panelDespues.setLayout(panelDespuesLayout);
        panelDespuesLayout.setHorizontalGroup(
            panelDespuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelDespuesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDespuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDespuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelDespuesLayout.createSequentialGroup()
                            .addComponent(botonFinalizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(botonCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGroup(panelDespuesLayout.createSequentialGroup()
                            .addComponent(etiquetaMedioDePago)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoMedioDePago, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(etiquetaMontoTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoMontoTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDespuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelDespuesLayout.createSequentialGroup()
                            .addGroup(panelDespuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etiquetaCantidadProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panelDespuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoCodigoProducto)
                                .addComponent(campoCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(etiquetaIngreseProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonIngresarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDespuesLayout.setVerticalGroup(
            panelDespuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDespuesLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(etiquetaIngreseProducto)
                .addGap(8, 8, 8)
                .addGroup(panelDespuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCodigoProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDespuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCantidadProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonIngresarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDespuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaMedioDePago)
                    .addComponent(campoMedioDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaMontoTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoMontoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDespuesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonFinalizarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        getContentPane().add(panelDespues, java.awt.BorderLayout.LINE_END);

        panelUltimo.setBackground(new java.awt.Color(102, 102, 102));
        panelUltimo.setMaximumSize(new java.awt.Dimension(950, 23));
        panelUltimo.setMinimumSize(new java.awt.Dimension(950, 23));
        panelUltimo.setPreferredSize(new java.awt.Dimension(950, 23));

        botonEliminarItemVenta.setText("Eliminar Item de Venta");
        botonEliminarItemVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarItemVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelUltimoLayout = new javax.swing.GroupLayout(panelUltimo);
        panelUltimo.setLayout(panelUltimoLayout);
        panelUltimoLayout.setHorizontalGroup(
            panelUltimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUltimoLayout.createSequentialGroup()
                .addComponent(botonEliminarItemVenta)
                .addGap(0, 811, Short.MAX_VALUE))
        );
        panelUltimoLayout.setVerticalGroup(
            panelUltimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUltimoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonEliminarItemVenta))
        );

        getContentPane().add(panelUltimo, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarProductoActionPerformed
        try {
            String codigoProducto = campoCodigoProducto.getText();
            Double cantidadProducto = ((Number) campoCantidadProducto.getValue()).doubleValue();
            ventaJpaController.agregarItemDeVenta(codigoProducto, cantidadProducto);
            campoCodigoProducto.setText("");
            campoCantidadProducto.setValue(1);
            campoMontoTotal.setValue(ventaJpaController.obtenerMontoTotal());
        } catch (CodigoProductoNoRegistradoException ex) {
            ex.mostrarDialogo();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonIngresarProductoActionPerformed

    private void botonEliminarItemVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarItemVentaActionPerformed
        try {
            ventaJpaController.eliminarItemDeVenta(tablaItemsDeVenta.getSelectedRow());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonEliminarItemVentaActionPerformed

    private void botonCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarVentaActionPerformed
        try {
            ventaJpaController.cancelarVenta();
            repintarVentana();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonCancelarVentaActionPerformed

    private void campoPuntoDeVentaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_campoPuntoDeVentaItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            PuntoVenta puntoDeVenta = (PuntoVenta) campoPuntoDeVenta.getSelectedItem();
            ventaJpaController.setPuntoDeVenta(puntoDeVenta);
            etiquetaSucursal.setText("Sucursal N°" + puntoDeVenta.getSucursal().getNumero().toString());
            etiquetaPuntoDeVenta.setText("Punto de venta N°" + puntoDeVenta.getNumero().toString());
            campoPuntoDeVenta.setEnabled(false);
        }
    }//GEN-LAST:event_campoPuntoDeVentaItemStateChanged

    private void campoMedioDePagoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_campoMedioDePagoItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            MedioDePago medioDePago = (MedioDePago) campoMedioDePago.getSelectedItem();
            ventaJpaController.setMedioDePago(medioDePago);
        }
    }//GEN-LAST:event_campoMedioDePagoItemStateChanged

    private void botonFinalizarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFinalizarVentaActionPerformed
        try {
            ventaJpaController.persistirOperacion();
            repintarVentana();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonFinalizarVentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionVentaUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new GestionVentaUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelarVenta;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonEliminarItemVenta;
    private javax.swing.JButton botonFinalizarVenta;
    private javax.swing.JButton botonIngresarProducto;
    private javax.swing.JFormattedTextField campoCantidadProducto;
    private javax.swing.JTextField campoCodigoProducto;
    private javax.swing.JFormattedTextField campoFecha;
    private javax.swing.JComboBox campoMedioDePago;
    private javax.swing.JFormattedTextField campoMontoTotal;
    private javax.swing.JComboBox campoPuntoDeVenta;
    private javax.swing.JLabel etiquetaCantidadProducto;
    private javax.swing.JLabel etiquetaCodigoProducto;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel etiquetaIngreseProducto;
    private javax.swing.JLabel etiquetaMedioDePago;
    private javax.swing.JLabel etiquetaMontoTotal;
    private javax.swing.JLabel etiquetaPuntoDeVenta;
    private javax.swing.JLabel etiquetaSucursal;
    private javax.swing.JLabel etiquetaVendedor;
    private javax.swing.JScrollPane jsp;
    private javax.swing.JPanel panelDespues;
    private javax.swing.JPanel panelPrimero;
    private javax.swing.JPanel panelUltimo;
    private javax.swing.JTable tablaItemsDeVenta;
    // End of variables declaration//GEN-END:variables

    private void agregarComponente(JComponent componente) {
        getContentPane().removeAll();
        add(componente, BorderLayout.CENTER);
        componente.setVisible(true);
        componente.updateUI();
    }

    private void repintarVentana() {
        campoMontoTotal.setValue(ventaJpaController.obtenerMontoTotal());
        campoFecha.setValue(new Date());
        campoCantidadProducto.setValue(1);
        campoCodigoProducto.setText("");
        campoPuntoDeVenta.setEnabled(true);
    }

}