package access;

public class ReturnObject {
	public static void main(String[] args) {
		SPD b=new SPD(5);
		SPD c=b.del();
		
		System.out.println(b.i);
		System.out.println(c.i);
	}
}
class SPD{
	int i;
	SPD(int a){
		 i=a;
	}
	SPD del() {
		SPD s=new SPD(i+2);
		SPD z=new SPD(i+7);
		z=s;
		return z;
		//return s;
	}
}
class Lion{
	
}