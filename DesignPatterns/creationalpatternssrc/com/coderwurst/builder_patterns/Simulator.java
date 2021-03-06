package com.coderwurst.builder_patterns;

import com.coderwurst.design_patterns.*;
import com.coderwurst.design_patterns.Vehicle.Colour;

public class Simulator {

	public static void main(String[] args) {
		System.out.println("<----- CAR 1 ----->");
		AbstractCar car = new Saloon(new StandardEngine(1300));
		VehicleBuilder builder = new CarBuilder(car);
		VehicleDirector director = new CarDirector();
		Vehicle vehicle = director.build(builder);
		System.out.println(vehicle);
		System.out.println("<----- ----- ----->");
		
		System.out.println("<----- CAR 2 ----->");
		AbstractCar car2 = new Sport(new TurboEngine(2500), Colour.RED);
		VehicleBuilder builder2 = new CarBuilder(car2);
		VehicleDirector director2 = new CarDirector();
		Vehicle vehicle2 = director2.build(builder2);
		System.out.println(vehicle2);
		System.out.println("<----- ----- ----->");

		
		System.out.println("<----- VAN 1 ----->");
		AbstractVan van = new Pickup(new StandardEngine(2000), Colour.WHITE);
		VehicleBuilder builder3 = new VanBuilder(van);
		VehicleDirector director3 = new CarDirector();
		Vehicle vehicle3 = director3.build(builder3);
		System.out.println(vehicle3);
		System.out.println("<----- ----- ----->");

	}

}
