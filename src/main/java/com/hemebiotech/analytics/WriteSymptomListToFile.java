package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.util.Map;


public class WriteSymptomListToFile implements ISymptomWriter {

	private String filenameToWrite;

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