package org.simarro.adt6_ejercicio5.service;

import org.modelmapper.ModelMapper;
import org.simarro.adt6_ejercicio5.model.Usuario;
import org.simarro.adt6_ejercicio5.model.udp.UsuarioRequestDto;
import org.simarro.adt6_ejercicio5.model.udp.UsuarioResponseDto;
import org.simarro.adt6_ejercicio5.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private IUsuarioRepository repo;

    @Autowired
    private ModelMapper modelMapper;



    @Override
    public Usuario registrar(UsuarioRequestDto usuario) {
        Usuario usuUDP = modelMapper.map(usuario, Usuario.class);
        return repo.save(usuUDP);
    }

    @Override
    public Usuario modificar(Integer id, UsuarioRequestDto usuario) {
        Optional<Usuario> op = repo.findById(id);
        if(op.isPresent()){
          Usuario usuarioUDP = op.get();
          usuarioUDP.setNombre(usuario.getNombre());
          usuarioUDP.setApellidos(usuario.getApellidos());
          usuarioUDP.setPedidosPendientes(usuario.isPedidosPendientes());
           return repo.save(usuarioUDP);
        }else{
            return null;
        }
    }

    @Override
    public List<UsuarioResponseDto> listar() {
        return repo.findAll()
                .stream()
                .map(usu -> modelMapper.map(usu, UsuarioResponseDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public UsuarioResponseDto listarPorId(Integer id) {
        Optional<Usuario> op = repo.findById(id);
        if(op.isPresent()){
            UsuarioResponseDto usuarioDTO = modelMapper.map(op.get(), UsuarioResponseDto.class);
            return usuarioDTO;
        }else{
            return null;
        }

    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}
