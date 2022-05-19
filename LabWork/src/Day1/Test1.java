package Day1;
import java.io.File;
import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class Test1 {
	static Logger logger=Logger.getLogger(Test1.class);
	public static void Avg() {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		logger.info("Enter the Length");
		n=s.nextInt();
		int[] a=new int[n];
		logger.info("Enter Values");
		for(int i=0;i<n;i++) {
			//logger.info("Enter Value "+i);
			a[i]=s.nextInt();
		}
		logger.info("Enter the Values avg is");
		int sum=0;
		for(int i=0;i<a.length;i++) {
			//logger.info(a[i]);
			sum=sum+a[i];
		}
		logger.info(sum/n);
	}

}
