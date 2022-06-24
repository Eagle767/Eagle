package multiThread;

import java.io.File;

import java.util.StringTokenizer;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class StringTokanizerTest {
	
	static Logger logger=Logger.getLogger(StringTokanizerTest.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start............");
		
		StringTokenizer s=new StringTokenizer("Hello Muthu How are you");
		
		logger.info("No Delimiters..................");
		
		while (s.hasMoreElements()) {
			
			logger.info(s.nextElement());
			
		}
		
//		while(s.hasMoreTokens()) {
//			
//			logger.debug(s.nextToken());
//			
//		}
	
		StringTokenizer s1=new StringTokenizer("Hello : World : Hi : Hiii",":");
		
		logger.info("Delimiters..................");
		
		while(s1.hasMoreTokens()) {
			
			logger.info(s1.nextToken());
			
		}
		
        StringTokenizer s2=new StringTokenizer("Hello : World : Hi : Hiii",":",true);
		
        logger.info("Delimiters and Boolean True..................");
        
		while(s2.hasMoreTokens()) {
			
			logger.info(s2.nextToken());
			
		}
		
        StringTokenizer s3=new StringTokenizer("Hello World Hi Hiii","H",false);
		
        logger.info("Delimiters and Boolean false..................");
        
		while(s3.hasMoreTokens()) {
			
			String m=s3.nextToken();
			
			logger.info(m);
			
			int i=s3.countTokens();
			
			logger.info(i);
			
			logger.info("How many letterss are there.............."+(m.length()));
			
		}
		
		logger.info(s2.hasMoreElements());
		
		logger.info(s2.hasMoreTokens());
		
		logger.info(s3);
		
		logger.info(s.countTokens());
		
		logger.info(s2.toString());
		
		logger.info(s2.asIterator());
		
		logger.warn("End....................");
		
	}

}
