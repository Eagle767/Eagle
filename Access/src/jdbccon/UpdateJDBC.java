package jdbccon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class UpdateJDBC {
	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/muthu","root","root");
		
		System.out.println(con);
		//Step 3 - Execute sql statement
		
		String sql="update user set flag=0";
		Statement stmt=con.createStatement();
		int noofrowschanged=stmt.executeUpdate(sql);
		
		//step 4 - process result
		
		System.out.println("No of rows updated...:"+noofrowschanged);
	}
}