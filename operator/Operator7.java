package org.java.operator;

import java.util.Scanner;

public class Operator7 {
	public static void main(String[] args) {

		System.out.println("XOR������(^)");

		int num1 = 10;
		int num2 = 20;
		System.out.println((num1 == 10) + "^" + (num2 == 20) + " " + (num1 == 10 ^ num2 == 20));
		System.out.println((num1 == 20) + "^" + (num2 == 20) + " " + (num1 == 20 ^ num2 == 20));
		System.out.println((num1 == 10) + "^" + (num2 == 30) + " " + (num1 == 10 ^ num2 == 30));
		System.out.println((num1 == 20) + "^" + (num2 == 30) + " " + (num1 == 20 ^ num2 == 30));

	}
}
