package multiThread;

import java.io.File;

import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ComparartorComparableDemo {

	static Logger logger=Logger.getLogger(ComparartorComparableDemo.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start........................");
		
		List<InnerValueAccess> l=new ArrayList<>();
		
		Set<InnerValueAccess> s=new TreeSet<>();
		
		l.add(new InnerValueAccess("Hello"));
		
		l.add(new InnerValueAccess("Raja"));
		
		l.add(new InnerValueAccess("King"));
		
		l.add(new InnerValueAccess("Jack"));
		
		l.add(new InnerValueAccess("Monster"));
		
		s.addAll(l);
		
		s.add(new InnerValueAccess("Gold"));
		
		logger.info("Before Sorting in ArrayList..............."+l);
		
		Collections.sort(l);
		
		logger.info("After Sorting in ArrayList..............."+l);
		
		Collections.sort(l,new OrderChange());
		
		logger.info("After Sorting in ArrayList using Comparator..............."+l);
		
		logger.info("Before Sorting in TreeSet..............."+s);
		
		logger.warn("End...................");
	
	}
	
}

class OrderChange implements Comparator<InnerValueAccess>{

	@Override
	public int compare(InnerValueAccess o1,InnerValueAccess o2) {
		
		return o2.compareTo(o1);
	
	}}

class InnerValueAccess implements Comparable<InnerValueAccess>{

	String a;
	
	public InnerValueAccess(String a) {
		
		this.a=a;
		
	}
	
	@Override
	public int compareTo(InnerValueAccess o) {
		
		return this.a.compareTo(o.a);
	
	}
	
	@Override
	public String toString() {
		
		return this.a;
	
	}

}