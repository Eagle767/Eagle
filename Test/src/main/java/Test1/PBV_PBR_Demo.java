package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PBV_PBR_Demo {
	static Logger logger=Logger.getLogger(PBV_PBR_Demo.class);
	public static void main(String[] args) {
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		PropertyConfigurator.configure(log4jConfigFile);
		Laddu laddu=new Laddu();
		laddu.size=10;
		
		logger.info("Size of laddu before PBV..:"+laddu.size);//10
		new PBV().accept(laddu.size);
		logger.info("Size of laddu after PBV..:"+laddu.size);
		logger.info("Size of laddu after PBV..:"+laddu.size);//10
		
		
		logger.info("Size of laddu before PBR..:"+laddu.size);//10
		new PBR().accept(laddu);
		logger.info("Size of laddu after PBR...:"+laddu.size);//5
		
		Mutability a=new Mutability();
		a.display();
	}
	
}
class PBV{
	public void accept(int size) {
		size=size-5;
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
class Mutability {
	static Logger logger=Logger.getLogger(Mutability.class);
	void display() {
		
		//simple  types - pass by value..
		int n=100;
		
		int k=n;
		
		n=n+100;
		//int k=n;
		logger.info(n);
		
		logger.info(k);
		
		String str="hello";
		
		String temp=str;
		
		str=str+"world............";
		
		logger.info(str);
		logger.info(temp);
		
		//complex type - pass by reference
		World w=new World();
		World tempw=w;
		//World tempw=new World();
		//tempw=w;
		
		w.size=110000;
		
		logger.info(w.size);
		logger.info(tempw.size);
	}
}
class World{
	int size=10;
}











