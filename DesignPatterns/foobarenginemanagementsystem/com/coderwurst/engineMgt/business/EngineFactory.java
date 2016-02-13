/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */

package com.coderwurst.engineMgt.business;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * FACTORY pattern to determine which classes should be used depending on 
 * engine properties passed in
 */
public class EngineFactory {
	
	public enum Type { STANDARD, TURBO };
	private static final Logger log = Logger.getLogger( EngineFactory.class.getName() );
	
	// static for ease of access
	static Engine create(EngineFactory.Type type, int size) {
		if (type == Type.STANDARD) {
			return new StandardEngine(size);
		} else {
			return new TurboEngine(size);
		}
	}
	
	// overridden so that clients can either use boolean values or type (above)
	static Engine create (int size, boolean turbo) {
		log.log( Level.FINE, "business - create an Engine" );
		return EngineFactory.create(turbo ? Type.TURBO : Type.STANDARD, size);
	}
	
	private EngineFactory() {}

}

