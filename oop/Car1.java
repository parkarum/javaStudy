package org.java.oop;

public class Car1 {

	//�ɹ�
	//�ν��Ͻ� �ɹ�(�ʵ�)
	public String carName;
	public int carCoin;
	public int carYear;
	public int carWidth;
	//final ����� ������ ���ÿ� �ʱ�ȭ �ؾߵȴ�. ���� �Ұ�
	//public static final String CITY="����";
	public static String CITV;
	
	
	//private setter,getter �ż��� ����
	private String option1;
	private String option2;
	
	//setters -> private �ɹ� �ʱ�ȭ
	public void setOption1(String option1) {
		this.option1=option1;
	}
	
	//getters -> private �ɹ� get
	public String getOption1() {
		return this.option1;
		
	}
	
	
	//�ν��Ͻ��ɹ�(�޼���)
	public void instanctMethod1() {
		System.out.println("�ڵ��� �̸�: "+ this.carName);
	}
	//�ν��Ͻ��ɹ�(�޼���)
	public void instanctMethod2() {
		System.out.println("�ڵ��� ���� "+ this.carCoin);
	}
	//�ν��Ͻ��ɹ�(�޼���)
	public void instanctMethod3() {
		System.out.println("�ڵ��� ���: "+ this.carYear);
	}
	//�ν��Ͻ��ɹ�(�޼���)
	public void instanctMethod4() {
		System.out.println("�ڵ��� �ʺ�: "+ this.carWidth);
	}

}
