package com.moby.prisma.jmr.prismapractica.exceptions;

import com.moby.prisma.jmr.prismapractica.models.ResponseMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    ResponseEntity<ResponseMessage> entityNotFoundException(EntityNotFoundException entityNotFoundException) {
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body((ResponseMessage.builder()
                        .message(entityNotFoundException.getMessage()).build()));
    }

    @ExceptionHandler(GlobalServiceDataAccessException.class)
    public ResponseEntity<ResponseMessage> handlerGlobalServiceDataAccessException(GlobalServiceDataAccessException globalServiceDataAccessException) {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ResponseMessage.builder()
                        .message(globalServiceDataAccessException.getMessage()).build());
    }
}
