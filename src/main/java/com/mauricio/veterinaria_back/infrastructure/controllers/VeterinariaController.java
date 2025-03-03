package com.mauricio.veterinaria_back.infrastructure.controllers;

import com.mauricio.veterinaria_back.domain.models.Citas;
import com.mauricio.veterinaria_back.application.services.VeterinariaService;
import com.mauricio.veterinaria_back.domain.models.Message;
import com.mauricio.veterinaria_back.domain.models.Response;
import com.mauricio.veterinaria_back.domain.models.Status;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class VeterinariaController {


    private final VeterinariaService veterinariaService;

    public VeterinariaController(VeterinariaService veterinariaService) {
        this.veterinariaService = veterinariaService;
    }

    @GetMapping
    public Response<List<Citas>> getAll(){
        return new Response<>(Status.SUCCESS.status, Message.GET_CITAS.message, veterinariaService.getCitas());
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Response<Citas> post(@RequestBody Citas request) {
        return  new Response<>(Status.SUCCESS.status, Message.POST_CITA.message, veterinariaService.postCita(request));
    }

    @PutMapping("/{id}")
    public Response<Citas> put(@PathVariable Long id, @RequestBody Citas request) {
        return new Response<>(Status.SUCCESS.status, Message.PUT_CITA.message, veterinariaService.putCitas(id, request));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        veterinariaService.delete(id);
    }

    @GetMapping("/{id}")
    public Response<List<Citas>> get(@PathVariable String id) {
        return new Response<>(Status.SUCCESS.status, Message.GET_CITA.message, veterinariaService.getCita(id));
    }


}
