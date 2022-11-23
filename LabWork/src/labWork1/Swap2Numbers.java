package labWork1;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Swap2Numbers {
	static Logger logger=Logger.getLogger(Swap2Numbers.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		logger.info("Enter two numbers");
		Scanner s=new Scanner(System.in);
		float a=s.nextFloat();
		float b=s.nextFloat();
		logger.info("Before Swaping Given Numbers Are "+a+", "+b);
		float sum=a;
		a=b;
		b=sum;
		logger.info("After Swaping Given Numbers are "+a+", "+b);
	}

}
