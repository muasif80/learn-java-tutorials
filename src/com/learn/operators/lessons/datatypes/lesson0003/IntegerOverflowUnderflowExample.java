package com.learn.operators.lessons.datatypes.lesson0003;

public class IntegerOverflowUnderflowExample {

	public static void main(String[] args) {
		int max = Integer.MAX_VALUE;
		System.out.println(max);
		// Alt + Shift + X, J - 
		// Short Cut Key for running java application with main class in Eclipse IDE
		
		System.out.println(max + 1);
		
		long l = max + 1;
		System.out.println(l);
		
		long l2 = (long)max + 1;
		System.out.println(l2);
		
		int min = Integer.MIN_VALUE;
		System.out.println();
		System.out.println(min);
		System.out.println(min - 1);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
	}
}
