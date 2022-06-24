package chapter6to10;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//https://fluvid.com/videos/detail/p35djuXqDmIaY1VMZ#.YoytmOY-5Qs.link
public class ConsDemo {
	static Logger logger=Logger.getLogger(StaticDemo.class);
	public ConsDemo() {
		System.out.println("cons with default called...");
	}
	public ConsDemo(int i) {
		System.out.println("cons with i value called....:"+i);
	}
	public ConsDemo(Employee e) {
		System.out.println("employee cons called...."+e);
	}
	
	
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		new ConsDemo();
		new ConsDemo(20);
		new ConsDemo(new Employee());
	}
}
class Employee{}