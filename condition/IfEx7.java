package org.java.condition;

import java.util.Scanner;

public class IfEx7 {
	public static void main(String[] args) {
		System.out.println("if문 예제");
		System.out.println("국어, 영어, 수학 점수를 입력, 총점, 평균, 학점(평균)");

		// 국어, 영어, 수학(0~100점수), 총점(정수), 평균(double)
		// Scanner 클래스 이용, 중첩 if문을 이용
		Scanner scn = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요");
		int kor = scn.nextInt();
		
		System.out.println("수학 점수를 입력하세요");
		int math = scn.nextInt();
		
		System.out.println("영어 점수를 입력하세요");
		int eng = scn.nextInt();
		
		int sum = kor + math + eng;
		System.out.println("총점"+ sum);
		
		double avg = (double) sum / 3;
		System.out.println("평균" +avg);
		
		System.out.println("학점");
		if (avg >= 90) {
			if (avg >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A-");
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B-");
			}

		} else if (avg >= 70) {
			if (avg >= 75) {
				System.out.println("C+");
			} else {
				System.out.println("C-");
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				System.out.println("D+");
			} else {
				System.out.println("D-");
			}
		} else {
			System.out.println("F");
		}

	}
}
