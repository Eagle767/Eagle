package inheritance;

public class FunctionOverLoading {
	void disp() throws Throwable{
		throw new Drinkers();
	}
	void complete() throws Exception{
		System.out.println("The Money Problem is Coming...............");
		throw new Exception();
	}
	void place(Poolavoorani p) {
		System.out.println("It is Inside the Poolavoorani...........");
	}
	public static void main(String[] args) throws Throwable {
		FunctionOverLoading fl=new FunctionOverLoading();
		Function f=new Function();
		try {
		Mani m=new Mani();
		f.function(m);
		m.Food();
		fl.place(m);
		Vembar v=new Vembar();
		f.function(v);
		v.Food();
		fl.place(v);
		Gopal g=new Gopal();
		f.function(g);
		g.Food();
		//fl.place(g);
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

interface Rules{
	abstract void Food();
	void ProvideFood();
}

interface Poolavoorani{}

abstract class Friends implements Rules{
	Friends(){
		System.out.println("That Person is My Friend.................");
	}
	public void ProvideFood() {}
}

final class Function{
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

class Mani extends Friends implements Poolavoorani{
	public void Food() {
		System.out.println("Breakfast only available...............");
	}
}

class Vembar extends Friends implements Poolavoorani{
	public void Food() {
		System.out.println("Breakfast and Lunch is available...............");
	}
}

class Gopal extends Friends{
	public void Food() {
		System.out.println("Lunch only available...............");
	}
}

final class Drinkers extends Throwable{
	Drinkers() {
		System.out.println("I don't Know Drinkers...............");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Drinkers not allowed.........";
	}
}