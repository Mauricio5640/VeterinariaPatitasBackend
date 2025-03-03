package com.mauricio.veterinaria_back.application.usecases;

import com.mauricio.veterinaria_back.domain.models.Citas;
import com.mauricio.veterinaria_back.domain.ports.in.PostCitasUseCase;
import com.mauricio.veterinaria_back.domain.ports.out.CitasRepositoryPort;

public class PostCitasUseCaseImpl implements PostCitasUseCase {

    private final CitasRepositoryPort citasRepositoryPort;

    public PostCitasUseCaseImpl(CitasRepositoryPort citasRepositoryPort) {
        this.citasRepositoryPort = citasRepositoryPort;
    }

    @Override
    public Citas postCita(Citas request) {
        return citasRepositoryPort.postCita(request);
    }
}
