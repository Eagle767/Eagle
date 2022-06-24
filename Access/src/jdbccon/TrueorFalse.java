package jdbccon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class TrueorFalse {
	public static void main(String[] args) throws Exception{
		//Step1 - Load the Driver.
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Step 2 - Establish Connection
		Connection con=DriverManager.getConnection
				("jdbc:mysql://localhost:3306/muthu","root","root");
		
		System.out.println(con);
		//Step 3 - Execute sql statement
		
		String sql="select * from user";
		Statement stmt=con.createStatement();
		boolean result=stmt.execute(sql);
		
		//step 4 - process result
		
		System.out.println(result);
		
		String sql1="update user set flag=5 where uid=2";
		
		boolean result1=stmt.execute(sql1);
		
		//step 4 - process result
		
		System.out.println(result1);
	}
}
