package com.coderwurst.command_patterns;

public class VolumeUpCommand implements Command {

	private Radio radio;
	
	public VolumeUpCommand(Radio radio) {
		this.radio = radio;
	}
	
	@Override
	public void execute() {
		radio.volumeUp();		
	}

	@Override
	public void undo() {
		radio.volumeDown();		
	}

}
