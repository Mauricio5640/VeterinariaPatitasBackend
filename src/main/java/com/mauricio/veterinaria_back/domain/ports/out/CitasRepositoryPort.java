package com.mauricio.veterinaria_back.domain.ports.out;

import com.mauricio.veterinaria_back.domain.models.Citas;

import java.util.List;
import java.util.Optional;

public interface CitasRepositoryPort {

    List<Citas> getCitas();
    List<Citas> getCita(String id);

    Citas postCita(Citas request);

    Citas putCita(Long id, Citas request);

    boolean findCita(Long id);

    void deleteCita(Long id);


}
