package collection;

import java.io.File;

import java.util.Vector;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class VectorDemo {
	
	static Logger logger=Logger.getLogger(VectorDemo.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start.....................");
		
		Vector<String> v=new Vector<>();
		
		v.add("Hello");
		
		v.add("Hellllllllllllllllllllll");
		
		logger.info(v.capacity());
		
		Vector<String> vv=new Vector<>();
		
		vv.add("HTTTTTT");
		
		//vv.add(v);  //Because It is inside fully Synchronized Methods
		
		vv.addAll(v);
		
		logger.info(v);
		
		logger.info(vv);
		
		logger.warn("End..............................");
		
	}
	
}
