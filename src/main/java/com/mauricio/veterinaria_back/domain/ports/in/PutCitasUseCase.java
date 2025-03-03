package com.mauricio.veterinaria_back.domain.ports.in;

import com.mauricio.veterinaria_back.domain.models.Citas;

public interface PutCitasUseCase {

    Citas putCitas(Long id, Citas request);

}
