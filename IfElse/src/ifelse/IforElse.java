package ifelse;
import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
public class IforElse {
	static Logger logger=logger.getLogger(IforElse);
	public static void main(String[] args) {
		int a,b;
		Scanner s=new Scanner(System.in);
		logger.info("Type A Value");
		a=s.nextInt();
		logger.info("Type B Value");
		b=s.nextInt();
		if(a==b) {
			System.out.print(true);
		}
		else {
			System.out.print(false);
		}		
	}

}
