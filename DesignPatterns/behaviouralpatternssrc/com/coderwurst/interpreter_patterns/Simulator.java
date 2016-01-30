package com.coderwurst.interpreter_patterns;

import java.util.Scanner;

public class Simulator {

	private static Scanner keyboard = new Scanner (System.in);
	
	public static void main(String[] args) {
		DirectionalEvaluator satNav = new DirectionalEvaluator();

		String userInput = "";
		System.out.println("<--- Welcome --->");

		while (!userInput.toLowerCase().equals("exit")) {
			System.out.println("Please enter your chosen cities and your regional "
					+ "position, or type exit to leave...");
			userInput = keyboard.nextLine();
			if (userInput.toLowerCase().equals("exit")) {
				System.out.println("<--- Thanks for visiting --->");
				System.exit(-99);
			} else {
				System.out.println("<--- Processing --->");
				System.out.println(satNav.evaluate(userInput));
			}
		}
		
		
	}

}
