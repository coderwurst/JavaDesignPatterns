/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */

package com.coderwurst.engineMgt.db;

import java.io.IOException;

public class EntityCSVStrategy extends AbstractEntityPersistenceStrategy {

	@Override
	String getFileSuffix() {
		return ".csv";
	}

	@Override
	void save(EntityTable table) throws IOException {
		// code emitted
		System.out.println("Saved to CSV file");
	}

	@Override
	EntityTable restore(EntityTable table) throws IOException {
		// code to restore table data from CSV file
		return table;
	}

}

