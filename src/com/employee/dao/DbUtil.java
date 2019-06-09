package com.employee.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	public static Connection con;

	public static Connection getCon() throws SQLException, ClassNotFoundException {
		if (con == null || con.isClosed()) {
			Class.forName("org.h2.Driver");
			con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		}
		return con;
	}

}
