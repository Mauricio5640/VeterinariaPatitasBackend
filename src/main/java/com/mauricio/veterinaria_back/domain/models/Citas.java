package com.mauricio.veterinaria_back.domain.models;

import com.mauricio.veterinaria_back.infrastructure.entities.CitaEntity;

public class Citas {

    private Long folioCita;
    private String nombreCliente;
    private String nombreMascota;
    private String especie;
    private String razonCita;
    private String fechaCita;
    private String horaCita;
    private String userId;

    public Citas() {
    }

    public Citas(Long folioCita, String nombreCliente, String nombreMascota, String especie, String razonCita, String fechaCita, String userId, String horaCita) {
        this.folioCita = folioCita;
        this.nombreCliente = nombreCliente;
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.razonCita = razonCita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.userId = userId;
    }

    public CitaEntity toEntity() {
        return new CitaEntity(folioCita, nombreCliente, nombreMascota, especie, razonCita, fechaCita, userId, horaCita);
    }

    public Long getFolioCita() {
        return folioCita;
    }

    public void setFolioCita(Long folioCita) {
        this.folioCita = folioCita;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRazonCita() {
        return razonCita;
    }

    public void setRazonCita(String razonCita) {
        this.razonCita = razonCita;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
