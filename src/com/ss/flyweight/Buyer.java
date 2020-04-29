package com.ss.flyweight;

public class Buyer {
	public static void main(String args[])
	{
		Vehicle cycle=VehicleFactory.getVehicle("cycle");
		cycle.assignColor("red");
		cycle.startEnginee();
		cycle.assignColor("blue");
		cycle.startEnginee();
		Vehicle truck=VehicleFactory.getVehicle("truck");
		truck.assignColor("red");
		truck.startEnginee();
		truck.assignColor("blue");
		truck.startEnginee();
	}
}
