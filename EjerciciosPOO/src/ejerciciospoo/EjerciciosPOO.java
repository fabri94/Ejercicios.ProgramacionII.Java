/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciospoo;

import java.util.Scanner;

/**
 *
 * @author Fabri
 */
public class EjerciciosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //EJERCICIO 1
        //-----------------------------------
        /*
        Contador miContador = new Contador();
        Contador miContador2 = new Contador();
        miContador.incrementar();
        miContador.incrementar();
        miContador.incrementar();
        miContador.incrementar();
        System.out.println(miContador.getCantidad());
        System.out.println(miContador2.getCantidad());
        */
        
        //EJERCICIO 2
        //-----------------------------------
        /*Scanner scannerPepe = new Scanner(System.in);
        int metrosIngresados;
        int kilometros;
        System.out.println("Ingrese los metros a convertir en kilometros: ");
        metrosIngresados = Integer.parseInt(scannerPepe.nextLine());
        kilometros = Conversor.conversorMetrosAKm(metrosIngresados);
        System.out.println(metrosIngresados+" metros equivalen a "+kilometros+" kilometros");
        */
        
        //EJERCICIO 3
        //-----------------------------------
        /*
        Estadisticas.metodoA();
        Estadisticas.metodoB();
        Estadisticas.metodoA();
        Estadisticas.metodoA();
        Estadisticas.mostrarResumen();
        */
        
        //EJERCICIO 4
        //-----------------------------------
        /*
        Banco.depositar(3000);
        Banco.depositar(-100);
        Banco.mostrarSaldoCuenta();
        Banco.extraer(10000);
        Banco.extraer(200);
        Banco.mostrarSaldoCuenta();
        */
        
        //EJERCICIO 5
        //----------------------------------
        Sesion.login(null);
        Sesion.mostrarEstado();
        Sesion.login("Pepe Silvia");
        Sesion.mostrarEstado();
        Sesion.logout();
        Sesion.mostrarEstado();
        
    }
    
}
