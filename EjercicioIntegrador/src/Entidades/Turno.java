/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Fabri
 */
public class Turno {
    private Paciente paciente;
    private Medico medico;
    private LocalDate fecha;

    public Turno(Paciente paciente, Medico medico, LocalDate fecha) {
        this.paciente = paciente;
        this.medico = medico;
        this.fecha = fecha;
    }
    
    public Medico getMedico()
    {
        return this.medico;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Turno");
        sb.append("Paciente\n").append(paciente);
        sb.append("Medico\n").append(medico);
        sb.append("Fecha\n").append(fecha.toString());
        sb.append(System.lineSeparator());
        return sb.toString();
    }
    
    
}
