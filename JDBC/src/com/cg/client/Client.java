package com.cg.client;
import java.sql.Connection;

import com.cg.util.DButil;
public class Client {

	public static void main(String[] args) {
		Connection connection = DButil.getConnection();
		if(connection != null) {
			System.out.println("JDBC: Connection is established");
		}
		

	}

}
