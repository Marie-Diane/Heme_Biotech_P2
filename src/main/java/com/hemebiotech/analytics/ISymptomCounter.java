package com.hemebiotech.analytics;

import java.util.Map;

/**
 * All the symptoms are collected in a Map to determine how many duplicates each symptom has
 * 
 */

public interface ISymptomCounter {

    /**
	 * If no data is available, return an empty Map
	 * 
	 * @return Map sorted in alphabetical order of key=symptom and value=count of duplicates symptoms
	 * 
	 */
    
    Map<String, Integer> compute();
}
