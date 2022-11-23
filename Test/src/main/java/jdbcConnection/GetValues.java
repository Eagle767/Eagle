package jdbcConnection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.mysql.cj.protocol.Resultset;

public class GetValues {
	
	static Logger logger=Logger.getLogger(GetValues.class);
	
	public static void main(String[] args) throws Exception{
		
		String s=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(s);
		
		logger.info("started.........");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
		
		logger.warn(c);
		
		String sset="select * from user";
		
		Statement ss=c.createStatement();
		
	    ResultSet rs=ss.executeQuery(sset);
	    
	    while(rs.next()) {
	    	
	    	System.out.println(rs.getInt("uid")+":"+rs.getString("uname"));
	    	
	    }
		
		logger.info("Ended.........");
		
	}

}
