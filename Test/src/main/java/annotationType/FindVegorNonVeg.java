package annotationType;

import java.io.File;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class FindVegorNonVeg {
	
	static Logger logger=Logger.getLogger(FindVegorNonVeg.class);
	
	public static void main(String[] args) throws Exception {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start............");
		
		Food f=new Food();
		
		Veg v=f.getClass().getAnnotation(Veg.class);
		
		Method m=f.getClass().getMethod("Pongal");
		
		if(v==null) {
			
			logger.debug("It is Veg............");
			
		}
		
		else {
			
			logger.debug("It is Non Veg....................");
			
		}
		
		logger.warn("end.............");
		
	}
	
}
