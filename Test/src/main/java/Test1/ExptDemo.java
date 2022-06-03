package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ExptDemo {
	//https://fluvid.com/videos/detail/Ee1-6HDxXQHQxnrQG#.YpiN-8KklXk.link
	static Logger logger=Logger.getLogger(ExptDemo.class);
		public static void main(String[] args) {
			String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.properties";
			PropertyConfigurator.configure(log4jConfigFile);
			if(args.length==0) {
				logger.info("pls give a argument value....");
			}
			else {
				String v=args[0];
				char c=v.charAt(0);
				if(Character.isDigit(c)) {
					int n=Integer.parseInt(c+"");
					if(n==0) {
						logger.info("please enter a non zero value...");
					}
					else {
						logger.info(n);
						int x=1/n;
					}
				}
				else {
					logger.info("please enter number as argument...");
				}
				
			}
		}
	}
