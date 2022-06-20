package collectionTest;

import java.io.File;

import java.util.HashSet;

import java.util.Set;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class HashSetTest {
	
	static Logger logger=Logger.getLogger(HashSetTest.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start...................");
		
		Set<Integer> s=new HashSet<>(); 
		
		Set<Integer> ss=new HashSet<>(); 
		
		ss.add(57);
		
		s.add(1);
		
		s.add(5);
		
		s.add(3);
		
		s.add(3);
		
		logger.info(s);
		
		s.addAll(s);
		
		logger.info(s);
		
       logger.info(s.contains(5));
       
       logger.info( s.containsAll(ss));
       
       logger.info(s.equals(s));
       
       logger.info(s.getClass());
       
       s.forEach((y)->{logger.info(y);});
       
       s.forEach(logger::warn);
       
       logger.info("It is hascode..........."+s.hashCode());
       
       logger.info(s.isEmpty());
       
       logger.info(s.iterator());
       
       logger.info(s.parallelStream());
       
       logger.info(s.remove(5));
       
       logger.info(s);
       
       logger.info(s.removeAll(ss));
       
       logger.info(s.size());
       
       logger.info(s.retainAll(ss));
       
       logger.info(s);
       
       logger.info(s.toArray());
       
 //      logger.info(s.removeIf(null));
       
//       s.notify();
//       
//       s.notifyAll();
//       
//       try{s.wait(5000);}catch(Exception e) {}
       
       s.clear();
       
       logger.info(s);
		
		logger.warn("End........................");
		
	}
	
}
