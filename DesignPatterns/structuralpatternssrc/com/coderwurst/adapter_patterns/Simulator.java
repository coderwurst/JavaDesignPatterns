package com.coderwurst.adapter_patterns;

import java.util.ArrayList;
import java.util.List;

import com.coderwurst.design_patterns.Engine;
import com.coderwurst.design_patterns.StandardEngine;
import com.coderwurst.design_patterns.TurboEngine;

public class Simulator {
	
	public static void main (String [] args) {
		List<Engine> engines = new ArrayList<Engine>();
		engines.add(new StandardEngine(1200));
		engines.add(new StandardEngine(1600));
		engines.add(new TurboEngine(2000));
		engines.add(new TurboEngine(2200));

		// SuperGreenEngine adapted before being added to the list
		SuperGreenEngine superGreenEngine = new SuperGreenEngine(1500);
		engines.add(new SuperGreenEngineAdapter(superGreenEngine));

		for (Engine engine : engines) {
			System.out.println(engine);
		}
	}

}
