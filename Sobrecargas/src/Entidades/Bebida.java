/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public enum Bebida {
    CAFE("Cafe","caliente"),
    TE("Te","caliente"),
    JUGO("Jugo","fria"),
    AGUA("Agua","fria"),
    GASEOSA("Gaseosa","fria");
    
    private final String descripcion;
    private final String tipo;

    Bebida(String descripcion, String tipo) {
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
    
}
