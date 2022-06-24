package labWork1;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class OddorEven {
	static Logger logger=Logger.getLogger(OddorEven.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		logger.info("Enter number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		logger.info("The Given Number is "+a);
		if(a%2==0) {
			logger.info("The Given Number is Even");
		}
		else {
			logger.info("The Given Number is Odd");
		}
	}

}
