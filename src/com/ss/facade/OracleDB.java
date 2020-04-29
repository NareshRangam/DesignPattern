package com.ss.facade;

import java.sql.Connection;

public class OracleDB {
	public static Connection getOracleConnection()
	{
		return null;
	}
	public static void generateOraclePdfReports(Connection con)
	{
		System.out.println("Generating Oracle PDF Reports");
	}
	public static void generateOracleHTMLReports(Connection con)
	{
		System.out.println("Generating Oracle HTML Reports");
	}
}
