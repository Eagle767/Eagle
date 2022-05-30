package LabWork;
import java.io.File;
import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class PrimeNumber {
	static Logger logger=Logger.getLogger(PrimeNumber.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Scanner s=new Scanner(System.in);
		logger.info("Enter any Number");
		int a=s.nextInt();
		boolean prime=true;
		int temp;
		s.close();
		for(int i=2;i<=a/2;i++) {
			temp=a%i;
			if(temp==0) {
				prime=false;
				break;
			}
			
		}
		if(prime) {
			logger.info("It is Prime Number \n");
		}
		else{
			logger.info("It is not Prime Number \n");
		}
		logger.info("PRIME NUMBERS 0 to 1000 \n");
		for(int j=0;j<=1000;j++) {
			
			if((j==0 || j==1 || j==2 || j==3 || j==5 || j==7) || (j%2!=0 && j%3!=0 && j%5!=0 && j%7!=0) ) {
				logger.info("Prime Numbers : "+j);
			}
			
			else {
				//logger.info("Other Numbers : "+j);
			}
		}
	}
}
