package collectionTest;

import java.io.File;

import java.util.function.Consumer;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ConsumerDemo implements Consumer<String>{
	
	static Logger logger=Logger.getLogger(ConsumerDemo.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start..................");
		
		Consumer<String> c=new ConsumerDemo();
		
		c.accept("Hello");
		
		logger.warn("End....................");
		
	}

	@Override
	public void accept(String t) {
		
		logger.info(t);
		
	}
	
}
