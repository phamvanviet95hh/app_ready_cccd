package Database;

import com.mysql.cj.jdbc.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
public class DB {

    public static Connection getConnection(){
        Connection conn = null;
        try {
            Driver dr = new Driver();
            DriverManager.registerDriver(dr);
            String url = "jdbc:mysql://183.91.2.220/test";
            String username = "root";
            String pass = "";
            conn = DriverManager.getConnection(url,username,pass);
        }catch (SQLException ex){
            ex.fillInStackTrace();
        }
        return conn;
    }

}
