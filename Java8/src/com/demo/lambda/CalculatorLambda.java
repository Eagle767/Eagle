package com.demo.lambda;

interface Calculator{
	
//	void hello();
	
//	int sum(int a,int b);
	
	int substract(int a,int b);
	
}

public class CalculatorLambda // implements Calculator
{

//	@Override
//	public void hello() {
//		
//		System.out.println("Hello");
//		
//	}
	
	public static void main(String[] args) {
		
//		Calculator calculator= ()->System.out.println("Hello");		calculator.hello();
		
//		Calculator calculator=( a, b)->{ return a+b; };  System.out.println(calculator.sum(2, 5));
		
//		Calculator calculator=( a, b)->a+b;  System.out.println(calculator.sum(2, 5));
		
		Calculator calculator=( a, b)->{ 
			if(a<b) {
				throw new RuntimeException("it is not valid");
			}else {
				return a-b;
			} };
		
		System.out.println(calculator.substract(2, 5));
		
	}

	
	// () -> {body};

}
