package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StaticDemo {
	public static void sMet() {
		//static methods cannot access non static methods and properties
		//met();
		logger.info("hi");
	}
	static Logger logger=Logger.getLogger(StaticDemo.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		House.saram="this is common saram...";
		logger.info(House.saram);
		
		House veedu1=new House();
		veedu1.saram="2 ton saram bought...";
		veedu1.toilet="western toilet...";
		
		logger.info("Veedu1 saram...:"+House.saram);
		logger.info("Veedu1 toilet..:"+veedu1.toilet);
		veedu1.toilet("plastic..taps...");
		
		House veedu2=new House();
		veedu2.toilet="indian toilet...";
		logger.info("Veedu2 saram...:"+House.saram);
		logger.info("Veedu2 toilet..:"+veedu2.toilet);
		veedu2.toilet("steel tap....");
		
		logger.info("v1..:"+veedu1.toilet);
		logger.info("v2..:"+veedu2.toilet);
		
		House.saram="3 ton saram....";
		
		logger.info("v2...:"+House.saram);
		
		//FloorMill obj=new FloorMill();
		//obj.gridingWheet();
	    FloorMill.gridingWheet();
	    
	    PassByValueDemo obj=new PassByValueDemo();
		obj.met(20);//passing a value of 20 the met method as argument
		
		sMet();
	}
}
class House{
	static Logger logger=Logger.getLogger(House.class);
	static String saram;//class variable
	String toilet;//instance variable
	void toilet(String tap) {
		String taps=tap;//local variable
		logger.info(taps);
	}
}
class FloorMill{
	static Logger logger=Logger.getLogger(FloorMill.class);
	static void gridingWheet() {
		logger.info("wheet is being grinded.......");
	}
}
//https://fluvid.com/videos/detail/G6x-Ycgd1ZTxvy_78#.YoteqxvpXrc.link
class PassByValueDemo {
	static Logger logger=Logger.getLogger(PassByValueDemo.class);
	public void met(int i) {
		i=i+10;
		logger.info(i);
		met2("hello",i);
		
	}
	
	public void met2(String s,int i) {
		logger.info(s+":"+i);
	}
	
}