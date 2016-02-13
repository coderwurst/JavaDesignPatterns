package com.coderwurst.engineMgt.business;

import java.io.Serializable;

public interface Engine extends Serializable {

	// must facilitate objects being serialized
	
	public int getSize();
	public boolean isTurbo();
}
