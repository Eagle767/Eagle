package Day1;
import java.util.Arrays;
import java.util.Scanner;
public class ResizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		//for(int i=0;i<a.length;i++) {
			//System.out.println(a[i]);
		//}
		//int[] b=new int[10];
		//b=a;\
		System.out.println("enter Length");
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int[] b=Arrays.copyOf(a, m);
		System.out.println("Enter values");
		for(int i=a.length;i<m;i++) {
			b[i]=s.nextInt();
		}
		System.out.println("The values");
		for(int j=0;j<b.length;j++) {
			System.out.print(b[j]+" ");
		}
		System.out.println("\n"+Arrays.toString(a));
		System.out.println("\n"+Arrays.toString(b));
	}

}
