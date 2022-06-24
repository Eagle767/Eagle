package labWork1;
//https://fluvid.com/videos/detail/2_nw1S44PphEXnw2j#.YntpXdpFKf8.link
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class DoWhile {
	static Logger logger=Logger.getLogger(DoWhile.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		int n;
		Scanner s=new Scanner(System.in);
		logger.info("Enter n Value below 10");
		n=s.nextInt();
		do {
			logger.info("The Addition of Loop Value is"+n);
			n++;
			logger.info("\n");
		}while(n<11);
		
	}
}