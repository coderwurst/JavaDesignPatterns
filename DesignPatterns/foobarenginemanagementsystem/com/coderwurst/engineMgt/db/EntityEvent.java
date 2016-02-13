/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */

package com.coderwurst.engineMgt.db;

import java.util.EventObject;

public class EntityEvent extends EventObject {

	private Object value;
	
	// used when restoring data
	EntityEvent() {
		this(0, null);
	}
	
	EntityEvent(Integer key, Object value) {
		super(key);
		this.value = value;
	}
	
	public Integer getKey() {
		return (Integer) getSource();
	}
	
	public Object getValue() {
		return value;
	}	

}
