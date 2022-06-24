package chapter6to10;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestCalculator {
	static Logger logger=Logger.getLogger(TestCalculator.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Calculator calc=new Calculator();
		
		calc.add1(10, 20);
		int result=calc.add2(100,20);
		logger.info(result);
		calc.add2(2,3);
		
		
		calc.add3(10,20);
		
		calc.add4(10,20,100,300,10);
		
		calc.add5(new int[] {10,20,30,40});
	}
}