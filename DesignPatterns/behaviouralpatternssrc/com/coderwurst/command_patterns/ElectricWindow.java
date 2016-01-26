package com.coderwurst.command_patterns;

public class ElectricWindow {
	
	private boolean open;
	
	public ElectricWindow() {
		open = false;
		System.out.println("Window is closed");
	}
	
	public boolean isOpen() {
		return open;
	}
	
	public boolean isClosed() {
		return (!open);
	}
	
	public void openWindow() {
		if (isClosed()) {
			open = true;
			System.out.println("Window is now open");
		} else {
			System.out.println("Window is already open");
		}
	}
	
	public void closeWindow() {
		if(isOpen()){
			open = false;
			System.out.println("Window is now closed");
		} else {
			System.out.println("Window is already closed");
		}
	}
	

}
