package org.java.oop;

public class Car1 {

	//맴버
	//인스턴스 맴버(필드)
	public String carName;
	public int carCoin;
	public int carYear;
	public int carWidth;
	//final 상수는 생성과 동시에 초기화 해야된다. 변경 불가
	//public static final String CITY="서울";
	public static String CITV;
	
	
	//private setter,getter 매서드 생성
	private String option1;
	private String option2;
	
	//setters -> private 맴버 초기화
	public void setOption1(String option1) {
		this.option1=option1;
	}
	
	//getters -> private 맴버 get
	public String getOption1() {
		return this.option1;
		
	}
	
	
	//인스턴스맴버(메서드)
	public void instanctMethod1() {
		System.out.println("자동차 이름: "+ this.carName);
	}
	//인스턴스맴버(메서드)
	public void instanctMethod2() {
		System.out.println("자동차 가격 "+ this.carCoin);
	}
	//인스턴스맴버(메서드)
	public void instanctMethod3() {
		System.out.println("자동차 년식: "+ this.carYear);
	}
	//인스턴스맴버(메서드)
	public void instanctMethod4() {
		System.out.println("자동차 너비: "+ this.carWidth);
	}

}
