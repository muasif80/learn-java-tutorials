package com.learn.operators.lessons.datatypes.masterclass;

public class MyCharacter {

	public static void main(String[] args) {

		char c1 = 'a';
		char c2 = 97;
		char c3 = 0B1100001;
		char c4 = '\u0061';
		char c5 = 9_7;

		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
		System.out.println(c1 == c4);
		System.out.println(c1 == c5);

		char res1 = 'a' + 1;
		char res2 = 'a';
		res2 += 1;
		char res3 = (char)(c1 + 1);
		
		System.out.println("res1=" + res1);
		System.out.println("res2=" + res2);
		System.out.println("res3=" + res3);
		
		
		for (int c = 48; c <= 'z'; c++) {
			System.out.println(c + " = " + (char) c);
		}
		
		switch (c1) {
		case 'a':
			System.out.println("Character " + c1 + " is found");
			break;
		default:
			System.out.println("No match found");
		}
		
		
	}
}
