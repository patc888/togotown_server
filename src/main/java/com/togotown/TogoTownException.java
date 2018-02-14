package com.togotown;

public class TogoTownException extends RuntimeException {
    public enum Code {
        UNAVAILABLE,
        BAD_INPUT
    }

    private Code code;

    public TogoTownException(Code code, String message) {
        super(message);
        this.code = code;
    }

    public TogoTownException(Code code, Throwable t) {
        super(t);
        this.code = code;
    }

    public TogoTownException(Code code, String message, Throwable t) {
        super(message, t);
        this.code = code;
    }

    public static TogoTownException unavailable(Throwable e) {
        return new TogoTownException(Code.UNAVAILABLE, e);
    }

    public static TogoTownException badInput(String message) {
        return new TogoTownException(Code.BAD_INPUT, message);
    }
}
