package inheritance;

public class AbstrctTest {
	public static void main(String[] args) {
		System.out.println("Hi.................");
		BO b=new BO();
		BO d=new BO();
		b=d;
		System.out.println(b);
		AO a=new AO();
		System.out.println(a.c(d));
		System.out.println(a);
	    //CE c=new CE();
	}
}
class AO extends BO{
	CE c(CE c) {
		return c;
	}
}

class BO extends CE{}

abstract class CE {}