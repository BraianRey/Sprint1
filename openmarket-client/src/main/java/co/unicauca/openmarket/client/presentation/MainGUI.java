/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.unicauca.openmarket.client.presentation;

/**
 *
 * @author restr
 */
public class MainGUI extends javax.swing.JFrame {

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        btnBuscarProductos = new javax.swing.JButton();
        btnComprarProductos = new javax.swing.JButton();
        btnCarritodeCompras = new javax.swing.JButton();
        btnConfirmarOrdenes = new javax.swing.JButton();
        btnPuntuarOrdenes = new javax.swing.JButton();
        btnCrearEditarProductos = new javax.swing.JButton();
        btnModificarStock = new javax.swing.JButton();
        bntBajaSuspender = new javax.swing.JButton();
        btnRegistrarEntrega = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pnlCentral = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OpenMarket");
        setMinimumSize(new java.awt.Dimension(860, 515));

        pnlMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlMenu.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        pnlMenu.setMinimumSize(new java.awt.Dimension(140, 515));
        pnlMenu.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 30, 25));

        btnBuscarProductos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarProductos.setText("Buscar Productos");
        pnlMenu.add(btnBuscarProductos);

        btnComprarProductos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnComprarProductos.setText("Comprar Productos");
        pnlMenu.add(btnComprarProductos);

        btnCarritodeCompras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCarritodeCompras.setText("Carrito de Compras");
        pnlMenu.add(btnCarritodeCompras);

        btnConfirmarOrdenes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnConfirmarOrdenes.setText("Confirmar Ordenes");
        pnlMenu.add(btnConfirmarOrdenes);

        btnPuntuarOrdenes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPuntuarOrdenes.setText("Puntuar Ordenes");
        pnlMenu.add(btnPuntuarOrdenes);

        btnCrearEditarProductos.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnCrearEditarProductos.setText("Crear/Editar Productos");
        pnlMenu.add(btnCrearEditarProductos);

        btnModificarStock.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificarStock.setText("Modificar Strock");
        btnModificarStock.setActionCommand("Modificar Stock");
        pnlMenu.add(btnModificarStock);

        bntBajaSuspender.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        bntBajaSuspender.setText("Dar de \nBaja/Suspender");
        pnlMenu.add(bntBajaSuspender);

        btnRegistrarEntrega.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarEntrega.setText("Registrar Entrega");
        pnlMenu.add(btnRegistrarEntrega);

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        pnlMenu.add(btnSalir);

        pnlCentral.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCentral, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntBajaSuspender;
    private javax.swing.JButton btnBuscarProductos;
    private javax.swing.JButton btnCarritodeCompras;
    private javax.swing.JButton btnComprarProductos;
    private javax.swing.JButton btnConfirmarOrdenes;
    private javax.swing.JButton btnCrearEditarProductos;
    private javax.swing.JButton btnModificarStock;
    private javax.swing.JButton btnPuntuarOrdenes;
    private javax.swing.JButton btnRegistrarEntrega;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel pnlCentral;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMenu;
    // End of variables declaration//GEN-END:variables
}