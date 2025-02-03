package org.simarro.adt6_ejercicio5.service;

import jakarta.validation.constraints.Null;
import org.modelmapper.ModelMapper;
import org.simarro.adt6_ejercicio5.model.Paquete;
import org.simarro.adt6_ejercicio5.model.Usuario;
import org.simarro.adt6_ejercicio5.model.udp.PaqueteRequestDto;
import org.simarro.adt6_ejercicio5.model.udp.PaqueteResponseDto;
import org.simarro.adt6_ejercicio5.repository.IPaqueteRepository;
import org.simarro.adt6_ejercicio5.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PaqueteServiceImpl implements IPaqueteService{

    @Autowired
    private IPaqueteRepository repo;
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private IUsuarioRepository repoUsuario;


    @Override
    public Paquete registrar(PaqueteRequestDto paqueteDTO) {

        Integer idUsuario = paqueteDTO.getUsuario().getId();
        Optional<Usuario> usuario = repoUsuario.findById(paqueteDTO.getUsuario().getId());

        Paquete paqDto = modelMapper.map(paqueteDTO, Paquete.class);

        if(usuario.isPresent()){
            paqDto.setUsuario(usuario.get());
        }
        return repo.save(paqDto);
    }

    @Override
    public Paquete modificar(Integer id,PaqueteRequestDto paqueteDTO) {
        Optional<Paquete> op = repo.findById(id);
        if(op.isPresent()){
            Paquete paqDto = op.get();
            paqDto.setNombre(paqueteDTO.getNombre());
            paqDto.setDescripcion(paqueteDTO.getDescripcion());
            paqDto.setEntregado(paqueteDTO.isEntregado());
            return repo.save(paqDto);

        }else{
            return null;
        }
    }

    @Override
    public List<PaqueteResponseDto> listar() {
        return repo.findAll()
                .stream()
                .map(usu -> modelMapper.map(usu, PaqueteResponseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public PaqueteResponseDto listarPorId(Integer id) {
        Optional<Paquete> op = repo.findById(id);
        if(op.isPresent()){
            PaqueteResponseDto usuarioDTO = modelMapper.map(op.get(), PaqueteResponseDto.class);
            return usuarioDTO;
        }else{
            return null;
        }

    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Paquete modificarEstado(Integer id) {
        Optional<Paquete> op = repo.findById(id);
        if(op.isPresent()){
            Paquete paqDto = op.get();
            if(!paqDto.isEntregado()){
                paqDto.setEntregado(true);
            }
            return repo.save(paqDto);
        }else{
            return null;
        }
    }




}
