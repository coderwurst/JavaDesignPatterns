package com.coderwurst.iterator_patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.coderwurst.design_patterns.Coupe;
import com.coderwurst.design_patterns.Saloon;
import com.coderwurst.design_patterns.Sport;
import com.coderwurst.design_patterns.StandardEngine;
import com.coderwurst.design_patterns.TurboEngine;
import com.coderwurst.design_patterns.Vehicle;

public class CarRange implements Iterable <Vehicle> {

	private List <Vehicle> cars;
	
	public CarRange() {
		cars = new ArrayList <Vehicle>();
		
		cars.add(new Saloon(new StandardEngine(1300)));
		cars.add(new Saloon(new StandardEngine(1300)));
		cars.add(new Coupe(new StandardEngine(2000)));
		cars.add((new Sport(new TurboEngine(2200))));
	}
	
	public List <Vehicle> getRange() {
		return cars;
	}
	
	// additional iterator method
	public Iterator <Vehicle> iterator() {
		return cars.listIterator();
	}
}
