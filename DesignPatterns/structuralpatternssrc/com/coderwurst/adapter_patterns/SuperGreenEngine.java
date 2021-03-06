package com.coderwurst.adapter_patterns;

public class SuperGreenEngine {
	
	private int engineSize;
	
	public SuperGreenEngine (int engineSize) {
		this.engineSize = engineSize;
	}
	
	public int getEngineSize() {
		return engineSize;
	}
	
	@Override
	public String toString() {
		return "SUPER ENGINE " + this.engineSize;
	}

}
