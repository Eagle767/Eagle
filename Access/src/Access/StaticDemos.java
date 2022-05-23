package Access;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class StaticDemos {
	static Logger logger=Logger.getLogger(StaticDemos.class);
	 static void display1() {
			// TODO Auto-generated method stub
			logger.info("It is Method");
		}
	public static void main(String[] abc) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.properties";
		PropertyConfigurator.configure(log4jConfigFile);
		logger.info("HI");
		logger.info(Human.b);
		display1();
		Human.pen();
		//logger.info(Human.a);
		//logger.info(Human.c);
		Human h=new Human();
		logger.info(h.a);
		h.abc();
		h.display();
	    logger.info(h.display());
	    h.display2("Hi Muthu how are you");
	   // logger.info(h.display2);
	    h.display3="HI Eagle";
	   logger.info(h.display3);
	    
	  
	}
}
class Human{
	
	static Logger logger=Logger.getLogger(StaticDemos.class);
	int a=5,d=50;
	static int e=7,b=10;
	void abc() {
		int c=a+b;
		logger.info(c);
	}
	int x=5;
	int display() {
		int c=a+b;
		logger.info(c);
		return c;
	}
	static void pen() {
		int c=e+b;
		logger.info(c);
		display1();
	}
	
    static void display1() {
		// TODO Auto-generated method stub
	logger.info("HI Muthu ");
	}
    String display3;
    void display2(String g) {
    	String t=g;
    	logger.info(g);
    	logger.info(t);
    	display3(2011,"Dhoni",'7');
    }
    static void display3(int a, String b, char c) {
    	logger.info(a+" this year India Won World Cup at the time Captain is "+b+" Jersy No is "+c);
       // display2("HI");
    }
}