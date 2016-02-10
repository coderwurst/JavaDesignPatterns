package com.coderwurst.mvc_pattern;

public class MyFirstSatNav {

	public static void main(String[] args) {
		SatNavModel model = new SatNavModel();
		SatNavView view = new SatNavView(model);
		SatNavController controller = new SatNavController(model, view);
		
		view.show();

	}

}
