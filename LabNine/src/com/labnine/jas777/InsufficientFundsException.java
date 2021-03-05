package com.labnine.jas777;

public class InsufficientFundsException extends RuntimeException {

    private final String message;

    public InsufficientFundsException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
