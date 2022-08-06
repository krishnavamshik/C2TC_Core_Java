package com.cg.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	private static final String db_driverclass = "com.mysql.cj.jdbc.Driver";
	private static final String db_url = "jdbc:mysql://localhost:3306/jdbc";
	private static final String db_username = "root";
	private static final String db_password = "admin123";
	private static Connection con = null;

	static {
		try {
			Class.forName(db_driverclass);
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection(db_url, db_username, db_password);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static Connection getConnection() {
		return con;
	}

}
