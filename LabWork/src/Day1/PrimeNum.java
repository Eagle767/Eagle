package Day1;

import java.io.File;
//import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PrimeNum {
	static Logger logger=Logger.getLogger(PrimeNum.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		//Scanner keyin=new Scanner(System.in);
		System.out.println("It is a Prime Numbers :");
		//int a=keyin.nextInt();
		for(int i=0;i<=100;i++) {
			if(i==0 || i==1 || i==2 || i==3 || i==5 ||i==7) {
				System.out.print(" "+i);
			}
			else if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0) {
				System.out.print(" "+i);
			}
		}
	}
}
