package Day1;

import java.util.Scanner;
<<<<<<< HEAD

public class ReverseArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Length");
		int n=s.nextInt();
		System.out.println("Enter Values");
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Enter the values are");
		for(int i=n-1;i>=0;i--) {
			System.out.print(a[i]+" ");
=======
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class ReverseArray {
	static Logger logger=Logger.getLogger(ReverseArray.class);
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
		for(int i=n-1;i>=0;i--) {
			logger.info(a[i]+" ");
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
		}

}}
