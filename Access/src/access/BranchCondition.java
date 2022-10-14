package access;
//https://fluvid.com/videos/detail/gk_qEcggEpi96G9xP#.Ynta4mAGVVQ.link
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class BranchCondition {
	static Logger logger=Logger.getLogger(BranchCondition.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// Ternary operator : ?
		logger.info(4<5);
		logger.info((4<5)? "small":"big");
		int num1=5;
		int num2=10;
		String Ans=(num1==num2)? "same":"not same";
		logger.info(Ans);
		
		if(num1==num2) { //if else condition
			logger.info("same");
		}
		else {
			logger.info("not same");
		}
		
		if(num1<=num2) { //if statement
			logger.info(num2);
		}
		
		if(num1<=num2) { //nested if else
			if(num1==num2) {
				logger.info("same");
			}
			else {
				logger.info(num2+" is big");
			}
		}
		else {
			logger.info(num1+" is big");
		}
		
		if(num1==num2) { //if else ladder
			logger.info("same");
		}
		else if(num1<num2) {
			logger.info(num2+" is big");
		}
		else {
			logger.info(num1+" is big");
		}
		String Day="mon";
	
	}
}
