package LabWork;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class TypeCasting {
	static Logger logger=Logger.getLogger(TypeCasting.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		byte a=5;
		logger.info(a);
		int b=a;
		logger.info(b);
		//byte c=b; //byte memory is low compare to integer
		byte c=(byte)b;
		logger.info(c);
		//byte mul=a-b; //doesn't add or multiply the values in byte
		int mul=a+b;
		logger.info(mul);
	}
}
