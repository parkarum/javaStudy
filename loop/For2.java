package org.java.loop;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		System.out.println("for��");
		// 2�� ~9�� ������
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "���Դϴ�.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));

			}
		}
		System.out.println("==========================");
		// 9�� ���� 2�ܱ��� �������� ���
		// 9*9~2*1
		for (int i = 9; i > 1; i--) {
			System.out.println(i + "���Դϴ�.");
			for (int j = 10; j > 1; j--) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}
		}

		// Scanner Ŭ���� �̿��ؼ� ���۴��� �Է¹޾� �� �������� �Է´�~9�ܱ��� ���
		System.out.println("������ ���۴��� �Է��ϼ���");
		Scanner scn = new Scanner(System.in);
		System.out.println("���۴� �Է�");
		int startNum = scn.nextInt();

		System.out.println("���� �Է�");
		int endNum = scn.nextInt();

		if (startNum > endNum) {
			System.out.println("���۴��� ���ܺ��� ũ�ų� ���ƾߵ˴ϴ�.");
		} else {
			for (int i = startNum; i < endNum + 1; i++) {
				System.out.println(i + "���Դϴ�.");
				for (int j = 2; j < 10; j++) {
					System.out.println(i + "*" + j + "=" + (i * j));
				}
			}

		}
		scn.close();
	}
}
