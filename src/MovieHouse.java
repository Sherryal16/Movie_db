
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.json.JSONArray;
import org.json.JSONObject;

public class MovieHouse extends javax.swing.JFrame {

    public MovieHouse() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.black);

        setSize(700, 600);
        setVisible(true);
        setLocationRelativeTo(null);

    }

    public static BufferedImage scale(BufferedImage src, int w, int h) {
        BufferedImage img
                = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        int x, y;
        int ww = src.getWidth();
        int hh = src.getHeight();
        int[] ys = new int[h];
        for (y = 0; y < h; y++) {
            ys[y] = y * hh / h;
        }
        for (x = 0; x < w; x++) {
            int newX = x * ww / w;
            for (y = 0; y < h; y++) {
                int col = src.getRGB(newX, ys[y]);
                img.setRGB(x, y, col);
            }
        }
        return img;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        searchtf = new javax.swing.JTextField();
        searchbt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("                     SEARCH MOVIE HOUSE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 10, 338, 28);

        searchtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtfActionPerformed(evt);
            }
        });
        getContentPane().add(searchtf);
        searchtf.setBounds(110, 60, 343, 40);

        searchbt.setText("SEARCH");
        searchbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtActionPerformed(evt);
            }
        });
        getContentPane().add(searchbt);
        searchbt.setBounds(230, 130, 97, 23);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(15, 186, 550, 290);

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

    private void searchtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtfActionPerformed

    private void searchbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtActionPerformed
        try {
            int x = 10;
            jPanel1.removeAll();//refresh
            String house = searchtf.getText();
            house = house.replaceAll(" ", "%20");
            String ans = movie_db_client.MovieHouse(house);
            System.out.println(ans);

            JSONObject mainobj = new JSONObject(ans);
            JSONArray arr = mainobj.getJSONArray("results");
            for (int i = 0; i < arr.length(); i++) {
                JSONObject subobj = (JSONObject) arr.get(i);

                MovieHouseDesign obj = new MovieHouseDesign();

                String photo = subobj.get("logo_path").toString();
                if (photo.equals("null")) {
                    continue;
                }

                String id = " ";
                if (subobj.has("id")) {
                    id = subobj.get("id").toString();
                    obj.namelb.setText(id);

                }

                //------------------------------------------------
                String logopath = subobj.get("logo_path").toString();

                try {
                    BufferedImage bi = ImageIO.read(new URL("https://image.tmdb.org/t/p/w200" + logopath));

                    bi = scale(bi, 180, 150);

                    obj.photolb.setIcon(new ImageIcon(bi));

                } catch (Exception e) {
                    e.printStackTrace();
                }

                obj.setBounds(x, 10, 250, 300);
                x = x + 290;//adding space within the panel printing
                jPanel1.add(obj);//addin one panel to other
                jPanel1.repaint();//kinda refresh
                obj.repaint();
                //--------------------------------------------------------
                System.out.println(id);
                //System.out.println();
                System.out.println(logopath);
                System.out.println("_____________________________________________");

                jPanel1.setPreferredSize(new Dimension(290 * arr.length(), 600));//scroll
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }


             }//GEN-LAST:event_searchbtActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        home obj = new home();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(MovieHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MovieHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MovieHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MovieHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovieHouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton searchbt;
    public javax.swing.JTextField searchtf;
    // End of variables declaration//GEN-END:variables
}
