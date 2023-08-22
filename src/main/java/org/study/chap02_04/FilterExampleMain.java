package org.study.chap02_04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExampleMain {

    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> integerList = Arrays.stream(integerArray)
            .boxed()
            .collect(Collectors.toList());
//            .toList();

        Integer findNumber = integerList.stream()
            .filter(integer -> {
                if (integer.equals(1234))
                    return true;
                return false;
            })
            .findAny()
            .orElseThrow();

        System.out.println("findNumber=" + findNumber);
    }
}
