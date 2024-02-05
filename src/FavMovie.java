
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.StringTokenizer;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import org.json.JSONObject;

public class FavMovie extends javax.swing.JFrame {

    /**
     * Creates new form FavMovie
     */
    public FavMovie() {
        initComponents();
        setVisible(true);
        setSize(600, 600);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.black);
        showfavmovies();


    }

    void showfavmovies() {
        int x = 10;
        jPanel1.removeAll();//refresh

        String ans = movie_db_client.showfavmovies();
        System.out.println(ans);
        ans = ans.trim();
        StringTokenizer st = new StringTokenizer(ans, ";");
        int count = st.countTokens();
        String api = "980d96176457a6e65b8bc282bcadccd4";
        for (int i = 0; i < count; i++) {
            int id = Integer.parseInt(st.nextToken());
            try {
                HttpResponse<String> response = Unirest.get("https://api.themoviedb.org/3/movie/" + id + "?api_key=" + api + "&language=en-US").asString();
                if (response.getStatus() == 200) {
                    String res = response.getBody();
                    JSONObject mainobj = new JSONObject(res);

                    toptrendingdesign obj = new toptrendingdesign();

                    String title = "";
                    if (mainobj.has("title")) {
                        title = mainobj.get("title").toString();
                        obj.titlelb.setText(title);

                    }
                    if (mainobj.has("name")) {
                        title = mainobj.get("name").toString();
                        obj.titlelb.setText(title);
                    }
                    //----------------------------------------------------
                  
                    String overviewString = mainobj.get("overview").toString();
                    String overview = "";
                    String[] n = overviewString.split("(?<=\\G.{" + 39 + "})");
                    for (String string : n) {
                        overview += string + " " + "\n" + " ";
                    }
                    
                    obj.overviewtf.setText(overview);
             
                  
                    //---------------------------------------
                    String releasedate = "";
                    if (mainobj.has("first_air_date")) {
                        releasedate = mainobj.get("first_air_date").toString();
                        obj.releasedtlb.setText(releasedate);
                    }
                    if (mainobj.has("release_date")) {
                        releasedate = mainobj.get("release_date").toString();
                        obj.releasedtlb.setText(releasedate);
                    }
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

                    String posterpath = mainobj.getString("poster_path").toString();

                    try {
                        java.awt.image.BufferedImage bi = ImageIO.read(new URL("https://image.tmdb.org/t/p/w200" + posterpath));

                        bi = scale(bi, obj.photolb.getWidth(), obj.photolb.getHeight());

                        obj.photolb.setIcon(new ImageIcon(bi));

                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    obj.setBounds(x, 10, 310, 350);
                    x = x + 330;//adding space within the panel printing
                    jPanel1.add(obj);//addin one panel to other
                    jPanel1.repaint();//kinda refresh
                    obj.repaint();

                    //--------------------------------------------------------
                    System.out.println(title);
                    System.out.println(overview);
                    System.out.println(releasedate);
                    System.out.println(posterpath);
                    System.out.println("_____________________________________________");
                }
                jPanel1.setPreferredSize(new Dimension(330 * count, 450));//scroll

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static java.awt.image.BufferedImage scale(java.awt.image.BufferedImage src, int w, int h) {
        java.awt.image.BufferedImage img
                = new java.awt.image.BufferedImage(w, h, java.awt.image.BufferedImage.TYPE_INT_RGB);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("                               YOUR FAVOURITE MOVIES!!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(96, 0, 500, 36);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 564, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 70, 566, 400);

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

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        UserEditProfile obj=new UserEditProfile();
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
            java.util.logging.Logger.getLogger(FavMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FavMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FavMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FavMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FavMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
