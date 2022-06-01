package inheritance;

public class OneDayTest {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome.............");
		
		IndHolder m=new MHolder();
		
		m.ind();
		
		m.Work();
		
        AmHolder h=new WHolder();
		
		h.Am();
		
		h.Work();
		
		AmtoIndHolder am=new AHolder(m);
		
		am.AmToInd();
		
		am.Am();
		
       IndToAmHolder as=new BHolder(h);
		
		as.IndToAm();
		
		as.ind();
		
		Fan f=new Oriet();
		
		int a=f.amt();
		
		System.out.println("The Orient Fan Value is..........."+a);
		
		f=new HiSpeed();
		
		int b=f.amt();
		
		System.out.println("The Hispeed Fan Value is..........."+b);
		
		f=new Usha();
		
		int c=f.amt();
		
		System.out.println("The Usha Fan Value is..........."+c);
		
		f=new Usha(new Oriet(new HiSpeed()));
		
		int d=f.amt();
		
		System.out.println("The Total Fan Value is..........."+d);
		
		IDCard i=new IDCard();
		
		i.display();
		
		Bank o=new Bank();
		
		o.exeCom(1);
		
		Rule r=new Rule();
		
		AccountType at=new AccountType();
		
		Com cc=new AccountClose(r,at);
		
		o.setCom(cc, 2);
		
		o.exeCom(2);
		
		System.out.println("The Process is Ended...........");
		
	}
	
}

abstract class IndBulb{
	
	void ind() {
		
		System.out.println("It is Supported Indian Holder........");
		
	}
	
}

abstract class IndHolder{
	
	void ind() {
		
		System.out.println("It is Supported Indian Bulb........");
		
	}
	
	abstract void Work();
	
}

abstract class AmBulb{
	
	void Am() {
		
		System.out.println("It is Supported American Holder........");
		
	}
	
}

abstract class AmHolder{
	
	void Am() {
		
		System.out.println("It is Supported American Bulb........");
		
	}
	
	abstract void Work();
	
}

abstract class IndToAmHolder{
	
	AmHolder a;
	
	IndToAmHolder(AmHolder a){
		
		this.a=a;
		
	}
	
	void IndToAm() {
		
		a.Am();
		
	}
	
	abstract void ind();
	
}

abstract class AmtoIndHolder {
	
	IndHolder i;
	
	AmtoIndHolder(IndHolder i){
		
		this.i=i;
		
	}
	
	void AmToInd() {
		
		i.ind();
		
	}
	
	abstract void Am(); 
	
}

class MBulb{
	
	void ind() {
		
		System.out.println("It is Supported Indian Holder........");
		
	}
	
}

class MHolder extends IndHolder{

	@Override
	void Work() {
		
		System.out.println("It is Also Indian Holder Type.....");
		
	}
	
}

class WBulb{
	
	void Am() {
		
		System.out.println("It is Supported American Holder........");
		
	}
	
}

class WHolder extends AmHolder{

	@Override
	void Work() {
		
		System.out.println("It is Also American Holder Type......");
		
	}
	
}

class ABulb{
	
	void Am() {
		
		System.out.println("It is Supported American Holder.But it is India.......");
		
	}
	
}

class AHolder extends AmtoIndHolder{

	AHolder(IndHolder i) {
		
		super(i);
		// TODO Auto-generated constructor stub
	}

	void Am() {
		
		System.out.println("I used American Holder.But it is India.......");
		
		System.out.println("So I use Adater.........");
		
		i.ind();
		
	}
	
}

class BBulb{
	
	void ind() {
		
		System.out.println("It is Supported Indian Holder.But it is America........");
		
	}
	
}

class BHolder extends IndToAmHolder{
	
	BHolder(AmHolder a) {
		
		super(a);
		// TODO Auto-generated constructor stub
	}

	void ind() {
		
		System.out.println("I used Indian Holder.But it is America........");
		
		System.out.println("So I use Adater.........");
		
		a.Am();
		
	}
	
}

abstract class Fan{
	
	abstract int amt();
	
}

abstract class Speed extends Fan{}

abstract class Blade extends Fan{}

class Usha extends Speed{
	
	Fan f;
	
	Usha(){}
	
	Usha(Fan f){
		
		this.f=f;
		
	}

	int amt() {
		
		if(f==null) {
			
			return 300;
		
		}
		
		else {
			
			return 300+f.amt();
			
		}
		
	}
	
}

class Oriet extends Speed{
	
	Fan f;
	
	Oriet(){}
	
	Oriet(Fan f){
		
		this.f=f;
		
	}

	int amt() {
		
		if(f==null) {
			
			return 400;
		
		}
		
		else {
			
			return 400+f.amt();
			
		}
		
	}
	
}

class HiSpeed extends Speed{
	
	Fan f;
	
	HiSpeed(){}
	
	HiSpeed(Fan f){
		
		this.f=f;
		
	}

	int amt() {
		
		if(f==null) {
			
			return 500;
		
		}
		
		else {
			
			return 500+f.amt();
			
		}
		
	}
	
}

class IDCard{
	
	void display() {
		
		IDCard i=new IDCard();
		
		Staff s=new ABD();
		
		i.BigRoom(s);
		
		Labour l=new BCD();
		
		s=new SPD();
		
		i.BigRoom(s);
		
		i.SmallRoom(l);
		
		l=new SPD();
		
		i.SmallRoom(l);
		
		
		
	}
	
	void SmallRoom(Labour l) {
		
		System.out.println("It is Small Room..........");
		
	}
	
    void BigRoom(Staff s) {
		
		System.out.println("It is Big Room..........");
		
	}
	
}

interface Staff{}

interface Labour{}

class ABD implements Staff{}

class BCD implements Labour{}

class SPD implements Staff,Labour{}

interface Com{
	
	void excute();
	
}

class Bank{
	
	Com[] c=new Com[3];
	
	Bank() {
		
		
		for(int i=0;i<c.length;i++) {
			
			this.c[i]=new MayIHelp();
			
		}
		
	}
	
	void setCom(Com c,int i) {
		
		this.c[i]=c;
		
	}
	
	void exeCom(int i) {
		
		c[i].excute();
		
	}
	
}

final class Rule {
	
	void dis() {
		
		System.out.println("It is a Rule Book...........");
		
	}
	
	void exe() {
		
		System.out.println("The Account is Verified.............");
		
	}
	
}

final class AccountType{
	
	void dis() {
		
		System.out.println("It is aAccount Type..........");
		
	}
	
	void exe() {
		
		System.out.println("The Account Type is Verified.............");
		
	}
	
}

class MayIHelp implements Com{
	
	void dis() {
		
		System.out.println("I will Help..........");
		
	}

	@Override
	public void excute() {
		
		System.out.println("I will Help You...........");
		
	}
	
}

class AccountClose implements Com{
	
	Rule r;
	
	AccountType a;
	
	AccountClose(){}
	
	AccountClose(Rule r,AccountType a){
		
		this.r=r;
		
		this.a=a;
		
	}

	@Override
	public void excute() {
		
		System.out.println("Your Account is Checking...........");
		
		r.exe();
		
		a.exe();
		
		System.out.println("Your Account is Closed...........");
	}
	
	void dis() {
		
		System.out.println("I need Account Closing...........");
		
	}
	
}