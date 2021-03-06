package com.coderwurst.adapter_patterns_test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.coderwurst.adapter_patterns.SuperGreenEngine;
import com.coderwurst.adapter_patterns.SuperGreenEngineAdapter;
import com.coderwurst.design_patterns.Engine;
import com.coderwurst.design_patterns.StandardEngine;
import com.coderwurst.design_patterns.TurboEngine;

public class SuperGreenEngineTest {

	private List <Engine> sampleList = new ArrayList <Engine>();
	private SuperGreenEngine greenEngine;
	private SuperGreenEngineAdapter adapter;
	
	@Before
	public void setup() {
		sampleList.add(new StandardEngine(1200));
		sampleList.add(new StandardEngine(1600));
		sampleList.add(new StandardEngine(1800));
		sampleList.add(new TurboEngine(2000));
		sampleList.add(new TurboEngine(2200));
	}
	
	@Test
	public void testGetEngines() {
		greenEngine = new SuperGreenEngine(1500);
		
		sampleList.add(adapter = new SuperGreenEngineAdapter(greenEngine));
		
		greenEngine = new SuperGreenEngine(1800);

		sampleList.add(adapter = new SuperGreenEngineAdapter(greenEngine));

		assertEquals(sampleList.size(), 7);
		
		int test = sampleList.get(0).getSize();
		assertEquals(test, 1200);
		
		test = sampleList.get(sampleList.size() -2).getSize();
		assertEquals(test, 1500);
		
		test = sampleList.get(sampleList.size() -1).getSize();
		assertEquals(test, 1800);
	}
	
	
}
