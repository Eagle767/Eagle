<<<<<<< HEAD
package access;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class GetObjectPerfect {
	
	static Logger logger=Logger.getLogger(GetObjectPerfect.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		Perfect p=Perfect.hi();
		
		Perfect d=Perfect.hi();
		
        Perfect a=Perfect.hi();
		
		Perfect b=Perfect.hi();
		
	}
	
}

class Perfect implements Cloneable{
	
	static Logger logger=Logger.getLogger(Perfect.class);
	
	private static Perfect p;
	
	private Perfect() {
		
		logger.warn("The Obj is Created............");
		
	}
	
	public static Perfect hi() {
		
		if(p==null) {
			
			p=new Perfect();
			
			return p;
			
		}
		
		else {
			
			logger.error("the Clone is Created..........");
			
			return p.tun();
	
		}
	}
		private Perfect tun() {
			
			try {
				
				return (Perfect)super.clone();
				
			} catch (CloneNotSupportedException e) {
				
				return null;
			
			}
				
		}
		
	
	
=======
package access;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class GetObjectPerfect {
	
	static Logger logger=Logger.getLogger(GetObjectPerfect.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		Perfect p=Perfect.hi();
		
		Perfect d=Perfect.hi();
		
        Perfect a=Perfect.hi();
		
		Perfect b=Perfect.hi();
		
	}
	
}

class Perfect implements Cloneable{
	
	static Logger logger=Logger.getLogger(Perfect.class);
	
	private static Perfect p;
	
	private Perfect() {
		
		logger.warn("The Obj is Created............");
		
	}
	
	public static Perfect hi() {
		
		if(p==null) {
			
			p=new Perfect();
			
			return p;
			
		}
		
		else {
			
			logger.error("the Clone is Created..........");
			
			return p.tun();
	
		}
	}
		private Perfect tun() {
			
			try {
				
				return (Perfect)super.clone();
				
			} catch (CloneNotSupportedException e) {
				
				return null;
			
			}
				
		}
		
	
	
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
}