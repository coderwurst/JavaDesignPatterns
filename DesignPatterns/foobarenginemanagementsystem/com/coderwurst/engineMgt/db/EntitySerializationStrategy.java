/**
 * @author coderwurst
 *
 * 13 Feb 2016
 */


package com.coderwurst.engineMgt.db;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EntitySerializationStrategy extends AbstractEntityPersistenceStrategy {

	@Override
	String getFileSuffix() {
		return ".ser";
	}

	@Override
	void save(EntityTable table) throws IOException {
		File file = new File (getFileName(table) + getFileSuffix());
		// DECORATOR PATTERN - FileOutput wrapped in BufferedOutput wrapped in ObjectOutput
		FileOutputStream fos = new FileOutputStream (file);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		ObjectOutputStream oos = new ObjectOutputStream(bos);
		oos.writeObject(table);
		oos.close();
	}

	@SuppressWarnings("resource")
	@Override
	EntityTable restore(EntityTable table) throws IOException {
		File file = new File (getFileName(table) + getFileSuffix());
		// DECORATOR PATTERN
		FileInputStream fis = new FileInputStream (file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		ObjectInputStream ois = new ObjectInputStream(bis);
		try {
			table = (EntityTable) ois.readObject();
		} catch (ClassNotFoundException ex) {
			throw new IOException(ex);
		}
		ois.close();
		return table;
	}
}
