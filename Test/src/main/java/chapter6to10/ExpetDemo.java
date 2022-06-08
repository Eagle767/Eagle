package chapter6to10;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ExpetDemo {
	//https://fluvid.com/videos/detail/n8Qdni_ar9tZn_zO4#.YpigbI8zxr0.link
	static Logger logger=Logger.getLogger(ExpetDemo.class);
			public static void main(String[] args) {
				String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.properties";
				PropertyConfigurator.configure(log4jConfigFile);
				logger.info("before exception...");
				try{
					String s=args[0];
					Integer.parseInt(s);
				}catch(ArrayIndexOutOfBoundsException  ae) {
					logger.info(ae);
				}finally {
					logger.info("finally block code called...");
				}
				logger.info("after exception");
			}
		}
