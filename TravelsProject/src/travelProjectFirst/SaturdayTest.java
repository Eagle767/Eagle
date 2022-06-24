package travelProjectFirst;

import java.time.DayOfWeek;

import java.time.LocalDateTime;

import java.time.temporal.ChronoUnit;

public class SaturdayTest {
	
	public static void main(String[] args) {

		LocalDateTime l=LocalDateTime.of(2022, 3, 4, 3, 20);
		
		System.out.println(l);
		
		LocalDateTime el=LocalDateTime.of(2022, 3, 20, 3, 15);
		
		System.out.println(el);

		long p2 = ChronoUnit.DAYS.between(l, el);
		
		double n=(int) p2+1;
		
		int g=0;
		
		for(int i=0;i<=n;i++) {
			
			LocalDateTime l7=l.plusDays(g);
			
			g++;
			
			DayOfWeek as=l7.getDayOfWeek();
			
			if(DayOfWeek.SATURDAY.equals(as)) {
				
				n=n+0.5;
				
			}
			
		}
		
		double rrg=n%1;
		
		System.out.println(rrg);
		
		LocalDateTime l5=l.plusDays((long) n);
		
		System.out.println(l5);
		
		int ssg=l5.getDayOfMonth();
		
		System.out.println(l5.getDayOfWeek());
	}
}
