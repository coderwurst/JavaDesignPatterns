/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */

package com.coderwurst.engineMgt.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.coderwurst.engineMgt.business.BusinessFacade;

public class BuildEngineDialog extends JDialog {
	
	private JComboBox typeCombo, sizeCombo;
	
	@SuppressWarnings("unchecked")
	BuildEngineDialog (Frame owner) {
		super(owner, "Build Engine", true);
		setLayout(new BorderLayout());
		this.setLocationRelativeTo(owner);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		// form entry
		JPanel formPanel = new JPanel (new GridLayout (0,2));
		
		typeCombo = new JComboBox
				(BusinessFacade.INSTANCE.getEngineTypes());
		formPanel.add(new JLabel("Type"));
		formPanel.add(typeCombo);
		
		sizeCombo = new JComboBox();
		sizeCombo.addItem(1300);
		sizeCombo.addItem(1600);
		sizeCombo.addItem(2000);
		sizeCombo.addItem(2500);
		
		formPanel.add(new JLabel("Size"));
		formPanel.add(sizeCombo);
		
		add(formPanel, BorderLayout.CENTER);
		
		// buttons to submit or cancel
		JPanel buttonPanel = new JPanel(new FlowLayout());
		
		JButton okButton = new JButton("OK");
		
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				BusinessFacade.INSTANCE.addEngine((Integer)sizeCombo.getSelectedItem(), 
						typeCombo.getSelectedItem());
				setVisible(false);
			}
		});
		buttonPanel.add(okButton);
		
		JButton cancelButton = new JButton("CANCEL");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				setVisible(false);
			}
		});
		buttonPanel.add(cancelButton);
		
		add(buttonPanel, BorderLayout.SOUTH);
		pack();
	}

}

