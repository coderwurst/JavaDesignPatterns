package com.coderwurst.builder_patterns_test;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.coderwurst.builder_patterns.VanBuilder;
import com.coderwurst.design_patterns.AbstractVan;
import com.coderwurst.design_patterns.Pickup;
import com.coderwurst.design_patterns.StandardEngine;
import com.coderwurst.design_patterns.Vehicle;

public class VanBuilderTest {
	
	private VanBuilder instance;
	private AbstractVan van;
	private int engineSize = 1200;
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	
	@Before
	public void setup() {
		
		System.setOut(new PrintStream(outContent));
	    System.setErr(new PrintStream(errContent));
		
		van = new Pickup(new StandardEngine(engineSize));
		instance = new VanBuilder(van);
	}
	
	@Test
	public void testBuildBody() {
		
		instance.buildBody();
		
		assertEquals("building van body\n", outContent.toString());
	}

	@Test
	public void testBuildChassis() {
		instance.buildChassis();
		
		assertEquals("building van chassis\n", outContent.toString());
	}

	@Test
	public void testBuildWindows() {
		instance.buildWindows();
		
		assertEquals("building van windows\n", outContent.toString());
	}

	@Test
	public void testBuildReinforcedStorageArea() {
		instance.buildReinforcedStorageArea();
		
		assertEquals("building van storage area\n", outContent.toString());
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
