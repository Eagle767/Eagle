<<<<<<< HEAD
package access;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Total10 {
	
	static Logger logger=Logger.getLogger(Total10.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		int a=10;
		
		String b="Muthu";
		
		char c='M';
		
		float e=12.5f;
		
		logger.info("The Integer Value is "+a);
		
		logger.warn("The String Value is "+b);
		
		logger.error("The Character Value is "+c);
		
		logger.debug("The Float Value is "+e);
		
	}
	
}

class VariableDemo{
	
	
	
}
=======
package access;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Total10 {
	
	static Logger logger=Logger.getLogger(Total10.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		int a=10;
		
		String b="Muthu";
		
		char c='M';
		
		float e=12.5f;
		
		logger.info("The Integer Value is "+a);
		
		logger.warn("The String Value is "+b);
		
		logger.error("The Character Value is "+c);
		
		logger.debug("The Float Value is "+e);
		
	}
	
}

class VariableDemo{
	
	
	
}
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
