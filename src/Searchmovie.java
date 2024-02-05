
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.json.JSONArray;
import org.json.JSONObject;

public class Searchmovie extends javax.swing.JFrame {

    public Searchmovie() {
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        getContentPane().setBackground(Color.black);
        // Searchmovie();
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

        searchtf = new javax.swing.JTextField();
        searchbt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        searchtf.setBackground(new java.awt.Color(0, 0, 0));
        searchtf.setForeground(new java.awt.Color(255, 255, 255));
        searchtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchtfActionPerformed(evt);
            }
        });
        getContentPane().add(searchtf);
        searchtf.setBounds(140, 30, 300, 40);

        searchbt.setText("SEARCH");
        searchbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtActionPerformed(evt);
            }
        });
        getContentPane().add(searchbt);
        searchbt.setBounds(200, 90, 130, 23);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(718, 438));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 718, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 630, 380);

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
        try {// TODO add your handling code here:
            int count = 0;
            int x = 10;
            jPanel1.removeAll();//refresh
            String movie = searchtf.getText();
            movie = movie.replaceAll(" ", "%20");
            String ans = movie_db_client.SearchMovie(movie);
            System.out.println(ans);

            JSONObject mainobj = new JSONObject(ans);//main obj parsing
            JSONArray arr = mainobj.getJSONArray("results");
            for (int i = 0; i < arr.length(); i++) //each element of array=object !!!!!!!!!!!!
            {
                JSONObject subobj = (JSONObject) arr.get(i);

                topupcomingdesign obj = new topupcomingdesign();

                String photo = subobj.get("poster_path").toString();
                if (photo.equals("null")) {
                    continue;
                }
                String title = "";
                if (subobj.has("title")) {
                    title = subobj.get("title").toString();
                    obj.titlelb.setText(title);

                }
                if (subobj.has("name")) {
                    title = subobj.get("name").toString();
                    obj.titlelb.setText(title);
                }
                //----------------------------------------------------
                String overviewString = subobj.get("overview").toString();
                String overview = "";
                String[] n = overviewString.split("(?<=\\G.{" + 39 + "})");
                for (String string : n) {
                    overview += string + " " + "\n" + " ";
                }

                obj.overviewtf.setText(overview);
                //---------------------------------------
                String releasedate = "";
                if (subobj.has("first_air_date")) {
                    releasedate = subobj.get("first_air_date").toString();
                    obj.releasedtlb.setText(releasedate);
                }
                if (subobj.has("release_date")) {
                    releasedate = subobj.get("release_date").toString();
                    obj.releasedtlb.setText(releasedate);
                }

                int id = Integer.parseInt(subobj.get("id").toString());
                String ans1 = movie_db_client.checkButton(id);
                if (ans1.equals("success")) {
                    obj.jButton1.setText("ADDED");
                } else {
                    obj.jButton1.setText("ADD");
                }
                obj.jButton1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String ans = " ";
                        ans = movie_db_client.addfavmovies(id);
                        if (ans.equals("failed")) {
                            obj.jButton1.setText("ADD");
                        } else {
                            obj.jButton1.setText("ADDED");

                        }
                    }
                });
                //------------------------------------------------
                String posterpath = subobj.get("poster_path").toString();

                try {
                    BufferedImage bi = ImageIO.read(new URL("https://image.tmdb.org/t/p/w200" + posterpath));

                    bi = scale(bi, 180, 150);

                    obj.photolb.setIcon(new ImageIcon(bi));

                } catch (Exception e) {
                    e.printStackTrace();
                }

                obj.setBounds(x, 10, 310, 400);
                x = x + 330;//adding space within the panel printing
                jPanel1.add(obj);//addin one panel to other
                jPanel1.repaint();//kinda refresh
                obj.repaint();
                count = count + 1;
                //--------------------------------------------------------
                System.out.println(title);
                System.out.println(overview);
                System.out.println(releasedate);
                System.out.println(posterpath);
                System.out.println("_____________________________________________");
            }
            System.out.println("Count " + count);
            jPanel1.setPreferredSize(new Dimension(330 * count, 450));//scroll

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
            java.util.logging.Logger.getLogger(Searchmovie.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Searchmovie.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Searchmovie.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Searchmovie.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Searchmovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton9;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton searchbt;
    private javax.swing.JTextField searchtf;
    // End of variables declaration//GEN-END:variables
}
