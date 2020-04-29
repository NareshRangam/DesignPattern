package com.ss.factory;

public class FactoryInstance {

	public static FactoryInterface getInstance(String instanceType)
	{
		if(instanceType.equalsIgnoreCase("circle"))
		{
			return new Circle();
		}
		else if(instanceType.equalsIgnoreCase("rectangle"))
		{
			return new Rectangle();
		}
		else if(instanceType.equalsIgnoreCase("traingle"))
		{
			return new Traingle();
		}
		return null;
		
	}
}
