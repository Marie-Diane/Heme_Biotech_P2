package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;


public class WriteSymptomListToFile implements ISymptomWriter {

	private String filenameToWrite;
	private List<String> symptomList;


	public WriteSymptomListToFile(String filenameToWrite, List<String> symptomList) {
		this.filenameToWrite = filenameToWrite;
		this.symptomList = symptomList;
	}

	@Override
	public void WriteSymptomsWithCounter() {
		if (filenameToWrite != null) {
			try {
				FileWriter writer = new FileWriter(filenameToWrite);
				int count = 1;
				if (symptomList != null) {

					Collections.sort(symptomList);

					for (int i = 0; i < symptomList.size(); ++i) {
						String symptom = symptomList.get(i);

						if (i != symptomList.size() - 1 && symptom.equals(symptomList.get(i + 1))) {
							count += 1;
						} else {
							writer.write(symptom + " : " + count + "\n");
							count = 1;
						}
					}
				} else {
					writer.write("La liste des symptomes est inexistante");
				}
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.print("Le fichier de destination n'a pas été spécifié");
		}
	}
} 