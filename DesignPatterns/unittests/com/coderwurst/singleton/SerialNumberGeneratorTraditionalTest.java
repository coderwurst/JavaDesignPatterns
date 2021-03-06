package com.coderwurst.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.coderwurst.singleton_patterns.SerialNumberGeneratorTraditional;

public class SerialNumberGeneratorTraditionalTest {
	
	private SerialNumberGeneratorTraditional instance;
	

	@Before
	public void setp() {
		instance = SerialNumberGeneratorTraditional.getInstance();	
	}
	
	@Test
	public void testSerialNumGeneration() {
		int result = instance.getNextSerial();
		int serial = 1000000001;
		assertEquals(serial, result);
		
		instance.getNextSerial();
		instance.getNextSerial();
		instance.getNextSerial();
		instance.getNextSerial();

		result = instance.getNextSerial();
		serial = 1000000006;
		assertEquals(serial, result);
	}
	
}
