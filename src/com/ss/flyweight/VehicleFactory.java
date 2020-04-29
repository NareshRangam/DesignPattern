package com.ss.flyweight;

import java.util.HashMap;

public class VehicleFactory {

	private static HashMap<String, Vehicle> hashMap=new HashMap<String, Vehicle>();
	public static Vehicle getVehicle(String type)
	{
		Vehicle v=null;
		if(hashMap.containsKey(type))
		{
			v=hashMap.get(type);
		}
		else
		{
			switch (type) {
			case "truck":
				v=new Truck();
				System.out.println("truck object created");
				break;
			case "cycle":
				v=new Cycle();
				System.out.println("cycle object created");
				break;
			default:
				throw new IllegalArgumentException("Vehicle type" +type+ " does not exist"); 
			}
			hashMap.put(type, v);
		}
		return v;
		
	}
}
