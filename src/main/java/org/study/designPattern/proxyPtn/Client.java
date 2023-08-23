package org.study.designPattern.proxyPtn;

public class Client {
    private final SomeInterface someInterface;

    public Client(SomeInterface someInterface) {
        this.someInterface = someInterface;
    }

    public void someClientMethod() {
        someInterface.someMethod();
    }

}
