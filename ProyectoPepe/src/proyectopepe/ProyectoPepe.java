/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopepe;

import java.util.Scanner;

/**
 *
 * @author Fabri
 */
public class ProyectoPepe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notaPepe;
        int acumuladorNotas = 0;
        int promedioAlumno;
        String nombre;
        String apellido;
        Scanner scannerPepe = new Scanner(System.in); 
            System.out.println("Ingrese nombre del alumno: ");
            nombre = scannerPepe.nextLine();
            System.out.println("Ingrese apellido del alumno: ");
            apellido = scannerPepe.nextLine();
            System.out.println("Ingrese notas de los parciales del alumno: "+nombre+ "" + apellido);
            for (int i = 0; i < 3; i++) {
                notaPepe = scannerPepe.nextInt();
                acumuladorNotas = notaPepe + acumuladorNotas;
            }
            promedioAlumno = acumuladorNotas/3;
            if(promedioAlumno < 4)
            {
                System.out.println(nombre+""+apellido+ " Desaprobado");
            }else if(promedioAlumno >=4 && promedioAlumno < 6)
            {
                System.out.println(nombre+""+apellido+ " Aprobado");
            }else{
                System.out.println(nombre+""+apellido+ " Promocionado");
           }     
    }
    
}
