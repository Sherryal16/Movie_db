
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.net.URI;
import javax.swing.ImageIcon;

public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
        getContentPane().setBackground(Color.black);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);
        setSize(900, 900);
        setLocationRelativeTo(null);
        ImageIcon ic1 = new ImageIcon(Global.ph);
        Image img = ic1.getImage().getScaledInstance(jButton10.getWidth(), jButton10.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon ic = new ImageIcon(img);
        jButton10.setIcon(ic);
            ImageIcon ic12 = new ImageIcon("src/movie_db/icons8-play-button-30.png");
        Image img13 = ic12.getImage().getScaledInstance(jButton11.getWidth(), jButton10.getHeight(), Image.SCALE_SMOOTH);
        jButton15.setIcon(ic12);
        jButton16.setIcon(ic12);
        jButton17.setIcon(ic12);
        jButton18.setIcon(ic12);
        jButton19.setIcon(ic12);
        jButton20.setIcon(ic12);
        jButton21.setIcon(ic12);
                jButton11.setIcon(ic12);
        jButton12.setIcon(ic12);
        jButton13.setIcon(ic12);
        jButton14.setIcon(ic12);        
        search_panel.setVisible(false);
        jPanel1.setVisible(false);
        
        jLabel13.setText(Global.un);

        ImageIcon ic2 = new ImageIcon("src/movie_db/barbie.jpg");
        Image img1 = ic2.getImage().getScaledInstance(l1.getWidth(), l1.getHeight(), Image.SCALE_SMOOTH);
        ic2 = new ImageIcon(img1);
        l1.setIcon(ic2);

        ImageIcon ic3 = new ImageIcon("src/movie_db/batman.jpg");
        Image img2 = ic3.getImage().getScaledInstance(lb2.getWidth(), lb2.getHeight(), Image.SCALE_SMOOTH);
        ic3 = new ImageIcon(img2);
        lb2.setIcon(ic3);
        
        ImageIcon ic4 = new ImageIcon("src/movie_db/culpamia.jpg");
        Image img3 = ic4.getImage().getScaledInstance(lb3.getWidth(), lb3.getHeight(), Image.SCALE_SMOOTH);
        ic4 = new ImageIcon(img3);
        lb3.setIcon(ic4);
        ImageIcon ic5 = new ImageIcon("src/movie_db/avtar.jpg");
        Image img4 = ic5.getImage().getScaledInstance(lb4.getWidth(), lb4.getHeight(), Image.SCALE_SMOOTH);
        ic5 = new ImageIcon(img4);
        lb4.setIcon(ic5);
        ImageIcon ic6 = new ImageIcon("src/movie_db/frozen.jpg");
        Image img5 = ic6.getImage().getScaledInstance(lb5.getWidth(), lb5.getHeight(), Image.SCALE_SMOOTH);
        ic5 = new ImageIcon(img5);
        lb5.setIcon(ic6);
        ImageIcon ic7 = new ImageIcon("src/movie_db/omg2.jpg");
        Image img6 = ic7.getImage().getScaledInstance(lb6.getWidth(), lb6.getHeight(), Image.SCALE_SMOOTH);
        ic7 = new ImageIcon(img6);
        lb6.setIcon(ic7);
        ImageIcon ic8 = new ImageIcon("src/movie_db/gadar2.jpg");
        Image img7 = ic8.getImage().getScaledInstance(lb7.getWidth(), lb7.getHeight(), Image.SCALE_SMOOTH);
        ic8 = new ImageIcon(img7);
        lb7.setIcon(ic8);
        ImageIcon ic9 = new ImageIcon("src/movie_db/p1.jpg");
        Image img8 = ic9.getImage().getScaledInstance(lb8.getWidth(), lb8.getHeight(), Image.SCALE_SMOOTH);
        ic9 = new ImageIcon(img8);
        lb8.setIcon(ic9);
        ImageIcon ic10 = new ImageIcon("src/movie_db/jawan.jpg");
        Image img9 = ic10.getImage().getScaledInstance(lb9.getWidth(), lb9.getHeight(), Image.SCALE_SMOOTH);
        ic10 = new ImageIcon(img9);
        lb9.setIcon(ic10);
        ImageIcon ic11 = new ImageIcon("src/movie_db/rr.jpg");
        Image img10 = ic11.getImage().getScaledInstance(lb10.getWidth(), lb10.getHeight(), Image.SCALE_SMOOTH);
        ic11 = new ImageIcon(img10);
        lb10.setIcon(ic11);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        search_panel = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        tf1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        explore_trending = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        explore_upcoming = new javax.swing.JButton();
        trending_panel = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lb6 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("MORE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(17, 47, 72, 23);

        search_panel.setBackground(new java.awt.Color(0, 0, 0));
        search_panel.setLayout(null);

        jButton5.setBackground(new java.awt.Color(51, 51, 51));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Search movie");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        search_panel.add(jButton5);
        jButton5.setBounds(20, 10, 101, 20);

        jButton6.setBackground(new java.awt.Color(51, 51, 51));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Search TVShows");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        search_panel.add(jButton6);
        jButton6.setBounds(10, 40, 130, 23);

        jButton4.setBackground(new java.awt.Color(51, 51, 51));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Search Actor");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        search_panel.add(jButton4);
        jButton4.setBounds(10, 70, 130, 23);

        jButton7.setBackground(new java.awt.Color(51, 51, 51));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Search Production ");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        search_panel.add(jButton7);
        jButton7.setBounds(10, 100, 130, 23);

        getContentPane().add(search_panel);
        search_panel.setBounds(100, 20, 150, 140);

        tf1.setBackground(new java.awt.Color(0, 0, 0));
        tf1.setForeground(new java.awt.Color(255, 255, 255));
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        getContentPane().add(tf1);
        tf1.setBounds(270, 40, 170, 22);

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(300, 70, 100, 20);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOP TRENDING");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 180, 170, 30);

        explore_trending.setBackground(new java.awt.Color(51, 51, 51));
        explore_trending.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        explore_trending.setForeground(new java.awt.Color(255, 255, 255));
        explore_trending.setText("Explore");
        explore_trending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explore_trendingActionPerformed(evt);
            }
        });
        getContentPane().add(explore_trending);
        explore_trending.setBounds(220, 190, 75, 23);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TOP UPCOMING");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 430, 160, 40);

        explore_upcoming.setBackground(new java.awt.Color(51, 51, 51));
        explore_upcoming.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        explore_upcoming.setForeground(new java.awt.Color(255, 255, 255));
        explore_upcoming.setText("Explore");
        explore_upcoming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explore_upcomingActionPerformed(evt);
            }
        });
        getContentPane().add(explore_upcoming);
        explore_upcoming.setBounds(220, 440, 72, 23);

        trending_panel.setBackground(new java.awt.Color(0, 0, 0));
        trending_panel.setLayout(null);

        l1.setText("jLabel2");
        trending_panel.add(l1);
        l1.setBounds(12, 6, 120, 149);

        lb2.setText("jLabel2");
        trending_panel.add(lb2);
        lb2.setBounds(138, 6, 139, 149);

        lb4.setBackground(new java.awt.Color(255, 255, 255));
        lb4.setText("jLabel6");
        trending_panel.add(lb4);
        lb4.setBounds(423, 6, 142, 149);

        lb5.setText("jLabel7");
        trending_panel.add(lb5);
        lb5.setBounds(577, 6, 147, 149);

        lb3.setText("jLabel5");
        trending_panel.add(lb3);
        lb3.setBounds(295, 6, 116, 149);

        jButton15.setBackground(new java.awt.Color(51, 51, 51));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        trending_panel.add(jButton15);
        jButton15.setBounds(36, 173, 48, 31);

        jButton16.setBackground(new java.awt.Color(51, 51, 51));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        trending_panel.add(jButton16);
        jButton16.setBounds(176, 173, 48, 31);

        jButton17.setBackground(new java.awt.Color(51, 51, 51));
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        trending_panel.add(jButton17);
        jButton17.setBounds(327, 173, 48, 31);

        jButton18.setBackground(new java.awt.Color(51, 51, 51));
        trending_panel.add(jButton18);
        jButton18.setBounds(473, 173, 48, 31);

        jButton19.setText("jButton19");
        trending_panel.add(jButton19);
        jButton19.setBounds(730, 172, 81, 23);

        jButton20.setBackground(new java.awt.Color(51, 51, 51));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        trending_panel.add(jButton20);
        jButton20.setBounds(627, 173, 48, 31);

        getContentPane().add(trending_panel);
        trending_panel.setBounds(10, 220, 730, 210);

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Settings");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(590, 70, 72, 23);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("jLabel13");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(6, 124, 118, 30);

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("jButton10");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);
        jButton10.setBounds(6, 14, 118, 98);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(450, 20, 130, 160);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        lb6.setText("jLabel4");
        jPanel2.add(lb6);
        lb6.setBounds(6, 6, 117, 141);

        lb8.setBackground(new java.awt.Color(0, 0, 0));
        lb8.setText("jLabel9");
        jPanel2.add(lb8);
        lb8.setBounds(279, 6, 144, 141);

        lb9.setText("lb9");
        jPanel2.add(lb9);
        lb9.setBounds(435, 6, 142, 141);

        lb10.setForeground(new java.awt.Color(255, 255, 255));
        lb10.setText("jLabel12");
        jPanel2.add(lb10);
        lb10.setBounds(589, 6, 147, 141);

        lb7.setText("jLabel2");
        jPanel2.add(lb7);
        lb7.setBounds(135, 6, 126, 141);

        jButton21.setBackground(new java.awt.Color(51, 51, 51));
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton21);
        jButton21.setBounds(34, 181, 48, 31);

        jButton11.setBackground(new java.awt.Color(51, 51, 51));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton11);
        jButton11.setBounds(177, 181, 48, 31);

        jButton12.setBackground(new java.awt.Color(51, 51, 51));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton12);
        jButton12.setBounds(332, 181, 48, 31);

        jButton13.setBackground(new java.awt.Color(51, 51, 51));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton13);
        jButton13.setBounds(482, 181, 48, 31);

        jButton14.setBackground(new java.awt.Color(51, 51, 51));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton14);
        jButton14.setBounds(615, 181, 48, 31);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 470, 730, 230);

        jButton9.setBackground(new java.awt.Color(51, 51, 51));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("LOGOUT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(10, 10, 80, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_tf1ActionPerformed

    private void explore_trendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explore_trendingActionPerformed
        // TODO add your handling code here:
        toptrending obj = new toptrending();
        obj.setVisible(true);
    }//GEN-LAST:event_explore_trendingActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        SearchTVshow obj = new SearchTVshow();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Searchmovie obj = new Searchmovie();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void explore_upcomingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explore_upcomingActionPerformed
        // TODO add your handling code here:
        topupcoming obj = new topupcoming();

    }//GEN-LAST:event_explore_upcomingActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        SearchActor obj = new SearchActor();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        MovieHouse obj = new MovieHouse();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        UserEditProfile obj = new UserEditProfile();
    }//GEN-LAST:event_jButton10ActionPerformed
