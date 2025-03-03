package com.mauricio.veterinaria_back.infrastructure.repositories;

import com.mauricio.veterinaria_back.domain.models.Citas;
import com.mauricio.veterinaria_back.domain.ports.out.CitasRepositoryPort;
import com.mauricio.veterinaria_back.infrastructure.entities.CitaEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CitasRepositoryAdapter implements CitasRepositoryPort {


    private final JpaCitaRepository jpaCitaRepository;

    public CitasRepositoryAdapter(JpaCitaRepository jpaCitaRepository) {
        this.jpaCitaRepository = jpaCitaRepository;
    }

    @Override
    public List<Citas> getCitas() {
        return jpaCitaRepository.findAll().stream().map(CitaEntity::toDomainModel).toList();
    }

    @Override
    public List<Citas> getCita(String id) {
        return jpaCitaRepository.findByUserId(id).stream().map(CitaEntity::toDomainModel).toList();
    }

    @Override
    public Citas postCita(Citas request) {
        return jpaCitaRepository.save(request.toEntity()).toDomainModel();
    }

    @Override
    public Citas putCita(Long id, Citas request) {
        return jpaCitaRepository.save(request.toEntity()).toDomainModel();
    }

    @Override
    public boolean findCita(Long id) {
        return jpaCitaRepository.findById(id).isPresent();
    }

    @Override
    public void deleteCita(Long id) {
        jpaCitaRepository.deleteById(id);
    }
}
