/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sobrecargas;

import Entidades.Bebida;
import Entidades.Calculadora;
import Entidades.Genero;
import Entidades.Libro;
import Entidades.Pedido;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Fabri
 */
public class Sobrecargas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        //EJERCICIO 1
        //-----------------------------------------------------------------------
        Calculadora calculadoraPepe = new Calculadora();
        
        
        System.out.println(calculadoraPepe.sumar("hola", " bobina"));
        System.out.println(calculadoraPepe.sumar(4000,-10));
        System.out.println(calculadoraPepe.sumar(10, 5, 3));
        */  
        
        
        /*
        //EJERCICIO 2
        //-----------------------------------------------------------------------
        Scanner scannerPepe = new Scanner(System.in);
        String mensajeUsuario;
        String aux;
        String[] palabras;
        int contadorCaracteres;
        int contadorPalabras;
        boolean esJava = false;
        
        System.out.println("Ingrese una frase: ");
        mensajeUsuario = scannerPepe.nextLine();
        System.out.println(mensajeUsuario);
        
        aux = mensajeUsuario.replace(" ", "");
        contadorCaracteres=aux.length();
        System.out.println("Cantidad caracteres de la oracion: "+contadorCaracteres);
        
        palabras = mensajeUsuario.split(" ");
        contadorPalabras = palabras.length;
        System.out.println("Cantidad palabras de la oracion: "+contadorPalabras);
        
        aux=mensajeUsuario.toLowerCase();
        System.out.println("Oracion en minuscula: "+aux);
        
        aux=mensajeUsuario.toUpperCase();
        System.out.println("Oracion en mayuscula: "+aux);
        
        aux=mensajeUsuario.toLowerCase();
        if(aux.contains("java"))
        {
            esJava = true;
        }
        if(esJava)
        {
            System.out.println("La frase ingresada tiene la palabra'java'");
        }else
        {
            System.out.println("La frase ingresada no tiene la palabra'java'");
        }
        */
        
       //EJERCICIO 3
       //-----------------------------------------------------------------------
       
       /*
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<=100 ; i++)
        {
            if(i!=100)
            {
                sb.append(i+" - ");                
            }else
            {
                sb.append(i);
            }
        }
        sb.toString();
        System.out.println(sb);
        System.out.println(sb.length());
        */
       
       //EJERCICIO 4
       //-----------------------------------------------------------------------
        /*
        Libro libro1 = new Libro("Pepe","Pepe Silvia",Genero.FICCION);
        Libro libro2 = new Libro("Abdul","Ibdal",Genero.ENSAYO);
        Libro libro3 = new Libro("Jeje","Jabar",Genero.NO_FICCION);
        Libro libro4 = new Libro("Pity","Pity Alvarez",Genero.POESIA);
        Libro libro5 = new Libro("Las cronicas","Jijolin",Genero.INFANTIL);
        
        System.out.println(libro1.esGenero("infantil"));
        System.out.println(libro2.esGenero("ensayo"));
        System.out.println(libro3.esGenero("poesia"));
        System.out.println(libro4.esGenero("infantil"));
        System.out.println(libro5.esGenero("infantil"));
        */
        //EJERCICIO 5
       //-----------------------------------------------------------------------
       
       /*
       Pedido pedidoUno = new Pedido("Pepe Silvia",Bebida.JUGO);
       Pedido pedidoDos = new Pedido("Abdul Jabar",Bebida.CAFE);
       
       System.out.println("El cliente "+pedidoUno.getCliente()+" pidio "+pedidoUno.getBebidaElegida().getDescripcion());
       System.out.println("El cliente "+pedidoDos.getCliente()+" pidio "+pedidoDos.getBebidaElegida().getDescripcion());
       
       if(pedidoUno.esBebidaFria())
       {
           System.out.println("La bebida es fria");
       }else
       {
           System.out.println("La bebida es caliente");
       }
       
       if(pedidoDos.esBebidaFria())
       {
           System.out.println("La bebida es fria");
       }else
       {
           System.out.println("La bebida no es fria");
       }
        
    }
    */
       
       int[][] matriz = new int[2][3];
       
       matriz[0][0] = 10;
       matriz[0][1] = 20;
       matriz[0][2] = 30;
       
       matriz[1] = new int[] {40,50,60};
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));
        
        
        
        //RECORRER UNA MATRIZ
        for (int i = 0; i < matriz.length; i++) 
        {
            for (int j = 0; j < matriz[i].length; j++) 
            {
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println();
        }
        
        for(int[] fila : matriz)
        {
            for(int valor : fila)
            {
                System.out.println(valor + " ");
            }
            System.out.println();
        }
    }
    
}
