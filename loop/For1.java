package org.java.loop;

public class For1 {

	public static void main(String[] args) {
		System.out.println("for¹®");

		for (int i = 0; i < 10; i++) {
//			System.out.print(i+ " ");

//			int i2=i+1;
//			System.out.print(i2);
//			System.out.println((i+1)+",");
			if (i == 9) {
				System.out.print(i + 1);
			} else {
				System.out.print((i + 1) + ",");
			}

		}

		System.out.println("========================");
		for (int i = 0; i < 10; i++)
			System.out.println("url(img/bg " + i + ".jpg) no-repeat 50%/cover");

	}
}
