package org.java.operator;

public class ASCII1 {
	
	public static void main(String[] args) {
	System.out.println('A');
	System.out.println((int)'A');
 
	char ch ='A';
	System.out.println(ch);
	System.out.println((int)ch);
	
	//�ҹ���>>�빮��
	//int�Ʒ� ����� �ڵ����� int������ ����ȯ
	System.out.println('B'-'A');
	System.out.println('a'-'A');
	System.out.println('b'-32);//�ҹ���->�빮��
	System.out.println('b');
	System.out.println((char)('b'-32)); //int->char
	
	//�빮��>>�ҹ���
	System.out.println('A');
	System.out.println('A'+32);//�빮��->�ҹ���
	System.out.println((char)('A'+32));
	
	
	
	}
}
