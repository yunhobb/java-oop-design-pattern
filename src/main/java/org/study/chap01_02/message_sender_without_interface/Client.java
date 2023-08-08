package org.study.chap01_02.message_sender_without_interface;

public class Client {

    public void someMethod() {
        FakeMessageSender messageSender = new FakeMessageSender();
        messageSender.send();
    }
}
