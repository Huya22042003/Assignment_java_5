package com.assignment.infrastructure.exeption.rest;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Path;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Set;

@RestControllerAdvice
public final class RestExceptionHandler extends
        ExceptionRestHandler<ConstraintViolationException> {

    @ExceptionHandler(RestApiException.class)
    public ResponseEntity<?> handlerException(RestApiException restApiException) {
        ApiError apiError = new ApiError(restApiException.getStatusCode());
        return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
    }

    @Override
    protected Object wrapApi(ConstraintViolationException ex) {
        Set<ConstraintViolation<?>> violations = ex.getConstraintViolations();
        HashMap<String, String> error = new HashMap<>();
        violations.forEach(el -> {
            error.put(getPropertyName(el.getPropertyPath()) + "Error", el.getMessage());
        });
        return error;
    }

    private String getPropertyName(Path path) {
        String pathStr = path.toString();
        String[] comps = pathStr.split("\\.");
        if (comps.length > 0) {
            return comps[comps.length - 1];
        } else {
            return pathStr;
        }
    }
}
