package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//https://fluvid.com/videos/detail/-KRkYhqQ21hB9ygO2#.YpRVFbpklsg.link
public class InheritanceDemo {
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(InheritanceDemo.class);
		//since subclass is a kind of super class, the subclass object can be assigned to super class reference type
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		SuperClass sc=new SubClass();
		logger.info(sc.name);
		sc.met();
		sc.absmet();
	}
}
//Good Rules pertaining to Inheritance - They are not compulsory but good
/*
* 1. The super class should be either abstract or interface
* 2. The super class can have methods or need not have methods
* 3. Since the super class is abstract or interface, its object cannot be created
* 4. If you have to create a object of the super class then you need inherit that class with child class
* 5. The super class can have abstract methods.
* 6. The super class can have non abstract methods, but they should be declared final or private
* 7. All the public, nomodifier and protected properties of super class will be visible in sub class
*
*/
abstract class SuperClass{
	static Logger logger=Logger.getLogger(SuperClass.class);
	public SuperClass() {
		logger.warn("super class cons called...");
	}
	final String name="anound";//final variables are constants - value cannot be changed
	final public void met() {//make sure the method is declared final, so that the method cannot be overriden
		logger.info("met of super class called.....");
	}
	abstract void absmet() ;
}
class SubClass extends SuperClass{
	//you can override the non private and non final methods of the super class
	public void absmet() {
		logger.error("met of sub class called............");
	}
}
