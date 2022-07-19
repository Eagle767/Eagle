package FirstTwo19072022;

public class BuilderPattern {
	
	public static void main(String[] args) {
		
		Outer o=new Outer.Inner("Muthu", "Kumar").setC(false).setD(true).build();
		
		System.out.println(o.getA());
		
		System.out.println(o.getB());
		
		System.out.println(o.getC());
		
		System.out.println(o.getD());
		
	}

}

class Outer{
	
	private String a,b;
	
	private boolean c,d;
	
	public String getA(){
		
		return a;
		
	}
	
	public String getB(){
		
		return b;
		
	}
	
	public boolean getC(){
		
		return c;
		
	}
	
	public boolean getD(){
		
		return d;
		
	}
	
	private Outer(Inner i) {
		
		this.a=i.a;
		
		this.b=i.b;
		
		this.c=i.c;
		
		this.d=i.d;
		
	}
	
	static class Inner{
		
		private String a,b;
		
		private boolean c,d;
		
		public Inner(String a,String b) {
			
			this.a=a;
			
			this.b=b;
			
		}
		
		public Inner setC(boolean c) {
			
			this.c= c;
			
			return this;
			
		}
		
		public Inner setD(boolean d) {
			
			this.d= d;
			
			return this;
			
		}
		
		public Outer build() {
			
			return new Outer(this);
			
		}
		
	}
	
}