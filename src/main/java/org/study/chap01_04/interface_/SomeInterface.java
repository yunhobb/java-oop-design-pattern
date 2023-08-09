package org.study.chap01_04.interface_;

public interface SomeInterface {
    void someMethod();

    default void defaultMethod() {
        //인터페이스에 메스드 정의 가능
        someMethod();
    }

}
