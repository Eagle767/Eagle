package keyword;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class CloneObject {
	
	static Logger logger=Logger.getLogger(CloneObject.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.warn("The Process is Started...........");
		
		SingleTon s=new SingleTon();
		
		SingleTon s1=s;
		
		s1.a=10;
		
		logger.error(s.a);
		
		s.a=15;
		
		logger.error(s1.a);
		
		MultiTon m=new MultiTon();
		
		MultiTon n=new MultiTon(); //MultiTon m=n; n=new MultiTon();
		
		m.b=10;
		
		n.b=14;
		
		logger.info(m.b);
		
		logger.info(n.b);
		
		Clone c=new Clone();
		
		Clone c1=c.getamt();
		
		c.amount=100;
		
		c1.amount=200;
		
		logger.info(c.amount);
		
		logger.info(c1.amount);
		
		logger.warn("The Process is ended.............");
		
	}

}

class SingleTon {
	
	int a;
	
	static Logger logger=Logger.getLogger(SingleTon.class);
	
	public SingleTon(){
		
		logger.warn("The Single is Created...........");
		
	}
	
}

class MultiTon {
	
	int b;
	
	static Logger logger=Logger.getLogger(MultiTon.class);
	
	public MultiTon() {
		
		logger.warn("The Multiple Is created..........");
		
	}
	
}

class Clone implements Cloneable {
	
	static Logger logger=Logger.getLogger(Clone.class);
	
	int amount;
	
	public Clone() {
		
		logger.warn("The Obj is Created............");
		
	}
	
	public Clone getamt() {
		
		try {
		
			return (Clone)super.clone();//Clone is Protected and also some exception is coming
		
		}catch(Exception e) {}
		
		return null;
		
	}
	
}