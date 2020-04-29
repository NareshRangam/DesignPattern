package com.ss.flyweight;

public class Truck implements Vehicle{

	private final String MAXSPEED;
	private String color;
	
	public Truck() {
		super();
		MAXSPEED = "120 km/hr";
	}

	@Override
	public void assignColor(String color) {
		this.color=color;
	}

	@Override
	public void startEnginee() {
		System.out.println(color+ "colored truck with max speed:"+MAXSPEED);
	}

}
