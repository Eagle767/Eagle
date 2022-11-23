package access;
import java.io.File;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class ClassTest {

	static protected String str="HI It is Protected String";
	public static void main(String[] args) {
		Logger logger=Logger.getLogger(ClassTest.class);
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
	}
}

class Twenty{
	
	class d{
		 //static hiii h;
		class s{
			void meth() {
				int k=5;
			}
			//static class hiii{}
		}
		
		//static class hiii{}
			
		
	}
	static class ABC{
	    class hi {
	    	// static class b{}
	 	    	
	 	    
		}
	    static class b{
	    	
	    }
	}
}