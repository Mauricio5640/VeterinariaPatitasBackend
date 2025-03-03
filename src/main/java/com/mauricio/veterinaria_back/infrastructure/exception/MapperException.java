package com.mauricio.veterinaria_back.infrastructure.exception;

import com.mauricio.veterinaria_back.domain.exceptions.CitasException;
import com.mauricio.veterinaria_back.domain.models.Message;
import com.mauricio.veterinaria_back.domain.models.Response;
import com.mauricio.veterinaria_back.domain.models.Status;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class MapperException {
    @ExceptionHandler(CitasException.class)
    public ResponseEntity<Response<String>> handleCitaExceptions(
            CitasException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
                new Response<>(Status.ERROR.status, Message.ERROR_CITA.message, ex.getMessage()));
    }


}
