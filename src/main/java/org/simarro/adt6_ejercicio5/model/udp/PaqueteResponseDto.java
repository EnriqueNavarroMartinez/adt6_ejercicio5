package org.simarro.adt6_ejercicio5.model.udp;

import jakarta.persistence.Column;

public class PaqueteResponseDto {

    private String nombre;

    private float peso;

    private float precio;

    private boolean entregado;

    public PaqueteResponseDto(String nombre, float peso, float precio, boolean entregado) {
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
        this.entregado = entregado;
    }
    public PaqueteResponseDto(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
}
