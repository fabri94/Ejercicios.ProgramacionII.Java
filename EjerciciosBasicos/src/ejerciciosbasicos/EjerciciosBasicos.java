/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author Fabri
 */
public class EjerciciosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 2
        //**************************************
        /*
        int numeroUno;
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        numeroUno = miScanner.nextInt();
        
        System.out.println("Numeros pares que hay hasta: "+numeroUno);
        for (int i = 2; i <= numeroUno; i+=2) 
        {
            System.out.println(i);
        }
        miScanner.close();
        */
        
        //Ejercicio 3
        //**************************************
        /*
        int numeroPepe;
        int numeroPepeDos;               
        Scanner scannerPepe = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        numeroPepe = scannerPepe.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numeroPepeDos = scannerPepe.nextInt();
        
        if(numeroPepeDos == 0)
        {
            System.out.println("Error, no es posible dividir por 0");
        }else if(numeroPepeDos != 0 && numeroPepe % numeroPepeDos == 0)
        {
            System.out.println(numeroPepe+" es multiplo de "+numeroPepeDos);
        }else
        {
            System.out.println("Los numeros ingresados no son multiplos entre si");
        }
        scannerPepe.close();
        */
        
        //Ejercicio 4
        //**************************************
        
        /*
        int numeroPepe;
        Scanner scannerPepe = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        numeroPepe = scannerPepe.nextInt();
        
        System.out.println("Tabla de multiplicar del 1 al 10 para el numero: "+numeroPepe);
        for (int i = 1; i <= 10; i++) 
        {
            System.out.println(numeroPepe+"x"+i+"="+(numeroPepe*i));
        }
        scannerPepe.close();
        */
        
        //Ejercicio 5
        //**************************************
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
            System.out.println("Ingrese notas de los parciales del alumno: "+nombre +" "+ apellido);
            for (int i = 0; i < 3; i++) {
                notaPepe = scannerPepe.nextInt();
                acumuladorNotas = notaPepe + acumuladorNotas;
            }
            promedioAlumno = acumuladorNotas/3;
            if(promedioAlumno < 4)
            {
                System.out.println(nombre+" "+apellido+ " Desaprobado");
            }else if(promedioAlumno >=4 && promedioAlumno < 6)
            {
                System.out.println(nombre+" "+apellido+ " Aprobado");
            }else{
                System.out.println(nombre+" "+apellido+ " Promocionado");
            }
        scannerPepe.close();
        
    }
    
}
