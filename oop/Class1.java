package org.java.oop;

public class Class1 {

	//�ν��Ͻ� ���
	public int num1;
	public int num2;
	private String key;
	//static  Ŭ���� ���
	public final static String PROJECTNAME = "JAVAPROJECT2022";
	//�ν��Ͻ� ���
	public void instansMethod() {
		System.out.println("return�� ���� �ν��Ͻ� �ż���");
	}
	//�ν��Ͻ� ���
	public int instansMethod2() {
		System.out.println("return���� int �ν��Ͻ� �ż���");
		return this.num1 + this.num2;
	}
	//static Ŭ���� ���
	public static void classMethod() {
		System.out.println("Ŭ���� �ż���");
	}
	
	//setters->private ��� �ʱ�ȭ
	public void setKey(String key) {
		this.key = key;
		//return; ��������, ���� �Ⱦ�
		}
	public String getKey() {
		return this.key;
	}










}

