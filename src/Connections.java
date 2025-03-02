

import java.sql.Connection;
import java.sql.DriverManager;

public class Connections {
    public static Connection connect(){
        String name = "sql12718054";
        String pass = "dUdkbq4CNI";
        String url = "jdbc:mysql://sql12.freesqldatabase.com:3306/?user=sql12718054";
        try{
            Connection con = DriverManager.getConnection(url, name, pass);
            return con;
        } 
        catch(Exception e){
            e.printStackTrace();
            return null;
        }

    }  
}
