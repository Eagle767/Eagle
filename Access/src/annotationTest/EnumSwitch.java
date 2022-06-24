package annotationTest;

enum Month{//enum is a special Data type,Direction is a Variable
	JAN,FEB,MARCH,APR,MAY,JUNE,JULLY,AUG,SEP,OCT,NOV,DEC;
	//set of predefined constants and use UpperCase Because it is constants
}
public class EnumSwitch {
	enum Hi{
		HIIII("1"),HAIIIII("2"),HII("Hello");
		private String Action;
		private int a;
	    private Hi(String Action) {
			this.Action=Action;
		}
	    private Hi(int a) {
			this.a=a;
		}
	}
	enum Door{
		STEEL,WOOD,PLASTIC;
		private Door() {
			System.out.println("Door is Ready...........");
		}
		void doorInfo() {
			System.out.println("It is Three Types Available There............");
		}
	}
	Month m;
      void test(Month m) {
    	  this.m=m;
		switch(m){
			case JAN:case FEB:
				System.out.println("It is Cool.........");
		        break;	
			case NOV:
			case DEC:
				System.out.println("It is Also Cool.............");
				break;
			default:
				System.out.println("Hot...........");
		}
	}
	public static void main(String[] args) {
		EnumSwitch e=new EnumSwitch();
		System.out.println(e);
		String g="APR";
		e.test(Month.valueOf(g));
		e.test(Month.JAN);
		e.test(Month.DEC);
		Month m[]=Month.values();
		for(Month s:m) {
			int h=s.ordinal()+1;
			System.out.println(s+" Index value is "+h+" action is ");
		}
		Door d=Door.PLASTIC;
		System.out.println(d);
		d.doorInfo();
		Hi j[]=Hi.values();
		for(Hi p:j) {
			System.out.println(p+"............."+p.Action);
		}
	}
}