int check = 0;
int flag = 0;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(check == 0){
            search_panel.setVisible(true);
            flag = 1;
        }
        
        if(check == 1){
            search_panel.setVisible(false);
            flag = 0;
        }
        
        if(flag == 0){
            check =0;
        }
        
        if(flag == 1){
            check = 1;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
      welcome_java obj=new welcome_java();
      obj.setVisible(true);
      dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    int check2 = 0;
    int flag2 = 0;
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if(check2 == 0){
            jPanel1.setVisible(true);
            flag2 = 1;
        }
        
        if(check2 == 1){
            jPanel1.setVisible(false);
            flag2 = 0;
        }
        
        if(flag2 == 0){
            check2 =0;
        }
        
        if(flag2 == 1){
            check2 = 1;
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String ans=tf1.getText();
        ans= ans.replaceAll(" ", "%20");
        MultiSeach obj=new MultiSeach(ans);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        
        try {


            URI uri = new URI("https://youtu.be/E6sHWQcCUsQ?si=5LHdfL7tu9jMpLqI");

            Desktop d = Desktop.getDesktop();

            d.browse(uri);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
         try {


            URI uri = new URI("https://youtu.be/vhwr4vc_GY0?feature=shared");

            Desktop d = Desktop.getDesktop();

            d.browse(uri);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        try {


            URI uri = new URI("https://www.youtube.com/watch?v=6mdxy3zohEk");

            Desktop d = Desktop.getDesktop();

            d.browse(uri);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        
        try {


            URI uri = new URI("https://youtu.be/mqqft2x_Aa4?si=hGofEpgI4R-JoNfa");

            Desktop d = Desktop.getDesktop();

            d.browse(uri);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
         try {


            URI uri = new URI("https://youtu.be/3CpKBAPqqM0?si=C16ejQRKmx7N9Y59");

            Desktop d = Desktop.getDesktop();

            d.browse(uri);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
              try {


            URI uri = new URI("https://youtu.be/L0MK7qz13bU?si=3YF-HM3ahD-tMOiB");

            Desktop d = Desktop.getDesktop();

            d.browse(uri);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here
            try {


            URI uri = new URI("https://youtu.be/Y6ZKXqM7HNQ?feature=shared");

            Desktop d = Desktop.getDesktop();

            d.browse(uri);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
                    try {


            URI uri = new URI("https://youtu.be/K-EMszLvRIQ?feature=shared");

            Desktop d = Desktop.getDesktop();

            d.browse(uri);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
                 try {


            URI uri = new URI("https://youtu.be/ZtYTwUxhAoI?feature=shared");

            Desktop d = Desktop.getDesktop();

            d.browse(uri);

        } catch (Exception ex) {
            ex.printStackTrace();
        
    }             
    }//GEN-LAST:event_jButton12ActionPerformed
void jbutton9ActionPerformed(java.awt.event.ActionEvent evt)
{
    
}
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton explore_trending;
    private javax.swing.JButton explore_upcoming;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JPanel search_panel;
    private javax.swing.JTextField tf1;
    private javax.swing.JPanel trending_panel;
    // End of variables declaration//GEN-END:variables
}
