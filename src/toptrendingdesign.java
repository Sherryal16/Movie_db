
public class toptrendingdesign extends javax.swing.JPanel {

    public toptrendingdesign() {
        initComponents();
        setSize(700, 1000);
        // getContentPane().setBackground(Color.pink);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titlelb = new javax.swing.JLabel();
        photolb = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        releasedtlb = new javax.swing.JLabel();
        overviewlb = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        overviewtf = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 0, 0));
        setLayout(null);

        titlelb.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        titlelb.setForeground(new java.awt.Color(255, 255, 255));
        titlelb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titlelb.setText("///////////////////////");
        add(titlelb);
        titlelb.setBounds(10, 10, 260, 30);

        photolb.setForeground(new java.awt.Color(255, 255, 255));
        photolb.setText("//photo");
        add(photolb);
        photolb.setBounds(70, 40, 150, 120);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Release Date");
        add(jLabel3);
        jLabel3.setBounds(30, 170, 110, 30);

        releasedtlb.setForeground(new java.awt.Color(255, 255, 255));
        releasedtlb.setText("dd/mm/yyyy");
        add(releasedtlb);
        releasedtlb.setBounds(150, 180, 100, 20);

        overviewlb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        overviewlb.setForeground(new java.awt.Color(255, 255, 255));
        overviewlb.setText("OVERVIEW");
        add(overviewlb);
        overviewlb.setBounds(100, 210, 90, 30);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(220, 40, 70, 23);

        overviewtf.setBackground(new java.awt.Color(0, 0, 0));
        overviewtf.setColumns(20);
        overviewtf.setForeground(new java.awt.Color(255, 255, 255));
        overviewtf.setRows(5);
        jScrollPane1.setViewportView(overviewtf);

        add(jScrollPane1);
        jScrollPane1.setBounds(10, 240, 300, 86);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel overviewlb;
    public javax.swing.JTextArea overviewtf;
    public javax.swing.JLabel photolb;
    public javax.swing.JLabel releasedtlb;
    public javax.swing.JLabel titlelb;
    // End of variables declaration//GEN-END:variables
}
