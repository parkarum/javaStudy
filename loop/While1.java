package org.java.loop;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		System.out.println("While");
		//구구단 2단~9단
		int i=2;
		while(i<10) {
			System.out.println(i+"단입니다");
			 
			int j=1;
			while(j<10) {
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
			}
		
			i++;
		
		}
		System.out.println("========================");
	
		//Scanner에서 입력단(정수)를 이용해서구구단을 출력하세요
		//예) 4입력하면 4단부터 9단까지 출력
	
		Scanner scn = new Scanner(System.in);
		System.out.println("시작단을 입력하세요");
		int startnum = scn.nextInt();
		
		System.out.println("끝단을 입력하세요");
		int endnum = scn.nextInt();
		
		int i2=startnum;
		
		while(i2>10) {
			System.out.println(i2+"단입니다");
			 
			int j=1;
			while(j<10) {
				System.out.println(i2+"*"+j+"="+(i*j));
				j++;
			}
		
			i2++;}
		}
	
	
	
}
