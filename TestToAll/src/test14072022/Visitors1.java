package test14072022;

public class Visitors1 {

	public static void main(String[] args) {
		
		Dogs dog=new Dogs();
		
		Baby b=new Baby();
		
		Items i=new Stones();
		
		b.playwithdog(dog, i);

	}

}

abstract class DogException extends Exception{
	
	public abstract void visit();
	
}

class BarkException extends DogException{
	
	String msg;
	
	public BarkException(String msg) {
		
		this.msg=msg;
		
	}
	
	@Override
	public String toString() {
		
		return this.msg;
		
	}
	
	public void visit(){
		
		new Handlers().handle(this);
		
	}
	
}

class BiteException extends DogException{
	
	String msg;
	
	public BiteException(String msg) {
		
		this.msg=msg;
		
	}
	
	@Override
	public String toString() {
		
		return this.msg;
		
	}
	
	public void visit(){
		
		new Handlers().handle(this);
		
	}
	
}

abstract class Items{
	
	public abstract void exe() throws DogException;
	
}

class Stones extends Items{

	@Override
	public void exe() throws DogException {
		
		throw new BarkException("You hit I Bark.......");
		
	}
	
}

class Sticks extends Items{

	@Override
	public void exe() throws DogException{
		
		throw new BiteException("You hit I Bite.......");
		
	}
	
}

class Handlers{
	
	public void handle(BarkException be){
		
		System.out.println("Handling Bark Exception........"+be);
		
	}
	
	public void handle(BiteException be){
		
		System.out.println("Handling Bite Exception........"+be);
		
	}
	
}

class Dogs{
	
	public void play(Items i) throws DogException{
		
		i.exe();
		
	}
	
}

class Baby{
	
	public void playwithdog(Dogs d,Items i) {
		
		try {
			
		d.play(i);
		
		}catch(DogException de) {
			
			System.out.println(de);
			
			de.visit();
			
		}
		
	}
	
}