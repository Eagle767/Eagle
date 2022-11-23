package chapter1to5;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//https://fluvid.com/videos/detail/gk_qEcggEpi96G9xP#.Ynta4mAGVVQ.link
public class BranchCondition {
	static Logger logger=Logger.getLogger(BranchCondition.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		//ternary operator
		
		// ?
		String result=(4%2==0)?"Even Number ...":"Odd Number...";
		logger.info(result);
		logger.info((10<20)?"yes it will lesser than 20":"no it is not lesser than twenty");
		
		if(3%2==0) {
			logger.info("Even number...");
		}
		else {
			logger.info("Odd number....");
		}
		String name="joh";
		if(name.equals("rahim")) {
			logger.info("my name is billa....");
		}
		else if(name.equals("ram")) {
			logger.info("my name is gilli....");
		}
		else if(name.equals("john")) {
			logger.info("amar akbar antony....");
		}
		else {
			logger.info("allahuddin and 40 theifs....");
		}
		
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
		
		String month="First";
		switch(month) {
		case "First":{
			logger.info("Jan");
			break;
		}
		case "Second":{
			logger.info("Feb");
			break;
		}
		default:{
			logger.info("3 to 12");
		}
		}
		
		char ride='c';
		switch(ride) {
		case 'a':{
			logger.info("Jan");
			break;
		}
		case 'b':{
			logger.info("Feb");
			break;
		}
		default:{
			logger.info("4 to 12");
			break;
		}
		case 'c':{
			logger.info("march");}}
	}
}