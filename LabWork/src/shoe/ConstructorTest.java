package shoe;

public class ConstructorTest {
	
	public ConstructorTest() {
	this(5);	
		System.out.println(1);
	}
	
	
    public ConstructorTest(int a) {
    	this("x");
    	System.out.println(2);
	}
    
    public ConstructorTest(int a,int b) {
    	
		System.out.println(3);
	}
    
    public ConstructorTest(String a) {
		System.out.println(4);
	}
    
    public static void main(String[] args) {
		new ConstructorTest();
	}

}
