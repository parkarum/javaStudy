package org.java.operator;

public class Operator3 {
	public static void main(String[] args) {
		System.out.println("��������");
		System.out.println("&& ��� ������ true�϶���  true");
		
		String userId="m1111";
		String userPw="1111";
				
		System.out.println(userId=="m1111" && userPw=="1111");
		System.out.println(userId=="m1111" && userPw=="2111");
		System.out.println(userId=="m1112" && userPw=="1111");
		System.out.println(userId=="m1112" && userPw=="2111");
	
		if(userId=="m1111" && userPw=="1111") {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		
		System.out.println("||�ϳ� �̻��� ������ true�̸� ������� true");
		if(userId!="m1111" || userPw!="1111") {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		
	
	}
}
