package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TestJDBC {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/hb_student_tracker";
		String user = "hbstudent";
		String pwd = "hbstudent";
		
		try {
			
			//Class.forName("com.mysql.jdbc.Driver");  
			Connection con = DriverManager.getConnection(jdbcUrl,user,pwd);	
			Statement stmt=con.createStatement();
			System.out.println("Connection Successful!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
