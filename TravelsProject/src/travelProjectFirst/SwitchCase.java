package travelProjectFirst;

import java.time.DayOfWeek;

public class SwitchCase {
	
	public static void main(String[] args) {
		
		int t=7;
		
		
		
		for(int i=1;i<=t;i++) {
			
			DayOfWeek Day=DayOfWeek.of(i);
			
			switch (Day) {
			case SUNDAY:{
				System.out.println("Sunday......");
				break;
			}
			case SATURDAY:{
				System.out.println("SaturDay..........");
				break;
			}	

			default:{
				System.out.println("normal Working Day.........");
				break;
			}
			}
			
		}
		
	}

}
