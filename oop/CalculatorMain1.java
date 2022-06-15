package org.java.oop;

import java.util.Scanner;

public class CalculatorMain1 {

	public static void main(String[] args) {
		// 두 숫자와 연산자(+-/*) 입력받아서 각각의 매서드를 실행
		// while문을 이용해서 무한반복 -> z를 입력하면 while문을 종료
		// 두숫자 입력 setter
		// + sum(),-sub(),*multi(), /div() 호출되도록 해보세요.

		Scanner scn = new Scanner(System.in);
		Calculator1 c1 = new Calculator1();

		while (true) {
			System.out.println("첫번재 숫자를 입력");
			int num1 = scn.nextInt();

			System.out.println("두번째 숫자를 입력");
			int num2 = scn.nextInt();

			System.out.println("연산자를 입력");
			String op = scn.next();

			c1.setNum1(num1);
			c1.setNum2(num2);

			if (op.equals("+")) {
				c1.sum();
			} else if (op.equals("-")) {
				System.out.println(c1.getNum1() + "-" + c1.getNum2() + "=" + c1.sub());
			} else if (op.equals("*")) {
				System.out.println(c1.getNum1() + "*" + c1.getNum2() + "=" + c1.multi());
			} else if (op.equals("/")) {
				System.out.println(c1.getNum1() + "/" + c1.getNum2() + "=" + c1.div());
			} else if (op.equals("z")) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("연산자 입력오류");
			}
		}
		scn.close();
	}
}
