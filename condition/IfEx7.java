package org.java.condition;

import java.util.Scanner;

public class IfEx7 {
	public static void main(String[] args) {
		System.out.println("if�� ����");
		System.out.println("����, ����, ���� ������ �Է�, ����, ���, ����(���)");

		// ����, ����, ����(0~100����), ����(����), ���(double)
		// Scanner Ŭ���� �̿�, ��ø if���� �̿�
		Scanner scn = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���");
		int kor = scn.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���");
		int math = scn.nextInt();
		
		System.out.println("���� ������ �Է��ϼ���");
		int eng = scn.nextInt();
		
		int sum = kor + math + eng;
		System.out.println("����"+ sum);
		
		double avg = (double) sum / 3;
		System.out.println("���" +avg);
		
		System.out.println("����");
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
