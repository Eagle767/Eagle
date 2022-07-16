package jdbccon;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ExtractImage {
	
public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
			
			System.out.println(con);
			
			String qury="select * from image";
			
			PreparedStatement ps=con.prepareStatement(qury);
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next()) {
				
				System.out.println(rs.getString(1));
				
				Blob img=rs.getBlob(2);
				
				byte[] b=img.getBytes(1, (int) img.length());
				
				FileOutputStream fos=new FileOutputStream("C://Users//muthukumar.m//Downloads/adhi.jpg");
				
				System.out.println(img);
				
				System.out.println(fos);
				
				fos.write(b);
				
				fos.close();
				
			}
			
			System.out.println(rs);
			
		} catch (ClassNotFoundException | SQLException | IOException e) {
			
			e.printStackTrace();
			
		}
		
	}

}
