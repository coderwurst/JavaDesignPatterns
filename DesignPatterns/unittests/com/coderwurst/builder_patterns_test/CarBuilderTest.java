package com.coderwurst.builder_patterns_test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.coderwurst.builder_patterns.CarBuilder;
import com.coderwurst.design_patterns.AbstractCar;
import com.coderwurst.design_patterns.Saloon;
import com.coderwurst.design_patterns.StandardEngine;
import com.coderwurst.design_patterns.Vehicle;

public class CarBuilderTest {

	private CarBuilder instance;
	private AbstractCar car;
	private int engineSize = 1200;
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	@Before
	public void setup() {
		
		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
		
		car = new Saloon(new StandardEngine(engineSize));
		instance = new CarBuilder(car);
	}
	
	@Test
	public void testBuildBody() {
		
		instance.buildBody();
		
		assertEquals("building car body\n", outContent.toString());
	}

	@Test
	public void testBuildBoot() {
		instance.buildBoot();
		
		assertEquals("building car boot\n", outContent.toString());
	}

	@Test
	public void testBuildChassis() {
		instance.buildChassis();
		
		assertEquals("building car chassis\n", outContent.toString());
	}

	@Test
	public void testBuildPassengerArea() {
		instance.buildPassengerArea();
		
		assertEquals("building car passenger area\n", outContent.toString());
	}

	@Test
	public void testBuildWindows() {
		instance.buildWindows();
		
		assertEquals("building car windows\n", outContent.toString());
	}

	@Test
	public void testGetVehicle() {
		
		Vehicle test = instance.getVehicle();
		
		assertEquals(engineSize, test.getEngine().getSize());
	}

	@After
	public void cleanUpStreams() {
	    System.setOut(null);
	    System.setErr(null);
	}

}
