package org.study.chap02_03.c_map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.add(70);

        List<Integer> x10IntegerList = integerList.stream()
            .map(integer -> integer * 10)
//            .toList(); // 이거 자바 16부터 됨
            .collect(Collectors.toList()); // 위에 문장이랑 같은 의미
        System.out.println(x10IntegerList);
    }
}
