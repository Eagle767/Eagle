package multiThread;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class GenaricTypeThread {
	
	static Logger logger=Logger.getLogger(GenaricTypeThread.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		School<Partion1> b=new School<>();
		
		Partion1 p=new Partion1();
		
		Partion2 pp=new Partion2();
		
		b.setobj(p);
		
		b.getobj();
		
		p=(Partion1)b.getobj();
		
		logger.error(p);
		
		p.sec();
		
		b.getobj();
		
	}
	
}

class Good{}

class MediumGood{}

class LiteGood{}

class Bad{}

class School<S>{
	
	static Logger logger=Logger.getLogger(School.class);
	
	private S a;
	
	public S getobj() {
	
		logger.warn("It is Provided.........."+a);
		
		return this.a;
		
	}
	
	public void setobj(S a) {
		
		this.a=a;
		
		logger.warn("It is Setted to....."+a);
		
	}
	
}

class Partion1{
	
	static Logger logger=Logger.getLogger(Partion1.class);
	
	void sec() {
		
		logger.debug("The Partion1 is Construct..........");
		
	}
	
}

class Partion2{}