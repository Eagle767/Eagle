package chapter1to5;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class WrapperDemo {
	static Logger logger = Logger.getLogger(WrapperDemo.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		int i=10;
		Integer ii=10;
		
		Integer in=new Integer(10);
		in=Integer.valueOf(10);
		in=Integer.parseInt("10");
		
		i=in;//auto unboxing
		i=Integer.valueOf(ii);//manual unboxing
		
		in=i;//auto boxing
		
		String arg1=args[3];
		String arg2=args[2];
		
		logger.info(arg1+arg2);
		logger.info(Integer.parseInt(arg1)+Integer.parseInt(arg2));
		
		logger.info(Integer.MAX_VALUE);
		logger.info(Integer.MIN_VALUE);
		
		logger.info(Integer.compare(20, 10));
		
		logger.info(Integer.max(20, 40));
	}
	
	
}