package com.coderwurst.bridge_patterns;

public class SportsControls extends AbstractDriverControls {

	public SportsControls(Engine engine) {
		super(engine);
	}
	
	public void accelerateHard() {
		accelerate();
		accelerate();
	}

}
