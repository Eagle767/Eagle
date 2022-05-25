package Day1;

import java.util.Scanner;

public class Location {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Length");
		int n=s.nextInt();
		System.out.println("Enter Values");
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		int count=0;
		System.out.println("Enter needed Location Value");
		int b=s.nextInt();
		for(int i=0;i<n;i++) {
			if(a[i]==b) {
				i++;
				System.out.println("Location is  "+i);
			}
			
		}
		
	}

}
