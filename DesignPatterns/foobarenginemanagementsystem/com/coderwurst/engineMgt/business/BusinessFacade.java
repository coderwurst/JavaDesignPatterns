/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */

package com.coderwurst.engineMgt.business;

import java.io.IOException;

import com.coderwurst.engineMgt.db.DatabaseFacade;
import com.coderwurst.engineMgt.db.EntityListener;

/*
 * Similar to DB package, the business tier will also have a SINGLETON to accommodate
 * communication to the other classes in the tier
 */
public enum BusinessFacade {

	// the compiler does the MySingleton INSTANCE = new BusinessFacade() call the first 
	// (and only first) time this is called
	INSTANCE;

	// these objects return an object to maintain loose coupling with UI tier
	public Object[] getEngineTypes() {
		return EngineFactory.Type.values();
	}

	// ui tier can make use of toString method to extract information returned in these objects
	public Object[] getAllEngines() {
		return DatabaseFacade.INSTANCE.getAllEngines();
	}

	public Engine addEngine(int size, Object type) {
		// System.out.println("Adding Engine");
		Engine engine = EngineFactory.create(size, type == EngineFactory.Type.TURBO);
		DatabaseFacade.INSTANCE.addEngine(engine);
		return engine;
	}

	// these methods are delegated to appropriate database facade methods
	public void addEngineListener(EntityListener listener) {
		DatabaseFacade.INSTANCE.addEngineListener(listener);
	}

	public void removeEngineListener(EntityListener listener) {
		DatabaseFacade.INSTANCE.removeEngineListener(listener);
	}

	public void saveEngines() throws IOException {
		DatabaseFacade.INSTANCE.saveEngines();
	}

	public void restoreEngines() throws IOException {
		DatabaseFacade.INSTANCE.restoreEngines();
	}

}
