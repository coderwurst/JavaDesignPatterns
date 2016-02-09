package com.coderwurst.template_pattern;

public class Simulator {

	public static void main(String[] args) {

		System.out.println("Printing Booklet for a Saloon Vehicle");
		AbstractBookletPrinter saloonBooklet = new SaloonBooklet();
		saloonBooklet.print();
		
		System.out.println("Printing Service Booklet for a Saloon Vehicle");
		AbstractBookletPrinter saloonServiceBooklet = new ServiceHistoryBooklet();
		saloonServiceBooklet.print();
		
	}

}
