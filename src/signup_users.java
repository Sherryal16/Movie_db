
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class signup_users extends javax.swing.JFrame {

    public signup_users() {
        initComponents();
        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        usernamelb = new javax.swing.JLabel();
        usernametf = new javax.swing.JTextField();
        emaillb = new javax.swing.JLabel();
        emailtf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passtf = new javax.swing.JPasswordField();
        addresslb = new javax.swing.JLabel();
        addresstf = new javax.swing.JTextField();
        photo = new javax.swing.JLabel();
        lb_ph = new javax.swing.JLabel();
        chooseph = new javax.swing.JButton();
        createacc = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calisto MT", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("           USER SIGNUP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 10, 300, 70);

        usernamelb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        usernamelb.setForeground(new java.awt.Color(255, 255, 255));
        usernamelb.setText("USERNAME");
        getContentPane().add(usernamelb);
        usernamelb.setBounds(120, 90, 130, 30);
        getContentPane().add(usernametf);
        usernametf.setBounds(310, 90, 190, 30);

        emaillb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emaillb.setForeground(new java.awt.Color(255, 255, 255));
        emaillb.setText("EMAIL");
        getContentPane().add(emaillb);
        emaillb.setBounds(120, 160, 130, 30);
        getContentPane().add(emailtf);
        emailtf.setBounds(311, 160, 190, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 230, 130, 30);
        getContentPane().add(passtf);
        passtf.setBounds(310, 230, 190, 30);

        addresslb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addresslb.setForeground(new java.awt.Color(255, 255, 255));
        addresslb.setText("ADDRESS");
        getContentPane().add(addresslb);
        addresslb.setBounds(120, 300, 100, 30);
        getContentPane().add(addresstf);
        addresstf.setBounds(310, 300, 240, 50);

        photo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        photo.setForeground(new java.awt.Color(255, 255, 255));
        photo.setText("PHOTO");
        getContentPane().add(photo);
        photo.setBounds(120, 390, 80, 20);

        lb_ph.setForeground(new java.awt.Color(204, 204, 255));
        lb_ph.setText("photo preview");
        getContentPane().add(lb_ph);
        lb_ph.setBounds(280, 376, 110, 100);

        chooseph.setText("Choose photo");
        chooseph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choosephActionPerformed(evt);
            }
        });
        getContentPane().add(chooseph);
        chooseph.setBounds(450, 400, 104, 50);

        createacc.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        createacc.setText("CREATE NEW ACCOUNT");
        createacc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccActionPerformed(evt);
            }
        });
        getContentPane().add(createacc);
        createacc.setBounds(150, 513, 280, 40);

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
File ph;
    private void choosephActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choosephActionPerformed

        JFileChooser jfc = new JFileChooser();
        int ans = jfc.showOpenDialog(this);
        if (ans == JFileChooser.APPROVE_OPTION) {
            ph = jfc.getSelectedFile();
            ImageIcon ic = new ImageIcon(ph.getPath());
            Image img = ic.getImage().getScaledInstance(lb_ph.getWidth(), lb_ph.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon ic1 = new ImageIcon(img);
            lb_ph.setIcon(ic1);

        }


    }//GEN-LAST:event_choosephActionPerformed

    private void createaccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccActionPerformed

        String username = usernametf.getText();
        String email = emailtf.getText();
        String password = passtf.getText();
        String address = addresstf.getText();

        int otp = (int) (1000 + (9999 - 1000) * Math.random());
        sendemail obj2 = new sendemail(email, "Your OTP for Movie DB Project", otp + "");

        int ans2 = Integer.parseInt(JOptionPane.showInputDialog("Enter The OTP"));

        if (otp == ans2) {
            JOptionPane.showMessageDialog(this, "OTP Matched Successfully");

            String ans = movie_db_client.signup_users(username, email, password, address, ph);

            if (ans.equals("success")) {
                JOptionPane.showMessageDialog(rootPane, "success");
                home obj = new home();
                 obj.setVisible(true);

            } else if (ans.equals("fail")) {
                JOptionPane.showMessageDialog(rootPane, "signup failed");

            }

        } else {
            JOptionPane.showMessageDialog(this, "Wrong OTP");
        }

//        String ans = movie_db_client.signup_users(username, email, password, address, ph);
//
//        if (ans.equals("success")) {
//            JOptionPane.showMessageDialog(rootPane, "success");
//            home obj = new home();
//            // obj.setVisible(true);
//
//        } else if (ans.equals("fail")) {
//            JOptionPane.showMessageDialog(rootPane, "signup failed");
//
//        }
    }//GEN-LAST:event_createaccActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        welcome_java obj = new welcome_java();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(signup_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signup_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signup_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signup_users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signup_users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addresslb;
    private javax.swing.JTextField addresstf;
    private javax.swing.JButton chooseph;
    private javax.swing.JButton createacc;
    private javax.swing.JLabel emaillb;
    private javax.swing.JTextField emailtf;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_ph;
    private javax.swing.JPasswordField passtf;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel usernamelb;
    private javax.swing.JTextField usernametf;
    // End of variables declaration//GEN-END:variables
}
