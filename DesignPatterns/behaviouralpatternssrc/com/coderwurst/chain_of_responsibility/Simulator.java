package com.coderwurst.chain_of_responsibility;


public class Simulator {

	public static void main(String[] args) {

		// no need to instantiate as .handle call is static

		String email1 = "I would like to buy a new Honda";
		String email2 = "I would like to make a complaint about the state of my car which "
				+ "I received back from your shop on the on the 12th December";
		String email3 = "Want cheap pills? Viagra also available!";
		String email4 = "What are you opening times at the weekends?";
		String email5 = "Can I book a service for next Wednesday?";

		System.out.println("Received 5 emails...");
		AbstractEmailHandler.handle(email1);

		AbstractEmailHandler.handle(email2);

		AbstractEmailHandler.handle(email3);

		AbstractEmailHandler.handle(email4);

		AbstractEmailHandler.handle(email5);
	}

}
