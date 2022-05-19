package LabWork;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//https://fluvid.com/videos/detail/gk_qEcggEpi96G9xP#.Ynta4mAGVVQ.link
public class SwitchCase {
	static Logger logger=Logger.getLogger(SwitchCase.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		
		int day=20;
		
		switch(day) {
		case 1:{
			logger.info("Monday");
			break;
		}
		case 2:{
			logger.info("Tuesday");
			break;
		}
		case 3:{
			logger.info("Wenesday");
			break;
		}
		case 4:{
			logger.info("Thursday");
			break;
		}
		case 5:{
			logger.info("Friday");
			break;
		}
		case 6:{
			logger.info("Saturday");
			break;
		}
		case 7:{
			logger.info("Sunday");
			break;// jumping statement 
		}
		default:{
			logger.info("no week day");//no need jumping statement in last case
		}
		}
	}
}