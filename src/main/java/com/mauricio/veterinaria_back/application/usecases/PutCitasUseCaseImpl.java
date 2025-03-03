package com.mauricio.veterinaria_back.application.usecases;

import com.mauricio.veterinaria_back.domain.exceptions.CitasException;
import com.mauricio.veterinaria_back.domain.models.Citas;
import com.mauricio.veterinaria_back.domain.ports.in.PutCitasUseCase;
import com.mauricio.veterinaria_back.domain.ports.out.CitasRepositoryPort;

public class PutCitasUseCaseImpl implements PutCitasUseCase {

    private final CitasRepositoryPort citasRepositoryPort;

    public PutCitasUseCaseImpl(CitasRepositoryPort citasRepositoryPort) {
        this.citasRepositoryPort = citasRepositoryPort;
    }


    @Override
    public Citas putCitas(Long id, Citas request) {

        boolean cita = citasRepositoryPort.findCita(id);
        if(!cita) {
            throw new CitasException("No se ha encontrado la cita");
        }

        request.setFolioCita(id);
        return citasRepositoryPort.putCita(id, request);


    }
}
