package labWork1;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Ascii {
	static Logger logger=Logger.getLogger(Ascii.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		//DT150142 - 1st step done
		char a='e';
		int b=a;
		logger.info("The ascii value of "+a+" is "+b);
		int c=(int) a;
		logger.info("The cast ascii value of "+a+" is "+c);
	}
}
