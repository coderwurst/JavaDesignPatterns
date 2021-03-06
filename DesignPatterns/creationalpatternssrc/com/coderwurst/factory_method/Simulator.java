package com.coderwurst.factory_method;

import com.coderwurst.design_patterns.Vehicle;
import com.coderwurst.design_patterns.Vehicle.Colour;
import com.coderwurst.factory_method.VehicleFactory.DrivingStyle;

public class Simulator {
	
	public static void main (String [] args){
		VehicleFactory carFactory = new CarFactory();
		Vehicle car = carFactory.build(DrivingStyle.POWERFUL, Colour.BLACK);
		System.out.println("The first vehicle off the production line is a car: " + car);
		
		VehicleFactory vanFactory = new VanFactory();
		Vehicle van = vanFactory.build(DrivingStyle.MIDRANGE, Colour.WHITE);
		System.out.println("The second vehicle off the production line is a van: " + van);		
	}

}
