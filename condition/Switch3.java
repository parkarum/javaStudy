package org.java.condition;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		System.out.println("���ĺ��� �Է��ϼ���");
		Scanner scn = new Scanner(System.in);
		System.out.println("���� �� �� �Է�");
		String ch = scn.nextLine();
		switch(ch) {
			case "A": //A�̳� a
			case "a":
					System.out.println("A�Դϴ�.");
			break;
			case "B"://B�̳� b
			case "b":
					System.out.println("B�Դϴ�.");
			break;
			case "C"://C�̳� c
			case "c":
					System.out.println("C�Դϴ�.");
			break;
			default: 
				System.out.println("A,B,C���� ���ĺ��Դϴ�.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
