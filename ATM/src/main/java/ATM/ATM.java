package ATM;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class ATM {
	static Logger logger=Logger.getLogger(ATM.class);
	
	public static void main(String[] args) {
		String str="This is Your Account";
		int accountNumber,passWord;
		Scanner s=new Scanner(System.in);
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("\n Enter Account Number");
		accountNumber=s.nextInt();
		logger.info("\n Enter Password");
		passWord=s.nextInt();
		if(accountNumber==4444 && passWord==4444)
			logger.info("this is a welcome message....:"+str);
		else
		   logger.warn("warning message...");
		if(accountNumber==0 || passWord==0)
		   logger.error("error message...");
	}
}
