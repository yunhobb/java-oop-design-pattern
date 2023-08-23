package org.study.designPattern.proxyPtn;

public class Proxy implements SomeInterface {
    private Service service;

    public Proxy() {
        this.service = new Service();
    }

    @Override
    public void someMethod() {
        System.out.println("someMethod 실행 전");

        service.someMethod();

        System.out.println("someMethod 실행 후");
    }

}
