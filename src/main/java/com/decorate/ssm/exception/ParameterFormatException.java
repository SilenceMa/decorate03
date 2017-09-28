package com.decorate.ssm.exception;

/**
 * Created by charles on 17/2/28.
 */
public class ParameterFormatException extends Exception {

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
