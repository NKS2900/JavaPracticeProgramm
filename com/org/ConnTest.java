package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Connection con;

		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
		if(con!=null)
		{
			System.out.println("connnnnnnnnnnnnnn");
		}
		else
		{
			System.out.println("not connnnnnnn");
		}

	}

}
