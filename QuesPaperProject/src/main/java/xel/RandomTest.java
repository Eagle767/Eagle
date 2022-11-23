package xel;

import java.time.LocalTime;

public class RandomTest {

	public static void main(String[] args) {
		
		int min=5,max=100;
		
		String str=String.valueOf(min)+"Hello";
		
		LocalTime end=LocalTime.now().plusMinutes(10);
		
		System.out.println(end);
		
		for(int i=0;i<10;i++) {
			
			int b = (int)(Math.random()*(max-min+1)+min);  
			
			System.out.println(b);
			
		}
		
	}

}
