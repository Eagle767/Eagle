package Access;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class PassByValue {
	static Logger logger=Logger.getLogger(PassByValue.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Laddu laddu=new Laddu();
		laddu.size=10;
		
		logger.info("Size of laddu before PBV..:"+laddu.size);//10
		new PBV().accept(laddu.size);
		logger.info("Size of laddu after PBV..:"+laddu.size);
		//logger.info("Size of laddu after PBV..:"+laddu.size);//10
		
		
		logger.info("Size of laddu before PBR..:"+laddu.size);//10
		new PBR().accept(laddu);
		logger.info("Size of laddu after PBR...:"+laddu.size);//5
	}
	
}
class PBV{
	public void accept(int size) {
	    size= size-5;
	}
}
class PBR{
	public void accept(Laddu laddu) {
		laddu.size= laddu.size-5;
	}
}
class Laddu{
	int size;
}