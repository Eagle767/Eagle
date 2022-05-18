package Day1;

import java.util.Scanner;

public class StudentResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Subjects");
		 int n=s.nextInt();
		 System.out.println("Enter Students Strength");
		 int m=s.nextInt();
		int[][] a=new int[m][n];
		for(int i=0;i<m;i++) {
			int b=i+1;
			System.out.println("The "+b+" Student Value");
			for(int j=0;j<n;j++) {
				a[i][j]=s.nextInt();
			}
			
		}
		
		for(int i=0;i<m;i++) {
			int sum=0;
			for(int j=0;j<n;j++) {
				sum=sum+a[i][j];
			}
			int b=i+1;
			System.out.println("The "+b+" Total Value");
			System.out.println(sum);
			}
	}

}
