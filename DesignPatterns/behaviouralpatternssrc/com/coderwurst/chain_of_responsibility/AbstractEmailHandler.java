package com.coderwurst.chain_of_responsibility;

public abstract class AbstractEmailHandler implements EmailHandler {

	public EmailHandler nextHandler;
	
	public void setNextHandler(EmailHandler handler) {
		nextHandler = handler;
	}
	
	public void processHandler(String email) {
		boolean wordFound = false;
		
		System.out.println("Entered: " + this.getDepartment());
		
		if (matchingWords().length == 0) {
			wordFound = true;
		} else {
			for (String word : matchingWords()) {
				if (email.indexOf(word) >0) {
					wordFound = true;
					break;
				}
			}
		}
		
		if (wordFound) {
			handleHere(email);
		} else {
			nextHandler.processHandler(email);
		}
	}
	// to return any strong of objects that the handler is interested in
	protected abstract String[] matchingWords();
	// only called if the object can actually handle the email, contains whatever code necessary
	protected abstract void handleHere (String email);
	
	public static void handle(String email) {
		
		// Handler Objects
		EmailHandler spam = new SpamEmailHandler();
		EmailHandler sales = new SalesEmailHandler();
		EmailHandler service = new ServiceEmailHandler();
		EmailHandler manager = new ManagerEmailHandler();
		EmailHandler general = new GeneralEnquiriesEmailHandler();
		
		// create the chain
		spam.setNextHandler(sales);
		sales.setNextHandler(service);
		service.setNextHandler(manager);
		manager.setNextHandler(general);
		
		// start process
		spam.processHandler(email);
		
	}

}
