/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */

package com.coderwurst.engineMgt.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.coderwurst.engineMgt.business.BusinessFacade;
import com.coderwurst.engineMgt.db.EntityEvent;
import com.coderwurst.engineMgt.db.EntityListener;

// OBSERVER PATTERN - utilises the EntityListener interface
public class ManageEnginesPanel extends JPanel implements EntityListener {

	private Frame owner;
	private EnginesListModel enginesModel;

	ManageEnginesPanel(final Frame owner) {
		super(new BorderLayout());
		this.owner = owner;

		// scrollable list of engines
		enginesModel = new EnginesListModel();
		add(new JScrollPane(new JList(enginesModel)), 
				BorderLayout.CENTER);

		// buttons for add, save and restore functionality
		JPanel buttonPanel = new JPanel(new FlowLayout());

		// build button
		JButton buildEngineButton = new JButton("Build Engine");
		buildEngineButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				new BuildEngineDialog(owner).setVisible(true);
			}
		});
		buttonPanel.add(buildEngineButton);

		// save button
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					BusinessFacade.INSTANCE.saveEngines();
				} catch (IOException ex) {
					JOptionPane.showMessageDialog(ManageEnginesPanel.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		buttonPanel.add(saveButton);
		
		// restore button
		JButton restoreButton = new JButton("Restore");
		restoreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					BusinessFacade.INSTANCE.restoreEngines();
				} catch (IOException ex) {
					JOptionPane.showMessageDialog(ManageEnginesPanel.this, ex, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		buttonPanel.add(restoreButton);
		
		// add buttons to UI
		add(buttonPanel, BorderLayout.SOUTH);
	}

	@Override
	public void entityAdded(EntityEvent event) {
		enginesModel.engineAdded(event.getValue());
	}

	@Override
	public void entityRestored(EntityEvent event) {
		enginesModel.loadEngines();
	}
	
	// inner class : ListModel for engines
	private class EnginesListModel extends DefaultListModel {
		
		private java.util.List<Object> engines;
		
		EnginesListModel() {
			engines = new ArrayList<Object>();
			loadEngines();
		}
		
		void loadEngines() {
			engines.clear();
			engines.addAll(
					Arrays.asList(BusinessFacade.INSTANCE.getAllEngines())
					);
			fireContentsChanged(this, 0, engines.size() -1);
		}
		
		public Object getElementAt(int index) {
			return engines.get(index);
		}
		
		public int getSize() {
			return engines.size();
		}
		
		void engineAdded(Object engine) {
			engines.add(engine);
			fireContentsChanged(this, 0, engines.size() -1);
		}
		
	}

}
