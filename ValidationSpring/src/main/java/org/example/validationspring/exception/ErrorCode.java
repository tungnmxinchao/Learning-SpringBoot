package org.example.validationspring.exception;

public enum ErrorCode {
    USER_EXSIT(1001, "USER EXIST!")
    ;
    private int code;
    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
