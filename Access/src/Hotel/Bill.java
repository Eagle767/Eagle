package Hotel;

import java.util.Scanner;

public class Bill {
	void disp() {
		Hotel h=new Hotel();
		h.Hello();
		System.out.println("The Menu List is......");
		Menu m=new Menu();
		for(int i=0;i<m.List.length;i++) {
			System.out.println(m.List[i] +" - Rs"+m.Amount[i]);
		}
		System.out.println("\n Please Enter Your Menu....");
		Scanner s=new Scanner(System.in);
		String Order=s.next();
	
		int count=0;
		for(int i=0;i<m.List.length;i++) {
		if(m.List[i].equals(Order)) {
		     System.out.println("Your Order is.....:  "+ Order);
		     System.out.println("Your Bill Amount is.....: "+m.Amount[i]);
		     break;
	       }
		else {
			count++;
		}
		}
		if(count==m.List.length) {
			System.out.println("Please Enter Valid Item");
			Bill b=new Bill();
			System.out.println("----------------------------------------------------------");
			b.disp();
		}
	}
	public static void main(String[] args) {
		
		Bill b=new Bill();
		b.disp();
	}
		
}
