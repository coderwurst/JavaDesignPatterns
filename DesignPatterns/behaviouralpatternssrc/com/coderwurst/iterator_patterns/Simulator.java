package com.coderwurst.iterator_patterns;

import java.util.Iterator;

import com.coderwurst.design_patterns.Vehicle;

public class Simulator {
	
	public static void main (String [] args) {
		System.out.println("=== Our Cars ===");
		// method 1 with while loop
		CarRange carRange = new CarRange();
		printIterator(carRange.iterator());
		System.out.println("=== Our Vans ===");
		// method 2 with for loop
		VanRange vanRange = new VanRange();
		enhancedForLoop(vanRange);
	}

	private static void enhancedForLoop(VanRange vanRange) {
		for (Vehicle currentVehicle : vanRange.getRange()){
			System.out.println(currentVehicle);
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void printIterator(Iterator iter) {
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
