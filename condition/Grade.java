package org.java.condition;

public class Grade {
	private int kor;
	private int eng;
	private int math;
	
	//contstruct(생산자)
	public Grade(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	//method (매서드)
	public void sumGrade() {
		System.out.println("국어: "+kor);
		System.out.println("영어: "+eng);
		System.out.println("수학: "+math);
		int sum=kor+eng+math;
		System.out.println("총점: "+sum);
	}
	//method (매서드)
	public void avgGrade() {
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		System.out.println("평균: "+avg);
	
	}
	//method (매서드)
	public double avgGet() {
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		return avg;
	}
	
}
