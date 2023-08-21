package org.study.chap01_08.withOptional;

import java.util.Optional;

public class WithOptionalMain {
    public static void main(String[] args) {
        MapRepository mapRepository = new MapRepository();
        Optional<String> string = mapRepository.getOptionalValue("NOT_EXIST_KEY");

        string.ifPresentOrElse(
            str -> System.out.println(str.toUpperCase()),               // Optional이 Empty가 아닐 때 실행
            () -> {
                throw new RuntimeException("키가 존재하지 않습니다."); // Optional이 Empty일 때 실행
            }
        );
    }
}