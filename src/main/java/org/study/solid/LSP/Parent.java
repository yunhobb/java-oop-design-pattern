package org.study.solid.LSP;

public class Parent {
    public void someMethod(int input) {
        // 어떤 input이든 상관 없음

        System.out.println("Parent 정상적으로 호출됨.");
    }
};