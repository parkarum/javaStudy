package org.java.condition;

import java.util.Scanner;

public class Switch2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("첫번째 숫자(정수)를 입력하세요");
		int num1 = scn.nextInt();

		System.out.println("두번째 숫자(정수)를 입력하세요");
		int num2 = scn.nextInt();

		System.out.println("연산기호를 입력하세요(+-*/)");
		String op = scn.next();

		switch (op) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case "/":
			System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / num2));
			break;
		default:
			System.out.println("연산자 입력오류");
		}
		int result = 0;
	}
}
