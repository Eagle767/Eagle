<<<<<<< HEAD
package newpack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
public class StreamKeyWord2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("d");list.add("z");list.add("c");list.add("b");list.add("a");
		
		//GANDHI WAY
		
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			String s=iter.next();
			if(s.equals("c")) {
				System.out.println("i found c....");
			}
		}
		
		//RAHUL GANDHI WAY
		
		list.stream().findAny().of("c").ifPresent(i->System.out.println("I found c....in a new way YO YO"));
		
		System.out.println("WITHOUT PARALLEL");
		list.stream().forEach(i->System.out.print(i+"\t"));
		System.out.println();
		list.stream().forEachOrdered(i->System.out.print(i+"\t"));
				
		System.out.println("\nPARALLEL");
		list.stream().parallel().forEach(i->System.out.print(i+"\t"));
		System.out.println();
		list.stream().parallel().forEachOrdered(i->System.out.print(i+"\t"));
		
	}
}
=======
package newpack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
public class StreamKeyWord2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("d");list.add("z");list.add("c");list.add("b");list.add("a");
		
		//GANDHI WAY
		
		Iterator<String> iter=list.iterator();
		while(iter.hasNext()) {
			String s=iter.next();
			if(s.equals("c")) {
				System.out.println("i found c....");
			}
		}
		
		//RAHUL GANDHI WAY
		
		list.stream().findAny().of("c").ifPresent(i->System.out.println("I found c....in a new way YO YO"));
		
		System.out.println("WITHOUT PARALLEL");
		list.stream().forEach(i->System.out.print(i+"\t"));
		System.out.println();
		list.stream().forEachOrdered(i->System.out.print(i+"\t"));
				
		System.out.println("\nPARALLEL");
		list.stream().parallel().forEach(i->System.out.print(i+"\t"));
		System.out.println();
		list.stream().parallel().forEachOrdered(i->System.out.print(i+"\t"));
		
	}
}
>>>>>>> branch 'master' of https://github.com/MayilaiMuthu/Eagle.git
