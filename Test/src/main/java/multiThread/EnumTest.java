package multiThread;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class EnumTest {
	
	static Logger logger=Logger.getLogger(EnumTest.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start...............");
		
		HelloEnum h=HelloEnum.HAI;
		
		String s="HELLO";
		
		HelloEnum e=HelloEnum.valueOf(s);
		
		HelloEnum[] f=HelloEnum.values();
		
		logger.info(e);
		
		logger.info(h);
		
		logger.info(h.ordinal());
		
		for(HelloEnum a:f) {
			
			logger.info(a+"..................."+a.Action);
			
		}
		
		switch(e) {
		
		case HI:
			
		{
			
			logger.debug("HI");break;
			
		}
		
		case HELLO:
			
		{
			
			logger.debug("HELLO");break;
			
		}
		
		default:
		
		{
			
			logger.error("No inside There...........");
			
		}
		
		}
		
		logger.warn("End...........................");
		
	}
	
}
