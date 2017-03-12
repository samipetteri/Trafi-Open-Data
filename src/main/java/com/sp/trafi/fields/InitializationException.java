package com.sp.trafi.fields;

/**
 * Created by sami on 11.3.2017.
 */
public class InitializationException extends RuntimeException {
    public InitializationException() {
    }

    public InitializationException(String message) {
        super(message);
    }

    public InitializationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InitializationException(Throwable cause) {
        super(cause);
    }
}
