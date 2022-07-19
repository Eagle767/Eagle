package Remaining4_19072022;

import java.util.Comparator;

import java.util.TreeSet;

public class TreesetDesendingOrder implements Comparable{
	
	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				return o2.compareTo(o1);
				
			}
			
		});
		
		ts.add("I");
		
		ts.add("am");
		
		ts.add("spider");
		
		ts.add("man");
		
		System.out.println("Desending Order............"+ts);
		
	}

	@Override
	public int compareTo(Object o) {
		
		return 0;
		
	}
	
}

