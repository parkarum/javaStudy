package org.java.oop;

public class Calculator1 {

	private int num1;
	private int num2;
	
	//�ʵ� ���� �����ڰ� private ���
	// �ܺο��� �ʱ�ȭ(setter),getter
	
	public void setNum1(int num1) {
		this.num1=num1;
	}
	public int getNum1() {
		return this.num1;
	}
	public void setNum2(int num2) {
		this.num2=num1;
	}
	public int getNum2() {
		return this.num2;
	}
	//////////////////////////////////
	
	public void sum() {
		System.out.println("���ϱ�");
		System.out.println(this.num1 + "+" + this.num2 + "="+ (this.num1+this.num2));
	}
	public int sub() {
		System.out.println("����");
		return this.num1 - this.num2;
	}
	
	public int div() {
		System.out.println("������");
		return this.num1 / this.num2;
	}
	
	public int multi() {
		System.out.println("���ϱ�");
		return this.num1 * this.num2;
	}
	
}
