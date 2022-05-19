package Test;
//https://fluvid.com/videos/detail/-KRkYhqqxxtBpjBaR#.YnypwYcmA6E.link
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class ArrayDemo {
	static Logger logger=Logger.getLogger(ArrayDemo.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		int []a= {10,20,30,40};
		
		logger.info(a[0]);
		logger.info(a[2]);
		
		logger.info("The length of array.COLUMNS.."+a.length);
		
		int[][] twod= {
				{20,40,60},
				{30,50,70},
				{1,3,5},
			        {20,50,34}
		};
		
		logger.info(twod[0][0]);
		
		logger.info("No of rows..:"+twod.length);
		logger.info("No of columns..:"+twod[0].length);
		
		int columns=5;
		int[] arr=new int[columns];//declaring a array of size(columns) 5
		logger.info(arr.length);//this will print number of columns
		//By default the value zero will be assigned
		
		logger.info(arr[1]);
		
		int rows=3;
		
		int[][] twodarr=new int[rows][columns];
		logger.info(twodarr.length);//this will print number of rows
		
int[] ar= {20,30,40,50,60};
		
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+"\t");
		}
		
		System.out.println();
		
		//Enhanced For Loop - JDK 5
		
		for(int n:ar) {
			System.out.print(n+"\t");
		}
		System.out.println("\n\n");
		int[][] twd= {
				{10,20,30,40},
				{100,200,300,400},
				{1000,2000,3000,4000}
		};
		
		for(int i=0;i<twd.length;i++) {
			for(int j=0;j<twd[i].length;j++) {
				System.out.print(twd[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("\n\n");
		
		for(int n[]:twd) {
			for(int m:n) {
				System.out.print(m+"\t");
			}
			System.out.println();
	}}
}
