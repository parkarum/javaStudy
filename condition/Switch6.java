package org.java.condition;

import java.util.Scanner;

public class Switch6 {
	public static void main(String[] args) {
		System.out.println("Scanner Ŭ���� �̿��ؼ� ���α׷����غ����� if�� Ȱ��");
		System.out.println("�������� �Է��ϼ���(insert,update,select,delete)");//CRUD

		Scanner scn = new Scanner(System.in);
		String query = scn.next();

		if (query.equals("insert")) {
			System.out.println("ȸ������ �������� �̵��մϴ�.");
		} else if (query.equals("update")) {
			System.out.println("ȸ�� ���� �������� �̵��մϴ�.");
		} else if (query.equals("select")) {
			System.out.println("ȸ�� ��ȸ�������� �̵��մϴ�.");
		} else if (query.equals("delete")) {
			System.out.println("ȸ�� Ż���������� �̵��մϴ�.");
		} else {
			System.out.println("�߸��� �������Դϴ�.");
		}
		scn.close();
		
		System.out.println("java2022".charAt(0));//���ڿ�0��°
		System.out.println("java2022".charAt(1));//���ڿ�1��°
		System.out.println("java2022".charAt(2));//���ڿ�2��°
		System.out.println("java2022".charAt(3));//���ڿ�3��°
		System.out.println("java2022".charAt(4));//���ڿ�4��°
	
	
	}
}
