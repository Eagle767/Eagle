package jdbcConnection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.mysql.cj.protocol.Resultset;

public class ChangeValue {
	
	static Logger logger=Logger.getLogger(ChangeValue.class);
	
	public static void main(String[] args) throws Exception{
		
		String s=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(s);
		
		logger.info("Started..............");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
		
		logger.warn(c);
		
		String query="update user set amt=? where uname=?";
		
		PreparedStatement ps=c.prepareStatement(query);
		
		while(true) {
			
			Scanner sss=new Scanner(System.in);
			
			logger.info("Enter amt..........");
			
			int amt=sss.nextInt();
			
			logger.info("Enter user name.........");
			
			String uname=sss.next();
			
			ps.setInt(1, amt);
			
			ps.setString(2, uname);
			
			int noofUpdate=ps.executeUpdate();
			
			logger.info(noofUpdate);
		
		logger.info("Ended.................");
		
		}
		
	}

}
