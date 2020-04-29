package com.ss.decorator;

public class LuxuryBike extends DecoratorBike {

	public LuxuryBike(Bike bike) {
		super(bike);
		// TODO Auto-generated constructor stub
	}
@Override
public void assembleBike() {
	super.assembleBike();
	System.out.println("Adding features for Luxury Bike");
}
}
