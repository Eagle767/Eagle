package chapter6to10;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
class ClassDemo {
	static Logger logger=Logger.getLogger(ClassDemo.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Demo obj=new Demo();
		obj.met(20,30,"hello");
		
		int[] a=new int[] {10,20,30,40};
		obj.met2(a);//indirect
		
		obj.met2(new int[] {10,30,40,50});//direct
		
		
		obj.met3(120,34,56,67,78);//we are passing arguments
		
		int b[]=obj.met3(20,30,40);
		for(int i:b) {
			logger.warn("........."+i);
			Test s=new Test();//this is how we create a objet of a class
			s.met();
			s.met2();
		}
	}
}
class RedPaint{//Classification class - Strictly should be either individual or under a category
	
}
abstract class Paint{//Classifier Class - Strictly common noun
	
}
interface Painter{//Action Class - Strictly Role - Classfier Class
	
}

//package ch6to10;
 class ClassDemo2 {
	 
 }
	//public static void main(String[] args) {
		
	

class Test{
	//Primitive types or simple types
	static Logger logger=Logger.getLogger(Test.class);
	int i;//variables declared outside the methods are called INSTANCE VARIABLES - denotes state
	
	void met() { //- denotes behavior
		//INSTANCE VARIABLES are initialized by default but local variables are
		//not initialized by default
		int meti=10;//local variable
		logger.debug(i);
		logger.error(meti);
	}
	void met2() {
		logger.info(i);
	}
}

//package ch6to10;
 class ClassDemo3 {
}
class Bank{
	
	boolean depositCash(int amt) {
		if(amt >1000) {
			return true;
		}
		else {
			return false;
		}
	}
	
	long getMoney() {
		return (long)100l;
	}
	
	String getName() {
		return "ram";
	}
}
class ClassDemo4 {
	
}
class Demo{
	static Logger logger=Logger.getLogger(ClassDemo.class);
	void met(int i,int j,String s) {
		logger.error(i+":"+j+":"+s);
	}
	
	void met2(int a[]) {//method is accepting parameters
		for(int i:a) {
			logger.info(i);
		}
	}
	int[]  met3(int ...a) {//variable arguments (VARARGS)
		for(int i:a) {
			logger.debug(i);
		}
		return a;
	}
}