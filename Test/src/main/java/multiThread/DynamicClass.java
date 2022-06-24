package multiThread;

import java.io.File;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class DynamicClass {

	static Logger logger=Logger.getLogger(DynamicClass.class);
	
	public static void main(String[] args) throws Exception{
	
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("start...............");
		
		Simple ss=new Simple();
		
		logger.info("It is Static Object.................."+ss);
		
		Simple s=(Simple)Class.forName("multiThread.Simple").newInstance();
		
		logger.info(s);
		
		s=(Simple)Class.forName("multiThread.Simple").getConstructor().newInstance();
		
		logger.info(s);
		
		s=(Simple)Class.forName("multiThread.Simple").getConstructor(int.class).newInstance(10);
		
		logger.info(s);
		
		s=(Simple)Class.forName("multiThread.Simple").getConstructor(String.class,char.class).newInstance("HI.......",'M');
		
		logger.info(s);
		
		s=(Simple)Class.forName("multiThread.Simple").getConstructor(Fun.class).newInstance(new Fun(10));
		
		logger.info(s);
		
		s.runner("Hi",10);
		
		Class c=s.getClass();
		
		Method m=c.getMethod("runner",String.class,int.class);
		
		logger.info(m);
		
		m.invoke(s, "Hiiiiiiiiii",150);
		
		logger.warn("end.................");
		
	}
	
}

class Simple{
	
	static Logger logger=Logger.getLogger(Simple.class);
	
	public Simple() {
		
		logger.debug("It is empty cons................");
		
	}
	
	public Simple(int i) {
		
		logger.debug(i);
		
	}
	
	
	public Simple(String s,char c) {
		
		logger.debug(s+"................."+c);
		
	}
	
	public Simple(Fun f) {
		
		logger.debug(f);
		
	}
	
	public void runner(String s,int i) {
		
		logger.info("Running...................."+s+"..............."+i+"m");
		
	}
	
}

class Fun{
	
	static Logger logger=Logger.getLogger(Fun.class);
	
	public Fun(int i) {
		
		logger.debug(i+" is Fun Number");
		
	}
	
}
