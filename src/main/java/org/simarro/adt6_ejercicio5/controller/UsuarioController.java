package org.simarro.adt6_ejercicio5.controller;

import jakarta.validation.Valid;
import org.simarro.adt6_ejercicio5.model.Usuario;
import org.simarro.adt6_ejercicio5.model.udp.UsuarioRequestDto;
import org.simarro.adt6_ejercicio5.model.udp.UsuarioResponseDto;
import org.simarro.adt6_ejercicio5.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private IUsuarioService service;

    @GetMapping
    public ResponseEntity<List<UsuarioResponseDto>> listar() {
        List<UsuarioResponseDto> lista = service.listar();
// Código 200 OK para select
        return new ResponseEntity<>(lista, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioResponseDto> listarPorId(@PathVariable("id") Integer id) {
        UsuarioResponseDto obj = service.listarPorId(id);
// Código 200 OK para select
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Usuario> registrar(@RequestBody UsuarioRequestDto usuarioDTO) {
        Usuario obj = service.registrar(usuarioDTO);
// Código 201 CREATED para insert
        return new ResponseEntity<>(obj, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> modificar(@PathVariable("id") Integer id, @Valid @RequestBody UsuarioRequestDto usuarioDTO) {
        Usuario obj = service.modificar(id, usuarioDTO);
// Código 200 OK para update
        return new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) {
        service.eliminar(id);
// Código 204 NOT CONTENT para delete
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

