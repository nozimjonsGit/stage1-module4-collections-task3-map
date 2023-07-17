package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> wordRepetitionMap = new HashMap<>();

        if (sentence.length() != 0) {
            sentence = sentence.toLowerCase();
            String[] words = sentence.split("\\W+");

            for (String word : words) {
                wordRepetitionMap.merge(word, 1, Integer::sum);
            }
        }

        return wordRepetitionMap;
    }
}
