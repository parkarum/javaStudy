package org.project.dto;

public class MemberDto {

	private String userId;
	private String userPw;
	private int userAge;
	private String userPhone;

	public MemberDto() {
		System.out.println("기본생성자");
	}
	
	
	public MemberDto( String userId, String userPw,int userAge, String userPhone) {
		this.userId=userId;
		this.userPw=userPw;
		this.userAge=userAge;
		this.userPhone=userPhone;
		System.out.println("다른생성자");
	}
	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	@Override
	public String toString() {
		return "회원가입[userId=" + userId + ", userPw=" + userPw + ", userAge=" + userAge + ", userPhone="
				+ userPhone + "]";
	}
	
	
	
}
