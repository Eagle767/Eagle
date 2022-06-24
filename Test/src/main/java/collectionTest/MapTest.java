package collectionTest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class MapTest {
	
	static Logger logger=Logger.getLogger(MapTest.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start............");
		
		Map<String ,Integer> m=new WeakHashMap<String,Integer>();
		
		String Key1=new String("HI");
		
		String Key2=new String("HELLO");
		
		Integer i=1;
		
		m.put(Key1,i);
		
		m.put(Key2,2);
		
		logger.info(m);
		
		logger.debug(m.get(Key1));
		
		Key1=null;
		
		logger.info(m);
		
		System.gc();
		
		logger.info(m);
		
		logger.warn("End..............");
		
	}

}
