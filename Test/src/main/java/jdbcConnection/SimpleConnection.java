package jdbcConnection;

import java.io.File;

import java.sql.Connection;

import java.sql.DriverManager;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class SimpleConnection {
	
	static Logger logger=Logger.getLogger(SimpleConnection.class);
	
	public static void main(String[] args) throws Exception{
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
		
		logger.info(c);
		
	}
	
}
