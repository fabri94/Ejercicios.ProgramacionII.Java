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
public class Clinica {
    private String nombre;
    private ArrayList<HistoriaClinica> historiales;
    private ArrayList<Turno> turnos;
    private ArrayList<Persona> personas;
    private static Clinica instancia;

    private Clinica() 
    {
        this.historiales = new ArrayList<>();
        this.turnos = new ArrayList<>();
        this.personas = new ArrayList<>();
    }
    
    public static Clinica getInstancia()
    {
        if(instancia == null)
        {
            instancia = new Clinica();
        }
        return instancia;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public boolean agregarPersona(Persona persona)
    {
      boolean seAgrego = false;
      if(!personas.contains(persona))
      {
          this.personas.add(persona);
          seAgrego = true;
      }   
      
      return seAgrego;
    }
    
       
    public void agregarHistoriaClinica(HistoriaClinica historia)
    {
        if(historia != null)
        {
            this.historiales.add(historia);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Clinica ").append(nombre);
        sb.append(System.lineSeparator());
        sb.append("\nStaff medico\n----------------------\n\n").append(listarMedicos());
        sb.append("Pacientes\n----------------------\n\n").append(listarPacientes());
        sb.append("Cantidad historiales: ").append(historiales.size());
        sb.append(System.lineSeparator());
        return sb.toString();
    }
    
    private String listarMedicos()
    {
        StringBuilder sb = new StringBuilder();
        int contador=0;
        for(Persona persona : personas)
        {
            if(persona instanceof Medico)
            {
                contador++;
                sb.append(persona);
                sb.append(System.lineSeparator());
            }
        }
        sb.append("Medicos disponibles: ").append(contador);
        sb.append("\n\n");
        return sb.toString();
    }
    
    private String listarPacientes()
    {
        StringBuilder sb = new StringBuilder();
        int contador=0;
        for(Persona persona : personas)
        {
            if(persona instanceof Paciente)
            {
                contador++;
                sb.append(persona);
                sb.append(System.lineSeparator());
            }
        }
        sb.append("Pacientes atendidos: ").append(contador);
        sb.append("\n\n");
        return sb.toString();
    }
    
    
}
