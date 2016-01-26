package com.coderwurst.command_patterns;

public class Simulator {
	
	public static void main (String []  args) {
		
		// radio instance
		Radio radio = new Radio();
		radio.on();
		Command volumeUp = new VolumeUpCommand(radio);
		Command volumeDown = new VolumeDownCommand(radio);
		
		// window instance
		ElectricWindow window = new ElectricWindow();
		Command windowUp = new WindowUpCommand(window);
		Command windowDown = new WindowDownCommand(window);
		
		// speech recognition system
		SpeechRecogniser speechRecogniser = new SpeechRecogniser();
		
		// compatible with Radio
		System.out.println("Speech system in Radio mode...");
		speechRecogniser.setCommands(volumeUp, volumeDown);
		speechRecogniser.hearUpSpoken();
		speechRecogniser.hearDownSpoken();
		speechRecogniser.hearDownSpoken();
		speechRecogniser.undo();
		speechRecogniser.hearUpSpoken();
		speechRecogniser.undo();
		speechRecogniser.hearUpSpoken();
		speechRecogniser.hearUpSpoken();
		System.out.println("Speech system exiting Radio mode...");
		System.out.println("-----------------------------------");
		
		
		// compatible with Window - same commands
		System.out.println("Speech system in Window mode...");
		speechRecogniser.setCommands(windowUp, windowDown);
		speechRecogniser.hearUpSpoken();
		speechRecogniser.hearDownSpoken();
		speechRecogniser.undo();
		speechRecogniser.hearDownSpoken();
		speechRecogniser.hearUpSpoken();
		speechRecogniser.hearUpSpoken();
		speechRecogniser.hearUpSpoken();
		System.out.println("Speech system exiting Radio mode...");	
		System.out.println("-----------------------------------");
		
		// compatible with Radio
		System.out.println("Speech system switching back to Radio mode...");
		speechRecogniser.setCommands(volumeUp, volumeDown);
		speechRecogniser.hearUpSpoken();
		speechRecogniser.hearUpSpoken();
		speechRecogniser.hearUpSpoken();
		speechRecogniser.hearUpSpoken();
		System.out.println("Speech system exiting Radio mode...");
		System.out.println("-----------------------------------");

	}

}
