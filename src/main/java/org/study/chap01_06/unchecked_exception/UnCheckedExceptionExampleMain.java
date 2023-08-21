package org.study.chap01_06.unchecked_exception;

public class UnCheckedExceptionExampleMain {

    public static void main(String[] args) {
        Client client = new Client();

        try {
            client.throwUncheckedExceptionMethod();
        } catch (UncheckedException e) {
            // 예외에 대한 적절한 처리
        }
        client .tryCatchUncheckedExceptionMethod();
    }
}
