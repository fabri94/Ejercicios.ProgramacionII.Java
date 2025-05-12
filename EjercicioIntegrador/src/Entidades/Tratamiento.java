/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class Tratamiento {

    
    private String descripcion;
    private int duracionDias;

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }
    
    public static String getTratamiento(Tratamiento tratamiento, Medico medico, Paciente paciente)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(tratamiento.toString());
        sb.append(medico.toString());
        sb.append(System.lineSeparator());
        sb.append(paciente.toString());
        sb.append(System.lineSeparator());
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.descripcion);
        sb.append(System.lineSeparator());
        sb.append("Duracion tratamiento: ").append(this.duracionDias).append(" dias");
        return sb.toString();
    }
    
    
}
