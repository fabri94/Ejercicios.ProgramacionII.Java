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
public class Consola {
    private String nombre;
    private TipoConsola tipo;
    private double capacidadMaximaGB;
    private ArrayList<Juego> juegosInstalados;

    public Consola(String nombre, TipoConsola tipo, double capacidadMaximaGB) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidadMaximaGB = capacidadMaximaGB;
        this.juegosInstalados = new ArrayList();
    }
    
    public boolean agregarJuego(Juego juego)
    {
        boolean seAgrego = false;
        if(puedeInstalar(juego))
        {
            juegosInstalados.add(juego);
            seAgrego = true;         
        }
        return seAgrego;
    }
        
    private double getEspacioLibre()
    {
        double espacioUsado = 0;
        for(Juego juego : this.juegosInstalados)
        {
            espacioUsado = espacioUsado + juego.getPesoGB();
        }
        return capacidadMaximaGB - espacioUsado;
    }
    
    private boolean puedeInstalar(Juego juego)
    {
        return (juego.esCompatible(this.tipo) && getEspacioLibre()>=juego.getPesoGB());
    }
    
    public String mostrarJuegos()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Consola: ").append(this.nombre);
        sb.append(System.lineSeparator());
        sb.append("Juegos instalados");
        sb.append(System.lineSeparator());
        sb.append("-----------------");
        for(Juego juego : this.juegosInstalados)
        {
            sb.append(System.lineSeparator());
            sb.append(juego.mostrarJuego());
        }
        return sb.toString();
    }
}
