package Day1;

import java.util.Scanner;

class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Length");
		n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter Values");
		for(int i=0;i<n;i++) {
			//System.out.println("Enter Value "+i);
			a[i]=s.nextInt();
		}
		System.out.println("Enter the Values are");
		int sum=0;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			sum=sum+a[i];
		}
		System.out.println("The Avarage Number is "+sum/n);
	}

}
