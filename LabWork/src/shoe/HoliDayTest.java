package shoe;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class HoliDayTest {
	public static void main(String[] args) {
		System.out.println("Start..........");
		LocalTime ltt=LocalTime.now().withHour(3).withMinute(34).plusMinutes(32);
		System.out.println(ltt);
		LocalTime a=LocalTime.of(2, 3);
		LocalTime b=a.plusHours(2).plusMinutes(23);
		LocalDate c=LocalDate.now();
		int shour,sminute,ehour,eminute;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter start Hour....................");
		shour=s.nextInt();
		System.out.println("Enter start Minutes....................");
		sminute=s.nextInt();
		System.out.println("Enter end Hour....................");
		ehour=s.nextInt();
		System.out.println("Enter end Minutes....................");
		eminute=s.nextInt();
		
		
		LocalTime sl=LocalTime.now().withHour(14).withMinute(15);
		LocalTime l=LocalTime.now().withHour(shour).withMinute(sminute);
		LocalTime l1=LocalTime.now().withHour(ehour).withMinute(eminute);
		long sd=ChronoUnit.MINUTES.between(l, l1);
		long sde=ChronoUnit.MINUTES.between(sl, l1);
		double ssd=14567.3456/sd;
		System.out.println(ssd);
		double ssde=14567.345%sd;
		System.out.println(ssde);
		System.out.println(sde);
		double spd=sde-ssde;
		System.out.println(spd);
		LocalTime gl=LocalTime.now().withHour(shour).withMinute(sminute).plusMinutes((long) spd);
		System.out.println("End.............");
	}
}
