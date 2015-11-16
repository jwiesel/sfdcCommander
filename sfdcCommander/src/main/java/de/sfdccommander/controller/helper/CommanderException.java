package de.sfdccommander.controller.helper;

public class CommanderException extends Exception {

    public CommanderException() {
    }

    public CommanderException(String message) {
        super(message);
    }

    public CommanderException(Throwable cause) {
        super(cause);
    }

    public CommanderException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommanderException(String message, Throwable cause,
            boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
