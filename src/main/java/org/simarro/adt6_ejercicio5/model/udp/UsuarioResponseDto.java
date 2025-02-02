package org.simarro.adt6_ejercicio5.model.udp;

public class UsuarioResponseDto {

    private String nombre;

    private String apellidos;

    private String direccion;

    private boolean pedidosPendientes;

    public UsuarioResponseDto(String nombre, String apellidos, String direccion, boolean pedidosPendientes) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.pedidosPendientes = pedidosPendientes;
    }

    public UsuarioResponseDto(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
