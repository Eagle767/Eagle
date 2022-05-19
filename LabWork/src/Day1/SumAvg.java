package Day1;

import java.util.Scanner;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class SumAvg {
	static Logger logger=Logger.getLogger(SumAvg.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		logger.info("Enter the Length");
		n=s.nextInt();
		int[] a=new int[n];
		logger.info("Enter Values");
		for(int i=0;i<n;i++) {
			//System.out.println("Enter Value "+i);
			a[i]=s.nextInt();
		}
		logger.info("Enter the Values are");
		int sum=0;
		for(int i=0;i<a.length;i++) {
			logger.info(a[i]);
			sum=sum+a[i];
		}
		logger.info("The Avarage Number is "+sum/n);
	}

}
