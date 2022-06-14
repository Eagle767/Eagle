package Thread;

public class FlagTest {
	synchronized void fast() {
		try {
			
			flag=true;
			wait();
		} catch (InterruptedException e) {
			
		}
	}
	boolean flag;
	public static void main(String[] args) {
		FlagTest f=new FlagTest();
		boolean flag=false;
	    System.out.println(flag);
	    if(flag) {
	    	//System.out.println(flag);
	    	System.out.println("a");
	    	// f.fast();
	    	// System.out.println(flag==true);
	    }
	    System.out.println(flag==true);
	    System.out.println(flag);System.out.println(flag);
	}
}
