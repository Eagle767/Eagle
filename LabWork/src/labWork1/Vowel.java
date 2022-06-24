package labWork1;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Vowel {
	static Logger logger=Logger.getLogger(Vowel.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		logger.info("Enter Single Character");
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		logger.info("The Given Character is "+a);
		if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u') {
			logger.info("The Given Character is Vowel");
		}
		else {
			logger.info("The Given Character is not Vowel");
		}
	}

}
