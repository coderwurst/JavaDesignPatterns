/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */

package com.coderwurst.engineMgt.db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EntityTable implements Serializable {

	private EntityKeyGenerator keyGenerator;
	private Map <Integer, Object> entities;
	private Collection <EntityListener> listeners;
	
	EntityTable (EntityKeyGenerator keyGenerator) {
		this.keyGenerator = keyGenerator;
		// the int in the hash map represents a primary key in a database, the use of Object promotes loose coupling (can store any type of obj)
		entities = new HashMap <Integer, Object> ();
		listeners = new ArrayList <EntityListener>();
	}
	
	// to return a specific object based on key
	Object getByKey(Integer key) {
		return entities.get(key);
	}
	
	// to return a list of all objects
	Collection <Object> getAll() {
		return entities.values();
	}
	
	// adds new entity to the list, after getting a new key from generator
	Integer addEntity (Object value) {
		Integer key = keyGenerator.getNextKey();
		entities.put(key,  value);
		fireEntityAdded(key, value);
		return key;
	}
	
	// replaces entities with restored table passed in
	void restore (EntityTable restoredTable) {
		entities.clear();
		entities.putAll(restoredTable.entities);
		fireEntityRestored();
	}
	
	// OBSERVER PATTERN
	// following methods will allow other classes to be notified whenever a new entity is added to the database
	void addEntityListener (EntityListener listener) {
		listeners.add(listener);
	}
	
	void removeEntityListener (EntityListener listener) {
		listeners.remove(listener);
	}
	
	// when data added
	void fireEntityAdded (Integer key, Object value) {
		EntityEvent event = new EntityEvent (key, value);
		for (EntityListener listener: listeners) {
			listener.entityAdded(event);
		}
	}
	
	// when data restored
	void fireEntityRestored() {
		EntityEvent event = new EntityEvent();
		for (EntityListener listener : listeners) {
			listener.entityRestored (event);
		}
	}

}
