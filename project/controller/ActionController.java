package org.project.controller;

import java.util.Scanner;

import org.project.commend.ActionDelete;
import org.project.commend.ActionInsert;
import org.project.commend.ActionSelect;
import org.project.commend.ActionUpdate;

public class ActionController {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		while (true) {
			System.out.println("쿼리문을 입력하세요");
			String query = scn.next();
			if (query.equals("insert")) {
				ActionInsert insert = new ActionInsert();
				insert.excuteQuery();
			} else if (query.equals("update")) {
				ActionUpdate update = new ActionUpdate();
				update.excuteQuery();
			} else if (query.equals("delete")) {
				ActionDelete delete = new ActionDelete();
				delete.excuteQuery();
			} else if (query.equals("select")) {
				ActionSelect select = new ActionSelect();
				select.excuteQuery();
			} else if (query.equals("exit")) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("입력오류");
			}
		}
	scn.close();
	}
	
}
