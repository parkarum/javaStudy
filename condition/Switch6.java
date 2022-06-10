package org.java.condition;

import java.util.Scanner;

public class Switch6 {
	public static void main(String[] args) {
		System.out.println("Scanner 클래스 이용해서 프로그래밍해보세요 if문 활용");
		System.out.println("쿼리문을 입력하세요(insert,update,select,delete)");//CRUD

		Scanner scn = new Scanner(System.in);
		String query = scn.next();

		if (query.equals("insert")) {
			System.out.println("회원가입 페이지로 이동합니다.");
		} else if (query.equals("update")) {
			System.out.println("회원 수정 페이지로 이동합니다.");
		} else if (query.equals("select")) {
			System.out.println("회원 조회페이지로 이동합니다.");
		} else if (query.equals("delete")) {
			System.out.println("회원 탈퇴페이지로 이동합니다.");
		} else {
			System.out.println("잘못된 쿼리문입니다.");
		}
		scn.close();
		
		System.out.println("java2022".charAt(0));//문자열0번째
		System.out.println("java2022".charAt(1));//문자열1번째
		System.out.println("java2022".charAt(2));//문자열2번째
		System.out.println("java2022".charAt(3));//문자열3번째
		System.out.println("java2022".charAt(4));//문자열4번째
	
	
	}
}
