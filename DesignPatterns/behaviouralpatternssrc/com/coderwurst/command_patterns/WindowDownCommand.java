package com.coderwurst.command_patterns;

public class WindowDownCommand implements Command{

	private ElectricWindow window;
	
	public WindowDownCommand(ElectricWindow electricWindow) {
		this.window = electricWindow;
	}
	
	@Override
	public void execute() {
		window.openWindow();
	}

	@Override
	public void undo() {
		window.closeWindow();
	}

}
