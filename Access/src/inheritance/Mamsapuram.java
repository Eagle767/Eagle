package inheritance;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Mamsapuram {
	
	static Logger logger=Logger.getLogger(Mamsapuram.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Function is Stated.............");
		
		Vinoth v=new Vinoth();
		
		v.Invite();
		
		v.TravelBusBooking();
		
		v.PurchaseDrinks();
		
		v.FoodArrange();
		
		try {
			
			v.Fight();
			
		} catch (Exception e) {
			
			logger.error(e);
			
		}
		
		Amount Arun=Amount.b();
		
		Arun.amt=50;
		
		Arun.name="Arun";
		
		//Amount Sabai=Arun.b();
		
		Amount Sabai=Amount.b();
		
		Sabai.amt=100;
		
	    Sabai.name="Vinoth";
	    
	    logger.info(Sabai.name+" anna given amount:"+Sabai.amt);
	    
	    logger.info(Arun.name+" anna given amount:"+Arun.amt);
		
		logger.warn("The Function is Over................");
		
	}

}

abstract class Functions{
	
	static Logger logger=Logger.getLogger(Functions.class);
	
	void Invite() {
		
		logger.info("Welcome to all..................");
		
	}
	
	void FoodArrange() {
		
		ExecutorService es=Executors.newFixedThreadPool(1);
		
		es.execute(()->{
		
		Rice();});
		
		es.shutdown();
		
		ExecutorService es1=Executors.newFixedThreadPool(1);
		
		es1.execute(()->{Mutton();});
		
		es1.shutdown();
		
		ExecutorService es2=Executors.newFixedThreadPool(1);
		
		es2.execute(()->{Water();});
		
		es2.shutdown();
		
	}
	
	void Rice() {
		
		try {
			
			Thread.sleep(3000);
		
		} catch (InterruptedException e) {
		
		}
		
		logger.info("The Rice is Ready..............");
		
	}
	
	void Mutton() {
		
		try {
			
			Thread.sleep(7000);
		
		} catch (InterruptedException e) {
			
		}

		logger.info("The Mutton is Ready.............");
		
	}
	
	void Water() {
		
		try {
			
			Thread.sleep(100);
			
		} catch (InterruptedException e) {
			
		}
		
		logger.info("Anyone Need Water.............");
		
	}
	
}

class Vinoth extends Functions{
	
	void PurchaseDrinks() {}
	
	void TravelBusBooking() {
		
		Snacks();
		
	}
	
	void Snacks() {}
	
	void Fight() throws Exception {
		
		String c = null;
		
		if(c!="Comedy") {
		
		throw new UnWanted();
		
		}
		
		else {}
		
	}
	
}

class UnWanted extends Exception{
	
	public UnWanted() {}
	
	@Override
	public String toString() {
		
		return "Don't Repeat this............";
				
	}
	
}

class Amount implements Cloneable{
	
	private static Amount a;
	
	int amt;
	
	String name;
	
	static Logger logger=Logger.getLogger(Amount.class);
	
	private Amount() {
		
		logger.warn("The Amount obj is created..........");
		
	}
	
	public static void Amt() {}
	
	public static Amount b() {
		
		if(a==null) {
			
			a=new Amount();
			
			return a;
			
		}
		
		else {
			
			try {
				
				return a.c();
				
			} catch (Exception e) {
				
				return null;
				
			}

		}
		
	}
	
	private Amount c() {
		
		
		try {
			
			return (Amount)super.clone();
			
		} catch (CloneNotSupportedException e) {
			
			return null;
			
		}
		
		
	}
	
}