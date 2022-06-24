package keyword;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class FinalKeyWord {
	
	static Logger logger =Logger.getLogger(FinalKeyWord.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Process is Started...........");
		
		Hi h=new Hi();
		
		logger.info(h.a);
		
		logger.info(h.b);
		
		//h.a=34;
		
		h.b=63;
		
		logger.info(h.b);
		
		h.met();
		
		h.met1();
		
		logger.warn("The Process is ended..............");
		
	}

}

abstract class FI{
	
	static Logger logger=Logger.getLogger(FI.class);
	
	final int a=56;
	
	int b=45;
	
	final void met() {
		
		logger.info("It is a Final met...............");
		
	}
	
}

final class Hi extends FI{
	
	final int a=67;
	
	//final void met() {}
	
	final void met1() {
		
		logger.info("It is a Sub Final..............");
		
	}
	
}