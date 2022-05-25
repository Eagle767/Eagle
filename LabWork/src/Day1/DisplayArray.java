package Day1;

import java.util.Scanner;

public class DisplayArray {

	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			
			//int[][] a= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
			//int n=a.length;
			System.out.println("Enter Length");
			 int n=s.nextInt();
			int[][] a=new int[n][n];
			for(int i=0;i<n;i++) {
				int b=i+1;
				System.out.println("The "+b+" Row Value");
				for(int j=0;j<n;j++) {
					a[i][j]=s.nextInt();
				}
				
			}
			System.out.println("Enter Array values is");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(a[i][j]+"  ");
				}
				System.out.println("\n");
			}

	}

}
