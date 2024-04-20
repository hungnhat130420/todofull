package org.backend.authservice.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserException {

    @ExceptionHandler(RuntimeException.class)
    ResponseEntity<String> handleRuntimeException (RuntimeException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
