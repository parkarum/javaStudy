package org.java.condition;

import java.util.Scanner;

public class IfEx1 {
	public static void main(String[] args) {
		System.out.println("if문");
		// 조건이 true일 때만 실행
		System.out.println("조건이 하나일 때");
		int num = 10;
		if (num >= 10) {
			System.out.println("10보다 크거나 같습니다.");
		}
		if (num >= 10)
			System.out.println("10보다 크거나 같습니다.");
		if (num >= 10)
			System.out.println("10보다 크거나 같습니다.");

		// Scanner 이용해서 정수를 입력받아서 100보다 크면 콘솔에 "100보다 크다"
		// if문 하나만 이용해서 프로그램을 해보세요
		System.out.println("숫자를 입력하세요");
		Scanner scn = new Scanner(System.in);
		int key = scn.nextInt();
		if (key > 100) {
			System.out.println("100보다 크다");
		}
		
		// Scanner 아이디를 입력해서 아이디가 "root"면 "즐겨운 쇼핑되세요" 표시
		// if문 하나만 이용해서 프로그램을 해보세요
		System.out.println("아이디 입력");
		String userId = scn.next();
		if (userId.equals("root"))
			System.out.println("즐거운 쇼핑되세요");
	}
}
