package com.ss.facade;

public class FacadeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FacadeHelper.generateReports("mysql", "html");
		FacadeHelper.generateReports("mysql", "pdf");
		FacadeHelper.generateReports("oracle", "html");
		FacadeHelper.generateReports("oracle", "pdf");
	}

}
