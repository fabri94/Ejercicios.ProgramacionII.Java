/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Fabri
 */
public class ListaDeReproduccion {
    private String nombre;
    private Tematica tematica;
    private ArrayList<Cancion> canciones;

    public ListaDeReproduccion(String nombre, Tematica tematica, ArrayList<Cancion> canciones) {
        this.nombre = nombre;
        this.tematica = tematica;
        this.canciones = canciones;
    }
    
    public double getDuracionTotal(){
        double duracionTotal = 0;
        for (Cancion c : canciones) {
            duracionTotal = c.getDuracion()+duracionTotal;
        }
        return duracionTotal;
    }
    
    public void agregarCancion(Cancion c){
        if(c!=null && !canciones.contains(c)){
            this.canciones.add(c);
        }
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Playlist ").append(this.nombre).append("\n");
        sb.append("tematica: ").append(this.tematica).append("\n");
        for (Cancion c : canciones) {
            sb.append(c.toString());
        }
        return sb.toString();
    }
}
