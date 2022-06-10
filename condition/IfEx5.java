package org.java.condition;

import java.util.Scanner;

public class IfEx5 {
	public static void main(String[] args) {
		System.out.println("조건문");

		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int grade = scn.nextInt();
		if (grade >= 90) {
			if (grade >= 95) {
				System.out.println("A+");
			} else {
				System.out.println("A-");
			}
		} else if (grade >= 80) {
			if (grade >= 85) {
				System.out.println("B+");
			} else {
				System.out.println("B-");
			}

		} else if (grade >= 70) {
			if (grade >= 75) {
				System.out.println("C+");
			} else {
				System.out.println("C-");
			}
		} else if (grade >= 60) {
			if (grade >= 65) {
				System.out.println("D+");
			} else {
				System.out.println("D-");
			}
		} else {
			System.out.println("F");
		}

	}
}
