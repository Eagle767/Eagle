package test14072022;

public class Adapter1 {
	
	public static void main(String[] args) {
		
		Sakthivelam am=new Sakthivelam();
		
		Sakthivelind ind=new Sakthivelind();
		
		Sakthivelamd amd=new Sakthivelamd();
		
		Sakthivelindd indd=new Sakthivelindd();
		
		am.FlatPin(amd);
		
		ind.RoundPin(indd);
		
		IndianAdpters ia=new IndianAdpters();
		
		AmericanAdpters aa=new AmericanAdpters();
		
		aa.is=amd;
		
		ia.as=indd;
		
		ind.RoundPin(aa);
		
		am.FlatPin(ia);
		
	}

}

abstract class IndianPlugs{
	
	public abstract void RoundPin(IndianSockets ip);
	
}

abstract class IndianSockets{
	
	public abstract void work();
	
}

abstract class AmericanPlugs{
	
	public abstract void FlatPin(AmericanSockets ap);
	
}

abstract class AmericanSockets{
	
	public abstract void work();
	
}

class IndianAdpters extends AmericanSockets{
	
	IndianSockets as;

	@Override
	public void work() {
		
		as.work();
		
	}
	
}

class AmericanAdpters extends IndianSockets{
	
	AmericanSockets is;

	@Override
	public void work() {
		
		is.work();
		
	}
	
}

class Sakthivelind extends IndianPlugs{

	@Override
	public void RoundPin(IndianSockets ind) {
		
		ind.work();
		
	}
	
}

class Sakthivelam extends AmericanPlugs{

	@Override
	public void FlatPin(AmericanSockets ap) {
		
		ap.work();
		
	}
	
}

class Sakthivelindd extends IndianSockets{

	@Override
	public void work() {
		
		System.out.println("Sakthivel Brand Indian plug is Working............");
		
	}
	
}

class Sakthivelamd extends AmericanSockets{

	@Override
	public void work() {

		System.out.println("Sakthivel Brand American plug is Working............");
		
	}
	
}