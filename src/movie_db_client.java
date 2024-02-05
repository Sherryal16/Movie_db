
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import java.sql.*;
import java.io.File;

public class movie_db_client {

    public static String signup_users(String username, String email, String password, String address, File photo) {
        String ans = "   ";
        try {
            ResultSet rs = DBLoader.executeQuery("select * from users where email='" + email + "' ");
            if (rs.next()) {
                ans = "fail";
            } else {
                System.out.println("Inside DBLOader");

                String ph = SaveFile.saveFile(photo);

                System.out.println("After Photo");
                rs.moveToInsertRow();
                rs.updateString("username", username);
                rs.updateString("email", email);
                rs.updateString("password", password);
                rs.updateString("address", address);
                rs.updateString("photo", ph);
                rs.insertRow ();
                Global.un=rs.getString("username");
                Global.ue=rs.getString("email");
                Global.pass=rs.getString("password");
                Global.ad=rs.getString("address");
                Global.ph=rs.getString("photo");

                System.out.println("End of DBLoader");
                ans = "success";
 
            }
            
        } catch (Exception e) {
            return e.toString();
        }
        return ans;
    }

    public static String login_user(String email, String password) {

        ResultSet rs = DBLoader.executeQuery("select * from movie_db.users where email ='" + email + "' and password='" + password + "'");
        try {
            if (rs.next()) {
                Global.un = rs.getString("username");
                Global.ph = rs.getString("photo");
                Global.ue = rs.getString("email");
                Global.ad = rs.getString("address");
                Global.pass = rs.getString("password");

                return ("login successfull");

            } else {
                return ("login failed");
            }
        } catch (Exception e) {
            return e.toString();
        }
    }

