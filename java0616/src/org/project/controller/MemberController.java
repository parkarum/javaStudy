package org.project.controller;

import org.project.dto.MemberDto;

public class MemberController {
		public static void main(String[] args) {
			
			
			MemberDto conn= new MemberDto();
			
			conn.setUserId("sdf");
			conn.setUserPw("asdfa");
			conn.setUserAge(1234);
			conn.setUserPhone("5468-486-7486");
			conn.toString();
			
			System.out.println(conn.getUserId());
			System.out.println(conn.getUserPw());
			System.out.println(conn.getUserAge());
			System.out.println(conn.getUserPhone());			
			System.out.println(conn.toString());
			
			
			MemberDto conn2= new MemberDto("asfd","SDFA2",44,"9746-74564-451");
			System.out.println(conn2.getUserId());
			System.out.println(conn2.getUserPw());
			System.out.println(conn2.getUserAge());
			System.out.println(conn2.getUserPhone());			
			System.out.println(conn2.toString());
		}
}
