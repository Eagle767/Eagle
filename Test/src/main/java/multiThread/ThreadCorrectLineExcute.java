package multiThread;

import java.io.File;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ThreadCorrectLineExcute {
	
	static Logger logger=Logger.getLogger(ThreadCorrectLineExcute.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		ExecutorService es=Executors.newFixedThreadPool(2);
		
		Perangi p=new Perangi();
		
		es.execute(()->{
			
			for(int i=0;i<3;i++){
				
				p.Shooter();
				
			}
			
		});
		
		es.execute(()->{
			
			for(int i=0;i<3;i++) {
				
				p.loader();
				
			}
			
		});
		
		es.shutdown();
		
	}
	
}

class Perangi{
	
	static Logger logger=Logger.getLogger(Perangi.class);
	
	boolean flag;
	
	synchronized public void loader() {
		
		if(flag) {
			
			try{wait();}catch(Exception e) {}
			
		}
			
			logger.info("The Loader is loded...........");
			
			flag=true;
			
			notify();
		
	}
	
	synchronized public void Shooter() {
		
		if(!flag) {
			
			try {wait();}catch(Exception e) {}
			
		}
			
			logger.info("The Shooter is shooted........");
			
			flag=false;
			
			notify();
		
	}
	
}