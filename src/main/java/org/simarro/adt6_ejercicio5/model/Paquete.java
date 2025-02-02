package org.simarro.adt6_ejercicio5.model;

import jakarta.persistence.*;

@Entity
public class Paquete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String nombre;

    @Column
    private String descripcion;

    @Column
    private float peso;

    @Column
    private float precio;

    @Column
    private boolean entregado;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;


    public Paquete(Integer id, String nombre, String descripcion, float peso, float precio, boolean entregado) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
        this.precio = precio;
        this.entregado = entregado;
    }
    public Paquete(){}

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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
