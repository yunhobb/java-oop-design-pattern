package org.study.chap01_08.without_Optional;

public class WithoutOptionalExampleMain {
    public static void main(String[] args) {
        MapRepository mapRepository = new MapRepository();
        String string = mapRepository.getValue("NOT_EXIST_KEY");

        System.out.println("string=" + string);

        System.out.println(string.toUpperCase());

//        NullPointerException을 피하려면 이렇게 Null 체크를 해야함.
//        if(string != null)
//            System.out.println(string.toUpperCase());
    }
}

