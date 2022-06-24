package chapter6to10;

public class MetodOverLoad {
	public static void main(String[] args) {
		
      MetodOverLoad obj=new MetodOverLoad();
		
		obj.met(23.3f);
		
		Dog tiger=new Dog();
		tiger.play(new Biscuit());
	}
	public void met(int i,int j) {
		System.out.println("int param met method called..");
	}
	
	 int met() {
		System.out.println("no param met method called...");
		return 1;
	}
	 void met(float f) {
		 System.out.println("float param method called...");
	 }

}
class Dog{
	public void play(Biscuit b) {
		System.out.println("nai valattum........");
	}
	public void play(Stick s) {
		System.out.println("nai odip pogum....");
	}
	
	public void play(Stone s) {
		System.out.println("nai kadikkum.....");
	}
}
class Biscuit{}
class Stick{}
class Stone{}