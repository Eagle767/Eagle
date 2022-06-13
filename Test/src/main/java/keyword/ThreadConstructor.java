package keyword;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ThreadConstructor {
	
	static Logger logger=Logger.getLogger(ThreadConstructor.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Process is Started..........");
		
		Edward1 a=new Edward1();//Thread is provided automatically in java
		
		a.Run();
		
		Edward e=new Edward();
		
		e.Run();
		
		logger.warn("The Process is Ended...........");
		
	}
	
}

class Edward{
	
	static Logger logger=Logger.getLogger(Edward.class);
	
	public Edward() {
		
		ExecutorService e=Executors.newFixedThreadPool(1);
		
		e.execute(()->{logger.error("I am Edward............");});
		
		e.shutdown();
		
	}
	
	public void Run() {
		
		for(int i=0;i<5;i++) {
			
			logger.info(i);
			
			try {
				
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				
			}
			
		}
		
	}
}

class Edward1{
	
	static Logger logger=Logger.getLogger(Edward.class);
	
	public Edward1() {
		
		ExecutorService e=Executors.newFixedThreadPool(1);
		
		e.execute(()->{logger.error("I am Edward1............");});
		
		e.shutdown();
		
	}
	
	public void Run() {
		
		for(int i=0;i<5;i++) {
			
			logger.info(i);
			
		}
		
	}
}