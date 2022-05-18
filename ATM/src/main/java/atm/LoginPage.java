package atm;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class LoginPage {
	static Logger logger=Logger.getLogger(LoginPage.class);
	public static void main(String[] args) {
		String str="This is Your Account";
		int accountNumber;
		int passWord;
		Scanner s =new Scanner(System.in);
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info(" Enter Account Number");
		accountNumber=s.nextInt();
		if(accountNumber==4444) {
			logger.info("this is a welcome message....");
			logger.info(" Enter Password");
			passWord=s.nextInt();
			if(passWord==4444)
				logger.info("correct Password :"+str);
			else
			    logger.warn("Incorrect Password");
		}
		else
		   logger.error("Incorrect Account Number");
	}
}
