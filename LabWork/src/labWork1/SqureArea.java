package labWork1;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class SqureArea {
	static Logger logger=Logger.getLogger(SqureArea.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		logger.info("Enter Side Value");
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		logger.info("The Given Value is "+a);
		double sum=a*a;
		logger.info("The Squre Area is "+sum);
	}

}
