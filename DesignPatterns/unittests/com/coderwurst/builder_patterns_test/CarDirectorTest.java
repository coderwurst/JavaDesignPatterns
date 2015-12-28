package com.coderwurst.builder_patterns_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coderwurst.builder_patterns.CarBuilder;
import com.coderwurst.builder_patterns.CarDirector;
import com.coderwurst.design_patterns.AbstractCar;
import com.coderwurst.design_patterns.Saloon;
import com.coderwurst.design_patterns.Sport;
import com.coderwurst.design_patterns.StandardEngine;
import com.coderwurst.design_patterns.TurboEngine;
import com.coderwurst.design_patterns.Vehicle;

public class CarDirectorTest {
	
	private CarDirector instance = new CarDirector();
	private AbstractCar testCar;
	private CarBuilder testCarBuilder;
	
	@Test
	public void testBuildSaloon(){
		testCar = new Saloon(new StandardEngine(1300));
		testCarBuilder = new CarBuilder(testCar);
		instance.build(testCarBuilder);
		
		Vehicle getVehicle = testCarBuilder.getVehicle();
		
		
		assertEquals(getVehicle, testCar);
	}	

	@Test
	public void testBuildSport(){
		testCar = new Sport(new TurboEngine(2000));
		testCarBuilder = new CarBuilder(testCar);
		instance.build(testCarBuilder);
		
		Vehicle getVehicle = testCarBuilder.getVehicle();
		
		
		assertEquals(getVehicle, testCar);
	}	
	
	@Test
	public void testBuildCoupe(){
		testCar = new Sport(new TurboEngine(1800));
		testCarBuilder = new CarBuilder(testCar);
		instance.build(testCarBuilder);
		
		Vehicle getVehicle = testCarBuilder.getVehicle();
		
		
		assertEquals(getVehicle, testCar);
	}
	
}
