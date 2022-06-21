package shoe;

import java.io.File;
import java.text.Format;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class SundaraTravels {
	
	static Logger logger=Logger.getLogger(SundaraTravels.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Welcome to Sundara Travels.............");
		
		int date,month,year,hour,minute;//,shour,sminute,ehour,eminute;
		
		double distance,speed;
		
		Scanner s=new Scanner(System.in);
		
		logger.info("Enter Date....................");
		
		date=s.nextInt();
		
		logger.info("Enter Month....................");
		
		month=s.nextInt();
		
		logger.info("Enter Year....................");
		
		year=s.nextInt();
		
		logger.info("Enter Time....................");
		
		hour=s.nextInt();
		
		logger.info("Enter Minutes....................");
		
		minute=s.nextInt();
		
		LocalDateTime l=LocalDateTime.of(year, month, date, hour, minute);
		
		DateTimeFormatter f=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm a");
		
		String ss=l.format(f);
		
		logger.info("The Start Time is....."+ss);
		
		logger.info("Enter Distance in KM...........");
		
		distance=s.nextDouble();
		
		logger.info("Distance is..........."+distance);
		
		logger.info("Enter Speed in Hours...........");
		
		speed=s.nextDouble();
		
		logger.info("Speed in..........."+speed);
		
		double t=distance*60/speed;
		
		int rr=(int) t;
		
		logger.info("The Total Travel Time in minutes.........."+t);
		
	
		LocalDateTime el=l.plusMinutes(rr);
		
		long p2 = ChronoUnit.DAYS.between(l, el);
		
		int n=(int) p2+1;
		
		int g=0,j=0;
		
		for(int i=0;i<=n;i++) {
			
			LocalDateTime l7=l.plusDays(g);
			
			g++;
			
			DayOfWeek as=l7.getDayOfWeek();
			
			if(DayOfWeek.SUNDAY.equals(as)) {
				
				n++;
				j++;
				
			}
			
		}
		
		LocalDateTime l5=el.plusDays(j);
		
		String sss=l5.format(f);

		logger.info("End Time is............."+sss);
		
		s.close();
		
		logger.warn("Ended...............");
		
	}
	
}