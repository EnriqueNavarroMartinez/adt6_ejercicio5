package org.simarro.adt6_ejercicio5.controller;

import jakarta.validation.Valid;
import org.simarro.adt6_ejercicio5.model.Paquete;
import org.simarro.adt6_ejercicio5.model.udp.PaqueteRequestDto;
import org.simarro.adt6_ejercicio5.model.udp.PaqueteResponseDto;
import org.simarro.adt6_ejercicio5.service.IPaqueteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/paquetes")

public class PaqueteController {

    @Autowired
    private IPaqueteService service;
    @GetMapping
    public ResponseEntity<List<PaqueteResponseDto>> listar(){
        List<PaqueteResponseDto> lista = service.listar();
// Código 200 OK para select
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<PaqueteResponseDto> listarPorId(@PathVariable("id") Integer id){
        PaqueteResponseDto obj = service.listarPorId(id);
// Código 200 OK para select
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Paquete> registrar(@Valid @RequestBody PaqueteRequestDto producto) {
        Paquete obj = service.registrar(producto);
// Código 201 CREATED para insert
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Paquete> modificar(@PathVariable("id") Integer id, @RequestBody PaqueteRequestDto producto) {
        Paquete obj = service.modificar(id,producto);
// Código 200 OK para update
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id){
        service.eliminar(id);
// Código 204 NOT CONTENT para delete
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}


