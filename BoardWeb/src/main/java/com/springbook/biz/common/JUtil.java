package com.springbook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;

public class JUtil {
	public static Connection getConnection() {
		
		try {
			Class.forName("org.h2.Driver");
			return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test","sa","");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	
	}
}