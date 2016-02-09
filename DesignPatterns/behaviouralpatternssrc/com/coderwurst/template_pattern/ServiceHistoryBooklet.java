package com.coderwurst.template_pattern;

public class ServiceHistoryBooklet extends AbstractBookletPrinter {

	@Override
	protected int getPageCount() {
		return 12;
	}

	@Override
	protected void printFrontCover() {
		System.out.println("Printing Saloon - Front Cover for Service History Booklet");
	}

	@Override
	protected void printTableOfCotents() {
		System.out.println("Printing Saloon - Contents for Service History Booklet");
	}

	@Override
	protected void printPage(int pageNumber) {
		System.out.println("Printing page " + pageNumber + " for Saloon, Service History Booklet");
	}

	@Override
	protected void printIndex() {
		System.out.println("Printing Saloon - Index Pages for Service History Booklet");
	}

	@Override
	protected void printBackCover() {
		System.out.println("Printing Saloon - Back Cover for Service History Booklet");
	}

}
