package org.java.condition;

public class Grade {
	private int kor;
	private int eng;
	private int math;
	
	//contstruct(������)
	public Grade(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	//method (�ż���)
	public void sumGrade() {
		System.out.println("����: "+kor);
		System.out.println("����: "+eng);
		System.out.println("����: "+math);
		int sum=kor+eng+math;
		System.out.println("����: "+sum);
	}
	//method (�ż���)
	public void avgGrade() {
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		System.out.println("���: "+avg);
	
	}
	//method (�ż���)
	public double avgGet() {
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		return avg;
	}
	
}
