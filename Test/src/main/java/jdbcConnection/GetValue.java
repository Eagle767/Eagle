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

public class GetValue {
	
	static Logger logger=Logger.getLogger(GetValue.class);
	
	public static void main(String[] args) throws Exception {
		
		String s=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(s);
		
		logger.info("Start............");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/muthu","root","root");
		
		logger.warn(c);
		
		String query="select * from user where uname=?";
		
		PreparedStatement st=c.prepareStatement(query);
		
		st.setString(1, "Rose");
		
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
			
			logger.info(rs.getInt("uid")+":"+rs.getString("city"));
			
		}
		
		logger.info("Ended..............");
		
	}

}
