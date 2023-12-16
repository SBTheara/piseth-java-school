package com.springbootlesson.lesson1.exception;

import lombok.*;
import org.springframework.http.HttpStatus;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApiException extends RuntimeException{
    private HttpStatus status;
    private String message;
}
