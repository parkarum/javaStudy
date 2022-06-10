package org.java.operator;

import java.util.Scanner;

public class Operator8 {
	public static void main(String[] args) {

		System.out.println("비트연산자");

		System.out.println("&");
		System.out.println(10 & 12);
		System.out.println(20 & 30);

		System.out.println("|");
		System.out.println(10 | 12);
		System.out.println(20 | 30);

		System.out.println("~");
		System.out.println(~10);

		System.out.println("shift 연산자");
		int i=10;
		System.out.println(i+", "+Integer.toBinaryString(i));
		System.out.println((i>>2)+", "+Integer.toBinaryString(i>>2));
		System.out.println((i<<2)+", "+Integer.toBinaryString(i<<2));
		
		

	}
}
