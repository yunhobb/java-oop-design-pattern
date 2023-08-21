package org.study.chap01_06.unchecked_exception;

public class Client {
    public void throwUncheckedExceptionMethod() throws UncheckedException {
        throw new UncheckedException();
    }

    public void tryCatchUncheckedExceptionMethod() {
        try {
            throw new UncheckedException();
        } catch (UncheckedException e) {
            e.printStackTrace();
        }
    }
}
