package labWork1;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class NestedFor {
	static Logger logger=Logger.getLogger(NestedFor.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				logger.info("\n"+i+" "+j);
			}
			logger.info("\n ");
		}
	}

}
