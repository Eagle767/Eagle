package labWork1;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Largest3Number {
	static Logger logger=Logger.getLogger(Largest3Number.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		logger.info("Enter Different three number");
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		double b=s.nextDouble();
		double c=s.nextDouble();
		logger.info("The Given Numbers are "+a+","+b+","+c);
		if(a>b && a>c) {
			logger.info("The Biggest Number is "+a);
		}
		else if(b>a && b>c) {
			logger.info("The Biggest Number is "+b);
		}
		else {
			logger.info("The Biggest Number is "+c);
		}
	}

}
