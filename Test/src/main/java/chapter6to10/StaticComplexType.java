package chapter6to10;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StaticComplexType {
	static Logger logger=Logger.getLogger(StaticComplexType.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		ClassRoom newton=new ClassRoom();
		
		ClassRoom edison=new ClassRoom();
		
		logger.info(newton.sanyo+":"+newton.sulab);
		
		logger.info(edison.sanyo+":"+edison.sulab);
		
		ClassRoom gandhi=new ClassRoom();
		logger.info(gandhi.sanyo+":"+gandhi.sulab);
	}
}
class ClassRoom{
	Projector sanyo=new Projector();
	static Toilet sulab=new Toilet();	
}
class Projector{
	
}
class Toilet{
	
}
class Human{}