package dbconpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBcon {
	
	public DBcon() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public boolean checkUser(String uname,String upass) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="Select * from customer where cname=? and cpass=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, uname);
			
			ps.setString(2, upass);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				return true;
				
			}
			
			return false;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		DBcon c=new DBcon();
		
		System.out.println(c.checkUser("raja", "raja123"));
		
	}

}
