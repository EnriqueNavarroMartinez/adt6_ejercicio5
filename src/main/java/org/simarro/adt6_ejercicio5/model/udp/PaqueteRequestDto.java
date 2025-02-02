package org.simarro.adt6_ejercicio5.model.udp;

import jakarta.persistence.Column;
import org.simarro.adt6_ejercicio5.model.Usuario;

public class PaqueteRequestDto {

    private String nombre;

    private String descripcion;

    private boolean entregado;

    private Usuario usuario;

    public PaqueteRequestDto(String nombre, String descripcion, boolean entregado, Usuario usuario) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.entregado = entregado;
        this.usuario = usuario;
    }
    public PaqueteRequestDto(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
