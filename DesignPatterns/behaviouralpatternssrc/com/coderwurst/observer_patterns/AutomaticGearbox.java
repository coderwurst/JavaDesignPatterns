package com.coderwurst.observer_patterns;

import java.util.Observable;
import java.util.Observer;

public class AutomaticGearbox implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		Speedometer speedo = (Speedometer) o;
		if (speedo.getCurrentSpeed() <= 10) {
			System.out.println("FIRST GEAR");
		} else if (speedo.getCurrentSpeed() <= 20) {
			System.out.println("SECOND GEAR");
		} else if (speedo.getCurrentSpeed() <= 30) {
			System.out.println("THIRD GEAR");
		} else if (speedo.getCurrentSpeed() <= 40) {
			System.out.println("FOURTH GEAR");
		} else if (speedo.getCurrentSpeed() <= 50) {
			System.out.println("FIFTH GEAR");
		} else {
			System.out.println("SIXTH GEAR");
		}
		
	}

}
