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
			
			String query="select station from taxitable where tname=?";
			
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
			
			String query="select flag from taxitable where tname=?";
			
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
			
			String query="update taxitable set station=? where tname=?";
			
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
			
			String query="update taxitable set flag=? where tname=?";
			
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
	
	public boolean CheckMoney(String tname){
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="select eamt from taxitable where tname=?";
			
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
	
	public boolean UpdateMoney(int amt,String tname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="update taxitable set eamt=? where tname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, amt);
			
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
	
	public boolean CheckTime(String station){
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="select time from taxivalues where astation=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, station);
			
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
	
	public boolean CheckDistance(String station){
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="select distance from taxivalues where astation=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setString(1, station);
			
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
	
	public static void main(String[] args) {
		
		DBconn db=new DBconn();
		
		System.out.println(db.UpdateStation("A","Taxi-2"));
		
		System.out.println(db.UpdateFlag("Taxi-1", 0));
		
		System.out.println(db.CheckStation("Taxi-3"));
		
		System.out.println(db.CheckFlag("Taxi-4"));
		
		System.out.println(db.CheckMoney("Taxi-2"));
		
		System.out.println(db.CheckTime("C"));
		
		System.out.println(db.CheckDistance("C"));
		
		System.out.println(db.UpdateMoney(0, "Taxi-1"));
		
	}

}
