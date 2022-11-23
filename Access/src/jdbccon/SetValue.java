<<<<<<< HEAD
package jdbccon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class SetValue {
	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/muthu","root","root");
		
		System.out.println(con);
		//Step 3 - Execute sql statement
		
		String sql="update user set flag=? where uid=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		stmt.setInt(1, 1);
		stmt.setInt(2, 4);
		int noofrowschanged=stmt.executeUpdate();
		
		//step 4 - process result
		
		System.out.println("No of rows updated...:"+noofrowschanged);
	}
=======
package jdbccon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
public class SetValue {
	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/muthu","root","root");
		
		System.out.println(con);
		//Step 3 - Execute sql statement
		
		String sql="update user set flag=? where uid=?";
		PreparedStatement stmt=con.prepareStatement(sql);
		
		stmt.setInt(1, 1);
		stmt.setInt(2, 4);
		int noofrowschanged=stmt.executeUpdate();
		
		//step 4 - process result
		
		System.out.println("No of rows updated...:"+noofrowschanged);
	}
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
}