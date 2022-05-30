package Test1;

import java.io.File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



//https://fluvid.com/videos/detail/n8Qdni_r2yIZnOEB_#.YpS6iTDeh8c.link
public class InheDemo {
	public static void main(String[] args) {
String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		Dominos dominos=new JahnaviPizza();
		dominos.sellPizza();
	}
}
abstract class Dominos{
	static Logger logger=Logger.getLogger(Dominos.class);
	private void makeDough() {
		logger.info("dough made as per the dominos logic..");
	}
	private void bakePizza() {
		logger.info("pizza baked as the dominos logic..");
	}
	private void addToppings() {
		logger.info("toppings added as per the dominos logic..");
	}
	private void packing() {
		logger.info("packing done as per dominos logic...");
	}
	final public void makePizza() {//this method is called template method
		makeDough();
		bakePizza();
		addToppings();
		packing();
	}
	final public void sellPizza() {//this method is called template method
		collectMoney();
		makePizza();
		delivery();
	}
	public abstract void delivery();
	public abstract void collectMoney();
}
class JahnaviPizza extends Dominos{
	@Override
	public void collectMoney() {
		logger.info("money is collected in US Dollors..");
	}
	@Override
	public void delivery() {
		logger.info("delivery done via benz car....");
	}
	
}