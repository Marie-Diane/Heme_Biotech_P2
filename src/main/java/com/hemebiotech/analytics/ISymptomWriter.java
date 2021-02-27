package com.hemebiotech.analytics;

import java.util.Map;

/**
 * Write the symptoms of List to a given file
 * 
 */

public interface ISymptomWriter {

	/**
	 * Writes in a file a list of symptoms without duplicate with their number of
	 * occurrences
	 * 
	 * @param symptoms Is a Map of symptoms with Integer value
	 * 
	 * @throws Exception If no file to write specified
	 * @throws Exception If no list available
	 * 
	 */

	void WriteSymptomsWithOccurence(Map<String, Integer> symptoms) throws Exception;

}