package test14072022;

public class TemplateMethod1 {
	
	public static void main(String[] args) {
		
		Road r=new NormalRoad();
		
		r.Ready();
		
		System.out.println("...............................");
		
		r=new RubberRoad();
		
		r.Ready();
		
	}

}

abstract class Road{
	
	public final void Ready(){
		
		FirstCoating();
		
		SecondCoating();
		
		ThirdCoating();
		
		FourthCoating();
		
		System.out.println("Road is Ready...........");
		
	}
	
	public void FirstCoating() {
		
		System.out.println("First Coat Ready............");
		
	}
	
	public abstract void SecondCoating();
	
	public abstract void ThirdCoating();
	
	void FourthCoating() {
		
		System.out.println("Fourth Coat Ready............");
		
	}
	
}

class NormalRoad extends Road{
	
	public void SecondCoating() {
		
		System.out.println("Second Normal Coat Ready............");
		
	}
	
	public void ThirdCoating() {
		
		System.out.println("Third Normal Coat Ready............");
		
	}
	
}

class RubberRoad extends Road{
	
	public void SecondCoating() {
		
		System.out.println("Second Rubber Coat Ready............");
		
	}
	
	public void ThirdCoating() {
		
		System.out.println("Third Rubber Coat Ready............");
		
	}
	
}