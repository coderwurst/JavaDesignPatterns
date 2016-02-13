/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */

package com.coderwurst.engineMgt.ui;

import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.coderwurst.engineMgt.business.BusinessFacade;

public class EnginesFrame extends JFrame {
	
	private ManageEnginesPanel enginesPanel;
	
	public EnginesFrame() {
		super("Manage Engines");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		add(buildUI(), BorderLayout.CENTER);
		pack();
		setLocationRelativeTo(null);
	}
	
	private Component buildUI() {
		JPanel uiPanel = new JPanel (new BorderLayout());
		enginesPanel = new ManageEnginesPanel(this);
		BusinessFacade.INSTANCE.addEngineListener(enginesPanel);
		uiPanel.add(enginesPanel, BorderLayout.CENTER);
		return uiPanel;
	}

}

