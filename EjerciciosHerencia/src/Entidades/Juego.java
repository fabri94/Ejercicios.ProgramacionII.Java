package Entidades;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fabri
 */
public class Juego {
    private String titulo;
    private double pesoGB;
    protected ArrayList<TipoConsola> consolasCompatibles;

    public Juego(String titulo, double pesoGB) {
        this.titulo = titulo;
        this.pesoGB = pesoGB;
        this.consolasCompatibles = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPesoGB() {
        return pesoGB;
    }
        
    public boolean esCompatible(TipoConsola consola)
    {
        return consolasCompatibles.contains(consola);
    }
    
    public String mostrarJuego()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append("Titulo: ").append(this.titulo);
        sb.append(System.lineSeparator());
        sb.append("Espacio necesario: ").append(this.pesoGB);
        sb.append(System.lineSeparator());
        
        return sb.toString();
        
    }
}
