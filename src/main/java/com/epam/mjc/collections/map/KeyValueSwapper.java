package com.epam.mjc.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swapped = new LinkedHashMap<>();

        for (Map.Entry<Integer, String> map : sourceMap.entrySet()) {
            int key = map.getKey();
            String value = map.getValue();

            if (swapped.containsKey(value)) {

                if (swapped.get(value) > key )
                    swapped.replace(value, key);

            } else {
                swapped.put(value, key);
            }

        }

        return swapped;
    }

}
