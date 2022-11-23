package chapter6to10;

import org.apache.log4j.Logger;

public class Calculator {
	static Logger logger=Logger.getLogger(TestCalculator.class);
	void add1(int i,int j) {
		int sum=i+j;
		logger.warn("the sum of "+i+"and "+j+"is..:"+sum);
	}
	
	int add2(int i,int j) {
		int c=i+j;
		logger.info(c);
		return i+j;
	}
	
	void add3(int i,int j) {
		display(i+j);
	}
	
	void display(int s) {
		logger.info("The result is..:"+s);
	}
	
	void add4(int ...i) {
		int result=0;
		for(int s:i) {
			result=result+s;
		}
		logger.error("The result is ...:%d"+result);
	}
	
	void add5(int i[]) {
		int result=0;
		for(int s:i) {
			result=result+s;
		}
		System.out.printf("The result is ...:%d", result);
	}
}
