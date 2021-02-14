package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "HR", "uday");
		String query="Select * from emp";
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		
		ResultSet executeQuery = prepareStatement.executeQuery();
		while(executeQuery.next())
		{
		int cid=executeQuery.getInt("eid");
		System.out.println(cid);
		
		}
		connection.close();
	}

}
