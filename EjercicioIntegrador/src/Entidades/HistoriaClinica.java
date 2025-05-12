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
public class HistoriaClinica {
    private Paciente paciente;
    private ArrayList<EntradaHistorial> entradas;

    public HistoriaClinica(Paciente paciente) {
        this.paciente = paciente;
        this.entradas = new ArrayList<>();
    }

    
    public void agregarEntrada(EntradaHistorial entrada)
    {
        if(entrada != null)
        {
            this.entradas.add(entrada);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Historia Clinica");
        sb.append(System.lineSeparator());
        sb.append("Paciente").append(System.lineSeparator()).append(paciente);
        sb.append(System.lineSeparator());
        sb.append("Entradas").append(mostrarEntradas());
        sb.append(System.lineSeparator());
        return sb.toString();
    }
    
    private String mostrarEntradas()
    {
        StringBuilder sb = new StringBuilder();
        for(EntradaHistorial entrada : this.entradas)
        {
            sb.append(entrada);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
