package dataBaseConnect;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBconn {
	
	public DBconn() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public boolean CheckStation(String tname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="select cstation from TaxiService where tname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, tname);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean CheckFlag(String tname){
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="select flag from TaxiService where tname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, tname);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean UpdateStation(String station,String tname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="update TaxiService set cstation=? where tname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, station);
			
			ps.setString(2, tname);
			
			int rs=ps.executeUpdate();
			
			if(rs!=0) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean UpdateFlag(String tname,int flag){
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="update TaxiService set flag=? where tname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, flag);
			
			ps.setString(2, tname);
			
			int rs=ps.executeUpdate();
			
			if(rs!=0) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		DBconn db=new DBconn();
		
		System.out.println(db.UpdateStation("A","Taxi-2"));
		
		System.out.println(db.UpdateFlag("Taxi-1", 0));
		
		System.out.println(db.CheckStation("Taxi-1"));
		
	}

}
