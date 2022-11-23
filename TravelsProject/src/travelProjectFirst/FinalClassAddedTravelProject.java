package travelProjectFirst;
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
public class FinalClassAddedTravelProject {
	
	static Logger logger=Logger.getLogger(FinalClassAddedTravelProject.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.info("Started..................");
		
		logger.info("Welcome to "+SunTravels.name+"..................");
		
		InPut i=InPut.createObj();
		
		Owner o=Owner.createObj();
		
		logger.info("The Owner is Coming...........");
		
		logger.debug("Owner Please set time.............");
		
		o.setCompanyTime(i);
		
		logger.warn("The time limit is Successfully Updated...............");
		
		Driver d=Driver.createObj();
		
		logger.info("The Driver is Coming.............");
		
		Customer c=Customer.createObj();
		
		logger.info("The Customer is coming............");
		
		logger.debug("Please book the travel Date and Time...........");
		
		c.bookTravel(i);
		
		logger.warn("Booked Successfully.................");
		
		logger.info("Owner ask travel end Date and Time in Driver............");
		
		d.calculateDistance(i);
		
		logger.debug("Driver Update the date and time Successfully............");
		
		logger.info("Ended..................");
		
	}
}
class InPut implements Cloneable{
	
	private InPut() {
		
	}
	
	int date,month,year,hour,minute,shour,sminute,ehour,eminute,ret;
	
	double distance,speed,t,ssd,ssde,ssdes,afgd,rrd;
	
	long sd,sd1,sd2,sd3,sd4;
	
	String ss,sss;
	
	LocalDate dfg;
	
	DayOfWeek sfg;
	
	LocalTime ste,sts,sti,stss;
	
	LocalDateTime l,l50,l5,lf,lfg,lffd;
	
	ZoneId st;
	
	DateTimeFormatter dtt;
	
	ZonedDateTime l36,l37;
	
	static Logger logger=Logger.getLogger(InPut.class);
	
	private static InPut r;
	
	public static InPut createObj() {
		
		if(r==null) {
			
			r=new InPut();
			
			return r;
			
		}
		
		else {
			
			return r.isd();
			
		}
		
	}
	
	private InPut isd(){
		
		try {
			
			return (InPut)super.clone();
			
		}catch(Exception e) {
			
			logger.error(e);
			
			return null;
			
		}
		
	}
	
}

interface Company{}

abstract class SunTravels implements Company{
	
	static Logger logger=Logger.getLogger(SunTravels.class);
	
	public static String name="Sun Travels";
	
	Scanner s=new Scanner(System.in);
	
}

interface Rule{
	
	void setCompanyTime(InPut i);
	
}

class Owner extends SunTravels  implements Cloneable,Rule{
	
	private Owner() {
		
	}
	
	private static Owner r;
	
	public static Owner createObj() {
		
		if(r==null) {
			
			r=new Owner();
			
			return r;
			
		}
		
		else {
			
			return r.isd();
			
		}
		
	}
	
	private Owner isd(){
		
		try {
			
			return (Owner)super.clone();
			
		}catch(Exception e) {
			
			logger.error(e);
			
			return null;
			
		}
		
	}
	
	public void setCompanyTime(InPut i) {
		
		logger.info("Enter Company start Hour....................");
		
		i.shour=s.nextInt();
		
		logger.info("Enter Company start Minutes....................");
		
		i.sminute=s.nextInt();
		
		logger.info("Enter Company end Hour....................");
		
		i.ehour=s.nextInt();
		
		logger.info("Enter Company end Minutes....................");
		
		i.eminute=s.nextInt();
		
		try {
			
		i.ste=LocalTime.of(i.ehour, i.eminute);
		
	    i.sts=LocalTime.of(i.shour, i.sminute);
	  
	    i.sd=ChronoUnit.MINUTES.between(i.sts, i.ste);
		
		if(i.sd<=10) {
			
			logger.error("It is Wrong Please Enter Correct Time.......");
			
			setCompanyTime(i);
			
		}
		
		}catch(Exception e) {
			
			logger.error(e);
			
			setCompanyTime(i);
			
		}
		
	}
	
}

interface Drive{
	
	void calculateDistance(InPut i);
	
}

class Driver extends SunTravels  implements Cloneable,Drive{
	
	private Driver() {
		
	}
	
	private static Driver r;
	
	public static Driver createObj() {
		
		if(r==null) {
			
			r=new Driver();
			
			return r;
			
		}
		
		else {
			
			return r.isd();
			
		}
		
	}
	
	private Driver isd(){
		
		try {
			
			return (Driver)super.clone();
			
		}catch(Exception e) {
			
			logger.error(e);
			
			return null;
			
		}
		
	}
	
