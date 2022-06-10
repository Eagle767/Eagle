package keyword;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class FinalizeKeyWord {
	
	static Logger logger=Logger.getLogger(FinalizeKeyWord.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Process is Started............");
		
		Runtime r=Runtime.getRuntime();
		
		logger.info(r.maxMemory());
		
		logger.info(r.freeMemory());
		
		logger.info(r.totalMemory());
		
		logger.info(r.availableProcessors());
		
		logger.info(Runtime.version());
		
		r.gc();
		
		logger.info(r.freeMemory());
		
		Home h=new Home();
		
		//logger.error(h.PropertyDetails);
		
		h.Details();
		
		logger.warn("The Procee is ended...........");
		
		logger.info(r.freeMemory());
		
		h=null;
		
		r.gc();
		
		logger.info(r.freeMemory());
		
		try {
			
		h.Details();
		
		}catch(Exception e) {}
	
		logger.info(r.freeMemory());
		
	}
	
}

class Home{
	
	static Logger logger=Logger.getLogger(Home.class);
	
	private String PropertyDetails="Down in the Bed..........";
	
	protected void Details() {
		
		logger.warn("The Place is  "+PropertyDetails);
		
	}
	
	protected void finalize(){
		
		Details();
		
	}
	
}