package Test;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//https://fluvid.com/videos/detail/37jwQh99Gwfe4YBn1#.YntCYYpREFw.link
public class OperatorsDemo {
	static Logger logger=Logger.getLogger(OperatorsDemo.class);
	public static void main(String[] args) {
		String log4jConfigFile = System.getProperty("user.dir") + File.separator + "log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		//Arithmetic operators
		//+,-,*,%,/
		
		int n1=10;
		int n2=2;
		//Addition
		logger.info(n1+n2);
		//Substraction
		logger.info(n1-n2);
		//multiplication
		logger.info(n1*n2);
		//division - quotient
		logger.info(n1/n2);
		//mod - reminder
		logger.info(n1%n2);
		
		//increment and decrement operators
		int i=n1++;//this will allocate and then increment
		i=++n1;//n1=n1+1; - it will increment and allocation
		logger.info(i);//11
		
		int x=20;
		
		logger.info(x++);//first it will print and then increment
		logger.info(x);
		
		x=20;
		logger.info(x--);//first it will print and then decrement
		logger.info(x);
		
		x=20;
		
		logger.info(++x);//first it will increment and then print
		logger.info(x);
		
		x=20;
		logger.info(--x);//first it will decrement and then print
		logger.info(x);
		
		x=20;
		//x=x+4;
		x+=4;
		logger.info(x);
		
		x=20;
		//x=x-5;
		x-=5;
		logger.info(x);
		
		x=20;
		//x=x*2;
		x*=2;
		logger.info(x);
		
		x=20;
		//x=x/3;
		x/=3;
		logger.info(x);
		
		x=20;
		//x=x%3;
		x%=3;
		logger.info(x);
		
		
		//Relational Operators = ==, !=, <, >, <=, >=
		
		int num1=100;
		int num2=200;
		logger.info(num1==num2);//false
		logger.info(num1!=num2);//true
		logger.info(num1<num2);//true
		logger.info(num1>num2);//false
		logger.info(num1<=num2);//either or - true
		logger.info(num1>=num2);//false
		
		logger.info(!(num1>=num2));//false
		
		//Logical operators = &&, ||, !
		
		logger.info(num1<num2 || num1==101);//true because either or
		
		logger.info(num1<num2 && num1==101);//false - will return true only if both the conditions are satisfied
	}
}