package multiThread;

import java.io.File;

import java.util.concurrent.Callable;

import java.util.concurrent.ExecutorService;

import java.util.concurrent.Executors;

import java.util.concurrent.Future;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ThreadCall {
	
	static Logger logger=Logger.getLogger(ThreadCall.class);
	
	public static void main(String[] args) throws Exception {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		ExecutorService e=Executors.newFixedThreadPool(1);
		
		Future f=e.submit(new TCall());
		
		Future a=e.submit(()->{return "Hello.........";});
		
		logger.warn(f.get());
		
		logger.warn(a.get());
		
		e.shutdown();
		
	}
	
}

class TCall implements Callable{

	@Override
	public Object call() throws Exception {
		return "Hi........";
	}}