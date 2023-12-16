package com.springbootlesson.lesson1.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(ApiException.class)
  public ResponseEntity<?> handleApiException(ApiException exception) {
    return ResponseEntity.status(exception.getStatus()).body(exception.getMessage());
  }
}
