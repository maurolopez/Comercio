package vistas;

import controladoresJPA.VentaJpaController;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import modelo.ItemVenta;
import modelo.Marca;
import vistas.modelos.ProductoVendidoTableModel;

/**
 *
 * @author Mauro Federico Lopez
 */
public class VentasPorMarcaUI extends javax.swing.JPanel {

    private VentaJpaController ventaJpaController;
    private ProductoVendidoTableModel productoVendidoTableModel;

    /**
     * Creates new form VentasPorMarcaUI
     */
    public VentasPorMarcaUI() {
        initComponents();
        ventaJpaController = new VentaJpaController();
        productoVendidoTableModel = new ProductoVendidoTableModel();
        tablaVentas.setModel(productoVendidoTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaMarca = new javax.swing.JLabel();
        campoMarca = new javax.swing.JComboBox();
        jsp = new javax.swing.JScrollPane();
        tablaVentas = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas por marca", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setPreferredSize(new java.awt.Dimension(900, 500));
        setLayout(new java.awt.BorderLayout());

        panel.setMaximumSize(new java.awt.Dimension(900, 42));
        panel.setMinimumSize(new java.awt.Dimension(900, 42));

        etiquetaMarca.setText("Seleccione una marca");

        campoMarca.setModel(new vistas.modelos.MarcaComboBoxModel());
        campoMarca.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                campoMarcaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(538, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaMarca)
                    .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panel, java.awt.BorderLayout.PAGE_START);

        tablaVentas.setAutoCreateRowSorter(true);
        tablaVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaVentas.getTableHeader().setReorderingAllowed(false);
        jsp.setViewportView(tablaVentas);

        add(jsp, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void campoMarcaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_campoMarcaItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED) {
            Marca marca = (Marca) campoMarca.getSelectedItem();
            ArrayList<ItemVenta> ventasPorMarca = ventaJpaController.obtenerVentasPorMarca(marca);
            productoVendidoTableModel.setProductosVendidos(ventasPorMarca);
        }
    }//GEN-LAST:event_campoMarcaItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox campoMarca;
    private javax.swing.JLabel etiquetaMarca;
    private javax.swing.JScrollPane jsp;
    private javax.swing.JPanel panel;
    private javax.swing.JTable tablaVentas;
    // End of variables declaration//GEN-END:variables
}
