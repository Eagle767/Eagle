package Day1;

import java.util.Scanner;

public class ReverseArray {
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
		System.out.println("Enter the values are");
		for(int i=n-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}

}}
