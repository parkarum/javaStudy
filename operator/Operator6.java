package org.java.operator;

import java.util.Scanner;

public class Operator6 {
	public static void main(String[] args) {

		System.out.println("복합 대입연산자");

		int num1 = 100;
		System.out.println(num1);
		
		num1 = num1+100;
		System.out.println(num1);

		num1+= 100;
		System.out.println(num1);

		num1-= 100;
		System.out.println(num1);

		num1*= 100;
		System.out.println(num1);

		num1/= 100;
		System.out.println(num1);


		num1%= 100;
		System.out.println(num1);

	}
}
