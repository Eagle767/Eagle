<<<<<<< HEAD
package inheritance;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class InheritanceDemo {
	
	static Logger logger=Logger.getLogger(InheritanceDemo.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Process is Started........");
		
		Omga o=new Omga();
		
		o.connected();
		
        Orient oo=new Orient();
		
		oo.connected();
		
		BigToSmall b=new BigToSmall();
		
		b.connected();
		
		logger.warn("The Process is Ended........");
		
	}
	
}

abstract class SmallBulbFiting{
	
	public abstract void connected(ZeroWattsBulb zero); 
	
}

abstract class ZeroWattsBulb{
	
	public abstract void connected(); 
	
}

abstract class BigBulbFiting{
	
	public abstract void connected(FortyWattsBulb zero);
	
} 

abstract class FortyWattsBulb{
	
	public abstract void connected(); 
	
}

class Orient extends ZeroWattsBulb{
	
	static Logger logger=Logger.getLogger(Orient.class);
	
	public void connected() {
		
		logger.info("The Zero Watts Orient Bulb is Working.........");
		
	}
	
}

class Omga extends FortyWattsBulb{
	
static Logger logger=Logger.getLogger(Omga.class);
	
	public void connected() {
		
		logger.info("The Forty Watts Omga Bulb is Working.........");
		
	}
	
}

class BigToSmall extends Orient{
	
	static Logger logger=Logger.getLogger(BigToSmall.class);
	
	SmallBulbFiting sm;
	
	BigToSmall(){
		
		logger.warn("The adapter is used to this function........");
		
	}
	
	BigToSmall(SmallBulbFiting sm){
		
		this.sm=sm;
		
	}
	
    public void connected() {
		
		logger.info("The Forty Watts to zero Watts Bulb is Chenged.........");
		
	}
=======
package inheritance;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class InheritanceDemo {
	
	static Logger logger=Logger.getLogger(InheritanceDemo.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Process is Started........");
		
		Omga o=new Omga();
		
		o.connected();
		
        Orient oo=new Orient();
		
		oo.connected();
		
		BigToSmall b=new BigToSmall();
		
		b.connected();
		
		logger.warn("The Process is Ended........");
		
	}
	
}

abstract class SmallBulbFiting{
	
	public abstract void connected(ZeroWattsBulb zero); 
	
}

abstract class ZeroWattsBulb{
	
	public abstract void connected(); 
	
}

abstract class BigBulbFiting{
	
	public abstract void connected(FortyWattsBulb zero);
	
} 

abstract class FortyWattsBulb{
	
	public abstract void connected(); 
	
}

class Orient extends ZeroWattsBulb{
	
	static Logger logger=Logger.getLogger(Orient.class);
	
	public void connected() {
		
		logger.info("The Zero Watts Orient Bulb is Working.........");
		
	}
	
}

class Omga extends FortyWattsBulb{
	
static Logger logger=Logger.getLogger(Omga.class);
	
	public void connected() {
		
		logger.info("The Forty Watts Omga Bulb is Working.........");
		
	}
	
}

class BigToSmall extends Orient{
	
	static Logger logger=Logger.getLogger(BigToSmall.class);
	
	SmallBulbFiting sm;
	
	BigToSmall(){
		
		logger.warn("The adapter is used to this function........");
		
	}
	
	BigToSmall(SmallBulbFiting sm){
		
		this.sm=sm;
		
	}
	
    public void connected() {
		
		logger.info("The Forty Watts to zero Watts Bulb is Chenged.........");
		
	}
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
}