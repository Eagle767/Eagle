package keyword;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ThrowKeyWord {
	
	static Logger logger=Logger.getLogger(ThrowKeyWord.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Process is started...........");
		
		logger.warn("The Process is ended......................");
		
	}

}
