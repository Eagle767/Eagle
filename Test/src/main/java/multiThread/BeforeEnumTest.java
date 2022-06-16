package multiThread;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class BeforeEnumTest {
	
	static Logger logger=Logger.getLogger(BeforeEnumTest.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start..................");
		
		logger.info(BeforeEnum.s);
		
		logger.info(BeforeEnum.ss);
		
		logger.info(BeforeEnum.sss);
		
		logger.warn("End................");
		
	}
	
}
