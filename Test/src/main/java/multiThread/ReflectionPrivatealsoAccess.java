package multiThread;

import java.io.File;

import java.lang.reflect.Field;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ReflectionPrivatealsoAccess {

	static Logger logger=Logger.getLogger(ReflectionPrivatealsoAccess.class);
	
	public static void main(String[] args) throws Exception {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("Start..............");
		
		Police p=new Police();
		
		Teacher t=new Teacher();
		
		Theif th=new Theif();
		
		p.normal(t);
		
		p.normal(th);
		
		p.ubnormal(t);
		
		p.ubnormal(th);
		
		logger.warn("End...............");
		
	}
	
}

class Police{
	
	static Logger logger=Logger.getLogger(Police.class);
	
	void normal(Object o) throws Exception {
		
		//Teacher t=(Teacher)o;
		
		//t.good();
		
		Class c=o.getClass();
		
		Field f=c.getField("name");
		
		logger.info(f.get(o));
		
		Method m=c.getMethod("good");
		
		m.invoke(o);
		
	}
	
	void ubnormal(Object o) throws Exception {
		
		Class c=o.getClass();
		
		Field f=c.getDeclaredField("weak");
		
		f.setAccessible(true);
		
		logger.info(f.get(o));
		
		Method m=c.getDeclaredMethod("bad");
		
		m.setAccessible(true);
		
		m.invoke(o);
		
	}
	
}

class Teacher{
	
	static Logger logger=Logger.getLogger(Teacher.class);
	
	public String name="Teacher1";
	
    private String weak="Not Good Listener.......";
    
    public void good() {
    	
    	logger.info("Teaching...........");
    	
    }
    
    private void bad() {
    	
    	logger.error("Sick...........");
    	
    }
	
}

class Theif{
	
	static Logger logger=Logger.getLogger(Theif.class);
	
	public String name="Raju";
	
    private String weak="I am Bad.......";
	
    public void good() {
    	
    	logger.info("I am currently working in America..........");
    	
    }
    
    private void bad() {
    	
    	logger.error("Evil........");
    	
    }
    
}