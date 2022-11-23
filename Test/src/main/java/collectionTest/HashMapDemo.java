package collectionTest;

import java.io.File;

//import java.util.HashMap;

import java.util.Iterator;

import java.util.Map;

import java.util.Set;

import java.util.TreeMap;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class HashMapDemo {

	static Logger logger=Logger.getLogger(HashMapDemo.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start...............");
		
		//HashMap<Integer, String> a=new HashMap<Integer, String>();
		
		TreeMap<Integer, String> a=new TreeMap<Integer, String>();
		
		a.put(1, "Hello1");
		
		a.put(2, "Hello2");
		
		a.put(4, "Hello4");
		
		a.put(3, "Hello3");
		
		a.put(5, "Hello5");
		
		a.put(3, "Hello7");
		
		logger.debug(a);
		
		logger.info(a.get(3));
		
		Set<Map.Entry<Integer,String>> s=a.entrySet();
		
		Iterator<Map.Entry<Integer, String>> i=s.iterator();
		
		while(i.hasNext()) {
			
			logger.info(i.next());
			
		}
		
		logger.warn("End................");
		
	}
	
}
