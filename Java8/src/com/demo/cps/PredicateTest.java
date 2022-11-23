package com.demo.cps;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest implements Predicate<Integer>
{

	public static void main(String[] args) {
		System.out.println(new PredicateTest().test(2));
		
		Predicate<Integer>  pre= (t)->t%2==0 ? true: false;;
		System.out.println(pre.test(5));
		
		List<Integer> list=Arrays.asList(1,2,3,4,7,5);
		list.stream().filter(pre). forEach((t)->System.out.println(t));
		
		list.stream().filter(t->t%2==0). forEach((t)->System.out.print(t));
	}
	
	@Override
	public boolean test(Integer t) {
		if(t%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
