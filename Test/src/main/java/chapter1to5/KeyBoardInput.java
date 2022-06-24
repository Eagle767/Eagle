package chapter1to5;
import java.io.File;
import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class KeyBoardInput {
	static Logger logger=Logger.getLogger(KeyBoardInput.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Scanner keyin=new Scanner(System.in);
		
		logger.info("Please enter your name..:");
		
		String name=keyin.next();
		
		logger.info("Welcome Mr.../Ms...:"+name);
		
		logger.info("Please enter your age..:");
		
		int age=keyin.nextInt();
		
		logger.info("Your age is...:"+age);
	}
}