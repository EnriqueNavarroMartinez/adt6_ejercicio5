package org.simarro.adt6_ejercicio5.service;

import org.simarro.adt6_ejercicio5.model.Usuario;
import org.simarro.adt6_ejercicio5.model.udp.UsuarioRequestDto;
import org.simarro.adt6_ejercicio5.model.udp.UsuarioResponseDto;

import java.util.List;

public interface IUsuarioService {

    Usuario registrar(UsuarioRequestDto usuario);
    Usuario modificar(Integer id,UsuarioRequestDto usuario);
    List<UsuarioResponseDto> listar();
    UsuarioResponseDto listarPorId(Integer id);
    void eliminar(Integer id);
}
