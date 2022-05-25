package LabWork;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class NumberReverse {
	static Logger logger=Logger.getLogger(NumberReverse.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		int sum=0;
		Scanner s=new Scanner(System.in);
		logger.info("Enter Value");
		int a=s.nextInt();
		while(a!=0) {
			sum=sum*10;
			sum=sum+a%10;
			a=a/10;	
		}
		logger.info("The Reverse Value is "+sum);
	}
}
