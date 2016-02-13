/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */

package com.coderwurst.engineMgt.db;

public enum EntityKeyGenerator {
	
	// SINGLETON PATTERN
	ENGINE;
	
	private int nextKey;
	
	synchronized int getNextKey() {
		return ++nextKey;
	}
	
	// could also add extra enum VEHICLE here to create keys for vehicles
	
}
