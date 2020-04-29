package com.ss.decorator;

public class SportsBike extends DecoratorBike {

	public SportsBike(Bike bike) {
		super(bike);
	}
@Override
public void assembleBike() {
	super.assembleBike();
	System.out.println("adding features for sports bike");
}
}
