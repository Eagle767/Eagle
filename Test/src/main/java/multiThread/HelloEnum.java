package multiThread;

public enum HelloEnum {
	
	HI("HI"),HAI('c'),HELLO(26.5f),HIII(1);
	
	String Action;
	
	int a;
	
	float b;
	
	private HelloEnum(String Action) {
		
		this.Action=Action;
		
	}
	
	private HelloEnum(int a) {
		
		this.a=a;
		
	}
	
	private HelloEnum(float b) {
		
		this.b=b;
	
	}
	
}
