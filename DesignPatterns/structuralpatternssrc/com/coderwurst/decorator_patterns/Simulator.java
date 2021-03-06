package com.coderwurst.decorator_patterns;

import com.coderwurst.design_patterns.StandardEngine;
import com.coderwurst.decorator_patterns.Vehicle.Colour;

public class Simulator {

	public static void main (String [] args) {

		Vehicle saloon = new Saloon(new StandardEngine(1200));
		saloon.paint(Colour.BLUE);
		saloon = new AirConditionedVehicle(saloon);
		System.out.println(saloon.toString());
		saloon = new AlloyWheeledVehicle(saloon);
		System.out.println(saloon.toString());
		saloon = new LeatherSeatedVehicle(saloon);
		System.out.println(saloon.toString());
		saloon = new MetallicPaintedVehicle(saloon);
		System.out.println(saloon.toString());
		saloon = new SatNavVehicle(saloon);
		System.out.println(saloon.toString());
	}

}
