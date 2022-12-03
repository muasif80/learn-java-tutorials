package com.learn.operators.lessons.datatypes.masterclass;

public class MyCharacter2 {

	public static void main(String[] args) {
		
//		char c1 = 'a' - 1; // 97 + 1
//		
//		print("c1", c1);
//		print("min", Character.MIN_VALUE);
//		print("max", Character.MAX_VALUE);
//		
		//char c2 = 1;
		
		
//		for(char i = '0'; i <= 'z'; i++) {
//			print("char literal = ", i);
//		}
		
//		char c = 0;
//		
//		print("c", c);
		
		
//		char c = 'a' & 'f'; // 97 & 103
//		print("c", c);
//		
//		char c1 = 1 ^ 0B10001;
		
		switch('f') {
		case 'a': 
			System.out.println("Found character");
			break;
		default:
			System.out.println("Could not find character");
		}
		
		
		
		
		
	}
	
	private static void exampleSet1() {
		char c = 'a';
		char c2 = 97;
		char c3 = '\u0061';
		char c4 = 0B1100001;
		char c5 = 0x0061;
		
		print("c", c);
		print("c2", c2);
		print("c3", c3);
		print("c4", c4);
		print("c5", c5);
	}
	
	private static void print(String name, char c) {
		int i = (int)c;
		System.out.println(name + "=" + c + ", int=" + i + ", binary=" + Integer.toBinaryString(i));
	}
}
