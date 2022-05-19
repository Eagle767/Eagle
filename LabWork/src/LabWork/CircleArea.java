package LabWork;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class CircleArea {
	static Logger logger=Logger.getLogger(CircleArea.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		logger.info("Enter Radius Value");
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		logger.info("The Given Value is "+a);
		double sum=Math.PI*(a*a);
		logger.info("The Circle Area is "+sum);
		double c=Math.PI*2*a;
		logger.info("The Circle Circumference is "+c);
	}

}
