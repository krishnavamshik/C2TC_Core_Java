package com.cg.util;
import java.sql.*;
public class Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/student";
		String uname = "root";
		String pass = "admin123";
		String query="select sname from student where usn=21";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st= con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("sname");
		System.out.println(name);
		st.close();
		rs.close();
	}

}
