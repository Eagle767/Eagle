package annotationTest;

public class GenericSpecifier<a,b,c> {
	private int A,s;
	private String B;
	private c C;
	public GenericSpecifier(a A,b B,c C){
		this.A=(int) A;
		this.B=(String) B;
		this.C=C;
	}
	<F> void met(F f) {
		System.out.println(f);
	}
	//this.a=a;
	public static void main(String[] args) {
		GenericSpecifier<Integer, String, Integer> g=new GenericSpecifier<Integer, String, Integer>(10,"Hello",3); 
		System.out.println(g.C);
		System.out.println(g.B);
		System.out.println(g.A);
		System.out.println(g);
		g.met(g);
	}
}
class S<a> extends GenericSpecifier<Object, Object, Object>{

	public S(Object A, Object B, Object C) {
		super(A, B, C);
		// TODO Auto-generated constructor stub
	}}

class AD{}

class AB<a,b> extends AD{}