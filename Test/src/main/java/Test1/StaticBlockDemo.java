package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StaticBlockDemo {
	static Logger logger=Logger.getLogger(StaticBlockDemo.class);
	
	static {
		System.out.println("static block called....");
	}
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		//new SBDemo();
		SBDemo.met();
		//SBDemo.met2();
	}
}
class SBDemo{
	static Logger logger=Logger.getLogger(SBDemo.class);
	static {
		logger.info("SBDemo static block called....");
	}
	SBDemo(){//constructor
		logger.info("constructor called...");
	}
	static void met() {
		logger.info("static method met called...");
	}
	
	static void met2() {
		logger.info("static method met2 called...");
	}
}