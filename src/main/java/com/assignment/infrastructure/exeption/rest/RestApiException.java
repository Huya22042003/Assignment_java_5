package com.assignment.infrastructure.exeption.rest;

public class RestApiException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String statusCode;

    public RestApiException() {
    }

    public RestApiException(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

}
