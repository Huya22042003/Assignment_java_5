package com.assignment.infrastructure.exeption.rest;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public final class UnknownExceptionRestHandler extends
        ExceptionRestHandler<Exception> {

    @Override
    protected Object wrapApi(Exception ex) {
        return ex.getMessage();
    }
}

