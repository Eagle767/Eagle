package ioPack;

import java.io.File;

import java.net.URL;

import java.net.URLConnection;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class CallWebProjectActionTest {

	static Logger logger=Logger.getLogger(CallWebProjectActionTest.class);
	
	public static void main(String[] args) throws Exception {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start............");
			
			URL u=new URL("http://localhost:8080/WebProjects/das.do");
			
			URLConnection uc=u.openConnection();
			
			uc.getInputStream();
		
		logger.warn("End..............");
		
	}
	
}
