package Calculator;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Kadhal {
	
	static Logger logger=Logger.getLogger(Kadhal.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn(Kadhal.VanthalSolliAnuppu());
		
	}
	
	static String VanthalSolliAnuppu() {
		
		return "uyiroodu irunthal varugiren";
		
	}
	
}
