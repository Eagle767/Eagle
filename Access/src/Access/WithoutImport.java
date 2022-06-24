package Access;

import java.io.*;

public class WithoutImport {
	public static void main(String[] args) throws IOException {
		//System.out.println("hi");
		//WithoutImport.abc();
		
		Console console = System.console();
		   if (console==null){
		      System.out.print("console not available ");
		   }else {
		      String line = console.readLine("Enter name :");
		      System.out.print("your name :"+line);
		   }
		   
		   InputStreamReader inStream = new InputStreamReader(System.in);
		   BufferedReader stdin = new BufferedReader(inStream);

		   int num , num2;
		   String str[]=new String[2];

		   System.out.print("Please Enter Your First Number:");
		   str[0] = stdin.readLine();
		   System.out.print("Please Enter Your Second Number:");
		   str[1] = stdin.readLine();

		   num = Integer.parseInt(str[0]);
		   num2 = Integer.parseInt(str[1]);
		   System.out.println("Enter the numbers are "+num+" , "+num2);
		   
		   String[] ar = new String[7];
		int ab = Integer.parseInt(ar[0]);
		     int ba = Integer.parseInt(ar[1]);
		     int res = ab+ba;
		     System.out.print(res);
	}
	static void abc() {
		System.out.println("Void");
	}
}
