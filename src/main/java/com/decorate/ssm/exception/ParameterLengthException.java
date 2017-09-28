package com.decorate.ssm.exception;

/**
 * 参数长度错误；
 * Created by charles on 17/2/28.
 */
public class ParameterLengthException extends Exception{

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
