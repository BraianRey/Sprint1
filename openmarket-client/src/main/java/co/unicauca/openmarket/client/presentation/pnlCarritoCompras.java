/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package co.unicauca.openmarket.client.presentation;

import co.unicauca.openmarket.client.infra.Messages;
import co.unicauca.openmarket.commons.domain.Product;
import framework.obsobs.Observador;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author restr
 */
public class pnlCarritoCompras extends javax.swing.JPanel implements Observador {

    /**
     * Creates new form pnlComprador
     */
    
    //private ShoppingCartService shoppingcartService;
    
    public pnlCarritoCompras(/*ShoppingCartService shoppingcartService*/) {
        initComponents();
        initializeTable();
        //this.shoppingcartService = shoppingcartService;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarrito = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnComprarCarrito = new javax.swing.JButton();
        btnEliminarCarrito = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(700, 515));

        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblCarrito);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 5));

        btnComprarCarrito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnComprarCarrito.setText("Comprar Carrito");
        btnComprarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarCarritoActionPerformed(evt);
            }
        });
        jPanel1.add(btnComprarCarrito);

        btnEliminarCarrito.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminarCarrito.setText("Eliminar Carrito");
        btnEliminarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCarritoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarCarrito);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarCarritoActionPerformed
        Messages.showMessageDialog("Carrito comprado", "Atenci�n");
    }//GEN-LAST:event_btnComprarCarritoActionPerformed

    private void btnEliminarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCarritoActionPerformed
        Messages.showMessageDialog("Carrito Eliminado", "Atenci�n");
    }//GEN-LAST:event_btnEliminarCarritoActionPerformed

    private void initializeTable() {
        tblCarrito.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ID", "Nombre", "Descripcion", "Precio", "Stock", "Latitud", "Longitud", "Categoria"
                }
        ));
    }

    private void fillTable(List<Product> listProducts) {
        initializeTable();
        DefaultTableModel model = (DefaultTableModel) tblCarrito.getModel();

        Object rowData[] = new Object[7];//No columnas
        for (int i = 0; i < listProducts.size(); i++) {
            rowData[0] = listProducts.get(i).getId();
            rowData[1] = listProducts.get(i).getName();
            rowData[2] = listProducts.get(i).getDescription();
            rowData[3] = listProducts.get(i).getPrice();
            rowData[4] = listProducts.get(i).getStock();
            rowData[5] = listProducts.get(i).getLatitude();
            rowData[6] = listProducts.get(i).getLongitude();
            rowData[7] = listProducts.get(i).getCategory().getName();

            model.addRow(rowData);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarCarrito;
    private javax.swing.JButton btnEliminarCarrito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCarrito;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actualizar() {
        //fillTable(shoppingcartService.findAll());
    }

}
