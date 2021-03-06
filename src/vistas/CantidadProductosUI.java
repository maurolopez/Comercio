package vistas;

import comercio.ControllerSingleton;
import controladoresJPA.AlmacenJpaController;
import controladoresJPA.LoteJpaController;
import controladoresJPA.ProductoJpaController;
import controladoresJPA.PuntoVentaJpaController;
import controladoresJPA.exceptions.CodigoProductoNoRegistradoException;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import modelo.Almacen;
import modelo.Producto;
import modelo.PuntoVenta;

/**
 *
 * @author Mauro Federico Lopez
 */
public class CantidadProductosUI extends javax.swing.JPanel {

    private ProductoJpaController productoJpaController;
    private LoteJpaController loteJpaController;
    private AlmacenJpaController almacenJpaController;
    private PuntoVentaJpaController puntoDeVentaJpaController;

    /**
     * Creates new form CantidadProductosUI
     */
    public CantidadProductosUI() {
        initComponents();
        grupoDeBotones.add(botonProductosEnLote);
        grupoDeBotones.add(botonProductosEnAlmacen);
        grupoDeBotones.add(botonProductosEnPuntoDeVenta);
        productoJpaController = ControllerSingleton.getProductoJpaController();
        loteJpaController = ControllerSingleton.getLoteJpaController();
        almacenJpaController = ControllerSingleton.getAlmacenJpaController();
        puntoDeVentaJpaController = ControllerSingleton.getPuntoVentaJpaController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDeBotones = new javax.swing.ButtonGroup();
        panelProductosEnLote = new javax.swing.JPanel();
        etiquetaAlmacenLote = new javax.swing.JLabel();
        campoAlmacenLote = new javax.swing.JComboBox();
        etiquetaCodigoLote = new javax.swing.JLabel();
        campoCodigoLote = new javax.swing.JTextField();
        botonConsultarProductosEnLote = new javax.swing.JButton();
        panelProductosEnAlmacen = new javax.swing.JPanel();
        campoAlmacen = new javax.swing.JComboBox();
        etiquetaAlmacen = new javax.swing.JLabel();
        etiquetaCodigoProductoAlmacen = new javax.swing.JLabel();
        campoCodigoProductoAlmacen = new javax.swing.JTextField();
        botonConsultarProductosAlmacen = new javax.swing.JButton();
        panelProductosEnPuntoDeVenta = new javax.swing.JPanel();
        etiquetaPuntoDeVenta = new javax.swing.JLabel();
        campoPuntoDeVenta = new javax.swing.JComboBox();
        etiquetaCodigoProductoPuntoDeVenta = new javax.swing.JLabel();
        campoCodigoProductoPuntoDeVenta = new javax.swing.JTextField();
        botonConsultarProductosEnPuntoDeVenta = new javax.swing.JButton();
        panelOpcion = new javax.swing.JPanel();
        botonProductosEnLote = new javax.swing.JRadioButton();
        botonProductosEnAlmacen = new javax.swing.JRadioButton();
        botonProductosEnPuntoDeVenta = new javax.swing.JRadioButton();

        panelProductosEnLote.setMaximumSize(new java.awt.Dimension(900, 97));
        panelProductosEnLote.setMinimumSize(new java.awt.Dimension(900, 97));

        etiquetaAlmacenLote.setText("Seleccione un almacén");

        campoAlmacenLote.setModel(new vistas.modelos.AlmacenComboBoxModel());

        etiquetaCodigoLote.setText("Ingrese el código del lote");

        botonConsultarProductosEnLote.setText("Consultar");
        botonConsultarProductosEnLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarProductosEnLoteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProductosEnLoteLayout = new javax.swing.GroupLayout(panelProductosEnLote);
        panelProductosEnLote.setLayout(panelProductosEnLoteLayout);
        panelProductosEnLoteLayout.setHorizontalGroup(
            panelProductosEnLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosEnLoteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductosEnLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelProductosEnLoteLayout.createSequentialGroup()
                        .addComponent(etiquetaCodigoLote, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCodigoLote))
                    .addComponent(botonConsultarProductosEnLote, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelProductosEnLoteLayout.createSequentialGroup()
                        .addComponent(etiquetaAlmacenLote, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoAlmacenLote, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(553, Short.MAX_VALUE))
        );
        panelProductosEnLoteLayout.setVerticalGroup(
            panelProductosEnLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosEnLoteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductosEnLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAlmacenLote)
                    .addComponent(campoAlmacenLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductosEnLoteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCodigoLote)
                    .addComponent(campoCodigoLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonConsultarProductosEnLote)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelProductosEnAlmacen.setMaximumSize(new java.awt.Dimension(900, 100));
        panelProductosEnAlmacen.setMinimumSize(new java.awt.Dimension(900, 100));
        panelProductosEnAlmacen.setPreferredSize(new java.awt.Dimension(900, 100));

        campoAlmacen.setModel(new vistas.modelos.AlmacenComboBoxModel());

        etiquetaAlmacen.setText("Seleccione un almacén");

        etiquetaCodigoProductoAlmacen.setText("Ingrese el código del producto");

        botonConsultarProductosAlmacen.setText("Consultar");
        botonConsultarProductosAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarProductosAlmacenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProductosEnAlmacenLayout = new javax.swing.GroupLayout(panelProductosEnAlmacen);
        panelProductosEnAlmacen.setLayout(panelProductosEnAlmacenLayout);
        panelProductosEnAlmacenLayout.setHorizontalGroup(
            panelProductosEnAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosEnAlmacenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductosEnAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelProductosEnAlmacenLayout.createSequentialGroup()
                        .addGroup(panelProductosEnAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaCodigoProductoAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelProductosEnAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoAlmacen, 0, 182, Short.MAX_VALUE)
                            .addComponent(campoCodigoProductoAlmacen)))
                    .addComponent(botonConsultarProductosAlmacen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(553, Short.MAX_VALUE))
        );
        panelProductosEnAlmacenLayout.setVerticalGroup(
            panelProductosEnAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosEnAlmacenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductosEnAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaAlmacen)
                    .addComponent(campoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelProductosEnAlmacenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCodigoProductoAlmacen)
                    .addComponent(campoCodigoProductoAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonConsultarProductosAlmacen)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelProductosEnPuntoDeVenta.setMaximumSize(new java.awt.Dimension(900, 100));
        panelProductosEnPuntoDeVenta.setMinimumSize(new java.awt.Dimension(900, 100));
        panelProductosEnPuntoDeVenta.setPreferredSize(new java.awt.Dimension(900, 100));

        etiquetaPuntoDeVenta.setText("Seleccione un punto de venta");

        campoPuntoDeVenta.setModel(new vistas.modelos.PuntoDeVentaComboBoxModel());

        etiquetaCodigoProductoPuntoDeVenta.setText("Ingrese el código del producto");

        botonConsultarProductosEnPuntoDeVenta.setText("Consultar");
        botonConsultarProductosEnPuntoDeVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarProductosEnPuntoDeVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelProductosEnPuntoDeVentaLayout = new javax.swing.GroupLayout(panelProductosEnPuntoDeVenta);
        panelProductosEnPuntoDeVenta.setLayout(panelProductosEnPuntoDeVentaLayout);
        panelProductosEnPuntoDeVentaLayout.setHorizontalGroup(
            panelProductosEnPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosEnPuntoDeVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductosEnPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelProductosEnPuntoDeVentaLayout.createSequentialGroup()
                        .addGroup(panelProductosEnPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaPuntoDeVenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiquetaCodigoProductoPuntoDeVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelProductosEnPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPuntoDeVenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoCodigoProductoPuntoDeVenta)))
                    .addComponent(botonConsultarProductosEnPuntoDeVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(549, Short.MAX_VALUE))
        );
        panelProductosEnPuntoDeVentaLayout.setVerticalGroup(
            panelProductosEnPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProductosEnPuntoDeVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelProductosEnPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelProductosEnPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaPuntoDeVenta)
                        .addComponent(campoPuntoDeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelProductosEnPuntoDeVentaLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelProductosEnPuntoDeVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoCodigoProductoPuntoDeVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiquetaCodigoProductoPuntoDeVenta))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonConsultarProductosEnPuntoDeVenta)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cantidad de productos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setLayout(new java.awt.BorderLayout());

        panelOpcion.setMaximumSize(new java.awt.Dimension(900, 80));
        panelOpcion.setMinimumSize(new java.awt.Dimension(900, 80));
        panelOpcion.setPreferredSize(new java.awt.Dimension(900, 80));

        botonProductosEnLote.setText("Cantidad de productos en lote");
        botonProductosEnLote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonProductosEnLoteMouseClicked(evt);
            }
        });

        botonProductosEnAlmacen.setText("Cantidad de productos en almacén");
        botonProductosEnAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonProductosEnAlmacenMouseClicked(evt);
            }
        });

        botonProductosEnPuntoDeVenta.setText("Cantidad de productos en punto de venta");
        botonProductosEnPuntoDeVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonProductosEnPuntoDeVentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionLayout = new javax.swing.GroupLayout(panelOpcion);
        panelOpcion.setLayout(panelOpcionLayout);
        panelOpcionLayout.setHorizontalGroup(
            panelOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(botonProductosEnLote)
                .addGap(18, 18, 18)
                .addComponent(botonProductosEnAlmacen)
                .addGap(18, 18, 18)
                .addComponent(botonProductosEnPuntoDeVenta)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        panelOpcionLayout.setVerticalGroup(
            panelOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelOpcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonProductosEnLote)
                    .addComponent(botonProductosEnAlmacen)
                    .addComponent(botonProductosEnPuntoDeVenta))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        add(panelOpcion, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void botonProductosEnLoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProductosEnLoteMouseClicked
        if(botonProductosEnLote.isSelected()) {
            removeAll();
            add(panelOpcion, BorderLayout.PAGE_START);
            add(panelProductosEnLote, BorderLayout.CENTER);
            panelProductosEnLote.setVisible(true);
            panelProductosEnLote.updateUI();
        }
    }//GEN-LAST:event_botonProductosEnLoteMouseClicked

    private void botonProductosEnAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProductosEnAlmacenMouseClicked
        if(botonProductosEnAlmacen.isSelected()) {
            removeAll();
            add(panelOpcion, BorderLayout.PAGE_START);
            add(panelProductosEnAlmacen, BorderLayout.CENTER);
            panelProductosEnAlmacen.setVisible(true);
            panelProductosEnAlmacen.updateUI();
        }
    }//GEN-LAST:event_botonProductosEnAlmacenMouseClicked

    private void botonProductosEnPuntoDeVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonProductosEnPuntoDeVentaMouseClicked
        if(botonProductosEnPuntoDeVenta.isSelected()) {
            removeAll();
            add(panelOpcion, BorderLayout.PAGE_START);
            add(panelProductosEnPuntoDeVenta, BorderLayout.CENTER);
            panelProductosEnPuntoDeVenta.setVisible(true);
            panelProductosEnPuntoDeVenta.updateUI();
        }
    }//GEN-LAST:event_botonProductosEnPuntoDeVentaMouseClicked

    private void botonConsultarProductosEnLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarProductosEnLoteActionPerformed
        try {
            Almacen almacen = (Almacen) campoAlmacenLote.getSelectedItem();
            String codigoLote = campoCodigoLote.getText();
            Double cantidad = loteJpaController.cantidadDeProductosEnLote(almacen, codigoLote);
            String msg = "El lote " + codigoLote + " tiene " + cantidad + " del producto";
            campoAlmacenLote.setSelectedItem(null);
            campoCodigoLote.setText("");
            JOptionPane.showMessageDialog(null, msg, "Cantidad de productos", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonConsultarProductosEnLoteActionPerformed

    private void botonConsultarProductosAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarProductosAlmacenActionPerformed
        try {
            Producto producto = productoJpaController.buscarProductoPorCodigo(campoCodigoProductoAlmacen.getText());
            Almacen almacen = (Almacen) campoAlmacen.getSelectedItem();
            Double cantidad = almacenJpaController.cantidadDeProductosEnAlmacen(almacen, producto);
            String msg = "El almacén N°" + almacen.getNumero() + " tiene " + cantidad + " " + producto.getUnidad().toString() + " del producto " + producto.getDescripcion();
            campoAlmacen.setSelectedItem(null);
            campoCodigoProductoAlmacen.setText("");
            JOptionPane.showMessageDialog(null, msg, "Cantidad de productos", JOptionPane.PLAIN_MESSAGE);
        } catch (CodigoProductoNoRegistradoException ex) {
            ex.mostrarDialogo();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonConsultarProductosAlmacenActionPerformed

    private void botonConsultarProductosEnPuntoDeVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarProductosEnPuntoDeVentaActionPerformed
        try {
            Producto producto = productoJpaController.buscarProductoPorCodigo(campoCodigoProductoPuntoDeVenta.getText());
            PuntoVenta puntoDeVenta = (PuntoVenta) campoPuntoDeVenta.getSelectedItem();
            Double cantidad = puntoDeVentaJpaController.cantidadDeProductosEnPuntoDeVenta(puntoDeVenta, producto);
            String msg = "El punto de venta N°" + puntoDeVenta.getNumero() + " tiene " + cantidad + " " + producto.getUnidad().toString() + " del producto " + producto.getDescripcion();
            campoPuntoDeVenta.setSelectedItem(null);
            campoCodigoProductoPuntoDeVenta.setText("");
            JOptionPane.showMessageDialog(null, msg, "Cantidad de productos", JOptionPane.PLAIN_MESSAGE);
        } catch (CodigoProductoNoRegistradoException ex) {
            ex.mostrarDialogo();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonConsultarProductosEnPuntoDeVentaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConsultarProductosAlmacen;
    private javax.swing.JButton botonConsultarProductosEnLote;
    private javax.swing.JButton botonConsultarProductosEnPuntoDeVenta;
    private javax.swing.JRadioButton botonProductosEnAlmacen;
    private javax.swing.JRadioButton botonProductosEnLote;
    private javax.swing.JRadioButton botonProductosEnPuntoDeVenta;
    private javax.swing.JComboBox campoAlmacen;
    private javax.swing.JComboBox campoAlmacenLote;
    private javax.swing.JTextField campoCodigoLote;
    private javax.swing.JTextField campoCodigoProductoAlmacen;
    private javax.swing.JTextField campoCodigoProductoPuntoDeVenta;
    private javax.swing.JComboBox campoPuntoDeVenta;
    private javax.swing.JLabel etiquetaAlmacen;
    private javax.swing.JLabel etiquetaAlmacenLote;
    private javax.swing.JLabel etiquetaCodigoLote;
    private javax.swing.JLabel etiquetaCodigoProductoAlmacen;
    private javax.swing.JLabel etiquetaCodigoProductoPuntoDeVenta;
    private javax.swing.JLabel etiquetaPuntoDeVenta;
    private javax.swing.ButtonGroup grupoDeBotones;
    private javax.swing.JPanel panelOpcion;
    private javax.swing.JPanel panelProductosEnAlmacen;
    private javax.swing.JPanel panelProductosEnLote;
    private javax.swing.JPanel panelProductosEnPuntoDeVenta;
    // End of variables declaration//GEN-END:variables
}
