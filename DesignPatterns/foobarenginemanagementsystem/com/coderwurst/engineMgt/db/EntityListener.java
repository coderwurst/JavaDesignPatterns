/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */

package com.coderwurst.engineMgt.db;

import java.util.EventListener;

public interface EntityListener extends EventListener {
	
	public void entityAdded(EntityEvent event);
	public void entityRestored (EntityEvent event);

}
