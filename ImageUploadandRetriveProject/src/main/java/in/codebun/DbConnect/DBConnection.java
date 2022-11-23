package in.codebun.DbConnect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
 public static Connection getConn() {
  System.out.println("inside conn");
  Connection con = null;
  String loadDriver = "com.mysql.cj.jdbc.Driver"; // driver name for mysql
  String dbURL = "jdbc:mysql://localhost:3306/muthu"; // url of the
               // database
  String dbUSERNAME = "root"; // username to coonect db
  String dbPASSWORD = "root"; // password to connect db
  try {
   Class.forName(loadDriver); // load the driver
   con = DriverManager.getConnection(dbURL, dbUSERNAME, dbPASSWORD);// get
                    // the
                    // connection
  } catch (ClassNotFoundException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  } catch (SQLException e) {
   // TODO Auto-generated catch block
   e.printStackTrace();
  }
  return con; // return the connection obj.
 }
}
