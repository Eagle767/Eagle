package newpack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
public class StreamKeyWord1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("z");list.add("c");list.add("b");list.add("a");
		
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
		
		list.stream().forEach(System.out::println);
		
		list.stream().parallel().forEachOrdered(System.out::println);
		
	}
}