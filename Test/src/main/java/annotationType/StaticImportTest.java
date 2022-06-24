package annotationType;

import accessSpecifierCheck.StaticInterface;

import static accessSpecifierCheck.StaticInterface.d;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class StaticImportTest {
	
	static Logger logger=Logger.getLogger(StaticImportTest.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start.................");
		
		logger.debug(StaticInterface.d);
		
		logger.debug(d);
		
		logger.warn("end..............");
		
	}

}
