package com.ss.builder;

public class BuiderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle car=new Vehicle.VehicleBuilder("500cc", 4).setAir(2).build();
		System.out.println("Car::"+car);
		Vehicle bike=new Vehicle.VehicleBuilder("200cc", 2).build();
		System.out.println("Bike::"+bike);
	}

}
