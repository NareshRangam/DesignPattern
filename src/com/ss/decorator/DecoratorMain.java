package com.ss.decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike bike=new BasicBike();
		bike.assembleBike();
		System.out.println("-----------------");
		Bike sportsBike=new SportsBike(new BasicBike());
		sportsBike.assembleBike();
		System.out.println("-----------------");
		Bike luxuryBike=new LuxuryBike(new BasicBike());
		luxuryBike.assembleBike();
		System.out.println("-----------------");
		Bike sportsLuxuryBike=new SportsBike(new LuxuryBike(new BasicBike()));
		sportsLuxuryBike.assembleBike();
	}

}
