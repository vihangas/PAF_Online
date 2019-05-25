package com.vihanga.sathsra.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	Connection con;
	String url;
//	private static DBConnector connection;
	
	public Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch(Exception e) {
			System.out.println(e);
		}
	
		try {
			this.url = "jdbc:mysql://localhost:3306/paf";
			this.con = (Connection)DriverManager.getConnection(this.url, "root", "");
			System.out.println("Connected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.con;
	}

}
