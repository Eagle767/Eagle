package Day1;
import java.io.File;
import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class DisplayArray {
	static Logger logger=Logger.getLogger(DisplayArray.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
			Scanner s=new Scanner(System.in);
			
			//int[][] a= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
			//int n=a.length;
			logger.info("Enter Length");
			 int n=s.nextInt();
			int[][] a=new int[n][n];
			for(int i=0;i<n;i++) {
				int b=i+1;
				logger.info("The "+b+" Row Value");
				for(int j=0;j<n;j++) {
					a[i][j]=s.nextInt();
				}
				
			}
			logger.info("Enter Array values is");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(a[i][j]+"  ");
				}
				logger.info("\n");
			}

	}

}
