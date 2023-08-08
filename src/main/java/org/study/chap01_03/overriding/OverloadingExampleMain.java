package org.study.chap01_03.overriding;

public class OverloadingExampleMain {

    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();     //다형성

        parent.someMethod();
        child.someMethod();
    }
}
