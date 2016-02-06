package com.coderwurst.iterator_patterns;

import java.util.Arrays;
import java.util.Iterator;

import com.coderwurst.design_patterns.BoxVan;
import com.coderwurst.design_patterns.Pickup;
import com.coderwurst.design_patterns.StandardEngine;
import com.coderwurst.design_patterns.TurboEngine;
import com.coderwurst.design_patterns.Vehicle;

public class VanRange implements Iterable{
	
	private Vehicle[] vans;
	
	public VanRange() {
		vans = new Vehicle[3];
		
		vans[0] = new BoxVan(new StandardEngine(1600));
		vans[1] = new BoxVan(new StandardEngine(2000));
		vans[2] = new Pickup(new TurboEngine(2200));
	}

	
	public Vehicle[] getRange() {
		return vans;
	}
	
	// additional iterator method
	public Iterator <Vehicle> iterator() {
		return Arrays.asList(vans).listIterator();
	}
	
}
