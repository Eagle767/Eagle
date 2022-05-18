package LabWork;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class ArraySum {
	static Logger logger=Logger.getLogger(ArraySum.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		int[] a=new int[10];
		int sum=0;
		logger.info("The Enter Array values");
		Scanner s=new Scanner(System.in);
		for(int i=0; i<10; i++) {
			a[i]=s.nextInt();
		}
		for(int i:a) {
			sum=sum+a[i];
		}
		logger.info("The total Array values are "+sum);
	}
}