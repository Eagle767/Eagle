package test14072022;

public class AbstractClassMethTest14072022 {
	
	public static void main(String[] args) {
		
	}

}

class Dhoni{}

abstract class Kholi{
	
	public abstract Dhoni play();
	
}

class CSK extends Kholi{

	@Override
	public Dhoni play() {
		
		return new Dhoni();
	}
	
}

abstract class Rohit{
	
	private Kholi k;
	
	public abstract Dhoni play();
	
	public Kholi getKholi() {
		
		return k;
		
	}
	
	public void setPlay(Kholi k) {
		
		this.k=k;
		
	}
	
}

class Pollard extends Rohit{

	@Override
	public Dhoni play() {
		
		Kholi r=getKholi();
		
		return null;
		
	}
	
}