package com.org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class TestConn {
	
	private Connection conn;
	ResultSet rs;
	private PreparedStatement stmt;
	public static void main(String xep[])throws SQLException
	{
		OracleDriver od=new OracleDriver();
		DriverManager.registerDriver(od);
		Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
	    if(conn!=null)
	    {
	    	System.out.println("connecteddddddddddddd");
	    }
	    else {
	    	System.out.println("not conectttteeeeeedddddddd");
	    }
	}
	
	
}