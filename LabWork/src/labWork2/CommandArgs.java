package labWork2;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class CommandArgs {
	static Logger logger=Logger.getLogger(CommandArgs.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		logger.info(args[1]);
		logger.info(args[2]);
		logger.info(args[3]);

	}

}
