package com.demo.cps;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest implements Consumer<Integer>
{

	public static void main(String[] args) {
		new ConsumerTest(). accept(5);
		Consumer<Integer> consumer=(t)->System.out.println(t);
		consumer.accept(5);
		
		List<Integer> list=Arrays.asList(1,2,3,4,7,5);
		list.stream().forEach(consumer);
		
		list.stream().forEach((t)->System.out.print(t));
	}

	@Override
	public void accept(Integer t) {System.out.println("Value is "+t);}

}
