package LoggerTest;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class LoggTest {

	static Logger logger=Logger.getLogger(LoggTest.class);
	
	public static void main(String[] args) {
		
		String a=System.getProperty("user.dir")+File.separator+"pro" ;
		
		PropertyConfigurator.configure(a);
		
		logger.info(a);
		
		logger.info(System.getProperty("user.dir"));
		
	}
	
}
