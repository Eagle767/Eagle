package jdbcConnection;

import java.io.File;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class DataBaseMetaDataDemo {
	
	static Logger logger=Logger.getLogger(DataBaseMetaDataDemo.class);
	
	public static void main(String[] args) throws Exception {
		
		String a=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(a);
		
		logger.info("Started...............");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
		
		DatabaseMetaData d=c.getMetaData();
		
		logger.debug(d.getDatabaseProductName());
		
		logger.debug(d.getDatabaseProductVersion());
		
		logger.warn(c);
		
		logger.warn("Ended.................");
		
	}

}
