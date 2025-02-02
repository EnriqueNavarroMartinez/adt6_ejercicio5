package org.simarro.adt6_ejercicio5.model;

import jakarta.persistence.*;

@Entity
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nombre;

    @Column
    private String apellidos;

    @Column
    private String localidad;

    @Column
    private String direccion;

    @Column
    private boolean pedidosPendientes;

    public Usuario(){}

    public Usuario(Integer id, String nombre, String apellidos, String localidad, String direccion, boolean pedidosPendientes) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.localidad = localidad;
        this.direccion = direccion;
        this.pedidosPendientes = pedidosPendientes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isPedidosPendientes() {
        return pedidosPendientes;
    }

    public void setPedidosPendientes(boolean pedidosPendientes) {
        this.pedidosPendientes = pedidosPendientes;
    }
}
