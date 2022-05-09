package Types;

public class Limits {

	public static void main(String[] args) {
		System.out.print("Welcome.....");
		// TODO Auto-generated method stub
		byte h, a=-128;
		h=127;
		short e,b=32767;
		e=-32768;
		int f,c=-2147483648;
		f=2147483647;
		long g, d=-9_223_372_036_854_775_808L;
		g=9_223_372_036_854_775_807L;
		String str="Hello Muthu.";
		String s=new String("Eagle");
		System.out.print("\n Byte Limit  "+a+" to "+h);
		System.out.print("\n Short Limit  "+b+" to "+e);
		System.out.print("\n Long Limit  "+d+" to "+g);
		System.out.print("\n Int Limit  "+c+" to "+f);
		System.out.print("\n Welcome....."+str);
		System.out.print("\n Welcome....."+s);

	}

}
