/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysycolecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Fabri
 */
public class ArraysYColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //EJERCICIO 1
        //--------------------------------------------
        /*
        Scanner scannerPepe = new Scanner(System.in);
        int[] vectorNumeros = new int[4];
        int acumulador = 0;
        int promedio;
        int contadorNumeros = 0;
        int mayor = 0;
        int menor = 0;
        System.out.println("Ingrese 4 numeros por favor: ");
        for (int i = 0; i < vectorNumeros.length; i++) 
        {
            vectorNumeros[i] = Integer.parseInt(scannerPepe.nextLine());
        }
        
        for (int i = 0; i < vectorNumeros.length; i++) 
        {
            acumulador = acumulador + vectorNumeros[i];
        }
        
        promedio = acumulador/vectorNumeros.length;
        System.out.println("Promedio: "+promedio);
        
        for (int i = 0; i < vectorNumeros.length; i++) 
        {
            if(vectorNumeros[i]>promedio)
            {
                contadorNumeros++;
            }
        }
        
        System.out.println("Hay "+contadorNumeros+" numeros que son mayores al promedio");
        
        for (int i = 0; i < vectorNumeros.length; i++) 
        {   
            if(mayor==0||vectorNumeros[i]>mayor)
            {
                mayor = vectorNumeros[i];
            }else if(menor==0||vectorNumeros[i]<menor)
            {
                menor = vectorNumeros[i];
            }
        }
        System.out.println("Nº mas chico del vector: "+menor+"\n"+"Nº mas grande del vector: "+mayor+"\n");
        
        scannerPepe.close();
        */
        
        //EJERCICIO 2
        //--------------------------------------------
        /*
        int[][] matrizPepe = new int[3][3];
        int acumuladorMatriz;
             
        System.out.println("Matriz de numeros aleatorios: ");   
        
        llenarMatrizRandom(matrizPepe);
        mostrarMatrizFormateada(matrizPepe);
        acumuladorMatriz = sumarMatriz(matrizPepe);      
        
        System.out.println("Resultado suma matriz: "+acumuladorMatriz);
        
        */
        //EJERCICIO 3
        //--------------------------------------------
        
        Queue<Persona> colaEntradas = new LinkedList<>();
        
        colaEntradas.add(new Persona("Pepe","Silvia"));
        colaEntradas.add(new Persona("Bombardino","Crocodilo"));
        colaEntradas.add(new Persona("Abdul","Jabar"));
        colaEntradas.add(new Persona("Cabeza","de Pollo"));
        
        while(!colaEntradas.isEmpty())
        {
            Persona personaConEntrada = colaEntradas.poll();
            System.out.println(personaConEntrada.getNombreCompleto()+" ya tiene su entrada para Dua Lipa");                
        }
        
        
        //EJERCICIO 4
        //--------------------------------------------
        /*
        HashSet<Integer> hashPepe = new HashSet<>();
        int[] arrayPepe = new int[10];
        
        hardcodearVector(arrayPepe);
        
        for (int i = 0; i < arrayPepe.length; i++) {
            hashPepe.add(arrayPepe[i]);
        }
        
        System.out.println("Array original: ");
        mostrarArray(arrayPepe);
        System.out.println("Hashset: ");
        System.out.println(hashPepe);
        */
        
        //EJERCICIO 5
        //--------------------------------------------
        
        /*
        ArrayList<Integer> arrayPepe = new ArrayList<>();
        ArraysYColecciones.hardcodearArrayList(arrayPepe);
        Scanner scannerPepe = new Scanner(System.in);
        int numeroBuscado;
        System.out.println("Ingrese el numero que quiere buscar en el arraylist por favor: ");
        numeroBuscado = Integer.parseInt(scannerPepe.nextLine());
        if(arrayPepe.contains(numeroBuscado))
        {
            System.out.println("El numero buscado "+numeroBuscado+" se encuentra en el indice "+arrayPepe.indexOf(numeroBuscado)+" del ArrayList");
        }else
        {
            System.out.println("No se encontro el numero buscado");
        }
        */
    }
    
    
    public static void llenarMatrizRandom(int[][] matriz)
    {
        Random numeroRandom = new Random();
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=numeroRandom.nextInt(10);
            }
        }
    }
    
    public static void mostrarMatrizFormateada(int[][] matriz)
    {
        for (int i = 0; i < matriz.length; i++) 
        {
            System.out.println("+------------+------------+------------+");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("| %10d ", matriz[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("+------------+------------+------------+");
    }
    
    public static int sumarMatriz(int[][] matriz)
    {
        int sumaMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sumaMatriz = sumaMatriz + matriz[i][j];
            }
        }
        return sumaMatriz;
    }
    
    public static void mostrarArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println();
    }
    
    public static void hardcodearVector(int[] array)
    {
        array[0] = 1;
        array[1] = 4;
        array[2] = 5;
        array[3] = 10;
        array[4] = 5;
        array[5] = 5;
        array[6] = 140;
        array[7] = 1;
        array[8] = 2;
        array[9] = 2;
    }
    
    public static void hardcodearArrayList(ArrayList<Integer> array)
    {
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
    }
}
