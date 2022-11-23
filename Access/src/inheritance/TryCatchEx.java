package inheritance;

public class TryCatchEx {
static public void main(String[] args){
		try {
			int i=1/1;
			System.out.println(i);
			AD a=new AD().dis();
			
			int c=1/0;
			System.out.println(c);
			//throw new AD();
		}
		catch(Exception t){
			System.out.println(t);
			//throw t;
		}
		finally {
			try {
			int j=1/0;
			
			System.out.println(j);}
			catch(Exception e) {}
			finally {System.out.println("Eagle");}
		}
	}
}
class AD extends Throwable{
	AD(){
		System.out.println("Haiiiii");
	}
	AD dis(){
		System.out.println("Hi");
		return null;
	}
}
//interface namespace{}
