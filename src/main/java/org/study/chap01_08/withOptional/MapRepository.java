package org.study.chap01_08.withOptional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapRepository {

    private Map<String, String> map = new HashMap<>();

    MapRepository() {
        map.put("EXIST_KEY", "value");
    }

    // ofNullable을 사용해 null 값도 허용을 한다. -> optional을 반환
    public Optional<String> getOptionalValue(String key) {
        return Optional.ofNullable(map.get(key));
    }

    public String getValue(String key) {
        return map.get(key);
    }
}

