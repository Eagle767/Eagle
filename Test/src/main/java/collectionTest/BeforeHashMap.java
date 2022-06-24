package collectionTest;

import java.io.File;

import java.util.Iterator;

import java.util.Map.Entry;

import java.util.Properties;

import java.util.Set;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class BeforeHashMap {
	
	static Logger logger=Logger.getLogger(BeforeHashMap.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		Properties p=new Properties();
		
		logger.warn("Start...............");
		
		p.put(1, "ABCD");
		
		p.put("HI", "HELLO");
		
		p.put('c', "FAN");
		
		p.put(25.4f, "RARE");
		
		logger.debug(p);
		
		logger.info(p.get("HI"));
		
		Set<Entry<Object, Object>> i=p.entrySet();
		
		Iterator<Entry<Object, Object>> it=i.iterator();
		
		while(it.hasNext()) {
			
			logger.debug(it.next());
			
		}
		
		logger.warn("End.................");
		
	}

}
