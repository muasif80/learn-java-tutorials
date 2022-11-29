package com.learn.operators.lessons.datatypes.lesson0002;

public class MyModuluOperator {

	public static void main(String[] args) {
		
		applyModuluOperator();
		printEvenNumbers();
		printOddNumbers();
		printMultiplesOf5();
		
		isPrime(5);
		isPrime(7);
		isPrime(8);
	}

	private static void applyModuluOperator() {
		int n = 8;
		
		int a1 = 8 % 2;
		int a2 = 8 % 3;
		int a3 = 8 % 5;
		int a4 = 8 % 8;
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
	}
	
	private static void printOddNumbers() {
		// Example 2 - Find all the odd numbers from 1 to 20
		System.out.println("Print odd numbers from (1 to 20)");
		for(int i = 1; i <= 20; i++) {
			
			boolean isOdd = i % 2 != 0;
			if(isOdd) {
				System.out.println(i);
			}
		}
	}
	
	private static void printMultiplesOf5() {
		// Example 3 - Find all the multiples of 5 from 1 to 20
		System.out.println("Print odd numbers from (1 to 20)");
		for(int i = 1; i <= 20; i++) {
			//i = 1, 2, 3, 4, 
			if(i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

	private static void printEvenNumbers() {
		// Example 1 - Find all the even numbers from 1 to 20
		System.out.println("Print even numbers from (1 to 20)");
		for(int i = 1; i <= 20; i++) {
			int rem = i % 2;
			if(rem == 0) {
				System.out.println(i);
			}
		}
	}

	private static void isPrime(int n) {
		
		// Example 4 - A prime number is divisible by only itself other than 1
		// To find prime check remainder after dividing the given number by 
		// each number in the series of integers from 2 upto the half of the given number
		
		if(n == 1) {
			System.out.println("1 is a prime number");
			return;
		}
		
		int m = n/2;
		for(int i = 2; i <= m; i++) {
			if(n % i == 0) {
				System.out.println(n + " => NP");
				return;
			}
		}
		
		System.out.println(n + " => P");
	}
	
	
}
