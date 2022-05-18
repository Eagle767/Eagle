package Test;
//https://fluvid.com/videos/detail/2_nw1S44PphEXnw2j#.YntpXdpFKf8.link
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class LoopingCondition {
	static Logger logger=Logger.getLogger(LoopingCondition.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		//in while loop the condition is check first
//		while(true) { //infinite loop
//			logger.info("called....");
//		}
		
		//in case of do while loop, the condition is check after one execution..
//		do {
//			logger.info("called....");
//		}while(true);
		
		int n=10;
		
		while(n>10) {
			logger.info("loop executed - while...");
		}
		
		do {
			logger.info("loop executed - do while...");
		}while(n>10);
		
		while(n>0) {
			logger.info(n);
			n--;
		}
		
//https://fluvid.com/videos/detail/2_nw1S44PphEXnw2j#.YntpXdpFKf8.link

//		for(;;) {
//			logger.info("for loop called...");
//		}
		
		for(int i=0;i<10;i++) {
			logger.info("i value is...:"+i);
		}
		
		for(int i=10;i>0;i--) {
			logger.info("i value is...:"+i);
		}
		
		for(int i=10,j=0;i>0&&j<10;i--,j++) {
			logger.info(i+"..."+j);
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" * ");
			}
			logger.info("\n");
		}
	}
}