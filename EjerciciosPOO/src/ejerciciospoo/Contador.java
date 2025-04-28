/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciospoo;

/**
 *
 * @author Fabri
 */
public class Contador {
    private static int cantidad;

    public static int getCantidad() {
        return cantidad;
    }
    
    public void incrementar()
    {
        this.cantidad++;
    }
}
