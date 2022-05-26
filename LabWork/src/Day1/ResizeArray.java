package Day1;
import java.util.Arrays;
import java.util.Scanner;

import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class ResizeArray {
	static Logger logger=Logger.getLogger(ResizeArray.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		int[] a= {1,2,3,4,5};
		//for(int i=0;i<a.length;i++) {
			//logger.info(a[i]);
		//}
		//int[] b=new int[10];
		//b=a;\
		logger.info("enter Length");
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int[] b=Arrays.copyOf(a, m);
		logger.info("Enter values");
		for(int i=a.length;i<m;i++) {
			b[i]=s.nextInt();
		}
		logger.info("The values");
		for(int j=0;j<b.length;j++) {
			logger.info(b[j]+" ");
		}
		logger.info("\n first array"+Arrays.toString(a));
		logger.info("\n resized"+Arrays.toString(b));

	}

}
