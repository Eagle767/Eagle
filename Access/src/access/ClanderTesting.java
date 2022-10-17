package access;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;

public class ClanderTesting {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		cal.add(Calendar.MONTH, -1);
		Date date = cal.getTime();
		System.out.println(date);
		Date date2=new Date();
		System.out.println(date2.getDate());
		System.out.println(date2.getDate()-1);
		date.setHours(0);
		System.out.println(date);
		LocalDate localDate=LocalDate.now();
		System.out.println(localDate);
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		LocalDateTime dateTime1=LocalDateTime.now().minusHours(dateTime.getHour()).minusMinutes(dateTime.getMinute());
		System.out.println(dateTime1);
		
		LocalDateTime dateTime2=LocalDateTime.now().minusDays(1);
		System.out.println(dateTime2);
		System.out.println(dateTime2.with(TemporalAdjusters.lastDayOfMonth()));
		int  quarter = LocalDate.now().get(IsoFields.QUARTER_OF_YEAR);
		System.out.println(quarter);
		Date myDate = new Date (); int quarters = (myDate.getMonth () / 3) + 1;
		System.out.println(quarters);
		System.out.println(dateTime2.getDayOfWeek());
		LocalDateTime dateTime3=LocalDateTime.now().minusWeeks(1);
		System.out.println(dateTime3);
		//today
		System.out.println("TODAY");
		LocalDateTime dateTime4=LocalDate.now().atStartOfDay();
		System.out.println(dateTime4);
		LocalDateTime end = LocalDate.now().atTime(LocalTime.MAX);
		System.out.println(end);
		//yesterday
		System.out.println("yesterday");
		LocalDateTime dateTime5=LocalDate.now().minusDays(1).atStartOfDay();
		System.out.println(dateTime5);
		LocalDateTime end1 = LocalDate.now().minusDays(1).atTime(LocalTime.MAX);
		System.out.println(end1);
		//this-week
		System.out.println("this-week");
		LocalDateTime dateTime6=LocalDate.now().atTime(LocalTime.MAX);
		System.out.println(dateTime6);
		int a=dateTime6.getDayOfWeek().getValue();
		LocalDateTime end2=null;
		if(a==7) {
			end2 = LocalDate.now().atStartOfDay();
		}else {
		     end2 = LocalDate.now().minusDays(a).atStartOfDay();
		}
		System.out.println(end2);
		//last-week
		System.out.println("last-week");
		LocalDateTime dateTime7=LocalDateTime.now();
		int b=dateTime7.getDayOfWeek().getValue();
		if(b==7) {
			dateTime7=LocalDate.now().minusDays(1).atTime(LocalTime.MAX);
		}else {
			dateTime7=LocalDate.now().minusDays(b+1).atTime(LocalTime.MAX);
		}
		System.out.println(dateTime7);
		LocalDateTime  end3 = dateTime7.minusDays(7).minusHours(23).minusMinutes(59);
		System.out.println(end3);
		//this-month
		System.out.println("this-month");
		LocalDateTime dateTime8=LocalDate.now().atTime(LocalTime.MAX);
		System.out.println(dateTime8);
		LocalDateTime end4=LocalDate.now().minusDays(dateTime6.getDayOfMonth()-1).atStartOfDay();
		System.out.println(end4);
		//last-month
		System.out.println("last-month");
		LocalDateTime end5=LocalDate.now().minusDays(LocalDate.now().getDayOfMonth()).atTime(LocalTime.MAX);
		System.out.println(end5);
		LocalDateTime dateTime9=LocalDate.now().minusMonths(1).minusDays(LocalDate.now().getDayOfMonth()-1).atStartOfDay();
		System.out.println(dateTime9);
		//this-year
		System.out.println("this-year");
		LocalDateTime dateTime10=LocalDate.now().atTime(LocalTime.MAX);
		System.out.println(dateTime10);
		LocalDateTime end10=LocalDate.now().minusMonths(LocalDate.now().getMonthValue()-1).minusDays(LocalDate.now().getDayOfMonth()-1).atStartOfDay();
		System.out.println(end10);
		//last-year
		System.out.println("last-year");
		LocalDateTime end11=LocalDate.now().minusMonths(LocalDate.now().getMonthValue()-1).minusDays(LocalDate.now().getDayOfMonth()).atTime(LocalTime.MAX);
	    System.out.println(end11);
	    LocalDateTime end12=LocalDate.now().minusYears(1).minusMonths(LocalDate.now().getMonthValue()-1).minusDays(LocalDate.now().getDayOfMonth()-1).atStartOfDay();
		System.out.println(end12);
	    //this-quarter
		System.out.println("this-quarter");
		LocalDateTime dateTime11=LocalDate.now().atTime(LocalTime.MAX);
		System.out.println(dateTime11);
		LocalDateTime end13=LocalDate.now().minusDays(dateTime6.getDayOfMonth()-1).atStartOfDay().minusMonths(2);
		System.out.println(end13);
		//last-quarter
		System.out.println("last-quarter");
		LocalDateTime end14=LocalDate.now().minusDays(LocalDate.now().getDayOfMonth()).atTime(LocalTime.MAX);
		System.out.println(end14);
		LocalDateTime end15=LocalDate.now().minusDays(LocalDate.now().getDayOfMonth()-1).atStartOfDay().minusMonths(3);
		System.out.println(end15);
	}
	
}
