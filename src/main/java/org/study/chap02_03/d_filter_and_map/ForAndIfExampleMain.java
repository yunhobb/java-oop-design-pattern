package org.study.chap02_03.d_filter_and_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForAndIfExampleMain {
    public static void main(String[] args) {
        int[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> integerList = Arrays.stream(integerArray)
            .boxed() //원시 타입을 Wrapper 타입으로 변경
//            .toList(); // 자바 16이상 지원
            .collect(Collectors.toList());
        System.out.println(integerList);

        List<Integer> evenNumberList = new ArrayList<>();

        for(int i = 0; i < integerList.size(); i++) {
            if(integerList.get(i) % 2 == 0) {
                evenNumberList.add(integerList.get(i));
            }
        }

        System.out.println(evenNumberList);

        List<Integer> evenX10NumberList = new ArrayList<>();

        for(int i = 0; i < evenNumberList.size(); i++) {
            evenX10NumberList.add(evenNumberList.get(i) * 10);
        }

        System.out.println(evenX10NumberList);
    }
}
