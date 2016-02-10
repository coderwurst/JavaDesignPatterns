package com.coderwurst.mvc_pattern;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SatNavController {
	
	// references to view and model
	private SatNavModel model;
	private SatNavView view;
	
	public SatNavController (SatNavModel model, SatNavView view) {
		this.model = model;
		this.view = view;
		
		view.addNorthButtonListener(new NorthButtonListener());
		view.addSouthButtonListener(new SouthButtonListener());
		view.addEastButtonListener(new EastButtonListener());
		view.addWestButtonListener(new WestButtonListener());
		view.addSliderListener(new SliderListener());
		
	}
	
	// inner classes to represent view listeners
	private class NorthButtonListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			view.disableNorthButton();
			view.enableSouthButton();
			view.enableEastButton();
			view.enableWestButton();
			model.setDirection(SatNavModel.Direction.NORTH);
		}
	}
	
	private class SouthButtonListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			view.enableNorthButton();
			view.disableSouthButton();
			view.enableEastButton();
			view.enableWestButton();
			model.setDirection(SatNavModel.Direction.SOUTH);
		}
	}
	
	private class EastButtonListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			view.enableNorthButton();
			view.enableSouthButton();
			view.disableEastButton();
			view.enableWestButton();
			model.setDirection(SatNavModel.Direction.EAST);
		}
	}
	
	private class WestButtonListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			view.enableNorthButton();
			view.enableSouthButton();
			view.enableEastButton();
			view.disableWestButton();
			model.setDirection(SatNavModel.Direction.WEST);
		}
	}
	
	private class SliderListener implements ChangeListener {
		public void stateChanged (ChangeEvent event) {
			JSlider slider = (JSlider) event.getSource();
			model.setSpeed(slider.getValue());
		}
	}

}
