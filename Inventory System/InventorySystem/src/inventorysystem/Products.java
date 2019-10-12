/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Joshua's
 */
public class Products extends javax.swing.JFrame {

    GlobalVariables cnn = new GlobalVariables();

    //GlobalVariables
    /**
     * Creates new form Products
     */
    public Products() {
        initComponents();
        this.setLocationRelativeTo(null);
        view();
        

    }

    public boolean isCellEditable(int row, int column) {
        return false;
    }
   

    public void close() {

        WindowEvent close = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(close);
    }

    public void view() {
        try {

            if (!cnn.conn.isClosed()) {

                String sql = "select * from products";

                cnn.ps = cnn.conn.prepareStatement(sql);
                cnn.rs = cnn.ps.executeQuery();
                DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
                tm.setRowCount(0);

                while (cnn.rs.next()) {

                    Object o[] = {cnn.rs.getInt("ProductId"), cnn.rs.getString("ProductName"), cnn.rs.getString("ProductSpec"), cnn.rs.getString("ProductType")};
                    tm.addRow(o);

                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, "Connection Error", "CALL YOUR ADMINISTRATOR", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void delete() {

        try {
            int index = jTable1.getSelectedRow();

            TableModel model = jTable1.getModel();
            String ProductId = model.getValueAt(index, 0).toString();

            if (!cnn.conn.isClosed()) {

                String sql = "delete from products where ProductId='" + ProductId + "'";
                cnn.ps = cnn.conn.prepareStatement(sql);
                cnn.ps.executeUpdate();

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, "Connection Error", "CALL YOUR ADMINISTRATOR", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void update() {
        try {
            int index = jTable1.getSelectedRow();
            TableModel model = jTable1.getModel();
            String ProductId = model.getValueAt(index, 0).toString();

            if (!cnn.conn.isClosed()) {

                String sql = "select * from products where ProductId='" + ProductId + "'";

                cnn.ps = cnn.conn.prepareStatement(sql);
                cnn.rs = cnn.ps.executeQuery();
                DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
                tm.setRowCount(0);

                if (cnn.rs.next()) {
                    String ProductName = (cnn.rs.getString(2));
                    String Specification = (cnn.rs.getString(3));
                    String Producttype = (cnn.rs.getString(4));
                    String Productbrand = (cnn.rs.getString(5));
                    String Packagingtype = (cnn.rs.getString(6));
                    String Quantityperpack = (cnn.rs.getString(7));
                    String Description = (cnn.rs.getString(8));

                    jtRowData.setVisible(true);
                    jtRowData.pack();
                    jtRowData.setLocationRelativeTo(null);
                    jtRowData.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    jtRowData.Productid.setText(ProductId);
                    jtRowData.Productname.setText(ProductName);
                    jtRowData.Specification.setSelectedItem(Specification);
                    jtRowData.Producttype.setSelectedItem(Producttype);
                    jtRowData.Productbrand.setSelectedItem(Productbrand);
                    jtRowData.Packagingtype.setSelectedItem(Packagingtype);
                    jtRowData.Quantityperpack.setText(Quantityperpack);
                    jtRowData.Description.setText(Description);

                }

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, "Connection Error", "CALL YOUR ADMINISTRATOR", JOptionPane.ERROR_MESSAGE);
        }

    }
    UpdateProduct jtRowData = new UpdateProduct();
    ViewProduct jtRowData1 = new ViewProduct();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 204));
        jLabel2.setText("Product Master");

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(153, 0, 0));
        jButton2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorysystem/back.png"))); // NOI18N
        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, 30));

        jButton5.setBackground(new java.awt.Color(0, 102, 0));
        jButton5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorysystem/addproduct.png"))); // NOI18N
        jButton5.setText("Add New Product");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 30));

        jTextField1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 820, 30));

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTable1.setBackground(new java.awt.Color(0, 204, 204));
        jTable1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153), new java.awt.Color(0, 153, 153)));
        jTable1.setFont(new java.awt.Font("Serif", 3, 20));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", "", null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ProductId", "ProductName", "ProductSpec", "ProductType"
            }
        ));
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(0, 51, 102));
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 940, 500));

        jButton7.setBackground(new java.awt.Color(204, 204, 0));
        jButton7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorysystem/edit.png"))); // NOI18N
        jButton7.setText("Edit Product");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        jButton8.setBackground(new java.awt.Color(153, 0, 0));
        jButton8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorysystem/delete.png"))); // NOI18N
        jButton8.setText("Delete Product");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, 30));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorysystem/search.png"))); // NOI18N
        jLabel3.setText("Search:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorysystem/mainbackground.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 580));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        close();
        new MainWindow().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new AddProduct().setVisible(true);
        this.hide();    // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            try {
                int index = jTable1.getSelectedRow();

                TableModel model = jTable1.getModel();
                String ProductId = model.getValueAt(index, 0).toString();

                if (!cnn.conn.isClosed()) {

                    String sql = "select * from products where ProductId='" + ProductId + "'";

                    cnn.ps = cnn.conn.prepareStatement(sql);
                    cnn.rs = cnn.ps.executeQuery();
                    if (cnn.rs.next()) {
                        String ProductName = (cnn.rs.getString(2));
                        String Specification = (cnn.rs.getString(3));
                        String Producttype = (cnn.rs.getString(4));
                        String Productbrand = (cnn.rs.getString(5));
                        String Packagingtype = (cnn.rs.getString(6));
                        String Quantityperpack = (cnn.rs.getString(7));
                        String Description = (cnn.rs.getString(8));

                        jtRowData1.setVisible(true);
                        jtRowData1.pack();
                        jtRowData1.setLocationRelativeTo(null);
                        jtRowData1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        jtRowData1.Productid.setText(ProductId);
                        jtRowData1.Productname.setText(ProductName);
                        jtRowData1.Specification.setSelectedItem(Specification);
                        jtRowData1.Producttype.setSelectedItem(Producttype);
                        jtRowData1.Productbrand.setSelectedItem(Productbrand);
                        jtRowData1.Packagingtype.setSelectedItem(Packagingtype);
                        jtRowData1.Quantityperpack.setText(Quantityperpack);
                        jtRowData1.Description.setText(Description);

                    }

                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "Connection Error", "CALL YOUR ADMINISTRATOR", JOptionPane.ERROR_MESSAGE);

            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want to Update Product?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            update();

        } else if (response == JOptionPane.NO_OPTION) {

        } else if (response == JOptionPane.CLOSED_OPTION) {

        }
        view();// TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int response = JOptionPane.showConfirmDialog(this, "Do you want to Update Product?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            delete();
            view();
        } else if (response == JOptionPane.NO_OPTION) {

        } else if (response == JOptionPane.CLOSED_OPTION) {

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Products.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Products().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
