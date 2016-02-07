package com.coderwurst.memento_patterns.serializable;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SpeedometerMemento {
	
	public SpeedometerMemento (Speedometer speedometer) throws FileNotFoundException, IOException {
		
		File speedometerFile = new File("speedometer.ser");
		ObjectOutputStream oos = new ObjectOutputStream (new BufferedOutputStream (
				new FileOutputStream(speedometerFile)));
		oos.writeObject(speedometer);
		oos.close();
	}
	
	// returns the object stored reference
	public Speedometer restoreState() throws FileNotFoundException, IOException, ClassNotFoundException {
		// deserialise
		File speedometerFile = new File("speedometer.ser");
		ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(speedometerFile)));
		Speedometer speedo = (Speedometer) ois.readObject();
		ois.close();
		return speedo;
	}

}
