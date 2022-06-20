package shoe;

import java.io.File;
import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class LocalDateTimeDemo {

	static Logger logger=Logger.getLogger(LocalDateTimeDemo.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Started.............");
		
		LocalDateTime now=LocalDateTime.now();
		
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-mm-yyyy hh:mm:ss a");
		
		String s=now.format(f);
		
		logger.info("Current Time....:"+s);
		
		Company c=new Company();
		
		c.display();
		
		logger.warn("Ended...............");
		
	}
	
}

class Company{
	
	static Logger logger=Logger.getLogger(Company.class);
	
	int date,month,year,hour,minute;
	
	void display() {
		
		Company c=new Company();
		
		Scanner s=new Scanner(System.in);
		
		logger.debug("Enter Date...........");
		
		c.date=s.nextInt();
		
		logger.debug("Enter Month...........");
		
		c.month=s.nextInt();
		
		logger.debug("Enter Year...........");
		
		c.year=s.nextInt();
		
		logger.debug("Enter Time in Hour...........");
		
		c.hour=s.nextInt();
		
		logger.debug("Enter Time in Minutes...........");
		
		c.date=s.nextInt();
		
		s.close();
		
		DateTimeFormatter d=DateTimeFormatter.ofPattern("c.date-c.month-c.year c.hour-c.minute-00 a");
		
		Format g=d.toFormat();
		
		logger.info(g);
		
	}
	
}
