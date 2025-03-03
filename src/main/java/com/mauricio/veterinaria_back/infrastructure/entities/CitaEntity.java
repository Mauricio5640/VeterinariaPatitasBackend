package com.mauricio.veterinaria_back.infrastructure.entities;

import com.mauricio.veterinaria_back.domain.models.Citas;
import jakarta.persistence.*;

@Entity
@Table(name = "Citas")
public class CitaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "FolioCita")
    private Long folioCita;
    @Column(name = "NombreCliente")
    private String nombreCliente;
    @Column(name = "NombreMascota")
    private String nombreMascota;
    @Column(name = "Especie")
    private String especie;
    @Column(name = "RazonCita")
    private String razonCita;
    @Column(name = "FechaCita")
    private String fechaCita;
    @Column(name="HoraCita")
    private String horaCita;
    @Column(name = "UserId")
    private String userId;

    public CitaEntity() {
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

    public CitaEntity(Long folioCita, String nombreCliente, String nombreMascota, String especie, String razonCita, String fechaCita, String userId, String horaCita) {
        this.folioCita = folioCita;
        this.nombreCliente = nombreCliente;
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.razonCita = razonCita;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.userId = userId;

    }

    public Citas toDomainModel(){
        return new Citas(folioCita, nombreCliente, nombreMascota, especie, razonCita, fechaCita, userId, horaCita);
    }

}
