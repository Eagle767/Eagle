package dBConnect;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dataPack.UserDIO;

public class DBConnect {
	
	public DBConnect() {

		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}

	}
	
	public boolean checkUser(String cname, String cpass) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String qury="select * from customer where cname=? and cpass=?";
			
			PreparedStatement ps=con.prepareStatement(qury);
			
			ps.setString(1, cname);
			
			ps.setString(2, cpass);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				
				return true;
				
			}else {
				
				return false;
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean checkFlag(String cname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String qury="select flag from customer where cname=?";
			
			PreparedStatement ps=con.prepareStatement(qury);
			
			ps.setString(1, cname);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				
				int f=rs.getInt(1);
				
				if(f==0) {
					
					return true;
					
				}else {
					
					return false;
				
				}
				
			}else {
				
				return false;
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean updateFlag(String cname, int flag) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String qury="Update customer set flag=? where cname=?";
			
			PreparedStatement ps=con.prepareStatement(qury);
			
			ps.setInt(1, flag);
			
			ps.setString(2, cname);
			
			int i=ps.executeUpdate();
			
			if(i!=0) {
				
				return true;
				
			}else {
				
				return false;
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean RegisterUser(UserDIO user) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String qury="insert into customer values(?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(qury);
			
			ps.setString(1, user.getCname());
			
			ps.setString(2, user.getCpass());
			
			ps.setInt(3, 0);
			
			int rs=ps.executeUpdate();
			
			if(rs>0) {
				
				return true;
				
			}else {
				
				return false;
				
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public ResultSet checkTable(String TableName) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String qury="select * from "+TableName;
			
			Statement ss=con.createStatement();
			
			ResultSet rs=ss.executeQuery(qury);
			
			return rs;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		DBConnect db=new DBConnect();
		
		UserDIO user=new UserDIO();
		
		user.setCname("muthu");
		
		user.setCpass("muthu123");
		
		System.out.println(db.checkUser("rose", "rose456"));
		
		System.out.println(db.checkFlag("rose"));
		
		System.out.println(db.updateFlag("rose", 0));
		
		System.out.println(db.RegisterUser(user));
		
	}

}
