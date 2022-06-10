package org.java.loop;

public class While2 {
	public static void main(String[] args) {
		System.out.println("While");
		
		int i = 0;
		
		while(i<10) {			
			System.out.println(i);
			i++;
		}
		System.out.println("=====================");
		
		int i2=0;
		while(true) {
			System.out.println(i2);
			
			//if문을 사용해서 0~9까지만 출력
			if(i2>=9) {
				break;
			}
				
			i2++;
			
		}
	}
}
