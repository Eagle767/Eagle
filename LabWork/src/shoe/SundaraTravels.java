package shoe;

import java.io.File;

import java.time.DayOfWeek;

import java.time.LocalDate;

import java.time.LocalDateTime;

import java.time.LocalTime;

import java.time.format.DateTimeFormatter;

import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.DefaultFormatter;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class SundaraTravels {
	
	static Logger logger=Logger.getLogger(SundaraTravels.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Welcome to Sundara Travels.............");
		
		int date,month,year,hour,minute,shour,sminute,ehour,eminute;
		
		double distance,speed;
		
		Scanner s=new Scanner(System.in);
		
		logger.info("Enter Date....................");
		
		date=s.nextInt();
		
		logger.info("Enter Month....................");
		
		month=s.nextInt();
		
		logger.info("Enter Year....................");
		
		year=s.nextInt();
		
		try {
		
		LocalDate dfg=LocalDate.of(year, month, date);
		
		DayOfWeek sfg=dfg.getDayOfWeek();
		
		if(DayOfWeek.SUNDAY.equals(sfg)
				|| ((dfg.getMonthValue()==1)&&(dfg.getDayOfMonth()==1))
				||((dfg.getMonthValue()==1)&&(dfg.getDayOfMonth()==26))
				||((dfg.getMonthValue()==8)&&(dfg.getDayOfMonth()==15))
				) {
			
			logger.error("It is Holiday..................");
			
		}
		
		else {
		
		logger.info("Enter Hour....................");
		
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
		
		logger.info("The Total Travel Time in minutes.........."+t);
		
		logger.info("Enter start Hour....................");
		
		shour=s.nextInt();
		
		logger.info("Enter start Minutes....................");
		
		sminute=s.nextInt();
		
		LocalTime sti=LocalTime.of(hour, minute);
		
		LocalTime sts=LocalTime.of(shour, sminute);
		
		if(sti.getHour()<sts.getHour() || ((sti.getHour()==sts.getHour()) && (sti.getMinute()<sts.getMinute()))) {
			
			logger.error("It is Wrong Timing sense................");
			
		}
		
		else {
		
		logger.info("Enter end Hour....................");
		
		ehour=s.nextInt();

		logger.info("Enter end Minutes....................");
		
		eminute=s.nextInt();
		
		LocalTime ste=LocalTime.of(ehour, eminute);
		
		if(sti.getHour()>ste.getHour() || ((sti.getHour()==ste.getHour()) && (sti.getMinute()>ste.getMinute()))) {
			
			logger.error("It is Wrong Timing sense................");
			
		}
		
		else {
		
		LocalTime startl=LocalTime.now().withHour(shour).withMinute(sminute);
		
		LocalTime endl=LocalTime.now().withHour(ehour).withMinute(eminute);

		long sd=ChronoUnit.MINUTES.between(startl, endl);

		double ssd=t/sd;
		
		double ssde=t%sd;
		
		int g=0;
		
		for(int i=0;i<ssd-1;i++) {
			
			LocalDateTime l7=l.plusDays(g);
			
			g++;
			
			DayOfWeek as=l7.getDayOfWeek();
			
			if((DayOfWeek.SUNDAY.equals(as)) 
					|| ((l7.getMonthValue()==1)&&(l7.getDayOfMonth()==1))
					||((l7.getMonthValue()==1)&&(l7.getDayOfMonth()==26))
					||((l7.getMonthValue()==8)&&(l7.getDayOfMonth()==15))
					){
				
				ssd++;
				
			}
			
		}
		
		LocalDateTime l5=l.plusDays(g).withHour(shour).withMinute(sminute).plusMinutes((long) ssde);
		
		String abdef;
		
		logger.info("Enter String value...........");
		
		logger.info("CANADA,CANADA,FRENCH,CHINA,CHINESE,ENGLISH,FRANCE,FRENCH,GERMAN,GERMANY,ITALIAN,ITALY,JAPAN,JAPANESE,KOREA,KOREAN,PRC,ROOT,SIMPLIFIED_CHINESE,TAIWAN,TRADITIONAL_CHINESE,UK,US");
		
		logger.info("Don't Print others...........");
		
		abdef=s.next();
		
		Locale loc=Locale.forLanguageTag(abdef);
		
		DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm a", loc);
		
		if(l5.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			
			LocalDateTime lf=l5.plusMinutes((long) ssde).plusDays(1);
			
			String sss=lf.format(f);
			
			String sss1=lf.format(f1);

			logger.info("End Time is............."+sss);
			
			logger.debug(lf.getDayOfWeek());
			
			logger.debug("End International Time is............."+sss1);
			
		}
		
		else {
		
		LocalDateTime lf=l5.plusMinutes((long) ssde);
		
		String sss=lf.format(f);
		
		String sss1=lf.format(f1);

		logger.info("End Time is............."+sss);
		
		logger.debug(lf.getDayOfWeek());
		
		logger.debug("End International Time is............."+sss1);
		
		}
		
		s.close();
		
		logger.warn("Ended...............");
		
		}
		
		}
		
		}
		}catch(Exception e) {logger.error(e);}
	}
	
}