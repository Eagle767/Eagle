package jdbcConnection;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TrueorFalse {
	
	static Logger logger=Logger.getLogger(TrueorFalse.class);
	
	public static void main(String[] args) throws Exception {
		
		String a=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(a);
		
		logger.warn("Started................");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
		
		logger.info(c);
		
		String query="select * from user";
		
		Statement ss=c.createStatement();
		
		boolean r=ss.execute(query);
		
		logger.info(r);
		
		String query1="update user set uid=1 where amt=530";
		
		boolean r1=ss.execute(query1);
		
		logger.info(r1);//it provides wrong statement
		
		logger.warn("Ended..................");
		
	}

}
