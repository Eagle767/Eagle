package labWork2;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Prime {
	static Logger logger=Logger.getLogger(Prime.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		int n;
		Scanner s=new Scanner(System.in);
		logger.info("Enter Value");
		n=s.nextInt();
		if(n==0 || n==1) {
			logger.info("It is Prime and also not Prime");
		}
		else if(n==2 || n==3 || n==5 || n==7) {
			logger.info("It is a Prime Number");
		}
		else if(n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0) {
			logger.info("It is a Prime Number");
		}
		else {
			logger.info("It is Not a Prime Number");
		}
	}
	}
