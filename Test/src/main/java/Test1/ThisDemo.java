package Test1;
//https://fluvid.com/videos/detail/5Ad-5CB2nZtAOgmpy#.Yo4D1mWskzM.link
import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ThisDemo {
	static Logger logger=Logger.getLogger(StaticDemo.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Fan khaitan=new Fan();
		khaitan.setup();
		
		//this keyword cannot be used inside a static method
				ThisDemo2 obj=new ThisDemo2("some value...");
				obj.printS("aaaaaaaaaa");
	}
}
class Fan{
	static Logger logger=Logger.getLogger(StaticDemo.class);
	public Fan() {
		logger.info("fan object created...");
	}
	public void on() {
		logger.info("fan switched on...");
	}
	public void setup() {
		Room myRoom=new Room();
		myRoom.fix(this);//this keyword represents the current object
		//myRoom.fix(new Fan());
	}
}
class Room{
	public void fix(Fan f) {
		f.on();
	}
}

class ThisDemo2 {
	static Logger logger=Logger.getLogger(StaticDemo.class);
	String s;
	public ThisDemo2(String s) {
		this.s=s;
	}
	public void printS(String s) {
		//ThisDemo2 a=new ThisDemo2("hi");
		//s=a.s;
		logger.info(this.s);
	}
}