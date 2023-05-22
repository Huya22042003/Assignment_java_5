package com.assignment.infrastructure.exeption.rest;

import com.assignment.infrastructure.exeption.ExceptionHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class ExceptionRestHandler<Z extends Exception>
        extends ExceptionHandler<ResponseEntity<?>,Z> {

    @Override
    protected ResponseEntity<?> wrap(Z ex) {
        return new ResponseEntity<>(wrapApi(ex), HttpStatus.BAD_REQUEST);
    }

    protected abstract Object wrapApi(Z ex);
}