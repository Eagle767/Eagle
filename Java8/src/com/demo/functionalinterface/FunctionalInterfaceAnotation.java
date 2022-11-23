package com.demo.functionalinterface;

@FunctionalInterface
public interface FunctionalInterfaceAnotation {
	
	public void m1();
	
//	public void m2();
	
	default void m3() {
		System.out.println("Default1");
	}
	
	default void m4() {
		System.out.println("Default2");
	}
	
	static void m5() {
		System.out.println("Static1");
	}
	
	static void m6() {
		System.out.println("Static2");
	}

}
