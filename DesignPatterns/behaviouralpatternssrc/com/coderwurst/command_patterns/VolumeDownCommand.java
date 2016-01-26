package com.coderwurst.command_patterns;

public class VolumeDownCommand implements Command {

	private Radio radio;
	
	public VolumeDownCommand(Radio radio) {
		this.radio = radio;
	}
	
	@Override
	public void execute() {
		radio.volumeDown();		
	}

	@Override
	public void undo() {
		radio.volumeUp();
		
	}

}
