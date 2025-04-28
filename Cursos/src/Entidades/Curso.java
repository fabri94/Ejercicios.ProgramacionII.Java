/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class Curso {
    private String nombreCurso;
    private int cantidadHoras;
    private Alumno alumno;

    public Curso(String nombreCurso, int cantidadHoras, Alumno alumno) {
        this.nombreCurso = nombreCurso;
        this.cantidadHoras = cantidadHoras;
        this.alumno = alumno;
    }
    
    public void setAlumno(Alumno alumno)
    {
        if(this.validarEdad(alumno.getEdad()))
        {
            this.alumno = alumno;
        }
    }
    
    private boolean validarEdad(int edad)
    {
        return edad >= 18;
    }
    
    public String mostrarInfo()
    {
        String mensaje = "Nombre del curso: "+this.nombreCurso + "\n" + "Cantidad de horas del curso: " +this.cantidadHoras + "\n";
        if(this.alumno != null)
        {
            mensaje += "Nombre del alumno: "+this.alumno.getNombreCompleto()+"\n" + "Edad del alumno: "+this.alumno.getEdad()+"\n";
        }else
        {
            mensaje+= "No se pudo agregar alumno al curso \n";
            
        }
        return mensaje;        
        
    }
    
}
