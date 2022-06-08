package inheritance;

public class FunctionOverLoading {
	void disp() throws Throwable{
		throw new Drinkers();
	}
	void complete() throws Exception{
		System.out.println("The Money Problem is Coming...............");
		throw new Exception();
	}
	public static void main(String[] args) throws Throwable {
		FunctionOverLoading fl=new FunctionOverLoading();
		Function f=new Function();
		try {
		Mani m=new Mani();
		f.function(m);
		m.Food();
		Vembar v=new Vembar();
		f.function(v);
		v.Food();
		Gopal g=new Gopal();
		f.function(g);
		g.Food();
		fl.disp();
		
		}catch(Drinkers e) {
			System.out.println("But I catch the Drinkers................");
		}
		finally {
			try {
				fl.complete();
				}catch(Exception e) {
					System.out.println("But the Problem is Solved................");
				}
			finally {
			System.out.println("It is Sunday................");
		}
		}
	}
}

abstract class Friends{
	Friends(){
		System.out.println("That Person is My Friend.................");
	}
}

class Function{
	void function(Mani m) {
		System.out.println("It is a Mani Anna Marraige Function............");
	}
	void function(Gopal m) {
		System.out.println("It is a Gopal Anna Marraige Function............");
	}
	void function(Vembar m) {
		System.out.println("It is a Vembar New House Function............");
	}
}

class Mani extends Friends{
	void Food() {
		System.out.println("Breakfast only available...............");
	}
}

class Vembar extends Friends{
	void Food() {
		System.out.println("Breakfast and Lunch is available...............");
	}
}

class Gopal extends Friends{
	void Food() {
		System.out.println("Lunch only available...............");
	}
}

class Drinkers extends Throwable{
	Drinkers() {
		System.out.println("I don't Know Drinkers...............");
	}
}