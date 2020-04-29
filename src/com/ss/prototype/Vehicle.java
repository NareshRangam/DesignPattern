package com.ss.prototype;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable{

	private List<String> vehicleList;

	public Vehicle()
	{
			this.vehicleList=new ArrayList<String>();
	}
	public Vehicle(List<String> vehicleList) {
		super();
		this.vehicleList = vehicleList;
	}
	public void insertData()
	{
		vehicleList.add("vehicle1");
		vehicleList.add("vehicle2");
		vehicleList.add("vehicle3");
		vehicleList.add("vehicle4");
		vehicleList.add("vehicle5");
	}
	public List<String> getVehicleList()
	{
		return vehicleList;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		List<String> tempList=new ArrayList<String>();
		for(String s:this.getVehicleList())
		{
			tempList.add(s);
		}
		return new Vehicle(tempList);
	}
	
}
