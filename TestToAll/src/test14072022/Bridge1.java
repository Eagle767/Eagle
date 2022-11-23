package test14072022;

public class Bridge1 {
	
	public static void main(String[] args) {
		
		CBShine h=new CBShine(new Hero());
		
		h.applyBike();
		
		TVS hh=new TVS(new Honda());
		
		hh.applyBike();
		
	}

}

interface TwoWheeler{
	
	public void applyBike();
	
}

class Hero implements TwoWheeler{

	@Override
	public void applyBike() {
		
		System.out.println("Hero Bike spare");
		
	}
	
}

class Honda implements TwoWheeler{

	@Override
	public void applyBike() {
		
		System.out.println("Honda Bike spare");
		
	}
	
}

abstract class HeroHonda{
	
	TwoWheeler t;
	
	public HeroHonda(TwoWheeler t) {
		
		this.t=t;
		
	}
	
	public abstract void applyBike();
	
}

class CBShine extends HeroHonda{

	public CBShine(TwoWheeler t) {
		
		super(t);
		
	}

	@Override
	public void applyBike() {
		
		System.out.print("This is CBShine Bike. It is need ");
		
		t.applyBike();
		
	}
	
}

class TVS extends HeroHonda{

	public TVS(TwoWheeler t) {
		
		super(t);
		
	}

	@Override
	public void applyBike() {
		
		System.out.print("This is TVS Bike. It is need ");
		
		t.applyBike();
		
	}
	
}