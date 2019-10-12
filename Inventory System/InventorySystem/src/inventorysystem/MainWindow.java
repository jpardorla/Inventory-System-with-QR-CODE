/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystem;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public class MainWindow extends javax.swing.JFrame {

        int mousepX;
        int mousepY;
    //public Boolean isAdmin =false;
    /**
     * Creates new form MainWindow
     */
    GlobalVariables user;
    GlobalVariables userid;// = new GlobalVariables();

    public MainWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        showTime();
        showDate();
        Seticon();
        jLabel2.setText(String.valueOf(userid));
        

        // System.out.print(user.isAdmin);
        if (user.isAdmin) {

            mnuRegister.show();
            productmaster.show();
        } else {
            mnuRegister.hide();
            productmaster.hide();

        }

    }

       void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        date.setText(s.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                time.setText(s.format(d));
            }

        }
        ).start();
    }
    public void close() {

        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

//   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        date2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        productmaster = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        mnuRegister = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setUndecorated(true);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 204)));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date2.setForeground(new java.awt.Color(255, 255, 255));
        date2.setText("Date:");
        jPanel1.add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 420, 50, 20));

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 420, 120, 20));

        date1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date1.setForeground(new java.awt.Color(255, 255, 255));
        date1.setText("Time:");
        jPanel1.add(date1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 440, 50, 20));

        time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 110, 20));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 400, 150, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/inventorysystem/main123.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, -1, -1));

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 102));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inventory System", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(0, 102, 102))); // NOI18N
        jMenuBar1.setForeground(new java.awt.Color(0, 102, 102));

        jMenu3.setBorder(null);
        jMenu3.setForeground(new java.awt.Color(0, 0, 51));
        jMenu3.setText("Account");
        jMenu3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("UserDescription");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu2.setBackground(new java.awt.Color(0, 102, 102));
        jMenu2.setForeground(new java.awt.Color(0, 0, 51));
        jMenu2.setText("Products");
        jMenu2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        productmaster.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        productmaster.setText("Product Master");
        productmaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productmasterActionPerformed(evt);
            }
        });
        jMenu2.add(productmaster);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText("Receive Product");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Disposed Product");
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        mnuRegister.setForeground(new java.awt.Color(0, 0, 51));
        mnuRegister.setText("Register");
        mnuRegister.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        mnuRegister.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnuRegisterMenuSelected(evt);
            }
        });
        mnuRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuRegisterMouseClicked(evt);
            }
        });
        mnuRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRegisterActionPerformed(evt);
            }
        });

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem4.setText("Register User");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnuRegister.add(jMenuItem4);

        jMenuBar1.add(mnuRegister);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuRegisterMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuRegisterMouseClicked

    private void mnuRegisterMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnuRegisterMenuSelected
        // new Registration().setVisible(true); // TODO add your handling code here:


    }//GEN-LAST:event_mnuRegisterMenuSelected

    private void mnuRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuRegisterActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        close();
        new LoginForm().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new Usedescription().setVisible(true);
        this.hide();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void productmasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productmasterActionPerformed
        new Products().setVisible(true);
        this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_productmasterActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Registration x = new Registration();

        x.setVisible(true);
        close();

        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        new Receiving().setVisible(true);
        this.hide();// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        mousepX = evt.getX();
        mousepY = evt.getY();        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int coordinateX = evt.getXOnScreen();
        int coordinateY = evt.getYOnScreen();
        this.setLocation(coordinateX - mousepX, coordinateY - mousepY);        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MouseDragged
    
    private void Seticon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));

    }
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel date2;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mnuRegister;
    private javax.swing.JMenuItem productmaster;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
