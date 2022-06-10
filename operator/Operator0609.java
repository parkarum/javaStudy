package org.java.operator;

import java.util.Scanner;

public class Operator0609 {

public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	
	System.out.println("국어점수를 입력하시오(정수)");
	int num1 = scn.nextInt();
			
	System.out.println("영어점수를 입력하시오(정수)");
	int num2 = scn.nextInt();
	
	System.out.println("수학점수를 입력하시오(정수)");
	int num3= scn.nextInt();
	
	System.out.println("총점");
	System.out.println(num1+num2+num3);
	
	System.out.println("평균");
	System.out.println((double)(num1+num2+num3)/3);
}
}
