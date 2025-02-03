package org.simarro.adt6_ejercicio5.service;

import org.simarro.adt6_ejercicio5.model.Paquete;
import org.simarro.adt6_ejercicio5.model.Usuario;
import org.simarro.adt6_ejercicio5.model.udp.PaqueteRequestDto;
import org.simarro.adt6_ejercicio5.model.udp.PaqueteResponseDto;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPaqueteService {

    Paquete registrar(PaqueteRequestDto paqueteDTO);
    Paquete modificar(Integer id,PaqueteRequestDto paqueteDTO);
    List<PaqueteResponseDto> listar();
    PaqueteResponseDto listarPorId(Integer id);
    void eliminar(Integer id);

    Paquete modificarEstado(Integer id);


}
