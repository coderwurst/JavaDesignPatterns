package com.coderwurst.builder_patterns_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coderwurst.builder_patterns.VanBuilder;
import com.coderwurst.builder_patterns.VanDirector;
import com.coderwurst.design_patterns.AbstractVan;
import com.coderwurst.design_patterns.BoxVan;
import com.coderwurst.design_patterns.Pickup;
import com.coderwurst.design_patterns.TurboEngine;
import com.coderwurst.design_patterns.Vehicle;

public class VanDirectorTest {
	
	private VanDirector instance = new VanDirector();
	private AbstractVan testVan;
	private VanBuilder testVanBuilder;
	
	@Test
	public void testBuildPickupVan(){
		testVan = new Pickup(new TurboEngine(2000));
		testVanBuilder = new VanBuilder(testVan);
		instance.build(testVanBuilder);
		
		Vehicle getVehicle = testVanBuilder.getVehicle();
		
		
		assertEquals(getVehicle, testVan);
	}
	
	@Test
	public void testBuildBoxVan(){
		testVan = new BoxVan(new TurboEngine(2000));
		testVanBuilder = new VanBuilder(testVan);
		instance.build(testVanBuilder);
		
		Vehicle getVehicle = testVanBuilder.getVehicle();
		
		
		assertEquals(getVehicle, testVan);
	}

}
