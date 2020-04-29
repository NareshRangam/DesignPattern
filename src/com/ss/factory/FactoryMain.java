package com.ss.factory;

public class FactoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FactoryInterface rectangle=FactoryInstance.getInstance("rectangle");
		rectangle.draw();
		FactoryInterface circle=FactoryInstance.getInstance("circle");
		circle.draw();
		FactoryInterface traingle=FactoryInstance.getInstance("traingle");
		traingle.draw();
		
	}

}
