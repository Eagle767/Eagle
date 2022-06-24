package shoe;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class SunDayTest {

	public static void main(String[] args) {

		LocalDateTime l=LocalDateTime.of(2022, 3, 4, 3, 20);
		
		System.out.println(l);
		
		LocalDateTime el=LocalDateTime.of(2022, 3, 30, 3, 15);
		
		System.out.println(el);

		long p2 = ChronoUnit.DAYS.between(l, el);
		
		int n=(int) p2+1;
		
		int g=0;
		
		for(int i=0;i<=n;i++) {
			
			LocalDateTime l7=l.plusDays(g);
			
			g++;
			
			DayOfWeek as=l7.getDayOfWeek();
			
			if((DayOfWeek.SUNDAY.equals(as)) || ((l7.getMonthValue()==1)&&(l7.getDayOfMonth()==1))) {
				
				n++;
				
			}
			
		}
		String abdef;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter String value...........");
		
		System.out.println("CANADA,CANADA,FRENCH,CHINA,CHINESE,ENGLISH,FRANCE,FRENCH,GERMAN,GERMANY,ITALIAN,ITALY,JAPAN,JAPANESE,KOREA,KOREAN,PRC,ROOT,SIMPLIFIED_CHINESE,TAIWAN,TRADITIONAL_CHINESE,UK,US");
		
		System.out.println("Don't Print others...........");
		
		abdef=s.next();
		
		Locale loc=new Locale("it");
		
		
		
		//DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd-MM-yyyy HH-mm a",loc);
		
		LocalDateTime l5=l.plusDays(n);
		
		LocalDate dad=l5.toLocalDate();
		
		System.out.println(l5);

		DateFormat df = DateFormat.getDateInstance (DateFormat.FULL, loc);
		
		System.out.println(df.format(dad));
		
		int ssg=l5.getDayOfMonth();
		
		System.out.println(l5.getDayOfWeek());
		
		//String sss1=f1.format(l5);
		
		//System.out.println("End International Time is............."+sss1);
		
	}

}
