package keyword;

import java.io.File;

import java.lang.ref.SoftReference;

import java.lang.ref.WeakReference;

import java.time.temporal.WeekFields;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class GCKeyWord {
	
	static Logger logger=Logger.getLogger(GCKeyWord.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Process is Started............");
		
		Runtime r=Runtime.getRuntime();
		
		r.gc();
		
		logger.info(r.freeMemory());
		
		Road ro=new Road();
		
		WeakReference weak=new WeakReference(ro);
		
		r.gc();
		
		logger.info(r.freeMemory());
		
		Roads rs=new Roads();
		
		SoftReference soft=new SoftReference(rs);
		
		r.gc();
		
		logger.info(r.freeMemory());
		
		logger.warn("The Process is ended...........");
		
		ro=null;
		
		r.gc();
		
		logger.info(r.freeMemory());
		
		rs=null;
		
		r.gc();
		
		logger.info(r.freeMemory());
		
		rs=(Roads)soft.get();
		
		logger.error(rs);
		
		//r=(Road)weak.get();
		
	}

}

class Road{
	
	int a=11,b=5;
	
	static Logger logger=Logger.getLogger(Road.class);
	
	@Override
	protected void finalize() throws Throwable {
		
		logger.debug("It is a Road Property...........");
		
	}
	
}

class Roads{
	
	static Logger logger=Logger.getLogger(Roads.class);
	
	int a=10;
	
	public Roads() {
		
		for(int i=0;i<a;i++) {
			
			//logger.warn(i);
			
		}
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		
		logger.debug("It is a Roads Properties...............");
		
	}
	
}
