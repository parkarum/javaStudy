package org.java.operator;

public class Operator10 {
	public static void main(String[] args) {

		System.out.println("단항연산자");

		// for문은 증감연산자 결과 똑같음
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}

		System.out.println();

		for (int i = 0; i < 10; ++i) {
			System.out.println(i);
		}
	}
}
