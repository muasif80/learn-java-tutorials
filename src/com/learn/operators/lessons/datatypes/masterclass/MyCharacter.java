package com.learn.operators.lessons.datatypes.masterclass;

import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class MyCharacter {

	public static void main(String[] args) throws UnsupportedEncodingException {

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
		
		
		//charToNumericTypes(c1);
		
		charOperations();
		
		//charToUnicode();
	}
	
	private static void charOperations() {
		System.out.println("charOperations");
		char r1 =  'a' + 'b';
		System.out.println((int)r1 + " = " + r1);
		
		char r2 = 'b' - 'a';
		System.out.println((int)r2 + " = " + r2);
		
		char r3 = '0' * 2 + 1;
		System.out.println("'0' * 2 + 1=" + (int)'0' + "*" + 2 + "+" + 1);
		System.out.println((int)r3 + "=" + r3);
		
		char r4 = (int)('4') ^ (int)('2'); // 100 ^ 010 = 110 = 6
		System.out.println("'4' ^ '2'=" + (int)'4' + "^" + (int)'2');
		
		System.out.println(Integer.toBinaryString(52));
		System.out.println(Integer.toBinaryString(50));
		
		System.out.println((int)r4 + " = " + r4);
		
		
		char r5 = '4' & '2'; // 100 & 010 = 000 = 0
		System.out.println((int)r5 + " = " + r5);
	}

	private static void charToNumericTypes(char c1) {
		int n = c1;
		byte b = (byte)c1;
		short s = (byte)c1;
		long l = (byte)c1;
		
		System.out.println("n = " + n);
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("l = " + l);
	}

	private static void charToUnicode() throws UnsupportedEncodingException {
		//
		Charset utf8 = Charset.forName("UTF-8");
        Charset def = Charset.defaultCharset();

        //String charToPrint = "u0000";
        char cc = '\u0061'; // Character constant
        String charToPrint = Character.toString(cc);

        byte[] bytes = charToPrint.getBytes("UTF-8");
        String message = new String(bytes , def.name());

        PrintStream printStream = new PrintStream(System.out, true, utf8.name());
        printStream.println(message); // should print your character
	}
}
