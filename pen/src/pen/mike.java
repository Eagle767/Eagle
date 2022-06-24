package pen;

import java.util.Scanner;

public class mike {
	public static void main(String[] args) {
		Scanner keyin=new Scanner(System.in);
		System.out.println("Enter Name");
		String a=keyin.next();
		
		System.out.println("Enter Age");
		byte age=keyin.nextByte();
		
		System.out.println("Welcome "+a);
		System.out.println("\n Your Age is "+age);
		
		
	}
}
