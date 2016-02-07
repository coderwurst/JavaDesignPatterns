package com.coderwurst.observer_patterns;

public class Simulator {
	
	public static void main (String [] args) {
		
		
		System.out.println("USING JAVA LIBS");
		SpeedMonitor montior = new SpeedMonitor();
		AutomaticGearbox gearbox = new AutomaticGearbox();
		
		Speedometer speedo = new Speedometer();
		
		speedo.addObserver(montior);
		speedo.addObserver(gearbox);
		
		speedo.setCurrentSpeed(10);
		speedo.setCurrentSpeed(20);
		speedo.setCurrentSpeed(30);
		speedo.setCurrentSpeed(40);
		speedo.setCurrentSpeed(50);
		speedo.setCurrentSpeed(60);
		speedo.setCurrentSpeed(100);
		speedo.setCurrentSpeed(69);
		speedo.setCurrentSpeed(50);
		
		System.out.println("=========================");
		System.out.println("=========================");
		System.out.println("USING EVENTS AND LISTNERS");
		SpeedMonitorListener monitor2 = new SpeedMonitorListener ();
		SpeedometerWithEventsListeners speedo2 = new SpeedometerWithEventsListeners();

		speedo2.addSpeedometerListener(monitor2);
		
		speedo.setCurrentSpeed(50);
		speedo.setCurrentSpeed(60);
		speedo.setCurrentSpeed(100);
		speedo.setCurrentSpeed(69);
		speedo.setCurrentSpeed(50);
		
	}

}
