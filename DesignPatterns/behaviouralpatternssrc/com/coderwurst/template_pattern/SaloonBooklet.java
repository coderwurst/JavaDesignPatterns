package com.coderwurst.template_pattern;

public class SaloonBooklet extends AbstractBookletPrinter {

	@Override
	protected int getPageCount() {
		return 100;
	}

	@Override
	protected void printFrontCover() {
		System.out.println("Printing Saloon - Front Cover");
	}

	@Override
	protected void printTableOfCotents() {
		System.out.println("Printing Saloon - Contents");
	}

	@Override
	protected void printPage(int pageNumber) {
		System.out.println("Printing page " + pageNumber + " for Saloon");
	}

	@Override
	protected void printIndex() {
		System.out.println("Printing Saloon - Index Pages");
	}

	@Override
	protected void printBackCover() {
		System.out.println("Printing Saloon - Back Cover");
	}

}
