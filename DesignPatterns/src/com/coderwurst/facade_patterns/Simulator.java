package com.coderwurst.facade_patterns;

public class Simulator {
	
	public static void main (String [] args){
		VehicleFacade vehicleFacade = new VehicleFacade();
		Coupe vehicle = new Coupe(new StandardEngine(1200));
		vehicleFacade.prepareForSale(vehicle);
	}

}
