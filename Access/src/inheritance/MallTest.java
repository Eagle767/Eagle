package inheritance;

import java.io.File;

import org.apache.log4j.Logger;

import org.apache.log4j.PropertyConfigurator;

public class MallTest {
	
	static Logger logger=Logger.getLogger(MallTest.class);
	
	public static void main(String[] args) {
		
		String log4jConfigFile=System.getProperty("user.dir")+File.separator+"log4j.Properties";
		
		PropertyConfigurator.configure(log4jConfigFile);
		
		logger.info("The Process is Started................");
		
		Mall m=new Venila(new Starwberry(new Male(new Venila(new Chicken65(new Shirt(new PeparChicken(new FeMale())))))));
		
		int c=m.Cost();
		
		logger.debug("The Total cost is..............."+c);
		
		Mall b=new Venila();
		
		int a=b.Cost();
		
		logger.debug("The Venila cost is..............."+a);
		
		logger.info("The Process is Ended.............");
		
	}
	
}

interface GVTTax{
	
	void Tax();
	
}

abstract class Mall implements GVTTax{
	
	static Logger logger=Logger.getLogger(Mall.class);
	
	int Rent=50000;
	
	String MallName="SkyWalk";
	
	void ele() {
		
		logger.debug("Electrical Team are inside team only..........");
		
	}
	
	void AC() {
		
		logger.debug("AC Maintanance Team are inside team only..........");
		
	}
	
	public void Tax() {
		
		logger.info("The Tax Amount is Paided for this Year............");
		
	}
	
	abstract void DesignWorks();
	
	abstract int Cost();

}

abstract class Ibaco extends Mall{}

abstract class Ice extends Ibaco{
	
	void DesignWorks() {
		
		logger.info("My Decoration is processed..............");
		
		logger.debug("My Decoration is finised..............");
		
	}
	
}

class Venila extends Ice{
	
	Mall m;
	
	Venila(){}
	
	Venila(Mall m){
		
		this.m=m;
		
	}
	
	void flavor() {
		
		logger.info("You Choosed Flavor is Venila............");
		
	}
	
	int Cost() {
		
		int cost=20;
		
		if(m==null) {
			
			return cost;
			
		}
		
		else {
			
			return cost+m.Cost();
			
		}
		
	}
	
}

class Starwberry extends Ice{
	
	Mall m;
	
	Starwberry(){}
	
	Starwberry(Mall m){
		
		this.m=m;
		
	}
	
	void flavor() {
		
		logger.info("You Choosed Flavor is Starwberry............");
		
	}
	
	int Cost() {
		
		int cost=30;
		
		if(m==null) {
			
			return cost;
			
		}
		
		else {
			
			return cost+m.Cost();
			
		}
		
	}
	
}

class PineApple extends Ice{
	
	Mall m;
	
	PineApple(){}
	
	PineApple(Mall m){
		
		this.m=m;
		
	}
	
	void flavor() {
		
		logger.info("You Choosed Flavor is PineApple............");
		
	}
	
	int Cost() {
		
		int cost=40;
		
		if(m==null) {
			
			return cost;
			
		}
		
		else {
			
			return cost+m.Cost();
			
		}
		
	}
	
}

abstract class Bata extends Mall{
	
	void DesignWorks() {
		
		logger.info("My Decoration is processed..............");
		
		logger.debug("My Decoration is finised..............");
		
	}
	
}

class Male extends Bata{
	
	Mall m;
	
	Male(){}
	
	Male(Mall m){
		
		this.m=m;
		
	}
	
	void male() {
		
		logger.info("You Choosed Male Shoe............");
		
	}
	
	int Cost() {
		
		int cost=200;
		
		if(m==null) {
			
			return cost;
			
		}
		
		else {
			
			return cost+m.Cost();
			
		}
		
	}
	
}

class FeMale extends Bata{
	
	Mall m;
	
	FeMale(){}
	
	FeMale(Mall m){
		
		this.m=m;
		
	}
	
	void female() {
		
		logger.info("You Choosed Female Shoe............");
		
	}
	
	int Cost() {
		
		int cost=250;
		
		if(m==null) {
			
			return cost;
			
		}
		
		else {
			
			return cost+m.Cost();
			
		}
		
	}
	
}

abstract class Reymonds extends Mall{
	
	void DesignWorks() {
		
		logger.info("My Decoration is processed..............");
		
		logger.debug("My Decoration is finised..............");
		
	}
	
}

class Shirt extends Reymonds{
	
	Mall m;
	
	Shirt(){}
	
	Shirt(Mall m){
		
		this.m=m;
		
	}
	
	void shirt() {
		
		logger.info("You Choosed Shirt............");
		
	}
	
	int Cost() {
		
		int cost=1000;
		
		if(m==null) {
			
			return cost;
			
		}
		
		else {
			
			return cost+m.Cost();
			
		}
		
	}
	
}

class Fant extends Reymonds{
	
	Mall m;
	
	Fant(){}
	
	Fant(Mall m){
		
		this.m=m;
		
	}
	
	void fant() {
		
		logger.info("You Choosed Fant............");
		
	}
	
	int Cost() {
		
		int cost=1500;
		
		if(m==null) {
			
			return cost;
			
		}
		
		else {
			
			return cost+m.Cost();
			
		}
		
	}
	
}

class TShirt extends Reymonds{
	
	Mall m;
	
	TShirt(){}
	
	TShirt(Mall m){
		
		this.m=m;
		
	}
	
	void tShirt() {
		
		logger.info("You Choosed TShirt............");
		
	}
	
	int Cost() {
		
		int cost=799;
		
		if(m==null) {
			
			return cost;
			
		}
		
		else {
			
			return cost+m.Cost();
			
		}
		
	}
	
}

abstract class KFC extends Mall{
	
	void DesignWorks() {
		
		logger.info("My Decoration is processed..............");
		
		logger.debug("My Decoration is finised..............");
		
	}
	
}

class Chicken65 extends KFC{
	
	Mall m;
	
	Chicken65(){}
	
	Chicken65(Mall m){
		
		this.m=m;
		
	}
	
	void chicken65() {
		
		logger.info("You Choosed Chicken65............");
		
	}
	
	int Cost() {
		
		int cost=100;
		
		if(m==null) {
			
			return cost;
			
		}
		
		else {
			
			return cost+m.Cost();
			
		}
		
	}
	
}

class ChickenRoast extends KFC{
	
	Mall m;
	
	ChickenRoast(){}
	
	ChickenRoast(Mall m){
		
		this.m=m;
		
	}
	
	void chickenRoast() {
		
		logger.info("You Choosed ChickenRoast............");
		
	}
	
	int Cost() {
		
		int cost=120;
		
		if(m==null) {
			
			return cost;
			
		}
		
		else {
			
			return cost+m.Cost();
			
		}
		
	}
	
}

class PeparChicken extends KFC{
	
	Mall m;
	
	PeparChicken(){}
	
	PeparChicken(Mall m){
		
		this.m=m;
		
	}
	
	void peparChicken() {
		
		logger.info("You Choosed PeparChicken............");
		
	}
	
	int Cost() {
		
		int cost=150;
		
		if(m==null) {
			
			return cost;
			
		}
		
		else {
			
			return cost+m.Cost();
			
		}
		
	}
	
}