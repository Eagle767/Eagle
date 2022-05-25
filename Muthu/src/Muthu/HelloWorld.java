package Muthu;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class HelloWorld {
	
	static Logger logger=Logger.getLogger(HelloWorld.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.info("Hello World");
		
		logger.error("Hello World");
		
		logger.warn("Hello World");
		
		logger.debug("Hello World");
		
	}
	
}
