package org.example.validationspring.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategoried error!"),
    USER_EXSIT(1001, "USER EXIST!"),
    PASSWORD_INVALID(1003, "PASSWORD MUST BE AT LEAST 3 CHARACTER!"),
    USER_NOT_EXSIT(1005, "USER NOT EXIST!"),
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
