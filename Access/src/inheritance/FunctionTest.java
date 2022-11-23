<<<<<<< HEAD
package inheritance;

public class FunctionTest {
	public static void main(String[] args) {
		try {
			System.out.println("Any Drinkers are there...........");
		}
		catch(Exception a){
			System.out.println(a);
		}
		finally{
			System.out.println("Today is Sunday...............");
		}
		System.out.println("Hi");
	}
}
abstract class Hall{
	void cost() {
		System.out.println("The Hall Booking OneDay Cost is 10000.....");
	}
	abstract void chair();
	abstract void food();
	
	abstract void photos();
}

abstract class Marraige extends Hall{}

abstract class NewHouse extends Hall{}

class Couple1 extends Marraige{
    void Relativities() {
    	System.out.println("Need My Relatives................");
    }
	@Override
	void chair() {
		System.out.println("This Function need only 50 chairs............");
		
	}
	@Override
	void food() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void photos() {
		// TODO Auto-generated method stub
		
	}}

class Couple2 extends Marraige{
    void Relativities() {
    	System.out.println("Need My Relatives................");
    }
	@Override
	void chair() {
		System.out.println("This Function need only 60 chairs............");
		
	}
	@Override
	void food() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void photos() {
		// TODO Auto-generated method stub
		
	}}

class ManiHouse extends NewHouse{

	void HomeThings(){
		System.out.println("The Home needed more New Things............");
	}
	@Override
	void chair() {
		System.out.println("This Function need only 70 chairs............");
		
	}
	@Override
	void food() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void photos() {
		// TODO Auto-generated method stub
		
=======
package inheritance;

public class FunctionTest {
	public static void main(String[] args) {
		try {
			System.out.println("Any Drinkers are there...........");
		}
		catch(Exception a){
			System.out.println(a);
		}
		finally{
			System.out.println("Today is Sunday...............");
		}
		System.out.println("Hi");
	}
}
abstract class Hall{
	void cost() {
		System.out.println("The Hall Booking OneDay Cost is 10000.....");
	}
	abstract void chair();
	abstract void food();
	
	abstract void photos();
}

abstract class Marraige extends Hall{}

abstract class NewHouse extends Hall{}

class Couple1 extends Marraige{
    void Relativities() {
    	System.out.println("Need My Relatives................");
    }
	@Override
	void chair() {
		System.out.println("This Function need only 50 chairs............");
		
	}
	@Override
	void food() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void photos() {
		// TODO Auto-generated method stub
		
	}}

class Couple2 extends Marraige{
    void Relativities() {
    	System.out.println("Need My Relatives................");
    }
	@Override
	void chair() {
		System.out.println("This Function need only 60 chairs............");
		
	}
	@Override
	void food() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void photos() {
		// TODO Auto-generated method stub
		
	}}

class ManiHouse extends NewHouse{

	void HomeThings(){
		System.out.println("The Home needed more New Things............");
	}
	@Override
	void chair() {
		System.out.println("This Function need only 70 chairs............");
		
	}
	@Override
	void food() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void photos() {
		// TODO Auto-generated method stub
		
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
	}}