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
public class Paciente extends Persona {
    
    private ArrayList<Tratamiento> tratamientos;

    public Paciente(String nombre, String apellido, int edad, String dni) {
        super(nombre, apellido, edad, dni);
        this.tratamientos = new ArrayList<>();
    }
    
    public void agregarTratamiento(Tratamiento tratamiento)
    {
        if(tratamiento!=null)
        {
            this.tratamientos.add(tratamiento);      
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente");
        sb.append(System.lineSeparator());
        sb.append(super.toString());
        sb.append("Tratamientos\n");
        sb.append(mostrarTratamientos());
        return sb.toString();
    }
    
    private String mostrarTratamientos()
    {
        StringBuilder sb = new StringBuilder();
        for(Tratamiento tratamiento : this.tratamientos)
        {
            sb.append(tratamiento);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
    
}
