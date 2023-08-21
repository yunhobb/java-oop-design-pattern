package org.study.chap01_08.withOptional;

import java.util.Optional;

public class WithOptionalMain3 {
    public static void main(String[] args) {
        // Optional의 정적 팩토리 메서드 사용

        MapRepository mapRepository = new MapRepository();
        String string = Optional.ofNullable(mapRepository.getValue("NOT_EXIST_KEY"))
            .orElseThrow(RuntimeException::new);

        System.out.println(string.toUpperCase());
    }
}
