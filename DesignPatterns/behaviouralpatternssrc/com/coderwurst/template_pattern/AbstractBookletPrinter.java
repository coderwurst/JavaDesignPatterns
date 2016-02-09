package com.coderwurst.template_pattern;

public abstract class AbstractBookletPrinter {
	
	protected abstract int getPageCount();
	protected abstract void printFrontCover();
	protected abstract void printTableOfCotents();
	protected abstract void printPage(int pageNumber);
	protected abstract void printIndex();
	protected abstract void printBackCover();
	
	// template method
	public final void print() {
		printFrontCover();
		printTableOfCotents();
		for (int i = 0; i<= getPageCount(); i++) {
			printPage(i);
		}
		printIndex();
		printBackCover();
	}

}
