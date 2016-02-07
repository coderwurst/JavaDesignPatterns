package com.coderwurst.state_patterns;

public class Simulator {
	
	public static void main (String [] args) {
		ClockSetup clockSetup = new ClockSetup();
		
		// increase years by 2
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.pushKnob();
		
		// increase months by 6
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.pushKnob();
		
		// decrease days by 3
		clockSetup.rotateKnobLeft();
		clockSetup.rotateKnobLeft();
		clockSetup.rotateKnobLeft();
		clockSetup.pushKnob();
		
		// increase hours by 10
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.rotateKnobRight();
		clockSetup.pushKnob();
		
		// decrease minutes by 5
		clockSetup.rotateKnobLeft();
		clockSetup.rotateKnobLeft();
		clockSetup.rotateKnobLeft();
		clockSetup.rotateKnobLeft();
		clockSetup.rotateKnobLeft();
		clockSetup.pushKnob();
		
		// push to finish
		clockSetup.pushKnob();
	}

}
