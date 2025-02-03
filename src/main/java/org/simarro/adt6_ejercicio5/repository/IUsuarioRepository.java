package org.simarro.adt6_ejercicio5.repository;

import org.simarro.adt6_ejercicio5.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {


    @Query("FROM Usuario u WHERE (:nombre is null or u.nombre = :nombre) and (:localidad is null or u.localidad = :localidad)")
    List<Usuario> listarPorParametros(@Param("nombre") String nombre, @Param("localidad") String localidad);
}
