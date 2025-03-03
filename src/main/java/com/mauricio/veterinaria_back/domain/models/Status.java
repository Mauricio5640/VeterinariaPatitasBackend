package com.mauricio.veterinaria_back.domain.models;

public enum Status {

    SUCCESS("success"),
    ERROR("error");

    public final String status;

    Status(String status) {
        this.status = status;
    }

}
