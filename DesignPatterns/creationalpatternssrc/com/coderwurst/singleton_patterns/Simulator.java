package com.coderwurst.singleton_patterns;

public class Simulator {
	
	public static void main (String [] args) {
		System.out.println("Traditional method");
		
		SerialNumberGeneratorTraditional generator = SerialNumberGeneratorTraditional.getInstance();
		
		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());
		
		System.out.println("Attempting new generator instantiation");
		
		SerialNumberGeneratorTraditional generator1 = SerialNumberGeneratorTraditional.getInstance();

		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());
		
		System.out.println("Using enum Singleton");
		
		System.out.println("next serial: " + SerialNumberGenerator.INSTANCE.getNextSerial());
		System.out.println("next serial: " + SerialNumberGenerator.INSTANCE.getNextSerial());
		System.out.println("next serial: " + SerialNumberGenerator.INSTANCE.getNextSerial());
		System.out.println("next serial: " + SerialNumberGenerator.INSTANCE.getNextSerial());
		
		System.out.println("next vehicle: " + SerialNumberGenerator.VEHICLE.getNextSerial());
		System.out.println("next engine: " + SerialNumberGenerator.ENGINE.getNextSerial());
		System.out.println("next engine: " + SerialNumberGenerator.ENGINE.getNextSerial());
		System.out.println("next vehicle: " + SerialNumberGenerator.VEHICLE.getNextSerial());
		System.out.println("next vehicle: " + SerialNumberGenerator.VEHICLE.getNextSerial());
		System.out.println("next vehicle: " + SerialNumberGenerator.VEHICLE.getNextSerial());
		System.out.println("next engine: " + SerialNumberGenerator.ENGINE.getNextSerial());
		System.out.println("next serial: " + SerialNumberGenerator.INSTANCE.getNextSerial());

		
	}
	
	

}
