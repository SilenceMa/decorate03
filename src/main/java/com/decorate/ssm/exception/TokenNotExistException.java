package com.decorate.ssm.exception;

/**
 * Created by charles on 17/2/23.
 */
public class TokenNotExistException extends Exception {

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
