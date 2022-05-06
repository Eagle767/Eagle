package ATM;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class ATM {
	static Logger logger=Logger.getLogger(ATM.class);
	
	public static void main(String[] args) {
		String str="Hi This is Yours";
		
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("this is a message....:"+str);
		logger.warn("warning message...:"+str);
		logger.error("error message...:");
	}
}
