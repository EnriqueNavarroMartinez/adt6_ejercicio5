package org.simarro.adt6_ejercicio5.model.udp;

import jakarta.validation.constraints.Size;
import org.antlr.v4.runtime.misc.NotNull;

public class UsuarioRequestDto {

    @NotNull
    private String nombre;

    @Size(min = 5, max = 20)
    private String apellidos;

    private boolean pedidosPendientes;

    public UsuarioRequestDto(String nombre, String apellidos, boolean pedidosPendientes) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.pedidosPendientes = pedidosPendientes;
    }

    public UsuarioRequestDto(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public @Size(min = 5, max = 20) String getApellidos() {
        return apellidos;
    }

    public void setApellidos(@Size(min = 5, max = 20) String apellidos) {
        this.apellidos = apellidos;
    }

    public boolean isPedidosPendientes() {
        return pedidosPendientes;
    }

    public void setPedidosPendientes(boolean pedidosPendientes) {
        this.pedidosPendientes = pedidosPendientes;
    }
}
