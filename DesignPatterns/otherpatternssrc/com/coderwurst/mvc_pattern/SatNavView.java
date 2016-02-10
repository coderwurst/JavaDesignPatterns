package com.coderwurst.mvc_pattern;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeListener;

public class SatNavView implements PropertyChangeListener {

	
	private SatNavModel model;
	private JFrame viewingFrame;
	
	private JButton northButton, southButton, eastButton, westButton;
	private JSlider speedSlider;
	
	private String directionString, speedString;
	private JLabel feedbackLabel;
	
	public SatNavView(SatNavModel model) {
		this.model = model;
		model.addPropertyChangeListener(this);
		
		// graphical elements
		viewingFrame = new JFrame("Sat Nav System");
		viewingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		northButton = new JButton("North");
		disableNorthButton();		// default
		
		southButton = new JButton("South");
		eastButton = new JButton("East");
		westButton = new JButton("West");
		
		speedSlider = new JSlider(JSlider.VERTICAL, 0,30,0);
		speedSlider.setMajorTickSpacing(10);
		speedSlider.setMinorTickSpacing(1);
		speedSlider.setPaintTicks(true);
		speedSlider.setPaintLabels(true);
		
		directionString = "You are pointing " + model.getDirection();

		speedString = " but not yet moving. Use Buttons & slider";
		feedbackLabel = new JLabel(directionString + "," + speedString);
		
		// button layout
		JPanel directionPanel = new JPanel (new GridLayout(3, 3));
		directionPanel.setBorder(new TitledBorder("Direction"));
		directionPanel.add(new JLabel(""));
		directionPanel.add(northButton);
		directionPanel.add(new JLabel(""));
		directionPanel.add(southButton);
		directionPanel.add(new JLabel(""));
		directionPanel.add(eastButton);
		directionPanel.add(new JLabel(""));
		directionPanel.add(westButton);
		directionPanel.add(new JLabel(""));

		// slider layout
		JPanel speedPanel = new JPanel();
		speedPanel.setBorder(new TitledBorder("Speed"));
		speedPanel.add(speedSlider);
			
		// feedback layout
		JPanel feedbackPanel = new JPanel();
		feedbackPanel.setBorder(new TitledBorder("Feedback"));
		feedbackPanel.add(speedSlider);
		
		// position panels into frame
		JPanel framePanel = new JPanel(new BorderLayout());
		framePanel.add(directionPanel, BorderLayout.CENTER);
		framePanel.add(speedPanel, BorderLayout.EAST);
		framePanel.add(feedbackPanel, BorderLayout.SOUTH);
		
		viewingFrame.add(framePanel);

	}

	public void show() {
		viewingFrame.pack();
		viewingFrame.setLocationRelativeTo(null);
		viewingFrame.setVisible(true);
	}
	
	public void addNorthButtonListener(ActionListener al) {
		northButton.addActionListener(al);
	}
	
	public void addSouthButtonListener(ActionListener al) {
		southButton.addActionListener(al);
	}
	
	public void addEastButtonListener(ActionListener al) {
		eastButton.addActionListener(al);
	}
	
	public void addWestButtonListener(ActionListener al) {
		westButton.addActionListener(al);
	}
	
	public void addSliderListener(ChangeListener cl) {
		speedSlider.addChangeListener(cl);
	}
	
	public void enableNorthButton() {
		northButton.setEnabled(true);
	}
	
	public void disableNorthButton() {
		northButton.setEnabled(false);
	}
	
	public void enableSouthButton() {
		southButton.setEnabled(true);
	}
	
	public void disableSouthButton() {
		southButton.setEnabled(false);
	}
	
	public void enableEastButton() {
		eastButton.setEnabled(true);
	}
	
	public void disableEastButton() {
		eastButton.setEnabled(false);
	}
	
	public void enableWestButton() {
		westButton.setEnabled(true);
	}
	
	public void disableWestButton() {
		westButton.setEnabled(false);
	}
	
	// called by controller when state changes
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (model.getSpeed() == 0) {
			directionString = "You are pointing " + model.getDirection();
			speedString = " but are currently not moving.";
		} else if (evt.getPropertyName().equals(SatNavModel.DIRECTION_CHANGE)) {
			SatNavModel.Direction newDirection = (SatNavModel.Direction) evt.getNewValue();
			directionString = "You are now pointing " + newDirection;
			speedString = " travelling at " + model.getSpeed();
		} else if (evt.getPropertyName().equals(SatNavModel.SPEED_CHANGE)) {
			int oldSpeed = (Integer) evt.getOldValue();
			int newSpeed = (Integer) evt.getNewValue();
			if (oldSpeed < newSpeed) {
				speedString = "and you have sped up to " + model.getSpeed();
			} else {
				speedString = "and you have slown down to " + model.getSpeed();
			}
		}
		
		feedbackLabel.setText(directionString + "' " + speedString);

	}

}
