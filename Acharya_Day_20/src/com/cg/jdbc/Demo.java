package com.cg.jdbc;
import java.sql.*;

public class Demo {

	public static void main(String[] args) {
		final String db_driverclass="com.mysql.jdbc.Driver";
		final String db_url="";
		final String db_username="";
		final String db_password="";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("db_url","db_username","db_password");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
