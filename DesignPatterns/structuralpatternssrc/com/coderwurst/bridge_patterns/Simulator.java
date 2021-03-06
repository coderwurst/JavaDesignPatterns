package com.coderwurst.bridge_patterns;

public class Simulator {

	public static void main (String [] args) {
		Engine engine = new StandardEngine(1300);
		StandardControls controls1 = new StandardControls(engine);
		controls1.ignitionStart();
		controls1.accelerate();
		controls1.brake();
		controls1.ignitionOff();
		
		SportsControls controls2 = new SportsControls(engine);
		controls2.ignitionStart();
		controls2.accelerate();
		controls2.brake();
		controls2.accelerateHard();
		controls2.accelerateHard();
		controls2.brake();
		controls2.brake();
		controls2.brake();
		controls2.brake();
		controls2.ignitionOff();
	}

}
