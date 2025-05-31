/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesTorneo;

import java.time.LocalDateTime;

/**
 *
 * @author Fabri
 */
public abstract class Equipo {
    private String nombre;
    private LocalDateTime fechaCreacion;

    public Equipo(String nombre, LocalDateTime fechaCreacion) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object obj) {
        boolean esIgual = false;

        if(this == obj){
            esIgual = true;
        }
        
        if (obj != null && getClass() == obj.getClass()) {
            Equipo otro = (Equipo) obj;
            if(sonIguales(this,otro)){
                esIgual = true;
            }
        }
        
        return esIgual;
    }
    
    private static boolean sonIguales(Equipo e1, Equipo e2){
        boolean sonIguales = false;
        if(e1.nombre.equals(e2.nombre) && e1.fechaCreacion.equals(e2.fechaCreacion)){
            sonIguales = true;
        }
        return sonIguales;
    }
    
    public String getFicha(){
        StringBuilder sb = new StringBuilder();
        sb.append("Equipo: ").append(this.nombre).append(" fundado el ").append(this.fechaCreacion).append("\n");
        return sb.toString();
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
}
