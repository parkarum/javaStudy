package org.java.loop;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		System.out.println("While");
		//������ 2��~9��
		int i=2;
		while(i<10) {
			System.out.println(i+"���Դϴ�");
			 
			int j=1;
			while(j<10) {
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
			}
		
			i++;
		
		}
		System.out.println("========================");
	
		//Scanner���� �Է´�(����)�� �̿��ؼ��������� ����ϼ���
		//��) 4�Է��ϸ� 4�ܺ��� 9�ܱ��� ���
	
		Scanner scn = new Scanner(System.in);
		System.out.println("���۴��� �Է��ϼ���");
		int startnum = scn.nextInt();
		
		System.out.println("������ �Է��ϼ���");
		int endnum = scn.nextInt();
		
		int i2=startnum;
		
		while(i2>10) {
			System.out.println(i2+"���Դϴ�");
			 
			int j=1;
			while(j<10) {
				System.out.println(i2+"*"+j+"="+(i*j));
				j++;
			}
		
			i2++;}
		}
	
	
	
}
