package com.ss.prototype;

import java.util.List;

public class ProtypeMain {

	public static void main(String args[]) throws CloneNotSupportedException {
		Vehicle vehicle=new Vehicle();
		vehicle.insertData();
		System.out.println("original list::"+vehicle.getVehicleList());
		Vehicle vehicle1=(Vehicle) vehicle.clone();
		List<String> list=vehicle1.getVehicleList();
		list.add("vehicle6");
		System.out.println("updated list::"+list);
	}
}
