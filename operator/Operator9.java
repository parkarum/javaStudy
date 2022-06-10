package org.java.operator;



public class Operator9 {
	public static void main(String[] args) {

		System.out.println("단항연산자");
		 
		int i =10;
		
		
		//선처리 후증가
		System.out.println(i++);//i:10
		System.out.println(i);//i:11
		
		//선증가 후 처리
		System.out.println(++i);//i=12
		System.out.println(i);//i=12
		
		//선처리 후 증가
		System.out.println(i--);//i=12
		System.out.println(i);//i=11
		
		//선감소 후 처리
		System.out.println(--i);//i=10
		System.out.println(i);//i=10

	}
}
