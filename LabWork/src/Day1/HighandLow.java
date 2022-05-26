package Day1;

import java.util.Scanner;

import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class HighandLow {
	static Logger logger=Logger.getLogger(HighandLow.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Scanner s=new Scanner(System.in);
		logger.info("Enter Length");
		int n=s.nextInt();
		logger.info("Enter Values");
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		logger.info("Enter the values are");
		for(int i=0;i<n;i++) {
			logger.info(a[i]+" ");
		}
		int temp=0;
		for(int k=0;k<n;k++) {
			for(int j=k+1;j<n;j++) {
				if(a[k]>a[j]) {
				temp=a[k];
				a[k]=a[j];
				a[j]=temp;
			} 
				
			}
		}
		logger.info("\n Ascending Order");
		for(int i=0;i<n;i++) {
			logger.info(a[i]+" ");
		}
		for(int l=0;l<n;l++) {
			for(int j=l+1;j<n;j++) {
				if(a[l]<a[j]) {
				temp=a[l];
				a[l]=a[j];
				a[j]=temp;
			}}
		}
		logger.info("\n Descending Order");
		for(int i=0;i<n;i++) {
			logger.info(a[i]+" ");

		}
	}

}
