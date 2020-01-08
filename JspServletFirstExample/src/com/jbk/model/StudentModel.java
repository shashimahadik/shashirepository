package com.jbk.model;

import java.sql.ResultSet;

import com.jbk.util.DBUtil;

public class StudentModel {
	public boolean checkUsernameIfExistInDb(String uname){
		try{
		System.out.println(4);
		String sql = "select * from Employee where name='" + uname + "'";
		System.out.println(5);
		System.out.println("query to execute >>"+sql);
		System.out.println(6);
		ResultSet rs;
		rs= DBUtil.createStatement().executeQuery(sql);
		System.out.println(7);
		if(rs.next()){
			System.out.println(8);
			return true;
		}
	} catch (Exception e) {
		System.out.println(3);
		e.printStackTrace();
	}
		return false;
	}
	
 }
