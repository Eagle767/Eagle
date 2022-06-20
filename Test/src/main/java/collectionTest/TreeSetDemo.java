package collectionTest;

import java.io.File;

import java.util.Comparator;

import java.util.TreeSet;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class TreeSetDemo implements Comparable<String>{

	static Logger logger=Logger.getLogger(TreeSetDemo.class);
	
	public static <T> void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start.............");
		
		TreeSet<String> t=new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
				
			}
		
		});
		
		//HashSet<String> t=new HashSet<>();
		
		t.add("Hello");
		
		t.add("I");
		
		t.add("AM");
		
		t.add("Spider");
		
		t.add("Man");
		
		logger.debug("Descending Order..............."+t);
		
		TreeSet<String> t1=new TreeSet<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				
				return o1.compareTo(o2);
				
			}
		
		});
		
		//HashSet<String> t=new HashSet<>();
		
		t1.add("Hello");
		
		t1.add("I");
		
		t1.add("AM");
		
		t1.add("Spider");
		
		t1.add("Man");
		
		logger.debug("Ascending Order................."+t1);
		
		String s="HEll";
		
		logger.info(s.compareTo("HEllOO"));
		
		logger.warn("End................");
		
	}

	String s;

	@Override
	public int compareTo(String o) {
		
		return o.compareTo(s);
		
	}
	
	
	
}

