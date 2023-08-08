package org.study.chap01_04.abstract_class;

public abstract class AbstractClass {
    public void implementMethod() {
        System.out.println("AbstractClass implementation");
        this.abstractMethod();
    }

    abstract public void abstractMethod();
}
