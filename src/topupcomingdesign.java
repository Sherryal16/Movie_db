
public class topupcomingdesign extends javax.swing.JPanel {

    public topupcomingdesign() 
    {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlelb = new javax.swing.JLabel();
        photolb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        releasedtlb = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        overviewtf = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(null);

        titlelb.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        titlelb.setForeground(new java.awt.Color(255, 255, 255));
        titlelb.setText("                  /////////////");
        add(titlelb);
        titlelb.setBounds(40, 10, 230, 40);

        photolb.setForeground(new java.awt.Color(255, 255, 255));
        photolb.setText("//photo");
        add(photolb);
        photolb.setBounds(40, 60, 150, 130);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Release Date");
        add(jLabel3);
        jLabel3.setBounds(50, 210, 99, 30);

        releasedtlb.setForeground(new java.awt.Color(255, 255, 255));
        releasedtlb.setText("dd/mm/yyyy");
        add(releasedtlb);
        releasedtlb.setBounds(160, 210, 85, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("OVERVIEW");
        add(jLabel5);
        jLabel5.setBounds(110, 250, 80, 20);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(190, 80, 72, 23);

        overviewtf.setBackground(new java.awt.Color(0, 0, 0));
        overviewtf.setColumns(20);
        overviewtf.setForeground(new java.awt.Color(255, 255, 255));
        overviewtf.setRows(5);
        jScrollPane1.setViewportView(overviewtf);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 270, 270, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextArea overviewtf;
    public javax.swing.JLabel photolb;
    public javax.swing.JLabel releasedtlb;
    public javax.swing.JLabel titlelb;
    // End of variables declaration//GEN-END:variables
}