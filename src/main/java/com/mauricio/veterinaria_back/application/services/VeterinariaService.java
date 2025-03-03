package com.mauricio.veterinaria_back.application.services;

import com.mauricio.veterinaria_back.domain.models.Citas;
import com.mauricio.veterinaria_back.domain.ports.in.DeleteCitasUseCase;
import com.mauricio.veterinaria_back.domain.ports.in.GetCitasUseCase;
import com.mauricio.veterinaria_back.domain.ports.in.PostCitasUseCase;
import com.mauricio.veterinaria_back.domain.ports.in.PutCitasUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinariaService implements GetCitasUseCase, PostCitasUseCase, PutCitasUseCase, DeleteCitasUseCase {

    private final GetCitasUseCase getCitasUseCase;
    private final PostCitasUseCase postCitasUseCase;
    private final PutCitasUseCase putCitasUseCase;
    private final DeleteCitasUseCase deleteCitasUseCase;

    public VeterinariaService(GetCitasUseCase getCitasUseCase,
                              PostCitasUseCase postCitasUseCase,
                              PutCitasUseCase putCitasUseCase,
                              DeleteCitasUseCase deleteCitasUseCase) {
        this.getCitasUseCase = getCitasUseCase;
        this.postCitasUseCase = postCitasUseCase;
        this.putCitasUseCase = putCitasUseCase;
        this.deleteCitasUseCase = deleteCitasUseCase;
    }

    @Override
    public List<Citas> getCitas() {
        return getCitasUseCase.getCitas();
    }

    @Override
    public List<Citas> getCita(String id) {
        return getCitasUseCase.getCita(id);
    }

    @Override
    public Citas postCita(Citas request) {
        return postCitasUseCase.postCita(request);
    }

    @Override
    public Citas putCitas(Long id, Citas request) {
        return putCitasUseCase.putCitas(id, request);
    }

    @Override
    public void delete(Long id) {
        deleteCitasUseCase.delete(id);
    }
}
