package travelProjectFirst;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NewSatTest {
	
	public static void main(String[] args) {
		
		int sshour,sehour,ssminute,seminute;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Sat Company start Hour....................");
		
		sshour=s.nextInt();
		
		System.out.println("Enter sat Company start Minutes....................");
		
		ssminute=s.nextInt();
		
		System.out.println("Enter sat Company end Hour....................");
		
		sehour=s.nextInt();
		
		System.out.println("Enter sat Company end Minutes....................");
		
		seminute=s.nextInt();
		
		try {
			
		LocalTime ste=LocalTime.of(sehour, seminute);
		
		LocalTime sts=LocalTime.of(sshour, ssminute);
		
		long sd=ChronoUnit.MINUTES.between(sts, ste);
		
		System.out.println(sd);
		
		}catch(Exception e) {}
		
	}

}
