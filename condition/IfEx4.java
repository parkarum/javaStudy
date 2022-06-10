package org.java.condition;

import java.util.Scanner;

public class IfEx4 {
	public static void main(String[] args) {
		System.out.println("if 조건이 여러개일때");
		// Scanner 클래스를 이용해서 변수 grade 정수값을 입력
		// grade가 90점 이상이면 A, 80점이상이면 B, 70점 이상이면 C, 60점 이상이면 D
		// 60미만이면 F를 콘솔에 출력하는 프로그래밍을 하세요
		// if~else if를 사용해보세요

		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int grade = scn.nextInt();
		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	
	}
}
