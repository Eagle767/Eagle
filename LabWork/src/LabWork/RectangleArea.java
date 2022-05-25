package LabWork;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class RectangleArea {
	static Logger logger=Logger.getLogger(RectangleArea.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		logger.info("Enter Length Value");
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		logger.info("Enter Width Value");
		double b=s.nextDouble();
		logger.info("The Given Values Are "+a+", "+b);
		double sum=a*b;
		logger.info("The Rectangle Area is "+sum);
	}

}
