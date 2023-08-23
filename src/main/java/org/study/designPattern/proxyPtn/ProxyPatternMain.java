package org.study.designPattern.proxyPtn;

public class ProxyPatternMain {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();

        Client client = new Client(proxy);

        client.someClientMethod();
    }

}
