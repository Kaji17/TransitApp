package com.TransitApp.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
	
	public static Connection connectDb() {
		try {
			
			Class.forName("org.mysql.jdbc.Driver");
			
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/transitbd", "root", "");
			
			return connect;
		
		}catch (Exception e) {e.printStackTrace(); }
		return null;
	}
} 