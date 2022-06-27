package jdbcConnection;

import java.io.File;

import java.sql.CallableStatement;

import java.sql.Connection;

import java.sql.DriverManager;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ProcedureIn {
	
	static Logger logger=Logger.getLogger(ProcedureIn.class);
	
	public static void main(String[] args) throws Exception {
		
		String s=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(s);
		
		logger.info("Started.............");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
		
		logger.debug(c);
		
		String query="{call bot1(?,?)}";
		
		CallableStatement cs=c.prepareCall(query);
		
		cs.setString(1, "Rose");
		
		cs.setInt(2, 550);
		
		int nocol=cs.executeUpdate();
		
		logger.info(nocol);
		
		logger.info("Ended...................");
		
	}

}
