package vistas;

import controladoresJPA.TransferenciaJpaController;
import javax.swing.JOptionPane;
import modelo.Almacen;
import modelo.PuntoVenta;

/**
 *
 * @author Mauro Federico Lopez
 */
public class TransferenciaUI extends javax.swing.JPanel {

    private TransferenciaJpaController transferenciaJpaController;

    /**
     * Creates new form TransferenciaUI
     */
    public TransferenciaUI() {
        initComponents();
        transferenciaJpaController = new TransferenciaJpaController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTransferenciaAlmacen = new javax.swing.JPanel();
        etiquetaCodigoLoteA = new javax.swing.JLabel();
        campoCodigoLoteA = new javax.swing.JTextField();
        etiquetaCantidadProductoA = new javax.swing.JLabel();
        etiquetaAlmacenOrigen = new javax.swing.JLabel();
        campoAlmacenOrigen = new javax.swing.JComboBox();
        etiquetaAlmacenDestino = new javax.swing.JLabel();
        campoAlmacenDestino = new javax.swing.JComboBox();
        botonTransferenciaAlmacen = new javax.swing.JButton();
        botonCancelarTransferenciaAlmacen = new javax.swing.JButton();
        campoCantidadProductoA = new javax.swing.JFormattedTextField();
        panelTransferenciaPuntoDeVenta = new javax.swing.JPanel();
        etiquetaCodigoLoteP = new javax.swing.JLabel();
        campoCodigoLoteP = new javax.swing.JTextField();
        etiquetaCantidadProductoP = new javax.swing.JLabel();
        campoCantidadProductoP = new javax.swing.JFormattedTextField();
        etiquetaAlmacen = new javax.swing.JLabel();
        campoAlmacen = new javax.swing.JComboBox();
        etiquetaPuntoDeVenta = new javax.swing.JLabel();
        campoPuntoDeVenta = new javax.swing.JComboBox();
        botonTransferenciaPuntoDeVenta = new javax.swing.JButton();
        botonCancelarTransferenciaPuntoDeVenta = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setLayout(new java.awt.BorderLayout());

        panelTransferenciaAlmacen.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transferencia de productos a un almacén", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        panelTransferenciaAlmacen.setMaximumSize(new java.awt.Dimension(900, 250));
        panelTransferenciaAlmacen.setMinimumSize(new java.awt.Dimension(900, 250));

        etiquetaCodigoLoteA.setText("Código del lote");

        etiquetaCantidadProductoA.setText("Cantidad a transferir");

        etiquetaAlmacenOrigen.setText("Almacén de origen");

        campoAlmacenOrigen.setModel(new vistas.modelos.AlmacenComboBoxModel());

        etiquetaAlmacenDestino.setText("Almacén de destino");

        campoAlmacenDestino.setModel(new vistas.modelos.AlmacenComboBoxModel());

        botonTransferenciaAlmacen.setText("Transferir");
        botonTransferenciaAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTransferenciaAlmacenActionPerformed(evt);
            }
        });

        botonCancelarTransferenciaAlmacen.setText("Cancelar Transferencia");
        botonCancelarTransferenciaAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarTransferenciaAlmacenActionPerformed(evt);
            }
        });

        campoCantidadProductoA.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout panelTransferenciaAlmacenLayout = new javax.swing.GroupLayout(panelTransferenciaAlmacen);
        panelTransferenciaAlmacen.setLayout(panelTransferenciaAlmacenLayout);
        panelTransferenciaAlmacenLayout.setHorizontalGroup(
            panelTransferenciaAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransferenciaAlmacenLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(panelTransferenciaAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTransferenciaAlmacenLayout.createSequentialGroup()
                        .addGroup(panelTransferenciaAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelTransferenciaAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(etiquetaCantidadProductoA, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(etiquetaCodigoLoteA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(etiquetaAlmacenOrigen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(etiquetaAlmacenDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTransferenciaAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoAlmacenOrigen, 0, 164, Short.MAX_VALUE)
                            .addComponent(campoAlmacenDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoCodigoLoteA)
                            .addComponent(campoCantidadProductoA)))
                    .addGroup(panelTransferenciaAlmacenLayout.createSequentialGroup()
                        .addComponent(botonTransferenciaAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelarTransferenciaAlmacen)))
                .addContainerGap(493, Short.MAX_VALUE))
        );
        panelTransferenciaAlmacenLayout.setVerticalGroup(
            panelTransferenciaAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTransferenciaAlmacenLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(panelTransferenciaAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCodigoLoteA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCodigoLoteA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTransferenciaAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCantidadProductoA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCantidadProductoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTransferenciaAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoAlmacenOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAlmacenOrigen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTransferenciaAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoAlmacenDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAlmacenDestino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelTransferenciaAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonTransferenciaAlmacen)
                    .addComponent(botonCancelarTransferenciaAlmacen))
                .addGap(29, 29, 29))
        );

        add(panelTransferenciaAlmacen, java.awt.BorderLayout.CENTER);

        panelTransferenciaPuntoDeVenta.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Transferencia de productos a un punto de venta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        panelTransferenciaPuntoDeVenta.setMaximumSize(new java.awt.Dimension(900, 250));
        panelTransferenciaPuntoDeVenta.setMinimumSize(new java.awt.Dimension(900, 250));
        panelTransferenciaPuntoDeVenta.setPreferredSize(new java.awt.Dimension(900, 250));

        etiquetaCodigoLoteP.setText("Código del lote");

        etiquetaCantidadProductoP.setText("Cantidad a transferir");

        campoCantidadProductoP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        etiquetaAlmacen.setText("Almacen origen");

        campoAlmacen.setModel(new vistas.modelos.AlmacenComboBoxModel());

        etiquetaPuntoDeVenta.setText("Punto de Venta destino");

        campoPuntoDeVenta.setModel(new vistas.modelos.PuntoDeVentaComboBoxModel());

        botonTransferenciaPuntoDeVenta.setText("Transferir");
        botonTransferenciaPuntoDeVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTransferenciaPuntoDeVentaActionPerformed(evt);
            }
        });

        botonCancelarTransferenciaPuntoDeVenta.setText("Cancelar Transferencia");
        botonCancelarTransferenciaPuntoDeVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarTransferenciaPuntoDeVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTransferenciaPuntoDeVentaLayout = new javax.swing.GroupLayout(panelTransferenciaPuntoDeVenta);
        panelTransferenciaPuntoDeVenta.setLayout(panelTransferenciaPuntoDeVentaLayout);
        panelTransferenciaPuntoDeVentaLayout.setHorizontalGroup(
            panelTransferenciaPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransferenciaPuntoDeVentaLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(panelTransferenciaPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelTransferenciaPuntoDeVentaLayout.createSequentialGroup()
                        .addGroup(panelTransferenciaPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(etiquetaPuntoDeVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(etiquetaCodigoLoteP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaCantidadProductoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelTransferenciaPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(campoAlmacen, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoCantidadProductoP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCodigoLoteP, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPuntoDeVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelTransferenciaPuntoDeVentaLayout.createSequentialGroup()
                        .addComponent(botonTransferenciaPuntoDeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelarTransferenciaPuntoDeVenta)))
                .addContainerGap(427, Short.MAX_VALUE))
        );
        panelTransferenciaPuntoDeVentaLayout.setVerticalGroup(
            panelTransferenciaPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTransferenciaPuntoDeVentaLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(panelTransferenciaPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCodigoLoteP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCodigoLoteP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTransferenciaPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCantidadProductoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaCantidadProductoP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTransferenciaPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAlmacen))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTransferenciaPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPuntoDeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaPuntoDeVenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelTransferenciaPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonTransferenciaPuntoDeVenta)
                    .addComponent(botonCancelarTransferenciaPuntoDeVenta))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(panelTransferenciaPuntoDeVenta, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarTransferenciaAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarTransferenciaAlmacenActionPerformed
        campoCodigoLoteA.setText("");
        campoCantidadProductoA.setText("");
        campoAlmacenOrigen.setSelectedItem(null);
        campoAlmacenDestino.setSelectedItem(null);
        campoAlmacenOrigen.updateUI();
        campoAlmacenDestino.updateUI();
    }//GEN-LAST:event_botonCancelarTransferenciaAlmacenActionPerformed

    private void botonCancelarTransferenciaPuntoDeVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarTransferenciaPuntoDeVentaActionPerformed
        campoCodigoLoteP.setText("");
        campoCantidadProductoP.setText("");
        campoAlmacen.setSelectedItem(null);
        campoPuntoDeVenta.setSelectedItem(null);
        campoAlmacen.updateUI();
        campoPuntoDeVenta.updateUI();
    }//GEN-LAST:event_botonCancelarTransferenciaPuntoDeVentaActionPerformed

    private void botonTransferenciaPuntoDeVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTransferenciaPuntoDeVentaActionPerformed
        try {
            String codigoLote = campoCodigoLoteP.getText();
            Double cantidad = ((Number) campoCantidadProductoP.getValue()).doubleValue();
            Almacen almacen = (Almacen) campoAlmacen.getSelectedItem();
            PuntoVenta puntoDeVenta = (PuntoVenta) campoPuntoDeVenta.getSelectedItem();
            transferenciaJpaController.transferirProductosAVenta(codigoLote, cantidad, almacen, puntoDeVenta);
            JOptionPane.showMessageDialog(null, "Se ha realizado la operación con éxito.", "Enhorabuena", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonTransferenciaPuntoDeVentaActionPerformed

    private void botonTransferenciaAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTransferenciaAlmacenActionPerformed
        try {
            String codigoLote = campoCodigoLoteA.getText();
            Double cantidad = ((Number) campoCantidadProductoA.getValue()).doubleValue();
            Almacen almacenOrigen = (Almacen) campoAlmacenOrigen.getSelectedItem();
            Almacen almacenDestino = (Almacen) campoAlmacenDestino.getSelectedItem();
            transferenciaJpaController.transferirProductosAlmacen(codigoLote, cantidad, almacenOrigen, almacenDestino);
            JOptionPane.showMessageDialog(null, "Se ha realizado la operación con éxito.", "Enhorabuena", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonTransferenciaAlmacenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelarTransferenciaAlmacen;
    private javax.swing.JButton botonCancelarTransferenciaPuntoDeVenta;
    private javax.swing.JButton botonTransferenciaAlmacen;
    private javax.swing.JButton botonTransferenciaPuntoDeVenta;
    private javax.swing.JComboBox campoAlmacen;
    private javax.swing.JComboBox campoAlmacenDestino;
    private javax.swing.JComboBox campoAlmacenOrigen;
    private javax.swing.JFormattedTextField campoCantidadProductoA;
    private javax.swing.JFormattedTextField campoCantidadProductoP;
    private javax.swing.JTextField campoCodigoLoteA;
    private javax.swing.JTextField campoCodigoLoteP;
    private javax.swing.JComboBox campoPuntoDeVenta;
    private javax.swing.JLabel etiquetaAlmacen;
    private javax.swing.JLabel etiquetaAlmacenDestino;
    private javax.swing.JLabel etiquetaAlmacenOrigen;
    private javax.swing.JLabel etiquetaCantidadProductoA;
    private javax.swing.JLabel etiquetaCantidadProductoP;
    private javax.swing.JLabel etiquetaCodigoLoteA;
    private javax.swing.JLabel etiquetaCodigoLoteP;
    private javax.swing.JLabel etiquetaPuntoDeVenta;
    private javax.swing.JPanel panelTransferenciaAlmacen;
    private javax.swing.JPanel panelTransferenciaPuntoDeVenta;
    // End of variables declaration//GEN-END:variables

    private void limpiarCampos() {
        this.campoAlmacen.setSelectedItem(null);
        this.campoAlmacenDestino.setSelectedItem(null);
        this.campoAlmacenOrigen.setSelectedItem(null);
        this.campoCantidadProductoA.setValue(null);
        this.campoCantidadProductoP.setValue(null);
        this.campoCodigoLoteA.setText("");
        this.campoCodigoLoteP.setText("");
        this.campoPuntoDeVenta.setSelectedItem(null);
    }

}
