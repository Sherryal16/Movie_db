
import java.awt.Color;
import javax.swing.JOptionPane;

public class login_user extends javax.swing.JFrame {

    public login_user() {
        initComponents();        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
              
        setSize(600, 600);
         setLocationRelativeTo(null);
       
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        useremailloginlb = new javax.swing.JLabel();
        useremaillogintf = new javax.swing.JTextField();
        passloginlb = new javax.swing.JLabel();
        loginbt = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        passlogintf = new javax.swing.JPasswordField();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(null);

        useremailloginlb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        useremailloginlb.setForeground(new java.awt.Color(255, 255, 255));
        useremailloginlb.setText("USEREMAIL");
        getContentPane().add(useremailloginlb);
        useremailloginlb.setBounds(70, 100, 120, 20);

        useremaillogintf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useremaillogintfActionPerformed(evt);
            }
        });
        getContentPane().add(useremaillogintf);
        useremaillogintf.setBounds(300, 90, 230, 40);

        passloginlb.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        passloginlb.setForeground(new java.awt.Color(255, 255, 255));
        passloginlb.setText("PASSWORD");
        getContentPane().add(passloginlb);
        passloginlb.setBounds(70, 170, 130, 30);

        loginbt.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        loginbt.setText("LOGIN");
        loginbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtActionPerformed(evt);
            }
        });
        getContentPane().add(loginbt);
        loginbt.setBounds(210, 273, 150, 40);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 255));
        jLabel3.setText("        USER   LOGIN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 30, 280, 30);
        getContentPane().add(passlogintf);
        passlogintf.setBounds(300, 180, 230, 40);

        jButton9.setBackground(new java.awt.Color(51, 51, 51));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("<----");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(20, 10, 60, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void useremaillogintfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useremaillogintfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useremaillogintfActionPerformed

    private void loginbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtActionPerformed
        // TODO add your handling code here:
        String email = useremaillogintf.getText();
        String password = passlogintf.getText();
        try {
            String ans1 = movie_db_client.login_user(email, password);
            if (ans1.equals("login successfull")) {
                JOptionPane.showMessageDialog(rootPane, "login successfull");
                // JOptionPane.showMessageDialog(rootPane, " login success");
                home obj = new home();
                obj.setVisible(true);
            } else if (ans1.equals("login failed")) {
                JOptionPane.showMessageDialog(rootPane, "Login failed");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_loginbtActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        welcome_java obj=new welcome_java();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(login_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginbt;
    private javax.swing.JLabel passloginlb;
    private javax.swing.JPasswordField passlogintf;
    private javax.swing.JLabel useremailloginlb;
    private javax.swing.JTextField useremaillogintf;
    // End of variables declaration//GEN-END:variables
}
