/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Fabri
 */
public class Auto extends Vehiculo{
    private int cantidadPuertas;

    public Auto(String marca, String modelo, int anio, int cantidadPuertas) {
        super(marca, modelo, anio);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    public String mostrarAuto()
    {
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.mostrar());
        sb.append("Cantidad de puertas: ").append(this.cantidadPuertas);
        sb.append(System.lineSeparator());
        
        return sb.toString();
    }
}
