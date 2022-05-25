package LabWork;
import java.io.File;
import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PrintInput {
	static Logger logger=Logger.getLogger(PrintInput.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("Enter ID Number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		logger.info("Please Check Your Id Number "+a);
	}
}
