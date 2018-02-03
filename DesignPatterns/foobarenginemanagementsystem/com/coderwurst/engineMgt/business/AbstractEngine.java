package com.coderwurst.engineMgt.business;

public abstract class AbstractEngine implements Engine {

	public int size;
	private boolean turbo;
	
	public AbstractEngine(int size, boolean turbo) {
		this.size = size;
		this.turbo = turbo;
	}

	public int getSize() {
		return size;
	}
	
	public boolean isTurbo() {
		return turbo;
	}
	
	public String toString() {
		return getClass().getSimpleName() + " (" + size + ")";
	}
	
}
