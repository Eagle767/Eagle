<<<<<<< HEAD
package inheritance;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ShopTest {
		
		static Logger logger=Logger.getLogger(InheritanceDemo.class);
		
		public static void main(String[] args) {
			
			String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
			
			PropertyConfigurator.configure(log4jConfigFile);
			
			logger.warn("The Process is Started........");
			
			Shop s=new SPKC();
			
			s.sellNote(s);
			
			s=new Roja();
			
			s.sellNote(s);
			
            s=new ClassMate();
			
			s.sellNote(s);
			
			logger.warn("The Process is Ended........");
		
	}
	
}

abstract class Shop extends Note{
	
	static Logger logger=Logger.getLogger(Shop.class);
	
	public Shop() {
		
		logger.info("The Shop is Open.......");
		
	}
	
	public void sellNote(Shop s) {
		
		logger.debug("You Choose the Company Name....:"+s);
		
		s.cost();
		
	}
	
}

abstract class Paper{
	
	static Logger logger=Logger.getLogger(Paper.class);
	
	public Paper() {
		
		logger.info("The Paper is ready........");
		
	}
	
}

abstract class Note extends Paper{
	
	static Logger logger=Logger.getLogger(Note.class);
	
	public Note() {
		
		logger.info("The Note is ready.......");
		
	}
	
    public void Binding() {
		
		logger.info("The Note is Binded.......");
		
	}
    
    public abstract void cost();
	
} 

class SPKC extends Shop{
	
	static Logger logger=Logger.getLogger(SPKC.class);
	
	public void cost() {
		
		logger.info("The Note cost is.......20");
		
	}
	
}

class ClassMate extends Shop{
	
	static Logger logger=Logger.getLogger(ClassMate.class);
	
	public void cost() {
		
		logger.info("The Note cost is.......30");
		
	}
	
}

class Roja extends Shop{
	
	static Logger logger=Logger.getLogger(Roja.class);
	
	public void cost() {
		
		logger.info("The Note cost is.......10");
		
	}
	
=======
package inheritance;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class ShopTest {
		
		static Logger logger=Logger.getLogger(InheritanceDemo.class);
		
		public static void main(String[] args) {
			
			String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
			
			PropertyConfigurator.configure(log4jConfigFile);
			
			logger.warn("The Process is Started........");
			
			Shop s=new SPKC();
			
			s.sellNote(s);
			
			s=new Roja();
			
			s.sellNote(s);
			
            s=new ClassMate();
			
			s.sellNote(s);
			
			logger.warn("The Process is Ended........");
		
	}
	
}

abstract class Shop extends Note{
	
	static Logger logger=Logger.getLogger(Shop.class);
	
	public Shop() {
		
		logger.info("The Shop is Open.......");
		
	}
	
	public void sellNote(Shop s) {
		
		logger.debug("You Choose the Company Name....:"+s);
		
		s.cost();
		
	}
	
}

abstract class Paper{
	
	static Logger logger=Logger.getLogger(Paper.class);
	
	public Paper() {
		
		logger.info("The Paper is ready........");
		
	}
	
}

abstract class Note extends Paper{
	
	static Logger logger=Logger.getLogger(Note.class);
	
	public Note() {
		
		logger.info("The Note is ready.......");
		
	}
	
    public void Binding() {
		
		logger.info("The Note is Binded.......");
		
	}
    
    public abstract void cost();
	
} 

class SPKC extends Shop{
	
	static Logger logger=Logger.getLogger(SPKC.class);
	
	public void cost() {
		
		logger.info("The Note cost is.......20");
		
	}
	
}

class ClassMate extends Shop{
	
	static Logger logger=Logger.getLogger(ClassMate.class);
	
	public void cost() {
		
		logger.info("The Note cost is.......30");
		
	}
	
}

class Roja extends Shop{
	
	static Logger logger=Logger.getLogger(Roja.class);
	
	public void cost() {
		
		logger.info("The Note cost is.......10");
		
	}
	
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
}