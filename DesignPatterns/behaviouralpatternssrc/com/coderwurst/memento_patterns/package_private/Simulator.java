package com.coderwurst.memento_patterns.package_private;

public class Simulator {

	public static void main (String [] args) {
		Speedometer speedo = new Speedometer();
		
		speedo.setCurrentSpeed(50);
		speedo.setCurrentSpeed(80);
		System.out.println("Current speed: " + speedo.getCurrentSpeed());
		System.out.println("Previous speed: " + speedo.previousSpeed);
		
		// save this info
		SpeedometerMemento memento = new SpeedometerMemento (speedo);
		
		speedo.setCurrentSpeed(100);
		System.out.println("Speed increased to 100");
		System.out.println("Current speed: " + speedo.getCurrentSpeed());
		System.out.println("Previous speed: " + speedo.previousSpeed);
		
		// use memento to restore previous state
		System.out.println("Restoring to previous state");
		memento.restoreState();
		System.out.println("Current speed: " + speedo.getCurrentSpeed());
		System.out.println("Previous speed: " + speedo.previousSpeed);
		
		
			
	}
	
}
