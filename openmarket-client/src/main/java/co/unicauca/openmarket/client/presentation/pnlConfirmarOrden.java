/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.unicauca.openmarket.client.presentation;

import co.unicauca.openmarket.client.infra.Messages;
import co.unicauca.openmarket.commons.domain.Order;
import framework.obsobs.Observador;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author restr
 */
public class pnlConfirmarOrden extends javax.swing.JPanel implements Observador{

    /**
     * Creates new form pnlComprador
     */
    
    //private OrderService orderService;
    
    public pnlConfirmarOrden(/*OrderService orderService*/) {
        initComponents();
        initializeTable();
        //this.orderService = orderService;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtOrden = new javax.swing.JTextField();
        btnConfirmarOrden = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrdenes = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(700, 515));

        btnConfirmarOrden.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirmarOrden.setText("Confirmar");
        btnConfirmarOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarOrdenActionPerformed(evt);
            }
        });

        tblOrdenes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblOrdenes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtOrden)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmarOrden)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmarOrden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void initializeTable() {
        tblOrdenes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "Estatus", "Precio", "Fecha"
                }
        ));
    }

    private void fillTable(List<Order> listOrders) {
        initializeTable();
        DefaultTableModel model = (DefaultTableModel) tblOrdenes.getModel();

        Object rowData[] = new Object[4];//No columnas
        for (int i = 0; i < listOrders.size(); i++) {
            rowData[0] = listOrders.get(i).getId();
            rowData[1] = listOrders.get(i).getStatus();
            rowData[2] = listOrders.get(i).getPrice();
            rowData[3] = listOrders.get(i).getDate();

            model.addRow(rowData);
        }
    }
    
    private void btnConfirmarOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarOrdenActionPerformed
        if (txtOrden.getText().isEmpty()) {
            Messages.showMessageDialog("Debe ingresar el ID de la orden", "Atenci�n");
            txtOrden.requestFocus();
            return;
        }
        
        if (!correctFormatId(txtOrden.getText())) {
            Messages.showMessageDialog("Debe ingresar un dato numerico", "Atenci�n");
            txtOrden.requestFocus();
            return;
        }
        
        Messages.showMessageDialog("Orden confirmada", "Atenci�n");
    }//GEN-LAST:event_btnConfirmarOrdenActionPerformed

    private boolean correctFormatId(String id) {
        for (int i = 0; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmarOrden;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblOrdenes;
    private javax.swing.JTextField txtOrden;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar() {
        //fillTable(orderService.findByUser());
    }

}
