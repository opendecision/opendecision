package com.opendecision.core;

public class ResponseBuilder<T> {

    private int code;
    private String message;
    private T data;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public static ResponseBuilder ok() {
        return new ResponseBuilder().code(200).msg("success");
    }

    public ResponseBuilder code(int code) {
        this.code = code;
        return this;
    }

    public ResponseBuilder msg(String message) {
        this.message = message;
        return this;
    }

    public ResponseBuilder data(T data) {
        this.data = data;
        return this;
    }
}
