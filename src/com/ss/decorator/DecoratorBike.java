package com.ss.decorator;

public class DecoratorBike implements Bike {

	private Bike bike;
	
	public DecoratorBike(Bike bike) {
		super();
		this.bike = bike;
	}

	@Override
	public void assembleBike() {
		// TODO Auto-generated method stub
		bike.assembleBike();
	}

}
