package com.demo.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachAndFilterTest {
	
	public static String desc="Streams doesn't change original data structure,It is provide results are pipelined methods";
	
	public static String advan="Functional programming,code reduce,Bulk Operation";
	
	public static List<String>  list=Arrays.asList("Hello","Bye","Java");
	
	public static Map<Integer, String> map=new HashMap<>();

	public static void main(String[] args) {
		
		//filter is a conditional check method
		
		for (String a : list) {
			System.out.println(a);
		}
		
		list.stream().forEach(t->System.out.println(t));
		
		map.put(1, advan);map.put(2, desc);
		
		map.forEach((key,value)->System.out.println(key));
		
		map.entrySet().stream().forEach(a->System.out.println(a));
		
		Consumer<String> consumer=t->System.out.println(t);
		for (String a : list) {
			consumer.accept(a);
		}
		
		for (String a : list) {
			if(a.startsWith("J")) {
				System.out.println(a);
			}
		}
		
		list.stream().filter(a->a.startsWith("B")).forEach(a->System.out.println(a));
		
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(a->System.out.println(a));
		
	}

}
