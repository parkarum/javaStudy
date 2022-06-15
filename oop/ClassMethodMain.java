package org.java.oop;

public class ClassMethodMain {
		public int s1;
		public int s2;
		public static int s3;
		
		public void m1() {
			s1=10;
			s2=20;
			s3=410;
			System.out.println();
		}
		
	public static void main(String[] args) {
//		s1=10; //static이 아니므로
		s3=10;
		
		ClassMethod c1 = new ClassMethod();
		c1.method1();//call
		
		c1.method2(20,50);
		
		int sum= c1.method3();
		System.out.println(sum);
		System.out.println(c1.method3());
		
		int sum1 = c1.method4(80, 90);
		System.out.println(sum1);
		System.out.println(c1.method4(50, 70));
	
		
		ClassMethod.staticMethod();
		ClassMethod.staticMethod2(80, 90);
		
	
	
	
	
	
	
	}
}
