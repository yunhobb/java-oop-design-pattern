package org.study.designPattern.proxyPtn;

public class Service implements SomeInterface {

    @Override
    public void someMethod() {
        System.out.println("Service의 someMethod");
    }

}
