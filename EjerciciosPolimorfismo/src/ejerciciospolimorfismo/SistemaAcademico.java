/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospolimorfismo;

import EntidadesSistAc.Alumno;
import EntidadesSistAc.Evaluacion;
import EntidadesSistAc.Final;
import EntidadesSistAc.Parcial;
import EntidadesSistAc.TrabajoPractico;
import java.util.ArrayList;

/**
 *
 * @author Fabri
 */
public class SistemaAcademico {
    
    public static void main(String[] args) {
        ArrayList<Evaluacion> pruebasAlumno1 = new ArrayList<>();
        ArrayList<Evaluacion> pruebasAlumno2 = new ArrayList<>();
        
        pruebasAlumno1.add(new Parcial("Parcial","10/03/2025",10));
        pruebasAlumno1.add(new TrabajoPractico("Trabajo Practico","20/04/2025",3));
        pruebasAlumno1.add(new Final("Final","25/05/2025",4));
        
        pruebasAlumno2.add(new Parcial("Parcial","04/04/2025",4));
        pruebasAlumno2.add(new TrabajoPractico("Trabajo Practico","21/04/2025",4));
        pruebasAlumno2.add(new Final("Final","30/05/2025",5));
        
        Alumno alumno1 = new Alumno(pruebasAlumno1,"Pepe Silvia");
        Alumno alumno2 = new Alumno(pruebasAlumno2,"Abdul Jabar");
        
        System.out.println("Notas de "+alumno1.getNombre()+"\n");
        for(Evaluacion evaluacion : pruebasAlumno1)
        {
            evaluacion.mostrarDetalle();
        }
        System.out.println("");
        System.out.println("Notas de "+alumno2.getNombre()+"\n");
        for(Evaluacion evaluacion : pruebasAlumno2)
        {
            evaluacion.mostrarDetalle();  
        }
        System.out.println("");
        
        System.out.println("Alumno "+alumno1.getNombre()+"\n Promedio: "+alumno1.obtenerPromedio()+"\n");
        System.out.println("Alumno "+alumno2.getNombre()+"\n Promedio: "+alumno2.obtenerPromedio()+"\n");
    }
}
