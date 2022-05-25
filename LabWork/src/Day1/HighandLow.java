package Day1;

import java.util.Scanner;

public class HighandLow {

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
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		int temp=0;
		for(int k=0;k<n;k++) {
			for(int j=k+1;j<n;j++) {
				if(a[k]>a[j]) {
				temp=a[k];
				a[k]=a[j];
				a[j]=temp;
				System.out.println(temp);
			} 
				
			}//System.out.println(temp);
		}System.out.println("\n Ascending Order");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		for(int k=0;k<n;k++) {
			for(int j=k+1;j<n;j++) {
				if(a[k]<a[j]) {
				temp=a[k];
				a[k]=a[j];
				a[j]=temp;
				System.out.println(temp);
			}}
		}System.out.println("\n Descending Order");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
