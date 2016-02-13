/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */


package com.coderwurst.engineMgt.db;

import java.io.IOException;

/*
 * AbstractEntityPersistanceStrategy
 * STRATEGY pattern used to determine is a file should be saved using serialization or
 * exporting to an external csv file
 */
public abstract class AbstractEntityPersistenceStrategy {

	String getFileName (EntityTable table) {
		return table.getClass().getSimpleName();
	}
	
	abstract String getFileSuffix();
	abstract void save (EntityTable table) throws IOException;
	abstract EntityTable restore (EntityTable table) throws IOException;
	
}
