package jdbcConnection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SetValue {
	
	static Logger logger=Logger.getLogger(SetValue.class);
	
	public static void main(String[] args) throws Exception{
		
		String s=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(s);
		
		logger.warn("Started..............");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
		
		logger.debug(c);
		
		String query="update user set uname=? where uid=?";
		
		PreparedStatement ps=c.prepareStatement(query);
		
		ps.setString(1, "Rajan");
		
		ps.setInt(2, 1);
		
		ps.execute();
		
		logger.warn("Ended..................");
		
	}

}
