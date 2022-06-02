package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ExecptHandle {
	//https://fluvid.com/videos/detail/37jwQh9a_AueqKO2m#.YphQBSFeLMk.link
	static Logger logger=Logger.getLogger(ExecptHandle.class);
		public static void main(String[] args) {
			String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
			
			PropertyConfigurator.configure(log4jConfigFile);
			logger.info("before exception....");
			try {
				int i=1/Integer.parseInt(args[0]);
			}catch(ArithmeticException e) {//try-catch is to avoid abnormal termination of the program
				logger.warn(e);//Exception printing...
				new Handler().handle(e);//Exception handling
			}
			catch(ArrayIndexOutOfBoundsException ae) {
				logger.info(ae);
				new Handler().handle(ae);
			}
			catch(NumberFormatException ae) {
				logger.info(ae);
				new Handler().handle(ae);
			}
			logger.info("After exception....");
		}
	}
	class Handler{
		static Logger logger=Logger.getLogger(Handler.class);
		public void handle(ArithmeticException ae) {
			logger.error("please dont divide the number by zero..");
		}
		public void handle(ArrayIndexOutOfBoundsException ae) {
			logger.error("please dont divide the number by zero..");
		}
		public void handle(NumberFormatException ae) {
			logger.error("please dont divide the number by zero..");
		}
	}