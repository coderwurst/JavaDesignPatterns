package com.coderwurst.bridge_patterns;

public abstract class AbstractEngine implements Engine {

	public int size;
	private boolean turbo;
	private boolean running;
	private int power;
	
	public AbstractEngine(int size, boolean turbo) {
		this.size = size;
		this.turbo = turbo;
		running = false;
		power = 0;
	}

	public int getSize() {
		return size;
	}
	
	public boolean isTurbo() {
		return turbo;
	}
	
	public void start() {
		running = true;
		System.out.println("Engine Started");
	}
	
	public void stop() {
		running = false;
		System.out.println("Engine Stopped");
	}
	
	public void increasePower() {
		if(running && (power < 10)) {
			power++;
			System.out.println("Engine power increased to " + power);
		}
	}
	
	public void decreasePower() {
		if(running && (power > 0)) {
			power--;
			System.out.println("Engine power decreased to " + power);
		}
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
