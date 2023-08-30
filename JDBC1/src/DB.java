import java.sql.Connection;
import java.sql.DriverManager;

public class DB {


    static Connection con = null;
    public static Connection connect(){
        try{
            String url = "jdbc:mysql://localhost:3306/DB1" ;
            String userName = "root";
            String passwowrd = "Aniket7300@";

            con = DriverManager.getConnection(url, userName, passwowrd);
        }catch(Exception e){
              e.printStackTrace();
        }
        return con;
    }
}
