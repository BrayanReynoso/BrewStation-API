package com.brewstation_.brew_station_api.utils;



public class CustomResponse <T> {
    private T data;
    private int code;
    private String message;
    private Boolean error;

    public CustomResponse() {
    }

    public CustomResponse(T data, int code, String message, Boolean error) {
        this.data = data;
        this.code = code;
        this.message = message;
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }
}