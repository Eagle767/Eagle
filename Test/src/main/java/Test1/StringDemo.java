package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StringDemo {
	static Logger logger=Logger.getLogger(StringDemo.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		String str1=new String("hello");	//this will create two objects	
		String str2="hello";//this will create one object
		
		logger.info(str1==str2);//this will compare the objects not the value
		
		logger.info(str1.equals(str2));//equals method compares the values...
		
		if(str1.equals(str2)) {
			logger.info("both are equal...");
		}
		
		String v=String.format("My name is is ..:%s","Billa");
		
		logger.info(v);
		
		v=String.format("My name is is ..:%s and my age is..:%d","Billa",70);
		
		logger.info(v);
		
		v=String.format("My name is is ..:%s and my age is..:%d and my weight is..:%f","Billa",70,60.5f);
		
		System.out.printf("\n \n %1.2f",21.3455);
		System.out.println();
		
        System.out.printf("\n %-4s %10s %20s", "Column1","Column2","Column3");
		
		System.out.printf("\n %-4s %10s %20s", "SNo","Name","Company");
		System.out.printf("\n %-4s %-20s %20s", "100","Ramu","Anound Technologies");
		
		System.out.printf("\n %-20s %-20s %-20s", "SNo","Name","Company");
		System.out.printf("\n %-20s %-20s %-20s", "100","Ramu","Anound Technologies");
		System.out.println();
		System.out.printf("%f",100.23434343f);
		
		String s="Hello World";
		
		System.out.println(s.charAt(1));//prints the character at that position
		
		System.out.println(s.indexOf('e'));//prints 1
		
		System.out.println(s.toUpperCase());
		
		String str=s.toLowerCase();
		
		System.out.println(str);
		
		char c[]=s.toCharArray();
		
		for(char cc:c) {
			System.out.print(cc+"\t");
		}
		
		str=s.substring(6);
		System.out.println();
		System.out.println(str);
		
		str=s.substring(2,8);
		System.out.println(str);//reads from 2nd character to 7th character
		
		str=str.concat("myworld");
		
		System.out.println(str);
		
		System.out.println(str.length());
		
		logger.info(v);
		
		System.out.printf("My name is is ..:%s and my age is..:%20d and my weight is..:%f","Billa",70,60.5f);
	}
}