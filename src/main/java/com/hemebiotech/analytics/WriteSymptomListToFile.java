package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;

/**
 * Simple brute force implementation
 *
 */

public class WriteSymptomListToFile implements ISymptomWriter {
	private String filenameToWrite;

    /**
	 * 
	 * @param filenameToWrite A full or partial path to file exist or not, to write
	 *                        inside
	 */

	public WriteSymptomListToFile(String filenameToWrite) {
		this.filenameToWrite = filenameToWrite;
	}

	@Override
	public void WriteSymptomsWithOccurence(Map<String, Integer> symptoms) throws Exception {
		if (filenameToWrite == null) {
            throw new Exception("Le fichier de destination n'a pas été spécifié");
        } else {
            try (FileWriter writer = new FileWriter(filenameToWrite)) {
				if (symptoms == null) {
                    throw new Exception("La liste des symptomes est inexistante");
                } else {
                    for(Map.Entry<String, Integer> entry : symptoms.entrySet()) {
                        writer.write(entry.getKey()+ " : " + entry.getValue() + "\n");

                    }
                }
            }
        }
    }
}