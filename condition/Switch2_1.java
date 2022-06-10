package org.java.condition;

import java.util.Scanner;

public class Switch2_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("첫번째 숫자(정수)를 입력하세요");
		int num1 = scn.nextInt();

		System.out.println("두번째 숫자(정수)를 입력하세요");
		int num2 = scn.nextInt();

		System.out.println("연산기호를 입력하세요(+-*/)");
		char op = scn.next().charAt(0);// char 한글자

		int result=0; //초기화 필요
		
		switch (op) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;	
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '%':
			result=num1%num2;
			break;
		default:
			System.out.println("연산자 입력오류");
		}//break문 위치
		
		System.out.println("연산의 결과 : "+num1+"  "+op+"  "+num2+" = "+result) ;
	}
}
