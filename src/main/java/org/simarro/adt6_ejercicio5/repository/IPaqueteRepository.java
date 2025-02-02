package org.simarro.adt6_ejercicio5.repository;

import org.simarro.adt6_ejercicio5.model.Paquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPaqueteRepository  extends JpaRepository<Paquete, Integer> {
}
