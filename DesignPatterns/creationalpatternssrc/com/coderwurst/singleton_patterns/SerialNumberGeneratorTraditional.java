package com.coderwurst.singleton_patterns;

public class SerialNumberGeneratorTraditional {
	
	// static members
	public static SerialNumberGeneratorTraditional instance;
	
	// will only ever create 1 instance, sync to prevent threading issues
	public synchronized static SerialNumberGeneratorTraditional getInstance() {
		
		if (instance == null) {
			instance = new SerialNumberGeneratorTraditional();
		} else {
			System.out.println("Traditional Generator already created");
		}
		return instance;
	}

	// int to represent serial numbers
	private int count = 1000000000;
	
	// constructor set to 'private' to prevent classes calling 'new Serial...'
	private SerialNumberGeneratorTraditional () { }		
	
	// serialized to prevent threading issues
	public synchronized int getNextSerial() {
		return ++count;
	}
}
