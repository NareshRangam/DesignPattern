package com.ss.factory;

public class Rectangle implements FactoryInterface{

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
	}

}
