package org.study.dependence.chap03_04;

import org.springframework.stereotype.Component;

@Component
public class DatabaseRepository implements Repository {

    @Override
    public void someMethod(String articleContent) {
        System.out.println("Database Repository");
    }
}
