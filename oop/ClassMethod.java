package org.java.oop;

public class ClassMethod {
	
	public int n1;
	public int n2;
	public static int n3;
	
	public void s1() {
		n1=10;
		n2=30;
		n3=200;
	}
	
	public static void s2() {
//		n1=10; static�� �ƴϹǷ�
//		n2=30;
		n3=200;
	}
	
	
	
	
	
	//�ż��� ����1
	public void method1() {
		//�ż��� ȣ��(call)�� ����Ǵ� �ڵ� ��
		System.out.println("��ȯ���� ���� �Է°��� ����");
//		return;// ��ȯ���� ����(��������)
	}
	//�ż��� ����2
						//��������(�Ű�����)
	public void method2(int num1, int num2) {
		int sum = num1+num2; // ��������(�ż��� �ȿ� ���𺯼�)
		System.out.println(num1+"+"+num2+"="+(num1+num2));
//		return;
	}
	//�ż��� ����3
	//��ȯŸ��
		public int method3() {
		int sum=10+200;
		return sum;
	}
	//�ż��� ����4
		public int method4(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	//Ŭ���� �ż���
	public static void staticMethod() {
		System.out.println("Ŭ���� �ż���");
	}
	public static void staticMethod2(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
	}

