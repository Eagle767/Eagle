package ATM;
import java.io.File;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class LoginPage {
	static Logger logger=Logger.getLogger(LoginPage.class);
	public static void main(String[] args) {
		List<String> test=new ArrayList<>();
		if(test.isEmpty()) {
			System.out.println("s");
		}
		System.out.println(LocalDate.of(LocalDate.now().getYear(), 1, 1).atStartOfDay());
		System.out.println(LocalDateTime.now());
		System.out.println(new Date(new Date().getYear(), 0, 1));
		System.out.println(new Date().getTime());
		System.out.println(new Timestamp(new Date().getTime()));
		Timestamp timestamp = null;
		try {
			timestamp = Timestamp.valueOf(LocalDateTime.now());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(timestamp);
		Date date = new Date(timestamp.getTime());
		System.out.println(date);
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