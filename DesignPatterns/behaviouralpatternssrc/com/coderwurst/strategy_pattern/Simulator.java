package com.coderwurst.strategy_pattern;

import com.coderwurst.design_patterns.StandardEngine;

public class Simulator {
	
	public static void main (String [] args) {
		AbstractCar myCar = new Sport (new StandardEngine (2000));
		myCar.setSpeed(20);
		myCar.setSpeed(40);
		
		System.out.println("... switching to sport mode...");
		myCar.setGearBoxStrategy(new SportGearboxStrategy());
		myCar.setSpeed(20);
		myCar.setSpeed(40);
		
		System.out.println("... going off road...");
		myCar.setGearBoxStrategy(new OffRoadGearboxStrategy());
		myCar.setSpeed(20);
		myCar.setSpeed(40);
		
	}

}
