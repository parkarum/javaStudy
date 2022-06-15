package org.java.oop;

import java.util.Date;

public class MemberDTO {
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private String userAddr;
	private String userPhone;
	private Date day;
	
	//getters, setters
	//라이브러리 Lombok(spring setters, getters)
	
	//userId
	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	//userPw
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserPw() {
		return this.userPw;
	}
	
	//userName
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserName() {
		return this.userName;
	}
	
	//userAge
	public void setUserAge (int userAge) {
		this.userAge=userAge;
	}
	public int getUserAge() {
		return this.userAge;
	}
	
	//userAddr
	public void setUserAddr(String userAddr) {
		this.userAddr=userAddr;
	}
	public String getUserAddr() {
		return this.userAddr;
	}
	
	//userPhone
	public void setUserPhone(String userPhone) {
		this.userPhone=userPhone;
	}
	public String getUserPhone() {
		return this.userPhone;
	}
	
	//day
	public void setday(Date day) {
		this.day = day;
	}
	public Date getday() {
		return this.day;
	}
	@Override
	public String toString() {
		return "MemberDTO 회원[userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userAge=" + userAge
				+ ", userAddr=" + userAddr + ", userPhone=" + userPhone + ", day=" + day + "]";
	}
	
	
}
