package com.demo.cps;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest implements Supplier<String>{
	
	public static void main(String[] args) {
		System.out.println(new SupplierTest().get());
		
		Supplier<String>  supplier=()->"Eagle";  System.out.println(supplier.get());
		
		List<String> list=Arrays.asList("a","b","c");
		System.out.println(list.stream().findAny().orElseGet(supplier));
		
		List<String> lists=Arrays.asList();
		System.out.println(lists.stream().findAny().orElseGet(()->"Eagle"));
	}

	@Override
	public String get() {
		// TODO Auto-generated method stub
		return "Eagle";
	}

}
