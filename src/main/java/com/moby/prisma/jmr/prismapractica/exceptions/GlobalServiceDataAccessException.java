package com.moby.prisma.jmr.prismapractica.exceptions;

public class GlobalServiceDataAccessException extends Exception {

    public GlobalServiceDataAccessException() {
    }

    public GlobalServiceDataAccessException(String message) {
        super(message);
    }

    public GlobalServiceDataAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public GlobalServiceDataAccessException(Throwable cause) {
        super(cause);
    }
}
