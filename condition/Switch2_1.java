package org.java.condition;

import java.util.Scanner;

public class Switch2_1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("ù��° ����(����)�� �Է��ϼ���");
		int num1 = scn.nextInt();

		System.out.println("�ι�° ����(����)�� �Է��ϼ���");
		int num2 = scn.nextInt();

		System.out.println("�����ȣ�� �Է��ϼ���(+-*/)");
		char op = scn.next().charAt(0);// char �ѱ���

		int result=0; //�ʱ�ȭ �ʿ�
		
		switch (op) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;	
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '%':
			result=num1%num2;
			break;
		default:
			System.out.println("������ �Է¿���");
		}//break�� ��ġ
		
		System.out.println("������ ��� : "+num1+"  "+op+"  "+num2+" = "+result) ;
	}
}
