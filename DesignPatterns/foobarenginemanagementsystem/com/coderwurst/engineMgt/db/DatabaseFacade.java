/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */

package com.coderwurst.engineMgt.db;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Database package in this code represents a database tier in real life...
 * To simplify access to database (through the business package), there will
 * be only 1 single point of access - via this class - to all database
 * functionality. This hides the internal structure and promotes loose-coupling
 * FACADE PATTERN, with SINGLETON PATTERN provides this single point of access.
 */

// SINGLETON - only ever 1 facade object
public enum DatabaseFacade {

	INSTANCE;
	private static final Logger log = Logger.getLogger( DatabaseFacade.class.getName() );
	
	private EntityTable engines;		// stores engines and methods to get all or one of them, add them
	// could also repeat for vehicle objects
	private AbstractEntityPersistenceStrategy persistenceStrategy;
	
	// this object is the only point of contact to/ from the business package (layer)
	DatabaseFacade() {
		engines = new EntityTable (EntityKeyGenerator.ENGINE);
		
		// would use config settings to set which strategy to use - persistence assumed, could use csv or alternatives here
		persistenceStrategy = new EntitySerializationStrategy();
	}
	
	/*
	 * these methods are the first ones that have public - all other classes have package private access, forcing 
	 * client packages to go via these methods to access the functionality
	 */
	public Object[] getAllEngines() {
		log.log( Level.FINE, "db - getAllEngines" );
		return engines.getAll().toArray();
	}
	
	public Object getEngine(Integer key) {
		log.log( Level.FINE, "db - getEngine" );
		return engines.getByKey(key);
	}
	
	public Object addEngine(Object engine) {
		log.log( Level.FINE, "db - addEngine" );
		return engines.addEntity(engine);
	}
	
	// these methods are delegated to appropriate objects
	public void addEngineListener(EntityListener listener) {
		log.log( Level.FINE, "db - addEngineListener" );
		engines.addEntityListener(listener);
	}
	
	public void removeEngineListener(EntityListener listener) {
		log.log( Level.FINE, "db - removeEngineListener" );
		engines.removeEntityListener(listener);
	}
	
	public void saveEngines() throws IOException {
		log.log( Level.FINE, "db - saveEngines" );
		persistenceStrategy.save(engines);
	}
	
	public void restoreEngines() throws IOException {
		log.log( Level.FINE, "db - restoreEngines" );
		EntityTable restoredEngines = persistenceStrategy.restore(engines);
		engines.restore(restoredEngines);
	}	
}