    public static String topTrending() {

        String api = "980d96176457a6e65b8bc282bcadccd4";

        try {
            HttpResponse<String> response = Unirest.get("https://api.themoviedb.org/3/trending/all/day?api_key=" + api).asString();
            //System.out.println(response.getBody());
            if (response.getStatus() == 200) {
                String res = response.getBody();

                return res;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return null;
    }

    public static String topupcoming() {
        String api = "980d96176457a6e65b8bc282bcadccd4";
        try {
            HttpResponse<String> response = Unirest.get("https://api.themoviedb.org/3/movie/upcoming?api_key=" + api + "&language=en-US&page=1")
                    .asString();
            //System.out.println(response.getBody());
            if (response.getStatus() == 200) {
                String res = response.getBody();

                return res;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return null;
    }

    public static String SearchMovie(String movie) {
        String api = "980d96176457a6e65b8bc282bcadccd4";

        try {
            HttpResponse<String> response = Unirest.get("https://api.themoviedb.org/3/search/movie?api_key=" + api + "&language=en-US&query=" + movie + "&page=1&include_adult=false").asString();
            //System.out.println(response.getBody());
            if (response.getStatus() == 200) {
                String res = response.getBody();

                return res;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return null;
    }

    public static String SearchTVShow(String tv) {
        String api = "980d96176457a6e65b8bc282bcadccd4";

        try {
            HttpResponse<String> response = Unirest.get("https://api.themoviedb.org/3/search/tv?api_key=" + api + "&language=en-US&page=1&query=" + tv + "&include_adult=false").asString();
            //System.out.println(response.getBody());
            if (response.getStatus() == 200) {
                String res = response.getBody();

                return res;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return null;
    }

    public static String MovieHouse(String house) {
        String api = "980d96176457a6e65b8bc282bcadccd4";

        try {
            HttpResponse<String> response = Unirest.get("https://api.themoviedb.org/3/search/company?api_key=" + api + "&query=" + house + "&page=1").asString();
            //System.out.println(response.getBody());
            if (response.getStatus() == 200) {
                String res = response.getBody();

                return res;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return null;
    }

    public static String SearchActor(String actorname) {

        String api = "980d96176457a6e65b8bc282bcadccd4";

        try {
            HttpResponse<String> response = Unirest.get("https://api.themoviedb.org/3/search/person?query=" + actorname + "&include_adult=false&language=en-US&page=1&api_key=" + api).asString();
            //System.out.println(response.getBody());
            if (response.getStatus() == 200) {
                String res = response.getBody();

                return res;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return null;
    }

    public static String UserEditProfile(String username, String address) {
        String ans = "";
        ResultSet rs = DBLoader.executeQuery("select * from movie_db.users where email ='" + Global.ue + "' and password='" + Global.pass + "'");
        try {
            if (rs.next()) {
                rs.updateString("username", username);
                rs.updateString("address", address);
                rs.updateRow();
                Global.un = username;
                Global.ad = address;
                ans = "success";
            } else {
                ans = "fail";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans;
    }

    public static String ChangePassword(String old_pass, String new_pass) {
        String ans = " ";
        ResultSet rs = DBLoader.executeQuery("select * from movie_db.users where  password='" + old_pass + "'");
        try {
            if (rs.next()) {
                rs.updateString("password", new_pass);
                rs.updateRow();
                Global.pass = new_pass;
                ans = "success";
            } else {
                ans = "fail";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return (ans);
    }

    public static String profilePicEdit(File photo) {
        String ans = " ";
        ResultSet rs = DBLoader.executeQuery("select * from movie_db.users where email ='" + Global.ue + "' and password='" + Global.pass + "'");
        try {
            if (rs.next()) {
                String ph = SaveFile.saveFile(photo);
                rs.updateString("photo", ph);
                rs.updateRow();
                ans = "success";
                Global.ph = ph;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans;
    }

    public static String deleteacc() {
        String ans = " ";
        ResultSet rs = DBLoader.executeQuery("select * from movie_db.users where email ='" + Global.ue + "' and password='" + Global.pass + "'");
        try {
            if (rs.next()) {
                rs.deleteRow();
                Global.ad = "";
                Global.pass = "";
                Global.ph = "";
                Global.ue = "";
                Global.un = "";
                ans = "success";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans;
    }

    public static String addfavmovies(int id) {

        String ans = " ";
        ResultSet rs = DBLoader.executeQuery("select * from movie_db.favmovies where useremail ='" + Global.ue + "' and id='" + id + "'");
        try {
            if (rs.next()) {
                rs.deleteRow();
                ans = "failed";
            } else {
                rs.moveToInsertRow();
                rs.updateInt("id", id);
                rs.updateString("useremail", Global.ue);
                rs.insertRow();
                ans = "success";
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans;
    }

    public static String checkButton(int id) {
        String ans = " ";
        ResultSet rs = DBLoader.executeQuery("select * from movie_db.favmovies where useremail ='" + Global.ue + "' and id='" + id + "'");
        try 
        {
           if (rs.next())
           {
             ans="success";  
           }
           else
           {
             ans="failed";
           }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans ;
    }
    
    
    public static String checkButtontv(int id) {
        String ans = " ";
        ResultSet rs = DBLoader.executeQuery("select * from movie_db.favtvshow where useremail ='" + Global.ue + "' and id='" + id + "'");
        try 
        {
           if (rs.next())
           {
             ans="success";  
           }
           else
           {
             ans="failed";
           }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans ;
    }
    
    
    public static String addfavtvshow(int id) {

        String ans = " ";
        ResultSet rs = DBLoader.executeQuery("select * from movie_db.favtvshow where useremail ='" + Global.ue + "' and id='" + id + "'");
        try {
            if (rs.next()) {
                rs.deleteRow();
                ans = "failed";
            } else {
                rs.moveToInsertRow();
                rs.updateInt("id", id);
                rs.updateString("useremail", Global.ue);
                rs.insertRow();
                ans = "success";
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans;
    }
        public static String showfavmovies() {

        String ans = " ";
        ResultSet rs = DBLoader.executeQuery("select * from movie_db.favmovies where useremail ='" + Global.ue + "'  ");
        try 
        {
         while(rs.next())
         {
          int id=rs.getInt("id");
          ans=ans+id+";";
         }
        }
            
        catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans;
}
        
            public static String showFavTVShow() {

        String ans = " ";
        ResultSet rs = DBLoader.executeQuery("select * from movie_db.favtvshow where useremail ='" + Global.ue + "'  ");
        try 
        {
         while(rs.next())
         {
          int id=rs.getInt("id");
          ans=ans+id+";";
         }
        }
            
        catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return ans;
}
        
        
        
        
        public static String searchMulti(String search) {
        String api = "980d96176457a6e65b8bc282bcadccd4";
        try {
            HttpResponse<String> response = Unirest.get("https://api.themoviedb.org/3/search/multi?api_key=" + api + "&language=en-US&query=" + search + "&page=1&include_adult=false").asString();
            //System.out.println(response.getBody());
            if (response.getStatus() == 200) {
                String res = response.getBody();

                return res;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return ex.toString();
        }
        return null;
    }
}
