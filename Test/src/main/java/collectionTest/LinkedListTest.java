package collectionTest;

import java.io.File;

import java.util.Iterator;

import java.util.LinkedList;

import java.util.List;

import java.util.ListIterator;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class LinkedListTest {
	
	static Logger logger=Logger.getLogger(LinkedListTest.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start...............");
		
		List<Object> l=new LinkedList<Object>();
		
		l.add(1);
		
		l.add("Hi");
		
		l.add('c');
		
		l.add(27.5);
		
		l.add(5.6f);
		
		l.add(new Fjhjj());
		
		logger.info("It is Wrong..........But Available........."+l);
		
		List<Object> s=new LinkedList<>();
		
		l.remove(0);
		
		s.add(l);
		
		logger.info("It is Wrong..........But Available........."+s);
		
		s.addAll(l);
		
		logger.info("It is Wrong..........But Available........."+s);
		
		List<String> a=new LinkedList<>();
		
		a.add("Hello");
		
		a.add("HI");
		
		a.addAll(a);
		
		logger.info(a);
		
		for(String b:a) {
			
			logger.debug(b);
			
		}
		
		Iterator<String> iter= a.iterator();
		
		while(iter.hasNext()) {
			
			logger.info(iter.next());
			
		}
		
		ListIterator<String> ad=a.listIterator();
		
		while(ad.hasNext()) {
			
			logger.info("It is Correct order......"+ad.next());
			
		}
		
		while(ad.hasPrevious()) {
			
			logger.info("It is Reverse order......"+ad.previous());
			
		}
		
		logger.info(LinkedListTest.class);
		
		logger.info(ad);
		
		logger.warn("End...............");
		
	}
	
}

class Fjhjj{}