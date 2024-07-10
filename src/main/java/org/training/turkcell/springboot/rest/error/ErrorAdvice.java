package org.training.turkcell.springboot.rest.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

@RestControllerAdvice
public class ErrorAdvice {

    private static final Logger logger = LoggerFactory.getLogger(ErrorAdvice.class);

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handle(IllegalArgumentException exceptionParam) {
        return ErrorObj.builder()
                       .withDesc(exceptionParam.getMessage())
                       .withErrorCode(1001)
                       .build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorObj handle(MethodArgumentNotValidException exceptionParam) {
        return ErrorObj.builder()
                       .withSubErrors(exceptionParam.getAllErrors()
                                                    .stream()
                                                    .map(oe -> ErrorObj.builder()
                                                                       .withErrorCode(1004)
                                                                       .withDesc(oe.toString())
                                                                       .build())
                                                    .collect(Collectors.toList()))
                       .withDesc("Validation Error")
                       .withErrorCode(1003)
                       .build();
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorObj handle(Exception exceptionParam) {
        logger.error("[ErrorAdvice][handle]-> *Error* : " + exceptionParam.getMessage(),
                     exceptionParam);
        return ErrorObj.builder()
                       .withDesc(exceptionParam.getMessage())
                       .withErrorCode(5000)
                       .build();
    }

}
