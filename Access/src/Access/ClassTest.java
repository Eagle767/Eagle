package Access;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

class ClassTest {
	static Logger logger=Logger.getLogger(ClassTest.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		one c=new one();
		c.abc();
		int d=c.abc();
		logger.info(d);
		Ten a=new Ten();
		//Twenty b=new Twenty();
	}
}
class one{
	static Logger logger=Logger.getLogger(ClassTest.class);
	public one() {
		logger.warn("It is Public........");
	}
	int abc() {
		return 10;
	}
}
class Ten{
	static Logger logger=Logger.getLogger(ClassTest.class);
	protected Ten() {
		logger.warn("It is Protected.....");
	}
}
class Twenty{
	static Logger logger=Logger.getLogger(ClassTest.class);
	private Twenty() {
		logger.warn("It is Private.....");
	}
}