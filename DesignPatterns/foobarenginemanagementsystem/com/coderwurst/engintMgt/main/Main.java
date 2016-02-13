/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */

package com.coderwurst.engintMgt.main;

import javax.swing.SwingUtilities;

import com.coderwurst.engineMgt.business.BusinessFacade;
import com.coderwurst.engineMgt.business.EngineFactory;
import com.coderwurst.engineMgt.ui.EnginesFrame;

public class Main {

	public static void main(String[] args) {
		
		// adds the most basic of engines
		BusinessFacade.INSTANCE.addEngine(1300, EngineFactory.Type.STANDARD);
		
		BusinessFacade.INSTANCE.addEngine(1600, EngineFactory.Type.STANDARD);
		
		BusinessFacade.INSTANCE.addEngine(2000, EngineFactory.Type.STANDARD);
		
		BusinessFacade.INSTANCE.addEngine(2500, EngineFactory.Type.TURBO);

		// starts up the ui
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new EnginesFrame().setVisible(true);
			}
		});
	}

}

