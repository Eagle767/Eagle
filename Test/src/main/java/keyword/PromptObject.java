package keyword;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class PromptObject {

	static Logger logger=Logger.getLogger(PromptObject.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Process is Started............");
		
		Ben10 b=Ben10.mem();
		
		b.amt=500;
		
		Ben10 c=Ben10.mem();
		
		c.amt=400;
		
		logger.info(c.amt);
		
		logger.info(b.amt);
		
		logger.warn("The Process is Ended...............");
		
	}
	
}

class Ben10 implements Cloneable{
	
	int amt;
	
	private static Ben10 b;
	
	static Logger logger=Logger.getLogger(Ben10.class);
	
	private Ben10() {
		
		logger.error("The obj is Created.............");
		
	}
	
	public static Ben10 mem() {
		
		if(b==null) {
			
			b=new Ben10();
			
			return b;
		
		}
		
		else {
			
			return b.fun();
			
		}
		
	}
	
	private Ben10 fun() {
		
		logger.info("The Ben10 is Bettery low........");
		
		try {
			
			return (Ben10)super.clone();
		
		}catch(Exception e) {
			
			return null;
			
		}
		
		
	}
	
}