package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class CountSymptomWithOccurence implements ISymptomCounter {
    private List<String> symptomList;

    /**
	 * 
	 * @param symptomList Is a List of String with the possibility of duplicates
	 * 
	 */

	public CountSymptomWithOccurence(List<String> symptomList) {
        this.symptomList = symptomList;
	}

    @Override
    public Map<String, Integer> compute() {
        Map<String, Integer> countSymptoms = new TreeMap<String, Integer>();

        for(String symptom : symptomList) {
            Integer count = countSymptoms.get(symptom);
            if(count==null) {
                count = 0;
            }
            countSymptoms.put(symptom, count + 1);
        }
        return countSymptoms;
    }
}   
