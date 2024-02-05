//friends,hera pheri,welcome//////////
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import org.json.JSONArray;
import org.json.JSONObject;

public class MultiSeach extends javax.swing.JFrame {

    String res = "";

    public MultiSeach(String ans) {
        initComponents();
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        setSize(700, 600);
        setLocationRelativeTo(null);
        setVisible(true);

        res = ans;
        MultiSearch();
    }

    void MultiSearch() {
        int x = 10;
        jPanel1.removeAll();//refresh
        String ans = movie_db_client.searchMulti(res);
        System.out.println(ans);
        try {
            JSONObject mainobj = new JSONObject(ans);
            JSONArray arr = mainobj.getJSONArray("results");
            for (int i = 0; i < arr.length(); i++) {
                JSONObject subobj = (JSONObject) arr.get(i);

                toptrendingdesign obj = new toptrendingdesign();

                String title = "";
                if (subobj.has("title")) {
                    title = subobj.get("title").toString();
                    obj.titlelb.setText(title);

                }else{
                    continue;
                }
                if (subobj.has("name")) {
                    title = subobj.get("name").toString();
                    obj.titlelb.setText(title);
                }
                //////////////////////////////////////////////////
                   String posterpath = subobj.get("poster_path").toString();
                   if(posterpath.equalsIgnoreCase("null"))
                   {
                       continue;
                   }
                //----------------------------------------------------
                 String overviewString="";
               if (subobj.has("overview"))
               {
                  
                  String overview = "";
                    overview = subobj.get("overview").toString();
                    String[] n = overviewString.split("(?<=\\G.{" + 39 + "})");
                    for (String string : n) {
                        overview += string + " " + "\n" + " ";
                    }
                   obj.overviewtf.setText(overview);
               }
               else
               {
                   continue;
               }                    
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
                obj.jButton1.setVisible(false);

                int id = Integer.parseInt(subobj.get("id").toString());
               
                //------------------------------------------------
             

                try {
                    java.awt.image.BufferedImage bi = ImageIO.read(new URL("https://image.tmdb.org/t/p/w200" + posterpath));

                    bi = scale(bi, obj.photolb.getWidth(), obj.photolb.getHeight());

                    obj.photolb.setIcon(new ImageIcon(bi));

                } catch (Exception e) {
                    e.printStackTrace();
                }

                obj.setBounds(x, 10, 290, 350);
                x = x + 310;//adding space within the panel printing
                jPanel1.add(obj);//addin one panel to other
                jPanel1.repaint();//kinda refresh
                obj.repaint();

                //--------------------------------------------------------
                System.out.println(title);
                System.out.println(posterpath);
                System.out.println(overviewString);
                System.out.println(releasedate);
                System.out.println("_____________________________________________");
            }
            jPanel1.setPreferredSize(new Dimension(310 * arr.length(), 450));//scroll

        } catch (Exception ex) {
            ex.printStackTrace();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 591, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(31, 55, 593, 322);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MultiSeach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MultiSeach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MultiSeach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MultiSeach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MultiSeach("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
