package org.study.chap02_03.e_map_collection_to_stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class MapStreamExample {
    public static void main(String[] args) {
        Map<String, Integer> someMap = new HashMap<>();
        Set<Map.Entry<String, Integer>> entries = someMap.entrySet();
        Set<String> keySet = someMap.keySet();
        List<Integer> valueList = someMap.values().stream().collect(Collectors.toList());

        entries.stream().forEach(stringIntegerEntry -> {
            String key = stringIntegerEntry.getKey();
            Integer value = stringIntegerEntry.getValue();

            // key, value 사용
        });
    }
}