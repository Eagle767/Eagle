package LabWork;
//https://fluvid.com/videos/detail/2_nw1S44PphEXnw2j#.YntpXdpFKf8.link
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Whileloop {
	static Logger logger=Logger.getLogger(Whileloop.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		logger.info("Enter n Value below 10");
		n=s.nextInt();
		while(n<=10) {
			sum+=n;
			n++;
		}
		logger.info("The Addition of Loop Value is"+sum);
	}
}