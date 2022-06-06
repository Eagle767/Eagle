package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ExptDem {
	static Logger logger=Logger.getLogger(ExptDem.class);
	//https://fluvid.com/videos/detail/v_v8rSxPr6iXy9xA2#.Ypmftn_GaNY.link
	//https://fluvid.com/videos/detail/v_v8rSxPr6iXy9xA2#.Ypmftn_GaNY.link
		public static void main(String[] args) {// throws Exception {
			String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.properties";
			PropertyConfigurator.configure(log4jConfigFile);
			Race race=new Race();
			logger.info("race started.....");
			//race.driveBike(150);
			try {
				race.driveBike(150);
			}catch(Exception e) {
				logger.info(e);
			}
			logger.info("race finished...");
			
			
		}
		public void met() {
			try {
				clone();
			}catch(Exception e) {
				
			}
		}
		
		public void met2()throws Exception {
			clone();
		}
	}
	class Race{
		public void driveBike(int speed) throws Exception{
			if(speed>100) {
				throw new Exception();
			}
		}
	}