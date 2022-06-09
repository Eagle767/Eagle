package keyword;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class SuperKeyWord {
	
	static Logger logger=Logger.getLogger(SuperKeyWord.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Process is Started.............");
		
		Low l=new Low();
		
		l.met();
		
		VarLow vl=new VarLow();
		
		vl.met();
		
		ConsLow cl=new ConsLow();
		
		logger.warn("The Process is Stoped............");
		
	}

}

abstract class Top{
	
	static Logger logger=Logger.getLogger(Top.class);
	
	public void method() {
		
		logger.info("It is a Top met................");
		
	}
	
}

abstract class NextTop extends Top{
	
	public void met() {
		
		logger.info("It is a Nexttop met.................");
		
	}
	
}

abstract class Medium extends NextTop{
	
	public void met() {
		
		super.met();
		
		logger.info("It is a Medium met................");
		
	}
	
}

class Low extends Medium{
	
	public final void met() {
		
		super.method();
		
		super.met();
		
		logger.info("It is a Medium class............");
		
	}
	
}

abstract class KeyVar{
	
	static Logger logger=Logger.getLogger(KeyVar.class);
	
}

abstract class VarTop extends KeyVar{
	
	int b=100;
	
}

abstract class VarHigh extends VarTop{
	
	int a=11;
	
}

abstract class VarMedium extends VarHigh{
	
     int a=16;
	
}

class VarLow extends VarMedium{
	
	int a=15;
	
	void met() {
		
		logger.info("The Top is.........:"+b);
		
		logger.info("The Medium is...........:"+super.a);
		
		logger.info("The Low is..........:"+a);
		
	}
	
}

abstract class ConsSuper{
	
	static Logger logger=Logger.getLogger(ConsSuper.class);
	
}

abstract class ConsTop extends ConsSuper{
	
	public ConsTop(String s){
		
		logger.info("It is a Top Con.............");
		
	}
	
}

abstract class ConsMedium extends ConsTop{
	
	public ConsMedium(int i) {
		
		super("aaaa");
		
		logger.info("It is a Medium Con.............");
		
	}
	
}

class ConsLow extends ConsMedium{
	
	public ConsLow(){
		
		super(100);
		
		//super();
		
		logger.info("It is Low Con..............");
		
	}
	
}