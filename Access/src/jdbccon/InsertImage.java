package jdbccon;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertImage {
	
	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			System.out.println(con);
			
			String qury="insert into image values(?,?)";
			
			PreparedStatement ps=con.prepareStatement(qury);
			
			ps.setString(1, "Light");
			
			FileInputStream fis=new FileInputStream("C://Users//muthukumar.m//Downloads/light.jpg");
			
			ps.setBinaryStream(2, fis, fis.available());
			
			int a=ps.executeUpdate();
			
			System.out.println(a);
			
		} catch (ClassNotFoundException | SQLException | IOException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
