package labWork1;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Pyramid {
	static Logger logger=Logger.getLogger(Pyramid.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			logger.info("\n");
		}
		logger.info("Reverse \n");
		for(int i=1;i<=10;i++) {
			for(int j=10;j>=i;j--) {
				System.out.print(" * ");
			}
			logger.info("\n");
		}
	}

}
