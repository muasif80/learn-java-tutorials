package com.learn.operators.lessons.lesson0001;

import java.io.PrintStream;

public class IntBinaryOperators {

	// >> Tips
	// 1. You should not use integer data type for monetary values. It can't represent
	// any value greater than 2147483647
	// 2. You should not prefix integer literal with 0. It denotes an Octal literal.
	// 3. The hashCode of an Integer object is the same integer value.
	// 4. Use the Integer class methods toBinaryFormat, toOctalFormat and toHexFormat
	// to represent the integer in other base values

	public static void main(String[] args) {
		PrintStream o = System.out;

		final int n1 = Integer.MAX_VALUE;
		final int n2 = Integer.MIN_VALUE;

		// Maximum Values of Integer
		o.println(">>\nMaxmimum and Minimum values of int");
		o.println("Maximum int = " + n1 + ", Binary=" + Integer.toBinaryString(n1) + ", Octal="
				+ Integer.toOctalString(n1) + ", Hex=" + Integer.toHexString(n1));
		o.println("Minimum int = " + n2 + ", Binary=" + Integer.toBinaryString(n2) + ", Octal="
				+ Integer.toOctalString(n2) + ", Hex=" + Integer.toHexString(n2));

		// Minimum Values of Integer
		o.println("\n>>\nExample 02 - Integer Overflow and Underflow");
		o.println("Integer Overflow >> " + n1 + " + " + 1 + " = " + (n1 + 1));
		o.println("Integer Overflow >> " + n2 + " + " + 2 + " = " + (n1 + 2));

		o.println("Integer Underflow >> " + n2 + " - " + 1 + " = " + (n2 - 1));
		o.println("Integer Underflow >> " + n2 + " - " + 2 + " = " + (n2 - 2));

		// Wrapper of Integer
		Integer wn1 = n1;
		Integer wn2 = n2;
		o.println("\n>>\nhashCode()");
		o.println("hashCode() of " + wn1 + "=" + wn1.hashCode());
		o.println("hashCode() of " + wn2 + "=" + wn2.hashCode());
		o.println(wn1.equals(wn2));

		o.println("\n>>\nInitialize integer using binary, octal or hexa literals.");
		int num = 0b1000;
		System.out.println("Integer initialized using binary literal 0b1000=" + num);

		num = 0xf;
		System.out.println("Integer initialized using hex literal 0xf=" + num);

		num = 012;
		System.out.println("Integer initialized using oct literal 012=" + num);

		// Are they equal? If not, why not?
		o.println("\n>>\nAre integer literals 12 and 012 equal?");
		int num1 = 12;
		int num2 = 012; // Initialize with Octal literal
		System.out.println(num1 == num2);
		System.out.println(Integer.valueOf(12).equals(Integer.valueOf(012)));
		System.out.println(Integer.valueOf(12));
		System.out.println(Integer.valueOf(012));
		
		testBinaryOperators(10, 19);
		
		
		// To Binary Format
		// Integer Table from 1 to 10 as Binary
		o.println("\n>>\nExample 03 - Table of Integers from 1 to 5 represented in binary, octal and hex format");
		for (int i = 1; i <= 16; i++) {
			// toBinaryFormat(i);
			System.out.println("Integer " + i + " as (Binary, Octal, Hex)=" + Integer.toBinaryString(i) + ", "
					+ Integer.toOctalString(i) + ", " + Integer.toHexString(i));
		}
	}
	
	private static void testBinaryOperators(int num1, int num2){
		
		System.out.println("\n>>\ntestBinaryOperators(" + num1 + ", " + num2 + ")");
		
		printInteger(num1);
		printInteger(num2);
		
		
		System.out.println("\n>>");
		
		System.out.println("Operation Addition >> " +num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println("Operation Subtraction >> " +num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println("Operation Multiply >> " + num1 + " * " + num2 + " = " + num1 * num2);
		System.out.println("Operation Division >> " + num1 + " / " + num2 + " = " + num1 / num2);
		System.out.println("Operation Modulus >> " + num1 + " % " + num2 + " = " + num1 % num2);
		
		
		System.out.println("Operation Binary & >> " + num1 + "(" + Integer.toBinaryString(num1) + ") & " 
				+ num2 + "(" + Integer.toBinaryString(num2) +  ") = " 
						+ (num1 & num2) + "(" + Integer.toBinaryString(num1 & num2) + ")");
		
		System.out.println("Operation Binary Exclusive OR >> " + num1 + "(" + Integer.toBinaryString(num1) + ") ^ " 
				+ num2 + "(" + Integer.toBinaryString(num2) +  ") = " 
						+ (num1 ^ num2) + "(" + Integer.toBinaryString(num1 ^ num2) + ")");
		
		System.out.println("Operation Unary Inversion >> " + "~" + num1 + "(" + Integer.toBinaryString(num1) + ") = " 
						+ (~num1) + "(" + Integer.toBinaryString(~num1) + ")");
		
		System.out.println(Integer.toBinaryString(-3) + "(len=" +Integer.toBinaryString(-3).length() + ")");
		
		
		System.out.println("Division Operation Case to Double=" + Double.valueOf(num1 / num2));
		System.out.println("Division Operation Case to Double=" + Double.valueOf((double)num1 / num2));
		System.out.println("Division Operation Case to Double=" + (double)num1 / num2);
		System.out.println("Division Operation Case to Double=" + Double.valueOf((float)num1 / num2));
		System.out.println("Division Operation Case to Double=" + Double.valueOf((long)num1 / num2));
		
		
		
	}

	private static void printInteger(int num) {
		System.out.println("\n>> " + num);
		System.out.println("Decimal of " + num + " = " + Integer.toString(num, 10));
		System.out.println("Binary of " + num + " = " + Integer.toBinaryString(num));
		System.out.println("Octal of " + num + " = " + Integer.toString(num, 8));
		System.out.println("Hex of " + num + " = " + Integer.toString(num, 16));
		System.out.println("Base 26 of " + num + " = " + Integer.toString(num, 26));
	}

	
	
	public static void binaryIntegerOperations() {
		
		int n1 = 2;
		int n2 = 3;
		
		// & it operates on the bits of the integer,
		// When both bits are 1 the output bit is going to be 1
		// When one of bits are 0 then the output bit will be 0
		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(3));
		
		int n3 = 0b10;
		System.out.println(">> " + Integer.toBinaryString(n3));
		
		System.out.println(Integer.toBinaryString(2 & 3)); // 10
		

		// Exclusive OR
		// ^ it operates on the bits of the integer,
		// When both bits are 1 the output bit is going to be 0
		// When both bits are 0 the output bit is going to be 0
		// When one bit is 0 and the other bit 1 then the output bit will 1
		System.out.println(n1 + " - " + Integer.toBinaryString(n1));
		System.out.println(n2 + " - " + Integer.toBinaryString(n2));
		
		System.out.println(">> " + (n1 ^ n2));
		System.out.println("Binary notation of result >> " + Integer.toBinaryString(n1 ^ n2));
		
		// ~ operator, A unary operator applied to a single operand
		n1 = Integer.MAX_VALUE;
		System.out.println(n1 + 1); // ?? 
		System.out.println(n1 + 2); // ?? 
		
		n2 = Integer.MIN_VALUE;
		System.out.println(n2 - 1);
		
		
		
	}
}
