package jdbcConnection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class UpdateJDBC {
	
	static Logger logger=Logger.getLogger(UpdateJDBC.class);
	
	public static void main(String[] args) throws Exception {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.info("Started.........");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
		
		logger.warn(c);
		
		String query="update user set uname='muthu' where uid=3";
		
		Statement s=c.createStatement();
		
		int cno=s.executeUpdate(query);
		
		logger.debug("no of place changed........"+cno);
		
		logger.info("Ended.............");
		
	}

}
