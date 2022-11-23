<<<<<<< HEAD
package access;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class AbstractTest {
	
	static Logger logger=Logger.getLogger(AbstractTest.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Output is Displayed..........");
		
		Muthu m=new Muthu();
		
		m.display();
		
		Kumar k=new Kumar();
		
		k.display();
		
		
		
	}

}

abstract class School{
	
	static Logger logger=Logger.getLogger(School.class);
	
	School(){
		
		logger.info("My School Name is AVM");
		
	}
	
	abstract void tamil();
	
	abstract void english();
	
}

interface Tamil{
	
	void tamil();
	
}

interface English{
	
	void english();
	
}

abstract class OneStd extends School implements Tamil,English{
	
	OneStd(){
		
		logger.warn("I am 1st Standard.......");
		
	}
	
    public abstract void tamil();
	
	public abstract void english();
	
}

abstract class TwoStd extends School implements Tamil,English{
	
     TwoStd(){
		
		logger.warn("I am 2nd Standard.......");
		
	}
	
    public abstract void tamil();
	
	public abstract void english();
	
}

abstract class Medical{}

class Muthu extends TwoStd{
	
     Muthu(){
		
		logger.warn("I am Muthu.......");
		
	}
	
	public void tamil() {
		
		logger.debug("Tamil 2nd Standard Learning.......");
		
	}
	
	public void english() {
		
		logger.debug("English 2nd Standard Learning.......");
		
	}
	
	public void cricket() {
		
		logger.info("Playing Cricket.....");
		
	}
	
	void display() {
		
		tamil();
		
		english();
		
		cricket();
		
	}
	
}

class Kumar extends OneStd{
	
    Kumar(){
		
		logger.warn("I am Kumar.......");
		
	}
	
    public void tamil() {
		
		logger.debug("Tamil 1st Standard Learning.......");
		
	}
	
	public void english() {
		
		logger.debug("English 1st Standard Learning.......");
		
	}
	
	void display() {
		
        tamil();
		
		english();
		
	}
	
=======
package access;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class AbstractTest {
	
	static Logger logger=Logger.getLogger(AbstractTest.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Output is Displayed..........");
		
		Muthu m=new Muthu();
		
		m.display();
		
		Kumar k=new Kumar();
		
		k.display();
		
		
		
	}

}

abstract class School{
	
	static Logger logger=Logger.getLogger(School.class);
	
	School(){
		
		logger.info("My School Name is AVM");
		
	}
	
	abstract void tamil();
	
	abstract void english();
	
}

interface Tamil{
	
	void tamil();
	
}

interface English{
	
	void english();
	
}

abstract class OneStd extends School implements Tamil,English{
	
	OneStd(){
		
		logger.warn("I am 1st Standard.......");
		
	}
	
    public abstract void tamil();
	
	public abstract void english();
	
}

abstract class TwoStd extends School implements Tamil,English{
	
     TwoStd(){
		
		logger.warn("I am 2nd Standard.......");
		
	}
	
    public abstract void tamil();
	
	public abstract void english();
	
}

abstract class Medical{}

class Muthu extends TwoStd{
	
     Muthu(){
		
		logger.warn("I am Muthu.......");
		
	}
	
	public void tamil() {
		
		logger.debug("Tamil 2nd Standard Learning.......");
		
	}
	
	public void english() {
		
		logger.debug("English 2nd Standard Learning.......");
		
	}
	
	public void cricket() {
		
		logger.info("Playing Cricket.....");
		
	}
	
	void display() {
		
		tamil();
		
		english();
		
		cricket();
		
	}
	
}

class Kumar extends OneStd{
	
    Kumar(){
		
		logger.warn("I am Kumar.......");
		
	}
	
    public void tamil() {
		
		logger.debug("Tamil 1st Standard Learning.......");
		
	}
	
	public void english() {
		
		logger.debug("English 1st Standard Learning.......");
		
	}
	
	void display() {
		
        tamil();
		
		english();
		
	}
	
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
}