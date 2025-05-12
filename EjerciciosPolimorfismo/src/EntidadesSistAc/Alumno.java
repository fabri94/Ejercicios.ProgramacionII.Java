/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EntidadesSistAc;

import java.util.ArrayList;

/**
 *
 * @author Fabri
 */
public class Alumno {
    private ArrayList<Evaluacion> evaluaciones;
    private String nombre;

    public Alumno(ArrayList<Evaluacion> evaluaciones, String nombre) {
        this.evaluaciones = evaluaciones;
        this.nombre = nombre;
    }
    
    
    public double obtenerPromedio()
    {
        double sumaNotas = 0;
        if(!evaluaciones.isEmpty())
        {
            for(Evaluacion prueba : evaluaciones)
            {
                sumaNotas = sumaNotas + prueba.calcularNotaFinal();
            }
            sumaNotas = sumaNotas/evaluaciones.size();
        }
        return sumaNotas;
    }

    public String getNombre() {
        return nombre;
    }
    
}
