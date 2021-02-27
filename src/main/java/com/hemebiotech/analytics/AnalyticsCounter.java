package com.hemebiotech.analytics;

public class AnalyticsCounter {
	public static void main(String args[]) throws Exception {
		ReadSymptomDataFromFile readSymptoms = new ReadSymptomDataFromFile("src/main/resources/symptoms.txt");
		WriteSymptomListToFile writeSymptoms = new WriteSymptomListToFile("result.out", readSymptoms.GetSymptoms());
		writeSymptoms.WriteSymptomsWithCounter();
	}
} 