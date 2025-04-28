/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospoo;

/**
 *
 * @author Fabri
 */
public class Estadisticas {
    private static int contadorMetA;
    private static int contadorMetB;
    private static int contadorMetC;
    
    public static void metodoA()
    {
        contadorMetA++;
    }
    
    public static void metodoB()
    {
        contadorMetB++;
    }
    
    public static void metodoC()
    {
        contadorMetC++;
    }
    
    public static void mostrarResumen()
    {
        System.out.println("El metodo A fue llamado "+contadorMetA+" veces");
        System.out.println("El metodo B fue llamado "+contadorMetB+" veces");
        System.out.println("El metodo C fue llamado "+contadorMetC+" veces");
    }
}
