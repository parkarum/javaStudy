package org.java.condition;

import java.util.Scanner;

public class IfEx3 {
	public static void main(String[] args) {
		System.out.println("if ������ �������϶�");
		// grade�� 90�� �̻��̸� A, 80���̻��̸� B, 70�� �̻��̸� C, 60�� �̻��̸� D
		// 60�̸��̸� F�� �ֿܼ� ����ϴ� ���α׷����� �ϼ���
		// if~else if�� ����غ�����

		int grade = 90;
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
