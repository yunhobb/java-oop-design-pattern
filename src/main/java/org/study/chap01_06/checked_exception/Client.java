package org.study.chap01_06.checked_exception;

public class Client {
    public void throwsCheckedExceptionMethod() throws CheckedException {
        throw new CheckedException();
    }

    public void tryCatchcheckedExceptionMethod() {
        try {
            throw new CheckedException();
        } catch (CheckedException e) {
            e.printStackTrace();
        }
    }

}
