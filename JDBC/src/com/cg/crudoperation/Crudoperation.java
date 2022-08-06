package com.cg.crudoperation;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.cg.util.DButil;

public class Crudoperation {

	public static void main(String[] args) throws SQLException {
		Connection connection = DButil.getConnection();
		Statement st = connection.createStatement();
		String sqlinsert = "INSERT INTO students(name, branch, usn )"+"values('Krishna','MT','21')";
		int execute = st.executeUpdate(sqlinsert);
		if(execute==1) {
			System.out.println("entery is added");
		}
		
		String sqlread = "SELECT* FROM students";
		ResultSet execute2 = st.executeQuery(sqlread);
		System.out.println(execute2);
		
		
		String sqlupdate = "UPDATE students(name =Nikhil, branch=MT, usn=33)";
		int execute3 = st.executeUpdate(sqlupdate);
		if(execute3==1) {
			System.out.println("entery is updated");
		}
		String sqlDelete = "DELETE FROM student WHERE (usn=33)";
		int execute4 = st.executeUpdate(sqlDelete);
		if(execute4==1) {
			System.out.println("entery is Deleted");
		}

	}

}
