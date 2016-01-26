package com.coderwurst.command_patterns;

public class SpeechRecogniser {
	
	private Command upCommand, downCommand, lastCommand;
	
	
	public void setCommands(Command upCommand, Command downCommand) {
		this.upCommand = upCommand;
		this.downCommand = downCommand;
	}
	
	public void hearUpSpoken() {
		lastCommand = upCommand;
		upCommand.execute();
	}
	
	public void hearDownSpoken() {
		lastCommand = downCommand;
		downCommand.execute();
	}
	
	public void undo() {
		if (lastCommand.equals(upCommand)){
			System.out.println("*** undo on upCommand ***");
			downCommand.execute();
		} else if (lastCommand.equals(downCommand)) {
			System.out.println("*** undo on downCommand ***");
			upCommand.execute();
		}
	}

}