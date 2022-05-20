package Access;
public class StateBankClassMethod extends abc {   //it is mainclkass it is also dont change able and
	//and creating object for the main class
	
	 //int c=a+b;
	 void msg() {
		 System.out.println(a+b);
	 }
	//static int d;
	public static void main(String[] args) {
		StateBankClassMethod h=new StateBankClassMethod();
		h.msg();
		//StateBankClassMethod.d=7;
	//	System.out.println(d);
		Bank c=new Bank();
		c.b1();
		c.ela();
		c.pen();
		System.out.println(c.pen());
		//g A=new g();
		c.A.msg();
		c.A.S.U.msg();
		c.A.S.avg();
		
	}
}
class Bank implements cashiar{//abstarac class it is dont changable
class g {
	int c=5;
	void avg() {
		System.out.println("the class");
	}
		 class v{
			void avg() {
				System.out.println("the class");
			}
			class u{
				void msg() {
					System.out.println("hai it is inner class");
				}
			}
			u U=new u();
		
		}
		v S=new v();
		void msg() {
			System.out.println("hai it is inner inner  class");
		}
	}
	
	g A=new g();//
	
	void b1() {
		System.out.println("This is bank of india");
	}
	public	void ela() {
		System.out.println("go to collect in  the cash...+");
		System.out.println(n);
	}
	public int pen() {
		class fan {
			int road() {
				System.out.println("hi method inside class");
				return 2;
			}
		}
		beg();// {}
		fan j=new fan();
		j.road();
		System.out.println("hi");
		return 2;
	}
	void beg() {
		System.out.println("Indide the method");
		//return 1;
	}
}
interface cashiar{
	String n="if you not commedning iam autometically working";
	void ela();
	int pen();
}
abstract class abc{
	int a=3;
	int b=5;
}