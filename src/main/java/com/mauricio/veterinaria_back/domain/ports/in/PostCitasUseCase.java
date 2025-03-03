package com.mauricio.veterinaria_back.domain.ports.in;

import com.mauricio.veterinaria_back.domain.models.Citas;

public interface PostCitasUseCase {

    Citas postCita(Citas request);

}
