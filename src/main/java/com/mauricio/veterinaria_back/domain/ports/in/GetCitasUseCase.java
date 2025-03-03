package com.mauricio.veterinaria_back.domain.ports.in;

import com.mauricio.veterinaria_back.domain.models.Citas;

import java.util.List;

public interface GetCitasUseCase {

    List<Citas> getCitas();

    List<Citas> getCita(String id);

}
