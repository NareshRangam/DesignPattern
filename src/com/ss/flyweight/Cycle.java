package com.ss.flyweight;

public class Cycle implements Vehicle {

	private final String MAXSPEED;
	private String color;
	
	public Cycle() {
		super();
		MAXSPEED = "15 km/hr";
	}

	@Override
	public void assignColor(String color) {
		this.color=color;
	}

	@Override
	public void startEnginee() {
		System.out.println(color+ "colored Cycle with max speed:"+MAXSPEED);
	}

}
