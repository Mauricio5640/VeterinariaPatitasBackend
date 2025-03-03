package com.mauricio.veterinaria_back.domain.models;

public enum Message {

    GET_CITAS("Citas obtenidas exitosamente"),
    GET_CITA("Cita obtenida extisamente"),
    PUT_CITA("Cita actualizada exitosamente"),
    POST_CITA("Cita creada exitosamente"),
    ERROR_CITA("Cita no encontrada");

    public final String message;

    Message(String message) {
        this.message = message;
    }

}
