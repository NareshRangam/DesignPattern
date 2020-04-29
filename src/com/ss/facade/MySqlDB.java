package com.ss.facade;

import java.sql.Connection;

public class MySqlDB {

	public static Connection getMySQLConnection()
	{
		return null;
	}
	public static void generateMySQLPdfReports(Connection con)
	{
		System.out.println("Generating Mysql PDF Reports");
	}
	public static void generateMySQLHTMLReports(Connection con)
	{
		System.out.println("Generating Mysql HTML Reports");
	}
}
