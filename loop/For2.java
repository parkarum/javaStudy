package org.java.loop;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		System.out.println("for문");
		// 2단 ~9단 구구단
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단입니다.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));

			}
		}
		System.out.println("==========================");
		// 9단 부터 2단까지 구구단을 출력
		// 9*9~2*1
		for (int i = 9; i > 1; i--) {
			System.out.println(i + "단입니다.");
			for (int j = 10; j > 1; j--) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

		// Scanner 클래스 이용해서 시작단을 입력받아 서 구구단을 입력단~9단까지 출력
		System.out.println("구구단 시작단을 입력하세요");
		Scanner scn = new Scanner(System.in);
		System.out.println("시작단 입력");
		int startNum = scn.nextInt();

		System.out.println("끝단 입력");
		int endNum = scn.nextInt();

		if (startNum > endNum) {
			System.out.println("시작단이 끝단보다 크거나 같아야됩니다.");
		} else {
			for (int i = startNum; i < endNum + 1; i++) {
				System.out.println(i + "단입니다.");
				for (int j = 2; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
			}

		}
		scn.close();
	}
}
