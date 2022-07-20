package dataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBCon {
	
	public DBCon() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public boolean checkUser(String uname, String upass) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String quary="select * from trainusers where uname=? and upass=?";
			
			PreparedStatement ps=con.prepareStatement(quary);
			
			ps.setString(1, uname);
			
			ps.setString(2, upass);
			
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
	
	public boolean registerUser(String uname, String upass) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String quary="insert into trainusers values(?,?)";
			
			PreparedStatement ps=con.prepareStatement(quary);
			
			ps.setString(1, uname);
			
			ps.setString(2, upass);
			
			int a=ps.executeUpdate();
			
			if(a!=0) {
				
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public int checkTickets(String tname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String quary="select avai from train where tname=?";
			
			PreparedStatement ps=con.prepareStatement(quary);
			
			ps.setString(1, tname);
			
			ResultSet a=ps.executeQuery();
			
			if(a.next()) {
				
				return a.getInt(1);
				
			}else {
			
			return 0;
			
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return 0;
			
		}
		
	}
	
	public int bookTickets(String tname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String quary="select start,avai from train where tname=?";
			
			PreparedStatement ps=con.prepareStatement(quary);
			
			ps.setString(1, tname);
			
			ResultSet a=ps.executeQuery();
			
			if(a.next()) {
				
				if(a.getInt(2)!=0) {
				
				int b=a.getInt(1)-a.getInt(2)+1;
				
				return b;
				
				}else{
					
					return 0;
					
				}
				
			}else {
			
			return 0;
			
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return 0;
			
		}
		
	}
	
	public boolean updateTicket(String uname, String upass, String pname, int age,  int ticketno, String tname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String quary="insert into trainchart values(?,?,?,?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(quary);
			
			ps.setString(1, uname);
			
			ps.setString(2, upass);
			
			ps.setString(3, pname);
			
			ps.setInt(4, age);
			
			ps.setInt(5, ticketno);
			
			ps.setString(6, tname);
			
			int a=ps.executeUpdate();
			
			if(a!=0) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public int checkTicketNo(String pname,String uname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String quary="select * from trainchart where pname=? and uname=?";
			
			PreparedStatement ps=con.prepareStatement(quary);
			
			ps.setString(1, pname);
			
			ps.setString(2, uname);
			
			ResultSet a=ps.executeQuery();
			
			if(a.next()) {
				
				return a.getInt(5);
				
			}else {
			
			return 0;
			
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return 0;
			
		}
		
	}
	
	public boolean cancelTicket(String uname, int ticketno) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String quary="select * from trainchart where uname=? and tno=?";
			
			PreparedStatement ps=con.prepareStatement(quary);
			
			ps.setString(1, uname);
			
			ps.setInt(2, ticketno);
			
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
	
	public boolean cancelupdateTicket(int ticketno) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="delete from trainchart where tno=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, ticketno);
			
			int a=ps.executeUpdate();
			
			if(a!=0) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public boolean availableupdateTicket(int a,String tname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="update train set avai=? where tname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, a);
			
			ps.setString(2, tname);
			
			int b=ps.executeUpdate();
			
			if(b!=0) {
			
			return true;
			
			}else {
				
				return false;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return false;
			
		}
		
	}
	
	public int checkavaiTicketNo(String tname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String quary="select avai from train where tname=?";
			
			PreparedStatement ps=con.prepareStatement(quary);
			
			ps.setString(1, tname);
			
			ResultSet a=ps.executeQuery();
			
			if(a.next()) {
				
				return a.getInt(1);
				
			}else {
			
			return 0;
			
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return 0;
			
		}
		
	}
	
	public ResultSet chart(String tname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String quary="select pname,age,tno from trainchart where tname=?";
			
			PreparedStatement ps=con.prepareStatement(quary);
			
			ps.setString(1, tname);
			
			ResultSet rs=ps.executeQuery();
				
				return rs;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
	}
	
	public String findTrain(int ticketno,String uname) {
		
		try {
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			String query="select * from trainchart where tno=? and uname=?";
			
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1, ticketno);
			
			ps.setString(2, uname);
			
			ResultSet a=ps.executeQuery();
			
			if(a.next()) {
			
			return a.getString(6);
			
			}else {
				
				return null;
				
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			return null;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		DBCon con =new DBCon();
		
//		System.out.println(con.checkTickets("Train-1"));
//		
//		System.out.println(con.cancelTicket("BV", 15));
//		
//		System.out.println(con.checkUser("A", "ac"));
//		
//		System.out.println(con.registerUser("C", "abc"));
//		
//		System.out.println(con.updateTicket("A", "abc", "abc", 10, 10,"Train-1"));
//		
//		System.out.println(con.bookTickets("Train-1"));
//		
//		System.out.println(con.checkTicketNo("fsgd", "A"));
		
		System.out.println(con.findTrain(2,"A"));
		
		System.out.println(con.checkTicketNo("muthu", "A"));
		
	}

}
