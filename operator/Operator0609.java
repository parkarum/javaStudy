package org.java.operator;

import java.util.Scanner;

public class Operator0609 {

public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	
	System.out.println("���������� �Է��Ͻÿ�(����)");
	int num1 = scn.nextInt();
			
	System.out.println("���������� �Է��Ͻÿ�(����)");
	int num2 = scn.nextInt();
	
	System.out.println("���������� �Է��Ͻÿ�(����)");
	int num3= scn.nextInt();
	
	System.out.println("����");
	System.out.println(num1+num2+num3);
	
	System.out.println("���");
	System.out.println((double)(num1+num2+num3)/3);
}
}
