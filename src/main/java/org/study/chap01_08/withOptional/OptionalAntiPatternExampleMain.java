package org.study.chap01_08.withOptional;

import java.util.Optional;

public class OptionalAntiPatternExampleMain {
    public static void main(String[] args) {
        MapRepository mapRepository = new MapRepository();
        Optional<String> string = mapRepository.getOptionalValue("NOT_EXIST_KEY");

        if(string.isPresent()) // 가독성 반감 그리고 null 체크 하는거랑 다를게 없다
            System.out.println(string.get().toUpperCase());
        else
            throw new RuntimeException("키가 존재하지 않습니다.");
    }
}
