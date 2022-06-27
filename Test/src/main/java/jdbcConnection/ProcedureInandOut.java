package jdbcConnection;

import java.io.File;

import java.sql.CallableStatement;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.Types;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ProcedureInandOut {
	
	static Logger logger=Logger.getLogger(ProcedureInandOut.class);
	
	public static void main(String[] args) throws Exception {
		
		String s=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(s);
		
		logger.info("Started.............");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
		
		logger.debug(c);
		
		String query="{call bot3(?,?)}";
		
		CallableStatement cs=c.prepareCall(query);
		
		cs.setInt(2, 500);
		
		cs.registerOutParameter(1, Types.CHAR);
		
		cs.execute();
		
		String place=cs.getString(1);
		
		logger.info(place);
		
		logger.info("Ended...................");
		
	}

}
