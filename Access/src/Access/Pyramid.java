package Access;
//package LabWork;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Pyramid {
	static Logger logger=Logger.getLogger(Pyramid.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a,b,c,d=1;
		logger.info("Enter Highest Value");
		a=s.nextInt();
		for(b=1;b<=a;b++) {
			
			for(c=1;c<=b;c++) {
				if(d<=a) {
				System.out.print(d+" ");
				d++;
			}
				//System.out.print("\n");	
			}
			System.out.print("\n");
			//break;
		}
	}
}
