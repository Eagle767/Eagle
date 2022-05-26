package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class InnerClassEx {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(InnerClassEx.class);
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Pepsi pepsiCo=new Pepsi();
		
		Kalimark kali=new Kalimark();
		
		pepsiCo.sellCola();
		kali.sellCola();
				
	}
}
class Pepsi{
	Logger logger = Logger.getLogger(InnerClassEx.class);
	public void sellCola() {
		Kalimark.CampaCola cc= new Kalimark().new CampaCola();
		cc.makeCola();
		logger.info("pepsi fills the cola in pepsi bottle and sells....");
	}
}
class Kalimark{
	Logger logger = Logger.getLogger(InnerClassEx.class);
	public void sellCola() {
		CampaCola cc=new CampaCola();
		cc.makeCola();
		logger.info("kalimark fills the cola in bovonto bottle and sells...");
	}
	class CampaCola{
		Logger logger = Logger.getLogger(InnerClassEx.class);
		public void makeCola() {
			logger.warn("campa cola makes cola...");
		}
	}
}











