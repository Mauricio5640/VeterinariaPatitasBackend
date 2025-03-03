package com.mauricio.veterinaria_back.application.usecases;

import com.mauricio.veterinaria_back.domain.exceptions.CitasException;
import com.mauricio.veterinaria_back.domain.models.Citas;
import com.mauricio.veterinaria_back.domain.ports.in.GetCitasUseCase;
import com.mauricio.veterinaria_back.domain.ports.out.CitasRepositoryPort;

import java.util.List;
import java.util.Optional;

public class GetCitasUseCaseImpl implements GetCitasUseCase {

    private final CitasRepositoryPort citasRepositoryPort;

    public GetCitasUseCaseImpl(CitasRepositoryPort citasRepositoryPort) {
        this.citasRepositoryPort = citasRepositoryPort;
    }

    @Override
    public List<Citas> getCitas() {
        return citasRepositoryPort.getCitas();
    }

    @Override
    public List<Citas> getCita(String id) {
        List<Citas> citasList = citasRepositoryPort.getCita(id);
        if(citasList.isEmpty()){
            throw new CitasException("No se ha encontrado la cita con el id " + id);
        }
        return citasList;
    }
}