	public void calculateDistance(InPut i) {
		
		logger.info("Enter Travel Distance in KM...........");
		
		i.distance=s.nextDouble();
		
		logger.info("Enter Speed in Hours...........");
		
		i.speed=s.nextDouble();
		
		i.t=i.distance*60/i.speed;
	
	    i.ssd=i.t/i.sd;
	
	    i.ssde=i.t%i.sd;
	
	    i.ssdes=0;
	
	for(int j=0;j<=i.ssd;j++) {
		
		DayOfWeek Day=i.l.getDayOfWeek().plus(j);
		
		switch (Day) {
		
		case SUNDAY:{
			
			i.ssd++;
			
			break;
		
		}
		
		case SATURDAY:{
		
			if(((i.l.getMonthValue()==1)&&(i.l.getDayOfMonth()==1))
					||((i.l.getMonthValue()==1)&&(i.l.getDayOfMonth()==26))
					||((i.l.getMonthValue()==8)&&(i.l.getDayOfMonth()==15))){
			
				i.ssd++;
			
			}
			
			else {
			
				i.ssd=i.ssd+0.5;
			
				i.ssdes=i.ssdes+0.5;
			
			}
			
			break;
		
		}	
		default:{
		
			if(((i.l.getMonthValue()==1)&&(i.l.getDayOfMonth()==1))
					||((i.l.getMonthValue()==1)&&(i.l.getDayOfMonth()==26))
					||((i.l.getMonthValue()==8)&&(i.l.getDayOfMonth()==15))){
			
				i.ssd++;
				
			}
			
			break;
		
		}
		
		}
		
	}
	
	i.afgd=(i.ssdes%1)*i.sd;
	
    i.l50=i.l.plusDays((long) i.ssd).plusMinutes((long) i.ssde);
	
	i.rrd=0;
	
	if(i.l50.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {}
	
	else {
		
		i.rrd=i.rrd+i.afgd;
		
	}
	
	i.l5=i.l50.minusMinutes((long)i.rrd);
	
	if(i.l5.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
		
		i.lf=i.l5.plusDays(1);
		
		i.ret=0;
		
		if(((i.lf.getMonthValue()==1)&&(i.lf.getDayOfMonth()==1))
				||((i.lf.getMonthValue()==1)&&(i.lf.getDayOfMonth()==26))
				||((i.lf.getMonthValue()==8)&&(i.lf.getDayOfMonth()==15))
				){
			
			i.ret++;
			
		}
		i.lfg=i.lf.plusDays((long)i.ret);
		
		i.l37=i.lfg.atZone(i.st);
		
		i.sss=i.dtt.format(i.l37);
		
		logger.debug("End International Time is............."+i.sss);
		
		logger.debug(i.lf.getDayOfWeek());
		
	}
	
	else {
		
	i.l37=i.l5.atZone(i.st);
	
	i.sss=i.dtt.format(i.l37);
	
	logger.debug("Trip End Time is............."+i.sss);
	
	logger.debug(i.l5.getDayOfWeek());
		
	}
	
	}
		
}

interface BookTickect{
	
	void bookTravel(InPut i);
	
}

class Customer extends SunTravels  implements Cloneable,BookTickect{
	
	private Customer() {
		
	}
	
	private static Customer r;
	
	public static Customer createObj() {
		
		if(r==null) {
			
			r=new Customer();
			
			return r;
			
		}
		
		else {
			
			return r.isd();
			
		}
		
	}
	
	private Customer isd(){
		
		try {
			
			return (Customer)super.clone();
			
		}catch(Exception e) {
			
			logger.error(e);
			
			return null;
			
		}
		
	}
	
	public void bookTravel(InPut i) {
		
		logger.info("Enter Travel start Date....................");
		
		i.date=s.nextInt();
		
		logger.info("Enter Travel start Month....................");
		
		i.month=s.nextInt();
		
		logger.info("Enter Travel start Year....................");
		
		i.year=s.nextInt();
		
		try {
		
		i.dfg=LocalDate.of(i.year, i.month, i.date);
		
		i.sfg=i.dfg.getDayOfWeek();
		
		if(DayOfWeek.SUNDAY.equals(i.sfg)
				|| ((i.dfg.getMonthValue()==1)&&(i.dfg.getDayOfMonth()==1))
				||((i.dfg.getMonthValue()==1)&&(i.dfg.getDayOfMonth()==26))
				||((i.dfg.getMonthValue()==8)&&(i.dfg.getDayOfMonth()==15))
				) {
			
			logger.error("It is Holiday..................");
			
			bookTravel(i);
			
		}
		
		else {
		
		logger.info("Enter Bus Starting in the Trip Hour....................");
		
		i.hour=s.nextInt();
		
		logger.info("Enter Bus Starting in the Trip Minutes....................");
		
		i.minute=s.nextInt();
		
		i.sti=LocalTime.of(i.hour, i.minute);
		
		i.sd1=ChronoUnit.MINUTES.between(i.sts, i.sti);
		
		i.sd2=ChronoUnit.MINUTES.between(i.sti, i.ste);
		
		i.sd3=i.sd/2;
		
		i.stss=i.ste.minusMinutes(i.sd3);
		
		i.sd4=ChronoUnit.MINUTES.between(i.sti, i.stss);
		
		if((i.sd1<=0)||(i.sd2<=0)) {
			
			logger.error("It is Wrong Please read open and close time................");
			
			bookTravel(i);
			
		}
		
		else {
			
			if(DayOfWeek.SATURDAY.equals(i.sfg)&&(i.sd4<=0)){
					
					logger.error("Half Day only Working............");
					
					bookTravel(i);
					
				
			}else {
		
		i.l=LocalDateTime.of(i.year, i.month, i.date, i.hour, i.minute);
		
		i.st= ZoneId.of("Asia/Kolkata");
		
		i.dtt=DateTimeFormatter.ofPattern("dd:MM:yyyy HH:mma z");
		
		i.l36=i.l.atZone(i.st);
		
		i.ss=i.dtt.format(i.l36);
		
		logger.info("The Start Time is....."+i.ss);
		
		logger.info(i.l.getDayOfWeek());
		
		}}
		
		}
		
		}catch(Exception e) {
			
			logger.error(e);
			
			bookTravel(i);
			
		}
	
}
	
}