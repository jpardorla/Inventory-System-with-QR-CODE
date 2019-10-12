/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author COLLEGE7
 */
public class AddProduct extends javax.swing.JFrame {

        GlobalVariables cnn = new GlobalVariables();
    /**
     * Creates new form AddProduct
     */
    public AddProduct() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public void clear(){
            Productname.setText(null);
            Specification.setSelectedItem(null);
            Producttype.setSelectedItem(null);
            Productbrand.setSelectedItem(null);
            Packagingtype.setSelectedItem(null);
            Quantityperpack.setText(null);
            Description.setText(null);
    }
    public void close() {

        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    public void addproduct() {
        try {
            if (!cnn.conn.isClosed()) {
            Statement stmt = (Statement) cnn.conn.createStatement();
            int ProductId = 0;
            String ProductName = Productname.getText();
            Object ProductSpec = Specification.getSelectedItem();
            Object ProductType = Producttype.getSelectedItem();
            Object ProductBrand = Productbrand.getSelectedItem();
            Object PackType = Packagingtype.getSelectedItem();
            String PackQuantity = Quantityperpack.getText();
            String ProductDescription = Description.getText();

            String sql = "INSERT INTO products VALUES('" + ProductId + "','" + ProductName + "','" + ProductSpec + "','" + ProductType + "'"
                    + ",'" + ProductBrand + "','" + PackType + "','" + PackQuantity + "','" + ProductDescription + "');";
            stmt.executeUpdate(sql);
            clear();


            JOptionPane.showMessageDialog(rootPane, "Successfully Added Product to Database:", "Successfully Added", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, "Connection Error", "CALL YOUR ADMINISTRATOR", JOptionPane.ERROR_MESSAGE);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Productname = new javax.swing.JTextField();
        Producttype = new javax.swing.JComboBox<>();
        Productbrand = new javax.swing.JComboBox<>();
        Specification = new javax.swing.JComboBox<>();
        Quantityperpack = new javax.swing.JTextField();
        Packagingtype = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Description = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Productid = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        addproduct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Productname.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(Productname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 340, 30));

        Producttype.setBackground(new java.awt.Color(0, 102, 102));
        Producttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beverage", "Breads and Pastries", "Toiletreis", "Canned Goods", "Frozen Foods", "Kitchen Items" }));
        jPanel1.add(Producttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 340, 30));

        Productbrand.setBackground(new java.awt.Color(0, 102, 102));
        Productbrand.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Uniliver", "Nestle", "San Miguel Corp.", "Procter and Gamble", "Rebisco", "NutriAsia", "Nissin", "Coca-Cola", " ", " " }));
        jPanel1.add(Productbrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 340, 30));

        Specification.setBackground(new java.awt.Color(0, 102, 102));
        Specification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10ml", "20ml", "30ml", "100ml", "200ml", "300ml", "400ml", "500ml", "600ml", "700ml", "800ml", "900ml", "1Liter", " " }));
        jPanel1.add(Specification, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 90, 30));

        Quantityperpack.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(Quantityperpack, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 70, 30));

        Packagingtype.setBackground(new java.awt.Color(0, 102, 102));
        Packagingtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Box", "Plastic", " ", " " }));
        jPanel1.add(Packagingtype, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 90, 30));

        Description.setColumns(20);
        Description.setRows(5);
        jScrollPane1.setViewportView(Description);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 350, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Description:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Specification:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Quantity per package:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, 30));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Packaging Type:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Product Brand:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Product Type:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Product Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("ADD PRODUCT");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Productid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(Productid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 45, 23));

        jButton1.setBackground(new java.awt.Color(153, 0, 0));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        addproduct.setBackground(new java.awt.Color(0, 102, 0));
        addproduct.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        addproduct.setText("Add Product");
        addproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addproductActionPerformed(evt);
            }
        });
        jPanel2.add(addproduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 540, 480));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        new Products().setVisible(true); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproductActionPerformed
        addproduct(); // TODO add your handling code here:
    }//GEN-LAST:event_addproductActionPerformed

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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Description;
    private javax.swing.JComboBox<String> Packagingtype;
    private javax.swing.JComboBox<String> Productbrand;
    private javax.swing.JLabel Productid;
    private javax.swing.JTextField Productname;
    private javax.swing.JComboBox<String> Producttype;
    private javax.swing.JTextField Quantityperpack;
    private javax.swing.JComboBox<String> Specification;
    private javax.swing.JButton addproduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
