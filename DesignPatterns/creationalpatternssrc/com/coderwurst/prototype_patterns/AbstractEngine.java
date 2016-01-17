package com.coderwurst.prototype_patterns;

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
	
	
	/*
	 * creates following output StandardEngine (0000)
	 * 							TurboEngine (1111)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return getClass().getSimpleName() + " (" + size + ")";
	}
	
}