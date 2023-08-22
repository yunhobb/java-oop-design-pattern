package org.study.chap02_04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForAndIfFilterExampleMain {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> integerList = Arrays.stream(integerArray)
            .boxed()
            .collect(Collectors.toList());
//            .toList();

        Integer findNumber = null;

        for (int i = 0; i < integerList.size(); i++) {
            if(integerList.get(i).equals(1234)) {
                findNumber = integerList.get(i);
                break;
            }
        }

        if(findNumber == null)
            throw new RuntimeException();

        System.out.println("findNumber=" + findNumber);
    }
}
