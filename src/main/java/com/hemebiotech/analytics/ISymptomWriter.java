package com.hemebiotech.analytics;

import java.util.Map;

public interface ISymptomWriter {

	void WriteSymptomsWithOccurence(Map<String, Integer> symptoms) throws Exception;

}