package shoe;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

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
			
			if(DayOfWeek.SUNDAY.equals(as)) {
				
				n++;
				
			}
			
		}
		
		LocalDateTime l5=l.plusDays(n);
		
		System.out.println(l5);
		
	}

}
