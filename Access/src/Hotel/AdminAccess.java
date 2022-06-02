package Hotel;

import java.util.Arrays;
import java.util.Scanner;

public class AdminAccess {
	public static void main(String[] args) {
		Menu m=new Menu();
		
		int b=m.List.length;
		
		for(int i=0;i<b;i++) {
			System.out.println(m.List[i]);
			System.out.println(m.Amount[i]);
		}
		Scanner ss=new Scanner(System.in);
		int n=ss.nextInt();
		
	    m.List=Arrays.copyOf(m.List, n);
	   
	    m.Amount=Arrays.copyOf(m.Amount, n);
	    
	    
	    
	    for(int i=b;i<n;i++) {
	    	m.List[i]=ss.next();
			m.Amount[i]=ss.nextInt();
		}
	    for(int i=0;i<n;i++) {
	    	System.out.println(m.List[i]);
			System.out.println(m.Amount[i]);
	    }
	}
}
