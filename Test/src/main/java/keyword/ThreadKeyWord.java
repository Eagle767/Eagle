package keyword;

import java.io.File;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ThreadKeyWord {
	
	static Logger logger=Logger.getLogger(ThreadKeyWord.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Process is Started..............");
		
		logger.debug("Simple Fun 1..........");
		
//		fun();  //Time loss
//		
//		Thread t=new Thread(new Runner());  //old Method
//		
//		t.start();
	
		ExecutorService e=Executors.newFixedThreadPool(1);
		
		e.execute(()->{fun();});
		
		e.shutdown();
		
		logger.debug("Simple Fun 2............");
		
		logger.warn("The Process is Ended....................");
		
	}
	
	static void fun() {
		
		try {
			
			Thread.sleep(7000);
		
		} catch (InterruptedException e) {
		
		}
		
		logger.info("The Big Fun is Started............");
		
	}

}

class Runner implements Runnable{

	static Logger logger=Logger.getLogger(Runner.class);
	
	@Override
	public void run() {
		
		try {
			
			Thread.sleep(4000);
		
		} catch (InterruptedException e) {
		
		}
		
		logger.info("The Big Fun also is Started...........");
		
	}
	
}