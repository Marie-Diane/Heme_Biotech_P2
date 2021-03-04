package com.hemebiotech.analytics;

public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {
		ISymptomReader readSymptoms = new ReadSymptomDataFromFile("src/main/resources/symptoms.txt");
		ISymptomCounter countSymptoms = new CountSymptomWithOccurence(readSymptoms.GetSymptoms());
		ISymptomWriter writeSymptoms = new WriteSymptomListToFile("result.out");
		writeSymptoms.WriteSymptomsWithOccurence(countSymptoms.compute());
	}
} 