package labWork1;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Div2Numbers {
	static Logger logger=Logger.getLogger( Div2Numbers.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		logger.info("Enter two numbers");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		logger.info("The Given Numbers Are :Dividend="+a+",Divisor="+b);
		int div=a/b;
		int rem=a%b;
		logger.info("The Divison of Two Numbers Quotient is "+div);
		logger.info("The Divison of Two Numbers Reminder is "+rem);
	}
}
