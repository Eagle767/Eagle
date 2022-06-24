package Calculator;

import java.io.File;
import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class Add {
	static Logger logger=Logger.getLogger(Add.class);
	
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		abc d=new abc();
		d.add();
	}
	//logger.info("Enter First Value");
}
class abc{
	static Logger logger=Logger.getLogger(Add.class); 
	//logger.info("");
	void add() {
		Scanner s = new Scanner(System.in);
		int[] a=new int[2];
		int sum=0;
		for(int i : a) {
		logger.info("Enter Value");
		i=s.nextInt();
		sum=sum+i;
		}
		logger.info(sum);
	}
	
}
