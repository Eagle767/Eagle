package travelProjectFirst;

import java.time.DayOfWeek;

import java.time.LocalDateTime;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		double t=4;
		
		LocalDateTime l1=LocalDateTime.now();
		
		for(int i=0;i<=t;i++) {
			
			DayOfWeek Day=l1.getDayOfWeek().plus(i);
			
			switch (Day) {
			case SUNDAY:{
				System.out.println("Sunday......");
				t++;
				break;
			}
			case SATURDAY:{
				if(((l1.getMonthValue()==1)&&(l1.getDayOfMonth()==1))
						||((l1.getMonthValue()==1)&&(l1.getDayOfMonth()==26))
						||((l1.getMonthValue()==8)&&(l1.getDayOfMonth()==15))){
					t++;
				}
				else {
				System.out.println("SaturDay..........");
				t=t+0.5;}
				break;
			}	

			default:{
				System.out.println("normal Working Day.........");
				break;
			}
			}
			
		}
		System.out.println((t%1)*30);
		
		System.out.println(l1.toLocalTime());
		
	}

}
