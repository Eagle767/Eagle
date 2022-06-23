package shoe;
import java.io.File;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class TravelTest {
	
	static Logger logger=Logger.getLogger(Travels.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		Owner mr=new Owner();
		
		logger.info(mr.itv.shour);
		
		logger.info("Welcome to.........."+mr.name);
		
		mr.openAndcloseTime();
		
		Customers cus1=new Customers();
		
		logger.info(cus1.itv.shour);
		
		logger.info("Owner is here..........");
		
		logger.info("Customer Coming..........");
		
		Customers cus=new Customers();
		
		cus.bookTravel();
		
		logger.info("Travel Booked..........");
		
		logger.info("Owner ask the Distance in Driver.........");;
		
		Driver dr=new Driver();
		
		dr.calculateDistance();
		
	}
}

class InputofTravels{
	
	int shour,sminute,ehour,eminute,distance,speed,date,month,year,hour,minute;
	
	LocalDateTime tripDay;
	
	double t;
	
}

interface CompanyRules{
	
	void openAndcloseTime();
	
	void holiDay();
}
abstract class Travels implements CompanyRules{
	
	static Logger logger=Logger.getLogger(Travels.class);
	
	ZoneId st= ZoneId.of("Asia/Kolkata");
	
	DateTimeFormatter dtt=DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mma z");
	
	String name="Sivakasi Travels";
	
	InputofTravels itv=new InputofTravels();
	
	Scanner s=new Scanner(System.in);
	
	public void openAndcloseTime() {
		
		logger.info("Enter Company start Hour....................");
		
		itv.shour=s.nextInt();
		
		logger.info("Enter Company start Minutes....................");
		
		itv.sminute=s.nextInt();
		
		logger.info("Enter Company end Hour....................");
		
		itv.ehour=s.nextInt();
		
		logger.info("Enter Company end Minutes....................");
		
		itv.eminute=s.nextInt();
		
		try {
		
		LocalTime trp=LocalTime.of(itv.shour, itv.sminute);
		
		LocalTime trp1=LocalTime.of(itv.ehour, itv.eminute);
		
		}catch(Exception e) {
			
			logger.error(e);
			
			openAndcloseTime();}
		
	}
	
	public void holiDay() {
		
		logger.error("The Date is HoliDay. so,Not Working in the Day...........");
		
	}
	
}
class Owner extends Travels{}

class Driver extends Customers{
	
	void calculateDistance() {
		
		logger.info("Enter Travel Distance in KM...........");
		
		itv.distance=s.nextInt();
		
		logger.info("Enter Speed in Hours...........");
		
		itv.speed=s.nextInt();
		
		itv.t=itv.distance*60/itv.speed;
		
		LocalTime startl=LocalTime.now().withHour(itv.shour).withMinute(itv.sminute);
		
		LocalTime endl=LocalTime.now().withHour(itv.ehour).withMinute(itv.eminute);
		long sd=ChronoUnit.MINUTES.between(startl, endl);
		double ssd=itv.t/sd;
		
		double ssde=itv.t%sd;
		
		int g=0;
		
		System.out.println(this.itv.tripDay);
		
		for(int i=0;i<ssd-1;i++) {
			
			LocalDateTime l7=itv.tripDay.plusDays(g);
			
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
		
		LocalDateTime l5=itv.tripDay.plusDays(g).plusMinutes((long) ssde);
		
		if(l5.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			
			LocalDateTime lf=l5.plusDays(1);
			
			int ret=0;
			
			if(((lf.getMonthValue()==1)&&(lf.getDayOfMonth()==1))
					||((lf.getMonthValue()==1)&&(lf.getDayOfMonth()==26))
					||((lf.getMonthValue()==8)&&(lf.getDayOfMonth()==15))
					){
				
				ret++;
				
			}
			LocalDateTime lfg=l5.plusDays(ret);
			
			ZonedDateTime l37=lfg.atZone(st);
			
			String sss=dtt.format(l37);
			
			logger.debug("End International Time is............."+sss);
			
			logger.debug(lf.getDayOfWeek());
			
		}
		
		else {
			
		ZonedDateTime l37=l5.atZone(st);
		
		String sss=dtt.format(l37);
		
		logger.debug("Trip End Time is............."+sss);
		
		logger.debug(l5.getDayOfWeek());
		
		}
		
	}
	
}
class Customers extends Travels{
	
	void bookTravel() {
		
		logger.info("Enter Trip Date....................");
		
		itv.date=s.nextInt();
		
		logger.info("Enter Trip Month....................");
		
		itv.month=s.nextInt();
		
		logger.info("Enter Trip Year....................");
		
		itv.year=s.nextInt();
		
		try {
		
		LocalDate dfg=LocalDate.of(itv.year, itv.month, itv.date);
		
		DayOfWeek sfg=dfg.getDayOfWeek();
		
		if(DayOfWeek.SUNDAY.equals(sfg)
				|| ((dfg.getMonthValue()==1)&&(dfg.getDayOfMonth()==1))
				||((dfg.getMonthValue()==1)&&(dfg.getDayOfMonth()==26))
				||((dfg.getMonthValue()==8)&&(dfg.getDayOfMonth()==15))
				) {
			
			holiDay();
			
			bookTravel();
		
		}
		
		else {
		
		logger.info("Enter Bus Starting in the Trip Hour....................");
		
		itv.hour=s.nextInt();
		
		logger.info("Enter Bus Starting in the Trip Minutes....................");
		
		itv.minute=s.nextInt();
		
		LocalTime sti=LocalTime.of(itv.hour, itv.minute);
		
		LocalTime sts=LocalTime.of(itv.shour, itv.sminute);
		
		LocalTime ste=LocalTime.of(itv.ehour, itv.eminute);
		
		itv.tripDay=LocalDateTime.of(itv.year, itv.month, itv.date, itv.hour, itv.minute);
		
		if((sti.getHour()<sts.getHour() || ((sti.getHour()==sts.getHour()) && (sti.getMinute()<sts.getMinute())))
				&&(sti.getHour()>ste.getHour() || ((sti.getHour()==ste.getHour()) && (sti.getMinute()>ste.getMinute())))){
			
			logger.error("It is Wrong Timing sense................");
			
			bookTravel();
			
		}
		
		else {
		
			ZonedDateTime l1=itv.tripDay.atZone(st);
		
		    String ss=dtt.format(l1);
		
		    logger.info("The Start Time is....."+ss);
		   
			}
		
		}
			
	}catch(Exception e) {logger.error(e);}
	
	}
	
}














