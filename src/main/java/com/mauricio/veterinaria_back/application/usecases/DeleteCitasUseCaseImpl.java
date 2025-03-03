package com.mauricio.veterinaria_back.application.usecases;

import com.mauricio.veterinaria_back.domain.exceptions.CitasException;
import com.mauricio.veterinaria_back.domain.ports.in.DeleteCitasUseCase;
import com.mauricio.veterinaria_back.domain.ports.out.CitasRepositoryPort;

public class DeleteCitasUseCaseImpl implements DeleteCitasUseCase {

    private final CitasRepositoryPort citasRepositoryPort;

    public DeleteCitasUseCaseImpl(CitasRepositoryPort citasRepositoryPort) {
        this.citasRepositoryPort = citasRepositoryPort;
    }

    @Override
    public void delete(Long id) {

        if (!citasRepositoryPort.findCita(id)) {
            throw new CitasException("No se ha encontrado la cita con el id " + id);
        }

        citasRepositoryPort.deleteCita(id);

    }
}
