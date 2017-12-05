package com.rcplatform.livechat.exception;

/**
 * Created by apple on 2017/4/9.
 */
public class FailureException extends RuntimeException {

    public final int errorCode;

    public FailureException(int errorCode) {
        super("Error code: " + errorCode);
        this.errorCode = errorCode;
    }
}
