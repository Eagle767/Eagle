package Access;

public class FinalizeMeth {

	public static void main(String[] args) {
		FinalizeMeth a=new FinalizeMeth();
		System.out.println(a.hashCode());
		a=null;
		System.gc();
		System.out.println("Garbage Collection");
		
	}
protected void finalize() {
	System.out.println("hi");
}
}
