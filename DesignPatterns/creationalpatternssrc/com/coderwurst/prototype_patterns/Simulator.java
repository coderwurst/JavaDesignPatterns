package com.coderwurst.prototype_patterns;

public class Simulator {

	public static void main(String[] args) {
		
		VehicleManager manager = new VehicleManager();
		
		Vehicle saloon1 = manager.createSaloon();
		Vehicle saloon2 = manager.createSaloon();
		
		Vehicle pickup1 = manager.createPickup();
		
		Vehicle sport1 = manager.createSport();
		
		VehicleManagerLazy lazyManager = new VehicleManagerLazy();
		
		Vehicle saloon3 = lazyManager.createSaloon();
		Vehicle saloon4 = lazyManager.createSaloon();
		
		Vehicle pickup2 = lazyManager.createPickup();
		Vehicle pickup3 = lazyManager.createPickup();
		Vehicle pickup4 = lazyManager.createPickup();
		
		Vehicle sport2 = lazyManager.createSport();
		Vehicle sport3 = lazyManager.createSport();
		
	}

}
