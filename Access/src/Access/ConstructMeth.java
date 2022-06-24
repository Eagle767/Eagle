package Access;

import java.io.File;

import org.apache.log4j.Appender;
import org.apache.log4j.Category;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.spi.LoggingEvent;

public class ConstructMeth {
	static Logger logger=Logger.getLogger(ConstructMeth.class);
	
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		ABC g=new ABC();
		ABC h=new ABC("hi");
		ABC i=new ABC(20.5);
		ABC j=new ABC(2.678);
		ABC k=new ABC(2,3,4);
		ABC l=new ABC(2);
		int d=k.Vol();
		System.out.println(d);
		int e=j.Vol();
		System.out.println(e);
		int f=i.Vol();
		System.out.println(f);
		int a=h.Vol();
		System.out.println(a);
		int b=g.Vol();
		System.out.println(b);
		int c=l.Vol();
		System.out.println(c);
		g.equals(g);
		logger.error(g);
		//Logger.shutdown();
		g.sys();
		}
}
class ABC{
	
	
	static Logger logger=Logger.getLogger(ConstructMeth.class);
	int a,b,c;
	Appender Appender3;
	LoggingEvent LoggingEvent1;
	Throwable v;
	private Appender a2;
	ABC(){
		a=5;
		b=2;
		c=3;
		logger.info("Construct Meth.....");
	}
	ABC(int i,int j,int k){
		a=i;
		b=j;
		c=k;
		logger.info(i+j+k);
	}
	ABC(String s){
		logger.warn(s);
	}
	ABC(int a){
		System.out.println(a);
	}
	ABC(float b){
		System.out.println(b);
	}
	ABC(double c){
		System.out.println(c);
	}
	int Vol() {
		return a*b*c;
	}
	void sys() {
	    Appender appender = Appender3;
	    LoggingEvent event = LoggingEvent1;
		a2 = appender;
		logger.addAppender(appender);
		logger.error(a2);
		logger.info("HI");
		boolean b=false;
		if(b==false) {
		logger.assertLog(false ,"Warning....");
		}
		else {
		logger.assertLog(true ,"Go");
	}
		
		//logger.callAppenders(event);
		logger.debug(a2, v);
		
	}
}