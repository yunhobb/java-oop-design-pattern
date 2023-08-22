package org.study.chap02_03.b_filter;

import java.util.ArrayList;
import java.util.List;

public class FilterExampleMain {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);
        integerList.add(70);

        Integer findNumber = integerList.stream().filter(integer -> {
            System.out.println(integer);

            if(integer.equals(40))
                return true;

            return false;
        }).findAny().get();

        System.out.println("findNumber=" + findNumber);
    }
}