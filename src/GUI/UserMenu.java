/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Database.Koneksi;
import static GUI.OrderDesktop.nama;
import static GUI.OrderDesktop.usernameee;
import static GUI.OrderLaptop.alamat1;
import static GUI.OrderLaptop.nama1;
import static GUI.OrderLaptop.usernameee1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static GUI.OrderLaptop.email1;
import static GUI.OrderDesktop.Email;
import static GUI.OrderDesktop.alamat;
import static GUI.UserLogin.usernameTextuser;

/**
 *
 * @author acer
 */
public class UserMenu extends javax.swing.JFrame {

    /**
     * Creates new form UserMenu
     */
    OrderDesktop OrderDesktop;
    OrderLaptop OrderLaptop;
    UserLogin UserLogin;
    public ResultSet rs;
    public Statement st;
    public UserMenu() {
        initComponents();
        setLocationRelativeTo(this);
    }
    Connection c = Koneksi.getKoneksi();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lgtLbl = new javax.swing.JLabel();
        ordrDesk = new javax.swing.JLabel();
        ordrLap = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UserMenu");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lgtLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lgtLblMouseClicked(evt);
            }
        });
        jPanel1.add(lgtLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1184, 30, 70, 50));

        ordrDesk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordrDeskMouseClicked(evt);
            }
        });
        jPanel1.add(ordrDesk, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 290, 70));

        ordrLap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordrLapMouseClicked(evt);
            }
        });
        jPanel1.add(ordrLap, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, 290, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/userMenu1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lgtLblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lgtLblMouseClicked
        UserLogin = new UserLogin();
        UserLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lgtLblMouseClicked

    private void ordrDeskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordrDeskMouseClicked
        try{
            String sql ="SELECT * FROM `user` WHERE username = '"+usernameTextuser.getText()+"'";
            st=c.createStatement();
            ResultSet rs =st.executeQuery(sql);
            if(rs.next()){
                OrderDesktop = new OrderDesktop();
                OrderDesktop.setVisible(true);
                this.dispose();
                usernameee.setText(rs.getString(4));
                nama.setText(rs.getString(1));
                alamat.setText(rs.getString(2));
                Email.setText(rs.getString(3));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_ordrDeskMouseClicked

    private void ordrLapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordrLapMouseClicked
        try{
            String sql ="SELECT * FROM `user` WHERE username = '"+usernameTextuser.getText()+"'";
            st=c.createStatement();
            ResultSet rs =st.executeQuery(sql);
            if(rs.next()){
                OrderLaptop = new OrderLaptop();
                OrderLaptop.setVisible(true);
                this.dispose();
                usernameee1.setText(rs.getString(4));
                nama1.setText(rs.getString(1));
                alamat1.setText(rs.getString(2));
                email1.setText(rs.getString(3));
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        this.dispose();
    }//GEN-LAST:event_ordrLapMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lgtLbl;
    private javax.swing.JLabel ordrDesk;
    private javax.swing.JLabel ordrLap;
    // End of variables declaration//GEN-END:variables
}
