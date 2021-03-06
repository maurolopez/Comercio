package vistas;

import controladoresJPA.EgresoJpaController;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Egreso;
import modelo.LoteEgresado;
import vistas.modelos.EgresoTableModel;
import vistas.modelos.LoteEgresadoTableModel;

/**
 *
 * @author Mauro Federico Lopez
 */
public class ConsultaEgresosUI extends javax.swing.JPanel {

    private EgresoJpaController egresoJpaController;
    private EgresoTableModel egresoTableModel;
    private LoteEgresadoTableModel loteEgresadoTableModel;
    private ArrayList<Egreso> egresos = new ArrayList();

    /**
     * Creates new form ConsultaEgresosUI
     */
    public ConsultaEgresosUI() {
        initComponents();
        egresoJpaController = new EgresoJpaController();
        egresoTableModel = new EgresoTableModel();
        tablaEgresos.setModel(egresoTableModel);
        egresos = egresoJpaController.obtenerTodosLosEgresos();
        egresoTableModel.setEgresos(egresos);
        loteEgresadoTableModel = new LoteEgresadoTableModel();
        tablaLotesEgresados.setModel(loteEgresadoTableModel);
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
        etiquetaBuscarPorFecha = new javax.swing.JLabel();
        botonBuscarPorFecha = new javax.swing.JButton();
        etiquetaBuscarPorCodigo = new javax.swing.JLabel();
        campoCodigo = new javax.swing.JTextField();
        botonBuscarPorCodigo = new javax.swing.JButton();
        campoFecha = new com.toedter.calendar.JDateChooser();
        jspTablaEgresos = new javax.swing.JScrollPane();
        tablaEgresos = new javax.swing.JTable();
        panelObservaciones = new javax.swing.JPanel();
        jspTablaLotesEgresados = new javax.swing.JScrollPane();
        tablaLotesEgresados = new javax.swing.JTable();
        jspAreaDeTexto = new javax.swing.JScrollPane();
        areaDeTextoObservaciones = new javax.swing.JTextArea();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Egresos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(900, 500));
        setLayout(new java.awt.BorderLayout());

        panel.setMaximumSize(new java.awt.Dimension(900, 74));
        panel.setMinimumSize(new java.awt.Dimension(900, 74));

        etiquetaBuscarPorFecha.setText("Buscar egreso por fecha");

        botonBuscarPorFecha.setText("Buscar egreso por fecha");
        botonBuscarPorFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPorFechaActionPerformed(evt);
            }
        });

        etiquetaBuscarPorCodigo.setText("Buscar egreso por código");

        botonBuscarPorCodigo.setText("Buscar egreso por código");
        botonBuscarPorCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarPorCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiquetaBuscarPorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiquetaBuscarPorCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(campoFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonBuscarPorCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonBuscarPorFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(462, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(etiquetaBuscarPorFecha)
                        .addComponent(botonBuscarPorFecha))
                    .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaBuscarPorCodigo)
                    .addComponent(campoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscarPorCodigo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panel, java.awt.BorderLayout.PAGE_START);

        jspTablaEgresos.setMaximumSize(new java.awt.Dimension(900, 241));
        jspTablaEgresos.setMinimumSize(new java.awt.Dimension(900, 241));
        jspTablaEgresos.setPreferredSize(new java.awt.Dimension(900, 241));

        tablaEgresos.setModel(new vistas.modelos.EgresoTableModel());
        tablaEgresos.getTableHeader().setReorderingAllowed(false);
        tablaEgresos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEgresosMouseClicked(evt);
            }
        });
        jspTablaEgresos.setViewportView(tablaEgresos);

        add(jspTablaEgresos, java.awt.BorderLayout.CENTER);

        panelObservaciones.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        panelObservaciones.setMaximumSize(new java.awt.Dimension(900, 185));
        panelObservaciones.setMinimumSize(new java.awt.Dimension(900, 185));
        panelObservaciones.setPreferredSize(new java.awt.Dimension(900, 185));
        panelObservaciones.setLayout(new java.awt.BorderLayout());

        jspTablaLotesEgresados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lotes Egresados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), java.awt.Color.black)); // NOI18N
        jspTablaLotesEgresados.setMaximumSize(new java.awt.Dimension(900, 125));
        jspTablaLotesEgresados.setMinimumSize(new java.awt.Dimension(900, 125));
        jspTablaLotesEgresados.setPreferredSize(new java.awt.Dimension(900, 125));

        tablaLotesEgresados.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaLotesEgresados.getTableHeader().setReorderingAllowed(false);
        jspTablaLotesEgresados.setViewportView(tablaLotesEgresados);

        panelObservaciones.add(jspTablaLotesEgresados, java.awt.BorderLayout.CENTER);

        jspAreaDeTexto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Observaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jspAreaDeTexto.setMaximumSize(new java.awt.Dimension(900, 60));
        jspAreaDeTexto.setMinimumSize(new java.awt.Dimension(900, 60));
        jspAreaDeTexto.setPreferredSize(new java.awt.Dimension(900, 60));

        areaDeTextoObservaciones.setColumns(20);
        areaDeTextoObservaciones.setEditable(false);
        areaDeTextoObservaciones.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        areaDeTextoObservaciones.setRows(5);
        jspAreaDeTexto.setViewportView(areaDeTextoObservaciones);

        panelObservaciones.add(jspAreaDeTexto, java.awt.BorderLayout.PAGE_END);

        add(panelObservaciones, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarPorFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarPorFechaActionPerformed
        Date fecha = campoFecha.getDate();
        if(fecha != null) {
            egresos = egresoJpaController.obtenerEgresosPorFecha(fecha);
            egresoTableModel.setEgresos(egresos);
            campoFecha.updateUI();
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fecha.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonBuscarPorFechaActionPerformed

    private void botonBuscarPorCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarPorCodigoActionPerformed
        try {
            String codigo = campoCodigo.getText();
            Egreso egreso = egresoJpaController.obtenerEgresoPorCodigo(codigo);
            egresos = new ArrayList();
            egresos.add(egreso);
            egresoTableModel.setEgresos(egresos);
            campoCodigo.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonBuscarPorCodigoActionPerformed

    private void tablaEgresosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEgresosMouseClicked
        int selectedRow = tablaEgresos.getSelectedRow();
        if(selectedRow >= 0) {
            Egreso egreso = egresoTableModel.obtenerEgreso(selectedRow);
            ArrayList<LoteEgresado> lotesEgresados = egresoJpaController.obtenerLotesEgresados(egreso);
            loteEgresadoTableModel.setLotesEgresados(lotesEgresados);
            areaDeTextoObservaciones.setText(egreso.getObservaciones());
        }
    }//GEN-LAST:event_tablaEgresosMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaDeTextoObservaciones;
    private javax.swing.JButton botonBuscarPorCodigo;
    private javax.swing.JButton botonBuscarPorFecha;
    private javax.swing.JTextField campoCodigo;
    private com.toedter.calendar.JDateChooser campoFecha;
    private javax.swing.JLabel etiquetaBuscarPorCodigo;
    private javax.swing.JLabel etiquetaBuscarPorFecha;
    private javax.swing.JScrollPane jspAreaDeTexto;
    private javax.swing.JScrollPane jspTablaEgresos;
    private javax.swing.JScrollPane jspTablaLotesEgresados;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panelObservaciones;
    private javax.swing.JTable tablaEgresos;
    private javax.swing.JTable tablaLotesEgresados;
    // End of variables declaration//GEN-END:variables
}
