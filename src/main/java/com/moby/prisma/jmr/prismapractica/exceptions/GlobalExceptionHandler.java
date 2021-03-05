package com.moby.prisma.jmr.prismapractica.exceptions;

import com.moby.prisma.jmr.prismapractica.models.ResponseMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.persistence.EntityNotFoundException;

@Slf4j
@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EntityNotFoundException.class)
    ResponseEntity<ResponseMessage> entityNotFoundException(EntityNotFoundException entityNotFoundException) {
        String message = "Entidad no encontrada! no existe en la BD";
        log.error(message);
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(ResponseMessage.builder().message(message).build());
    }

    @ExceptionHandler(GlobalServiceDataAccessException.class)
    public ResponseEntity<ResponseMessage> handlerGlobalServiceDataAccessException(GlobalServiceDataAccessException globalServiceDataAccessException) {
        String message = globalServiceDataAccessException.getMessage();
        log.error(message);
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(ResponseMessage.builder()
                        .message(message).build());
    }
}
