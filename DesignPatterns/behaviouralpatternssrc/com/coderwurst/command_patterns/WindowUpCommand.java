package com.coderwurst.command_patterns;

public class WindowUpCommand implements Command{

	private ElectricWindow window;
	
	public WindowUpCommand(ElectricWindow electricWindow) {
		this.window = electricWindow;
	}
	
	@Override
	public void execute() {
		window.closeWindow();
		
	}

	@Override
	public void undo() {
		window.openWindow();		
	}

}
