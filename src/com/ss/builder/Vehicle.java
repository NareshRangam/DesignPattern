package com.ss.builder;

public class Vehicle {

	private String vehicleEngine; //required
	private int vehicleWheels;  //required
	private int vehicleAirbags;  //optional
	
	private Vehicle(VehicleBuilder builder)
	{
		this.vehicleEngine=builder.vehicleEngine;
		this.vehicleWheels=builder.vehicleWheels;
		this.vehicleAirbags=builder.vehicleAirbags;
	}

	public String getVehicleEngine() {
		return vehicleEngine;
	}

	public int getVehicleWheels() {
		return vehicleWheels;
	}

	public int getVehicleAirbags() {
		return vehicleAirbags;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleEngine=" + vehicleEngine + ", vehicleWheels=" + vehicleWheels + ", vehicleAirbags="
				+ vehicleAirbags + "]";
	}
	public static class VehicleBuilder {

		private String vehicleEngine;
		private int vehicleWheels;  
		private int vehicleAirbags;
		public VehicleBuilder(String vehicleEngine, int vehicleWheels) {
			super();
			this.vehicleEngine = vehicleEngine;
			this.vehicleWheels = vehicleWheels;
		}
		public VehicleBuilder setAir(int vehicleAirbags) {
			this.vehicleAirbags = vehicleAirbags;
			return this;
		}  
		public Vehicle build()
		{
			return new Vehicle(this);
		}
		
	}

	
}
