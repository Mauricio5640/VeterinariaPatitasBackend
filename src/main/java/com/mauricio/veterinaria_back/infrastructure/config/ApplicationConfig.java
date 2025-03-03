package com.mauricio.veterinaria_back.infrastructure.config;

import com.mauricio.veterinaria_back.application.services.VeterinariaService;
import com.mauricio.veterinaria_back.application.usecases.DeleteCitasUseCaseImpl;
import com.mauricio.veterinaria_back.application.usecases.GetCitasUseCaseImpl;
import com.mauricio.veterinaria_back.application.usecases.PostCitasUseCaseImpl;
import com.mauricio.veterinaria_back.application.usecases.PutCitasUseCaseImpl;
import com.mauricio.veterinaria_back.domain.ports.out.CitasRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    private final CitasRepositoryPort citasRepositoryPort;

    public ApplicationConfig(CitasRepositoryPort citasRepositoryPort) {
        this.citasRepositoryPort = citasRepositoryPort;
    }

    @Bean
    public VeterinariaService veterinariaService(){
        return new VeterinariaService(
                new GetCitasUseCaseImpl(citasRepositoryPort),
                new PostCitasUseCaseImpl(citasRepositoryPort),
                new PutCitasUseCaseImpl(citasRepositoryPort),
                new DeleteCitasUseCaseImpl(citasRepositoryPort)
        );
    }


}
