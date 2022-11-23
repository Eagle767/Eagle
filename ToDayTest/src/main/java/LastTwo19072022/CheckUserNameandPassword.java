package LastTwo19072022;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CheckUserNameandPassword {
	
	public CheckUserNameandPassword() {

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void main(String[] args) {
		
		CheckUserNameandPassword c=new CheckUserNameandPassword();
		
		System.out.println(c.checkUser("raja1", "raja123"));
		
	}

	public boolean checkUser(String uname,String upass) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String quary="select * from usercheck where upass=? and uname=?";
			
			PreparedStatement ps=con.prepareStatement(quary);
			
			ps.setString(1, upass);
			
			ps.setString(2, uname);
			
			ResultSet a=ps.executeQuery();
			
			if(a.next()) {
				
				return true;
				
			}else {
			
			return false;
			
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
			
			return false;
			
		}
			
	}
	
}
