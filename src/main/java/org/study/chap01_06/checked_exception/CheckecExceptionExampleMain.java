package org.study.chap01_06.checked_exception;

public class CheckecExceptionExampleMain {

    public static void main(String[] args) {
        Client  client = new Client();

        try {
            client.throwsCheckedExceptionMethod();
        } catch (CheckedException e) {
            // 예외에 대한 적절한 처리
        }
        client.tryCatchcheckedExceptionMethod();
    }
}
