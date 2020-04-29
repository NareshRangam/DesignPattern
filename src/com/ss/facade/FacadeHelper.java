package com.ss.facade;

import java.sql.Connection;

public class FacadeHelper {
	public static void generateReports(String database,String report)
	{
		Connection con=null;
		switch (database) {
		case "mysql":
			con=MySqlDB.getMySQLConnection();
			switch (report) {
			case "html":
				MySqlDB.generateMySQLHTMLReports(con);
				break;
			case "pdf":
				MySqlDB.generateMySQLPdfReports(con);
				break;
			}
			break;
		case "oracle":
			con=OracleDB.getOracleConnection();
			switch (report) {
			case "html":
				OracleDB.generateOracleHTMLReports(con);
				break;
			case "pdf":
				OracleDB.generateOraclePdfReports(con);
				break;
			}
			break;
		}
	}

}
